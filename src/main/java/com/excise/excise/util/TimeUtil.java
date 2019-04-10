package com.excise.excise.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    public static String date2Str(Date date, String str){
        SimpleDateFormat sdf = new SimpleDateFormat(str);
        return sdf.format(date);
    }



}
