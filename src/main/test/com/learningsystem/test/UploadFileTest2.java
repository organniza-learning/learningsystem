package com.learningsystem.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @Author : YangGuang
 * @Description:
 * @Date:Created in 20:04 2018/1/8
 * @Modified By:
 **/
@Controller
@RequestMapping("UploadFileTest2")
public class UploadFileTest2 {

    @Autowired
    private HttpServletRequest request;

    /***
     * 上传文件 用@RequestParam注解来指定表单上的file为MultipartFile
     *
     * @param file
     * @return
     */
//    private boolean saveFile(MultipartFile file) {
//        // 判断文件是否为空
//        if (!file.isEmpty()) {
//            try {
//                // 文件保存路径
//                String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"
//                        + file.getOriginalFilename();
//                // 转存文件
//                file.transferTo(new File(filePath));
//                return true;
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return false;
//    }

    /***
     * 读取上传文件中得所有文件并返回
     *
     * @return
     */
    @RequestMapping("list")
    public ModelAndView list() {
        String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/";
        System.err.println(filePath);
        ModelAndView mav = new ModelAndView("list");
        File uploadDest = new File(filePath);
        String[] fileNames = uploadDest.list();
        for (int i = 0; i < fileNames.length; i++) {
            //打印出文件名
            System.out.println(fileNames[i]);
        }

        return mav;
    }

    /***
     * 保存文件
     * @param file
     * @return
     */
    private boolean saveFile(MultipartFile file) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                // 文件保存路径
                String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"
                        + file.getOriginalFilename();
                // 转存文件
                file.transferTo(new File(filePath));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
//    编写action:
    @RequestMapping("filesUpload")
    public String filesUpload(@RequestParam("files") MultipartFile[] files) {
        //判断file数组不能为空并且长度大于0
        if(files!=null&&files.length>0){
            //循环获取file数组中得文件
            for(int i = 0;i<files.length;i++){
                MultipartFile file = files[i];
                //保存文件
                saveFile(file);
            }
        }
        // 重定向
        return "redirect:/list.html";
    }
}
