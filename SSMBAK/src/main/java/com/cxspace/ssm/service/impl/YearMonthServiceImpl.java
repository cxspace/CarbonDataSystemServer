package com.cxspace.ssm.service.impl;

import com.cxspace.ssm.dao.YearMonthDao;
import com.cxspace.ssm.model.YearMonth;
import com.cxspace.ssm.service.YearMonthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("yearMonthServiceImpl")
public class YearMonthServiceImpl  implements YearMonthService {

    @Resource
    private YearMonthDao yearMonthDao;

    public YearMonth findYearMonthIdByValues(YearMonth yearMonth) {
        return yearMonthDao.findYearMonthIdByValues(yearMonth);
    }

    public List<YearMonth> findYearMonthSelected() {
        return yearMonthDao.findYearMonthSelected();
    }
}
