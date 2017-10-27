package com.cxspace.ssm.dao;

import com.cxspace.ssm.model.YearMonth;

import java.util.List;

public interface YearMonthDao {

    /**
     * 通过年份和月份查询记录id
     *
     * @return
     */

    public YearMonth findYearMonthIdByValues(YearMonth yearMonth);


    /**
     * 查询已经填报过数据的年月
     * @return
     *
     */
    public List<YearMonth> findYearMonthSelected();

}
