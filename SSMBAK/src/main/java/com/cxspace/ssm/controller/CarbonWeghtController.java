package com.cxspace.ssm.controller;

import com.cxspace.ssm.model.*;
import com.cxspace.ssm.service.CarbonWeightService;
import com.cxspace.ssm.service.YearMonthService;
import org.apache.commons.math3.fitting.PolynomialCurveFitter;
import org.apache.commons.math3.fitting.WeightedObservedPoints;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;
import java.util.*;

@RestController
public class CarbonWeghtController {



    @Resource
    private CarbonWeightService carbonWeightService;

    @Resource
    private YearMonthService yearMonthService;

    @RequestMapping( value = "/insert_carbon_weight",method = RequestMethod.POST)
    public ResponseEntity<BackStatus> insert_carbon_weight(@RequestBody CarbonVolum carbonVolum){

        System.out.println(carbonVolum+"=====");

        HttpHeaders headers = new HttpHeaders();
        headers.setAccessControlAllowOrigin("*");

        Integer year_month_id = yearMonthService.findYearMonthIdByValues(new YearMonth(null,carbonVolum.getYear(),carbonVolum.getMonth())).getId();

        carbonWeightService.save(new CarbonWeight(null,carbonVolum.getWeight(),year_month_id,true));

        return new ResponseEntity<BackStatus>(new BackStatus("yes"),headers, HttpStatus.CREATED);

    }

    @RequestMapping(value = "/update_carbon_weight",method = RequestMethod.POST)
    public ResponseEntity<BackStatus> update_carbon_weight(@RequestBody CarbonVolum carbonVolum){

        HttpHeaders headers = new HttpHeaders();

        headers.setAccessControlAllowOrigin("*");

        System.out.println(carbonVolum+"被更新");

        //更新数据
//       查出年月对应的数据ID
        int year_month_id = yearMonthService.findYearMonthIdByValues(new YearMonth(null,carbonVolum.getYear(),carbonVolum.getMonth())).getId();

        carbonWeightService.update(new CarbonWeight(null,carbonVolum.getWeight(),year_month_id,true));

        return new ResponseEntity<BackStatus>(new BackStatus("yes"),headers,HttpStatus.CREATED);
    }


    @RequestMapping(value = "/get_year_carbon_weight/{year}", method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CarbonVolum>> get_year_carbon_veight(@PathVariable("year")String year){

        List<CarbonVolum> carbonVolums = new ArrayList<CarbonVolum>();

        carbonVolums = carbonWeightService.findCarbonVolumByYear(Integer.parseInt(year));

        return new ResponseEntity<List<CarbonVolum>>(carbonVolums,HttpStatus.OK);
    }


    @RequestMapping(value = "/get_x_param",method = RequestMethod.GET)
    public ResponseEntity<Params> get_x_param(){

        List<CarbonVolum> carbonVolums2014 = new ArrayList<CarbonVolum>();

        List<CarbonVolum> carbonVolums2015 = new ArrayList<CarbonVolum>();

        List<CarbonVolum> carbonVolums2016 = new ArrayList<CarbonVolum>();


        Params params = new Params();

        carbonVolums2014 = carbonWeightService.findCarbonVolumByYear(2014);

        carbonVolums2015 = carbonWeightService.findCarbonVolumByYear(2015);

        carbonVolums2016 = carbonWeightService.findCarbonVolumByYear(2016);

        double sumCarbonVolums2014 = 0.0;

        double sumCarbonVolums2015 = 0.0;

        double sumCarbonVolums2016 = 0.0;



        for (int i = 0 ; i < carbonVolums2014.size() ; i++){
            sumCarbonVolums2014 += carbonVolums2014.get(i).getWeight();
        }
        for (int i = 0 ; i < carbonVolums2015.size() ; i++){
            sumCarbonVolums2015 += carbonVolums2015.get(i).getWeight();
        }
        for (int i = 0 ; i < carbonVolums2016.size() ; i++){
            sumCarbonVolums2016 += carbonVolums2016.get(i).getWeight();
        }

//        一次回归分析

        final WeightedObservedPoints obs = new WeightedObservedPoints();

        obs.add(1,sumCarbonVolums2014);

        obs.add(2,sumCarbonVolums2015);

        obs.add(3,sumCarbonVolums2016);

        //一次函数拟合
        final PolynomialCurveFitter fitter = PolynomialCurveFitter.create(1);

        final double[] coeff = fitter.fit(obs.toList());

        params.setParam1(coeff[0]);
        params.setParam2(coeff[1]);

        //二次函数拟合
        final  PolynomialCurveFitter fitter1 = PolynomialCurveFitter.create(2);

        final double [] coeff1 = fitter1.fit(obs.toList());

        params.setParam3(coeff1[0]);
        params.setParam4(coeff1[1]);
        params.setParam5(coeff1[2]);

        return new ResponseEntity<Params>(params,HttpStatus.OK);
    }



    @RequestMapping(value = "/select_submit_year_month", method = RequestMethod.GET)
    public ResponseEntity<List<YearMonth>> select_submit_year_month(){

        List<YearMonth> yearMonthsSelected = yearMonthService.findYearMonthSelected();

        return new ResponseEntity<List<YearMonth>>(yearMonthsSelected,HttpStatus.OK);

    }



    @RequestMapping(value = "/uploadData",method = RequestMethod.POST)
    public ResponseEntity<BackStatus> uploadData(@RequestParam("file")MultipartFile uploadFile) throws IOException {

        HttpHeaders headers = new HttpHeaders();

        headers.setAccessControlAllowOrigin("*");

        String fileName = uploadFile.getOriginalFilename();

        InputStream is = uploadFile.getInputStream();

        boolean isE2013 = false;

        if (fileName.endsWith("xls")) {

            isE2013 = true;
        }

        Workbook workbook = isE2013 ? new HSSFWorkbook(uploadFile.getInputStream()) : new XSSFWorkbook(uploadFile.getInputStream());

        Sheet sheet = workbook.getSheetAt(0);


        /**
         * 现在一些填报过的数据删掉
         */
        carbonWeightService.deleteAll();

        for (int i = 2 ; i < sheet.getPhysicalNumberOfRows() ; i++){

            Row row = sheet.getRow(i);

            Cell cell1 = row.getCell(0);
            Cell cell2 = row.getCell(1);
            Cell cell3 = row.getCell(2);

            System.out.println((int) cell1.getNumericCellValue()+ "="+(int) cell2.getNumericCellValue()+"="+cell3.getNumericCellValue());


            /**
             * 先通过年月查到year_month_id
             */
            int year_month_id = yearMonthService.findYearMonthIdByValues(new YearMonth(null,(int)cell1.getNumericCellValue(),(int)cell2.getNumericCellValue())).getId();

            System.out.println(year_month_id);

            /**
             * 存储数据
             */
            carbonWeightService.save(new CarbonWeight(null,cell3.getNumericCellValue(),year_month_id,true));

        }


        return new ResponseEntity<BackStatus>(new BackStatus("yes"),headers,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/test_math")
    public void test_math(){

        final WeightedObservedPoints obs = new WeightedObservedPoints();
        obs.add(0.5,1.75);
        obs.add(1.0,2.45);
        obs.add(1.5,3.81);
        obs.add(2.0,4.80);
        obs.add(2.5,7.00);
        obs.add(3.0,8.60);

        final PolynomialCurveFitter fitter = PolynomialCurveFitter.create(1);

        final double[] coeff = fitter.fit(obs.toList());
        for (double c : coeff) {
            System.out.println(c);
        }

    }


}
