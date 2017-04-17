package com.cfb.common.log4jUtil;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;

/**
 *@describe 
 *@author 臻宝
 *@date 2017年3月23日 下午10:57:47
 */
public class MyDailyRollingFileAppender extends DailyRollingFileAppender{

	/**
	 * 这里有两个需要注意的地方:
	 * 第一个地方是在log4j.properties文件中
	 * log4j.appender.infoTarget.Threshold属性一定要指定，
	 * 属性值为等级（INFO,ERROR等），后面需要用到此属性进行判断是否要写入文件，
	 * 第二个个地方是类MyDailyRollingFileAppender继承了DailyRollingFileAppender
	 * 并重写了isAsSevereAsThreshold方法，此方法决定等级为Threshold属性值的日志信息是否要写入日志。
	 * 本例中当调用error方法写入错误日志的时候，此日志信息写入到Threshold属性值为ERROR的目的地文件中，
	 * 即${catalina.home}/logs/app/error.log文件。
	 * */
	@Override
	public boolean isAsSevereAsThreshold(Priority priority) {
        String level = priority.toString();
        //this.getThreshold()即为配置文件中Threshold属性
        return this.getThreshold().equals(priority);
    }
}
