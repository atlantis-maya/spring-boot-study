package com.wisely.highlight_spring4.ch1.prepost;

/**
 * @author 朱赫 EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月7日 下午9:41:48
 * 
 */
public class BeanWayService {
	public void init() {
		System.out.println("@Bean-init-method");
	}

	public BeanWayService() {
		super();
		System.out.println("初始化构造函数-BeanWayService");
	}

	public void destroy() {
		System.out.println("@Bean-destroy-method");
	}

}
