package com.wisely.highlight_spring4.ch1.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 朱赫 EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月7日 下午9:46:14
 * 
 */
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		
		@SuppressWarnings("unused")
		BeanWayService beanwayservice = context.getBean(BeanWayService.class);
		
		@SuppressWarnings("unused")
		JSR250WayService jsr250wayservice = context.getBean(JSR250WayService.class);
		context.close();
	}
}
