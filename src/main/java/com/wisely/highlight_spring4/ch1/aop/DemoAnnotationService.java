package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年8月19日 下午9:38:54
* 
*/
@Service
public class DemoAnnotationService {
   @Action(name="注解式拦截的add操作")
   public void add(){}
}
