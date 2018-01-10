package com.learningsystem.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * @Author : YangGuang
 * @Description:
 * @Date:Created in 10:25 2018/1/9
 * @Modified By:
 **/
@Controller
@RequestMapping("uploadController")
public class uploadController {

        //JSON形式返回给结果
        @ResponseBody
        //文件只能用POST方式进行传递
        @RequestMapping(value = "/upload", method = RequestMethod.POST)
        public void filesUpload(HttpServletRequest request, HttpServletResponse response,
                                @RequestParam("file") MultipartFile file) {

            //设置返回信息的编码格式及类型
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=utf-8");
            String callbackName = request.getParameter("callback");

            JSONObject json = new JSONObject();
            JSONArray array = new JSONArray();
            JSONObject resultJson = new JSONObject();

            // 获取文件名
            String filename = file.getOriginalFilename();
            // 判断文件是否为空
            if (!file.isEmpty()) {
                try {
                    // 传入的文件保存的路径，如果没有先进行创建文件
                    String FilePath = "target/upload/img";
                    File dir = new File(FilePath);
                    if (!dir.exists()) {
                        dir.mkdirs();
                    }
                    // 转存文件，否则所创建的是个文件夹
                    file.transferTo(new File(FilePath));
                    // 获取需要处理的文件
                    resultJson.put("data", "成功");
                    response.getWriter().write(callbackName + "([" + resultJson + "])");
                } catch (Exception e) {
                    System.out.println("文件转存失败");
                }
            } else {
                try {
                    resultJson.put("data", "空文件");
                    response.getWriter().write(callbackName + "([" + resultJson + "])");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}
