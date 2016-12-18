package com.wisely.highlight_spring4.ch1.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 朱赫 EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月7日 下午9:45:55
 * 
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.prepost")
public class PrePostConfig {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	BeanWayService beanWayService() {
		return new BeanWayService();
	}

	@Bean
	JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}

}
