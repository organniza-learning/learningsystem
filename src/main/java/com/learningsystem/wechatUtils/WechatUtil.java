package com.learningsystem.wechatUtils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;

import org.apache.commons.codec.binary.Base64;

import net.sf.json.JSONObject;
/**
 * 小程序连接工具包
 * @author molu
 */
public class WechatUtil {
	// 微信小程序连接信息
	private static final String appSecret = "5b9f0f37df5cc32b2b7445728d53367f";
	private static final String url = "https://api.weixin.qq.com/sns/jscode2session";
	private static final String appId = "wx0f5ae24373944034";
	// 访问微信服务器
	public static JSONObject accessWechat(String code,String key,String iv){
		// 1.code+appid+appsecret 发送到微信服务器，返回 session_key+openid
		String param = "appid=" + appId + "&secret=" + appSecret + "&js_code=" + code
				+ "&grant_type=authorization_code";
		String result = HttpRequest.sendGet(url, param);
		JSONObject resultJson = JSONObject.fromObject(result);
		JSONObject userInfos = null;
		String session_key = (String) resultJson.get("session_key"); // session_key
		
		// 2.用session_key+key+iv 换取用户信息
		try {
			byte[] resultByte = AESUtil.decrypt(Base64.decodeBase64(key), Base64.decodeBase64(session_key),
					Base64.decodeBase64(iv));
			if (null != resultByte && resultByte.length > 0) {
				String userInfo = new String(resultByte, "UTF-8");
				System.out.println(userInfo);
				userInfos = JSONObject.fromObject(userInfo); // 将字符串{“id”：1}
				return userInfos;
			}
		} catch (InvalidAlgorithmParameterException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return userInfos;
	}
}
