package com.wisely.highlight_spring4.ch1.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author 朱赫 EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月12日 下午9:06:07 事件发布类
 */

@Component
public class DemoPublisher {
	@Autowired
	// 注入ApplicationContext用来发布事件
	ApplicationContext applicationContext;

	public void publish(String msg) {
		// ApplicationContext的publishEvent方法来发布
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}
