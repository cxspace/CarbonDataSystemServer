package com.cxspace.ssm.service.impl;

import com.cxspace.ssm.dao.CarbonWeightDao;
import com.cxspace.ssm.model.CarbonVolum;
import com.cxspace.ssm.model.CarbonWeight;
import com.cxspace.ssm.service.CarbonWeightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("carbonWeightServiceImpl")
public class CarbonWeightServiceImpl implements CarbonWeightService{

    @Resource
    private CarbonWeightDao carbonWeightDao;

    public Integer save(CarbonWeight carbonWeight) {
        return carbonWeightDao.save(carbonWeight);
    }

    public Integer update(CarbonWeight carbonWeight) {
        return carbonWeightDao.update(carbonWeight);
    }

    public void deleteAll() {
        carbonWeightDao.deleteAll();
    }

    public List<CarbonVolum> findCarbonVolumByYear(Integer year) {
        return carbonWeightDao.findCarbonVolumByYear(year);
    }
}
