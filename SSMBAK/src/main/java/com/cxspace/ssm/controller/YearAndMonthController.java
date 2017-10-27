package com.cxspace.ssm.controller;


import com.cxspace.ssm.model.BackStatus;
import com.cxspace.ssm.model.YearMonth;
import com.cxspace.ssm.service.CarbonWeightService;
import com.cxspace.ssm.service.YearMonthService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class YearAndMonthController {



    /**
     *
     * 用户选择填报的年月
     *
     * @return
     * @throws Exception
     */


    @RequestMapping("/select_year_month")
    public ResponseEntity<BackStatus> stroy_edit(@RequestBody YearMonth yearMonth) throws Exception{

        System.out.println(yearMonth+"==============");
        HttpHeaders headers = new HttpHeaders();
        headers.setAccessControlAllowOrigin("*");



        return new ResponseEntity<BackStatus>(new BackStatus("yes"),headers, HttpStatus.CREATED);

    }

}
