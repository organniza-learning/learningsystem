package com.learningsystem.controller;

import com.alibaba.fastjson.JSONObject;
import com.learningsystem.utils.UploadFileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author : YangGuang
 * @Description:
 * @Date:Created in 10:25 2018/1/9
 * @Modified By:
 **/
@Controller
@RequestMapping("uploadController")
public class uploadController {

    //创建文件上传工具类
    UploadFileUtils uploadFileUtils = new UploadFileUtils();

    @ResponseBody
    @RequestMapping(value = "/uploadfile", method = RequestMethod.POST)
    public String filesUpload(HttpServletRequest request, HttpServletResponse response, @RequestParam("file") MultipartFile file) {
        //页面发送文件必须带上enctype=multipart/form-data属性
        JSONObject jsonObject = uploadFileUtils.filesUpload(request, response, file);
        String path = (String) jsonObject.get("path");
        System.err.println("controller中的pat：" + path);
        return path;
    }

    /**
    *@Author : YangGuang
    *@Description:多文件上传
    *@Date:Created in 15:21 2018/1/16
    *
    **/
    @ResponseBody
    @RequestMapping("uploadfiles")
    public JSONObject filesUpload(@RequestParam("files") MultipartFile[] files, HttpServletRequest request, HttpServletResponse response) {
        JSONObject jsonObject = new JSONObject();
        //判断file数组不能为空并且长度大于0
        if (files != null && files.length > 0) {
            //循环获取file数组中得文件
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                //保存文件
                 String path = String.valueOf(uploadFileUtils.filesUpload(request, response, file));
                 jsonObject.put("第"+ i + "个文件：",path);
            }
        }
        return jsonObject;
    }
}
