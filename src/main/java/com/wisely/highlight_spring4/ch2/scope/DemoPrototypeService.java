package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
* @author 朱赫    EmailAddress:zhuhe.6@163.com
* @version JDK1.8
* @createtime 2016年8月22日 下午8:18:42
* 
*/
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
