package com.cxspace.ssm.dao;

import com.cxspace.ssm.model.CarbonVolum;
import com.cxspace.ssm.model.CarbonWeight;

import java.util.List;

public interface CarbonWeightDao {

    /**
     * 存储一个碳重量数据纪录
     * @param carbonWeight
     * @return
     *
     */

    public Integer save(CarbonWeight carbonWeight);

    /**
     * 更新一个碳重量数据记录
     * @param carbonWeight
     * @return
     */

    public Integer update(CarbonWeight carbonWeight);

    /**
     * 清空填报的数据表
     */
    public void deleteAll();

    /**
     * 通过年份查看月度碳排量
     * @param year
     * @return
     */

    public List<CarbonVolum> findCarbonVolumByYear(Integer year);

}
