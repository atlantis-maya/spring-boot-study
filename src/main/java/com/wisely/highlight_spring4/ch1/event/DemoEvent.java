package com.wisely.highlight_spring4.ch1.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author 朱赫 EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月12日 下午8:41:59 自定义事件
 */
public class DemoEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;
	private String msg;

	public DemoEvent(Object source, String msg) {
		super(source);
		this.msg = msg;

	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
