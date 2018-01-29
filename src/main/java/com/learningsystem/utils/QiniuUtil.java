package com.learningsystem.utils;

import java.util.Date;
import java.util.Random;

import com.qiniu.common.Zone;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

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
}