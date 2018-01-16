package com.learningsystem.utils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @Author : YangGuang
 * @Description:移除Bean中为null值的字段
 * @Date:Created in 10:53 2018/1/11
 * @Modified By:
 **/
public class RemoveNullJsonUtils {

    JSONArray jsonArray = new JSONArray();

    public JSONObject removeBeanNull(Object object, HttpServletRequest request, HttpServletResponse response){
        //设置过滤json格式
        JsonConfig jsonConfig = new JsonConfig();
        //创建过滤器
        PropertyFilter filter = new PropertyFilter() {
            public boolean apply(Object object, String fieldName, Object fieldValue) {
                if(fieldValue instanceof List){
                    List<Object> list = (List<Object>) fieldValue;
                    if (list.size()==0) {
                        return true;
                    }
                }
                return null == fieldValue || "".equals(fieldValue);
            }
        };
        //加载
        jsonConfig.setJsonPropertyFilter(filter);
        //转换
        JSONArray jsonArray = JSONArray.fromObject(object,jsonConfig);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data",jsonArray);
        try {
            //保证返回值中文的时候不乱码
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭getWriter
            response.reset();
        }
        System.err.println(jsonArray.toString());
        return jsonObject;
    }

    public void add(int key,Object object){
        jsonArray.add(key,object);
    }

    
    public JSONArray removeBeanNullByArray(Object object, HttpServletRequest request, HttpServletResponse response){
        //设置过滤json格式
        JsonConfig jsonConfig = new JsonConfig();
        //创建过滤器
        PropertyFilter filter = new PropertyFilter() {
            public boolean apply(Object object, String fieldName, Object fieldValue) {
                if(fieldValue instanceof List){
                    List<Object> list = (List<Object>) fieldValue;
                    if (list.size()==0) {
                        return true;
                    }
                }
                return null == fieldValue || "".equals(fieldValue);
            }
        };
        //加载
        jsonConfig.setJsonPropertyFilter(filter);
        //转换
        JSONArray jsonArray = JSONArray.fromObject(object,jsonConfig);
        try {
            //保证返回值中文的时候不乱码
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭getWriter
            response.reset();
        }
        System.err.println(jsonArray.toString());
        return jsonArray;
    }
}
