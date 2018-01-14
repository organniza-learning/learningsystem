package com.learningsystem.utils;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @Author : YangGuang
 * @Description:工具集合类
 * @Date:Created in 14:37 2018/1/9
 * @Modified By:
 **/
public class LearningUtils {

    //只带年月日的日期 y年M月d日
    public String date_ymd(){
        SimpleDateFormat sdf=new SimpleDateFormat("y年M月d日");
        return sdf.format(new Date());
    }

    //只带数字的年月日 20180105
    public String date_yyyymmdd(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        return sdf.format(new Date());
    }

    //只带数字的年月日 2018-01-05
    public String date_yyyy_mm_dd(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.err.println(sdf.format(new Date()));
        return sdf.format(new Date());
    }

    //随机数
    public Integer randoms(Integer nums){
        Random random = new Random();
        Integer s = random.nextInt(nums);
        return s;

    }

    public static void main(String[] agrs){
        LearningUtils learningUtils= new LearningUtils();
        learningUtils.date_yyyy_mm_dd();
    }
}
