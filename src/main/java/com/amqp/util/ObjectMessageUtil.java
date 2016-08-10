package com.amqp.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * VO--String 转化 工具类
 * @author zhp
 */
public class ObjectMessageUtil {
	
	/**
	 * String 类型 转化 为 Object
	 * @param sourceStr
	 * @return
	 */
	public static Object transform2Object(String sourceStr){
		Object obj = null; 
		try {
			sourceStr = java.net.URLDecoder.decode(sourceStr,"UTF-8");
			ByteArrayInputStream input = new ByteArrayInputStream(sourceStr.getBytes("ISO-8859-1"));
			ObjectInputStream objectIn = new ObjectInputStream(input);
			obj = objectIn.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	/**
	 * Object 转化为 String
	 * @param obj
	 * @return
	 */
	public static String transform2String(Object obj){
		String str = "";
		try {
			ByteArrayOutputStream outputByte = new ByteArrayOutputStream();
			ObjectOutputStream objectObjectStream = new ObjectOutputStream(outputByte);
			objectObjectStream.writeObject(obj);
			str = outputByte.toString("ISO-8859-1");
			str = java.net.URLEncoder.encode(str,"UTF-8");
			objectObjectStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}
