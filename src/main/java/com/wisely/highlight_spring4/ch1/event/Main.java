package com.wisely.highlight_spring4.ch1.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 朱赫    EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月12日 下午9:15:00
 * 运行类
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher demoPublisher=context.getBean(DemoPublisher.class);
		demoPublisher.publish("hello application event");
		context.close();
    /**
     * <p>在这个例子学习中一直报一个错误就是bean类没有定义,实际上我肯定是写了的为什么会出现这样的问题我思考了许久觉得很不应该</p>
     * <p>我检查了好多代码发现没有问题在根据提示我觉得是没有找到这个类,那为什么在同一个包下还是找不到呢,我想到了配置类,配置类扫描指定包
     * 下的bean然后才使用,仔细发现了原来我的扫描的包名写错了才造成的</p>
     */
	}

}
