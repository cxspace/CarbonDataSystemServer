package com.cxspace.ssm.utils;


import java.text.SimpleDateFormat;



import java.sql.Timestamp;
import java.util.Date;

public class DateTimeHelper {

    public static String getCurrentTime(){

        SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

        return df.format(new Date());

    }

    public static Timestamp stringToTimestamp(String time){
        //把String转换为Timestamp
        return Timestamp.valueOf(time);
    }

    public static String timestampToSecString(Timestamp timestamp){
        //把Timestamp转换为以秒为精度的String
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(timestamp);
    }

    public static String timestampToDayString(Timestamp timestamp){
        //把Timestamp转换为以天为精度的String
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(timestamp);
    }

    public static Timestamp YMDToTimestamp(int year,int month,int day){
        //接受年月日转化为Timestamp
        String time = year+"-"+month+"-"+day+" 00:00:00";
        return stringToTimestamp(time);
    }

    /**
     * 把YYYYMM或YYYYMMDD或YYYY格式的
     * @param ordinaryString 4位6位或8位字符串
     * @return 转化成的timestamp
     */
    public static Timestamp ordinaryStringToTimestamp(String ordinaryString) {

        if("".equals(ordinaryString)) {
            return null;
        }
        int numberOfString = Integer.valueOf(ordinaryString.trim());

        if(numberOfString<1000){
            return null;
        }
        if(numberOfString<100000){
            numberOfString*=10000;
            numberOfString+=101;
        } else if(numberOfString < 10000000) {
            numberOfString *= 100;
            numberOfString += 1;
        }
        int year, month, day;
        day = numberOfString%100;
        numberOfString /= 100;
        month = numberOfString%100;
        year = numberOfString/100;
        return YMDToTimestamp(year, month, day);
    }

}
