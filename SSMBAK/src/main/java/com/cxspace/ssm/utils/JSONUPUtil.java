package com.cxspace.ssm.utils;

/**
 * Created by liujie on 2017/7/28.
 */
public class JSONUPUtil {
    private static String responseString = "";
    public static String toJSONPStr(String jsonStr , String callback){
        if (callback != null && !callback.isEmpty()) {
            responseString = callback + "(" + jsonStr + ")";
        } else {
            responseString = jsonStr;
        }
        return responseString;
    }
}
