package com.wisely.highlight_spring4.ch1.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 朱赫 EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月7日 下午9:45:06
 * 
 */
public class JSR250WayService {

	@PostConstruct
	public void init() {
		System.out.println("jsr250-init-method");
	}

	public JSR250WayService() {
		super();
		System.out.println("初始化构造函数-JSR250WayService");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("jsr250-destroy-method");
	}
}
