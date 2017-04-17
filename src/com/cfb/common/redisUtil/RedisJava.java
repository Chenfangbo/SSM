package com.cfb.common.redisUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 *@describe 
 *@author 臻宝
 *@date 2017年4月11日 下午7:42:13
 */
public class RedisJava {
	
	private static Jedis redisCatch = null;
	
	public RedisJava() {}

	public static Jedis getInstance(){
		if(redisCatch == null){
			redisCatch = new Jedis("localhost");
		}
		return redisCatch;
	}
	
	private static Map<String,JedisPool> maps  = new HashMap<String,JedisPool>();
	/** 
     * 获取连接池. 
     * @return 连接池实例 
     */  
    private static JedisPool getPool(String ip,int port) {  
        String key = ip+":" +port;  
        JedisPool pool = null;  
        if(!maps.containsKey(key)) {  
            JedisPoolConfig config = new JedisPoolConfig();  
            config.setMaxTotal(500);
            //设置最大空闲数
            config.setMaxIdle(5);  
            //引入一个Jedis实例最大等待时间
            config.setMaxWaitMillis(1000*100L);
            //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的
            config.setTestOnBorrow(true);  
            config.setTestOnReturn(true);  
            try{    
                /** 
                 *如果你遇到 java.net.SocketTimeoutException: Read timed out exception的异常信息 
                 *请尝试在构造JedisPool的时候设置自己的超时值. JedisPool默认的超时时间是2秒(单位毫秒) 
                 */  
                pool = new JedisPool(config, ip, port,2000);  
                maps.put(key, pool);  
            } catch(Exception e) {  
                e.printStackTrace();  
            }  
        }else{  
            pool = maps.get(key);  
        }  
        return pool;  
    }  
    
    /** 
     * 释放redis实例到连接池. 
     * @param jedis redis实例 
     */  
    public void closeJedis(Jedis jedis,String ip,int port) {  
        if(jedis != null) {  
            getPool(ip,port).returnResource(jedis);  
            getPool(ip, port).destroy();
        }  
    }  
	
	

}
