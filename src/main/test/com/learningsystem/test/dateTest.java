package com.learningsystem.test;

import com.learningsystem.utils.LearningUtils;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : YangGuang
 * @Description:
 * @Date:Created in 13:20 2018/1/9
 * @Modified By:
 **/
public class dateTest {

    @Test
    public void test(){
        DateFormat d2=DateFormat.getDateTimeInstance();
        String date =  d2.format(new Date());
        System.out.println(date);

        SimpleDateFormat sdf=new SimpleDateFormat("y年M月d日");
        System.out.println(sdf.format(new Date()));

        LearningUtils learningUtils = new LearningUtils();
        System.out.println(learningUtils.randoms(1000));
        }





}
