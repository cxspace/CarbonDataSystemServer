package com.cxspace.ssm.service;

import com.cxspace.ssm.model.CarbonVolum;
import com.cxspace.ssm.model.CarbonWeight;

import java.util.List;

public interface CarbonWeightService {

    /**
     * 存储一个重量纪录
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
