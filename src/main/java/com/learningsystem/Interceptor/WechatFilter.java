package com.learningsystem.Interceptor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONTokener;

/**
 * 内容过滤器
 * 
 * @author molu
 *
 */
public class WechatFilter {
	/**
	 * 过滤pojo类中掉中的无用数据及敏感数据
	 * @author molu
	 * @throws IOException	
	 * @param obj		需要处理的类
	 * @param strings	需要过滤的内容，目前只能过滤两层jsonobject
	 * @return			过滤后的内容
	 */
	public static <T> JSONObject FilterIsNull(T obj, String[]... strings) {
		ObjectMapper mapper = new ObjectMapper();
		// 1.把需要的类转变成json格式
		String jsonStr = "";
		try {
			jsonStr = mapper.writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONObject json = JSONObject.fromObject(obj);

		// 2.拿出json中的所有key 放入set中
		Set<Object> set = json.keySet();
		Iterator<Object> it = set.iterator();

		List<Object> list = new ArrayList<Object>();
		// 此状态的set不支持删除，会报UnsupportedOperationException 错误，采取曲线救国方式
		/*
		for (int i = 0; i < set.size(); i++) {
			Object key = it.next();
			if (json.get(key).equals("")) {
				it.remove();
				i--;
			}
		}
		*/
		// 3.遍历处理需要过滤的内容
		for (int k = strings.length; k <= strings.length; k++) {
			for (int i = 0; i < set.size(); i++) {
				Object key = it.next();
				// JSONTokener(json.get(key).toString()).nextValue();	
				// 判断value 值是否是 JSONObject
				if (json.get(key) instanceof String || json.get(key) instanceof Integer) {
					if (json.get(key).equals("")) {
						list.add(key);
					}
					for (int j = 0; j < strings[0].length; j++) {
						if (key.equals(strings[0][j]) || key == strings[0][j]) {
							list.add(key);
						}
					}
				} else if (new JSONTokener(json.get(key).toString()).nextValue() instanceof JSONObject) {// 判断是否是jsonobject
					JSONObject jo = WechatFilter.FilterIsNull(json.get(key), strings[k - 1]);
					json.put(key, jo);
				}
			}
			for (Object object : list) {
				json.remove(object);
			}
		}

		return json;
	}

}
