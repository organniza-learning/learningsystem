package com.learningsystem.utils;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.web.multipart.MultipartFile;

public class QiniuUtil {
	// ...生成上传凭证，然后准备上传
	private static String accessKey = "-t7_IiDD7Fh0KnIs9ZdNaVKFwSzAh2j7_6rquVHb";
	private static String secretKey = "_3r0rDLXEH-74A0nQ_swOJI_sSMrpfVrTkxpy_8B";
	private static String bucket = "studyonline";
	// 构造一个带指定Zone对象的配置类 Zone.zone2() 华南区服务器
	private Configuration cfg = new Configuration(Zone.zone2());
	// ...其他参数参考类注释
	private UploadManager uploadManager = new UploadManager(cfg);
	// 时间格式解析
	LearningUtils learningUtils = new LearningUtils();

	/**
	 * 获得upToken
	 */
	public String getUpToken() {
		Auth auth = Auth.create(accessKey, secretKey);
		String upToken = auth.uploadToken(bucket);
		return upToken;
	}

	/**
	 * 生成文件名 格式：文件类型/文件用途/时间/随机生成文件名
	 */
	public String getFileName(String fileType, String fileUse) {
		String fileName = fileType + "/" + fileUse + "/" + learningUtils.date_yyyymmdd() + "/" + new Date().getTime()
				+ "_" + new Random().nextInt(1000);
		return fileName;
	}

	public String upload(MultipartFile file){
		//构造一个带指定Zone对象的配置类
		Configuration cfg = new Configuration(Zone.zone2());
		//...其他参数参考类注释
		UploadManager uploadManager = new UploadManager(cfg);

		//默认不指定key的情况下，以文件内容的hash值作为文件名
		String key = learningUtils.date_yyyy_mm_dd() + "/images/"+learningUtils.randoms(99999999)+learningUtils.randoms(9999);
		//byte[] uploadBytes = "hello qiniu cloud".getBytes("utf-8");
		Auth auth = Auth.create(accessKey, secretKey);
		String upToken = auth.uploadToken(bucket);
		String path = null;
		try {
			Response response = uploadManager.put(file.getBytes(), key, upToken);
			//解析上传成功的结果
			DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
			path = putRet.key;
			System.out.println(putRet.key);
			System.out.println(putRet.hash);
		} catch (QiniuException ex) {
			Response r = ex.response;
			System.err.println(r.toString());
			try {
				System.err.println(r.bodyString());
			} catch (QiniuException ex2) {
				ex.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
}