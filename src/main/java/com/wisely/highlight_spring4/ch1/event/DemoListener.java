package com.wisely.highlight_spring4.ch1.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author 朱赫 EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月12日 下午9:01:59
 * 
 *             事件监听器
 */
// 实现Applicationlistener接口,并指定监听事件类型

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	// 使用onApplicationEvent方法对消息进行处理
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息:"+ msg);

	}

}
