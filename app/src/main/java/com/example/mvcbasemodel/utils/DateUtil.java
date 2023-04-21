package com.example.mvcbasemodel.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static SimpleDateFormat simpleDateFormat;

    /**
     * 按照指定的格式获取日期
     * @param date 日期对象
     * @param format 指定的格式
     * @return 指定格式的时间字符串
     */
    public static String getDateString(Date date, String format) {
        simpleDateFormat = new SimpleDateFormat(format);
        String time = simpleDateFormat.format(date);
        return time;
    }
}
