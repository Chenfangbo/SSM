package com.cfb.blog.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import net.sf.ehcache.util.PropertyUtil;

/**
 *@describe 读取properties文件信息
 *@author 臻宝
 *@date 2017年3月25日 下午9:23:39
 */
public class PropertiesUtil {
	
	private static Logger logger = Logger.getLogger(PropertiesUtil.class);
	
	public static String getV(String param){
		Properties properties = new Properties();
		InputStream in = null;
		try {
			in = PropertyUtil.class.getClassLoader().getResourceAsStream("config.properties");
			if(in == null){
				logger.error("配置文件读取失败...");
				return null;
			}
			properties.load(in);
			String value = properties.getProperty(param);
			if(value != null){
				return value;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				logger.error("文件流关闭异常...");
				e.printStackTrace();
			}
		}
		return null;
	}

}
