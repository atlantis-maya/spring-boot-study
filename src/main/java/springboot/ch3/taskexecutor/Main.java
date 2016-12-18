package springboot.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 朱赫    EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年12月18日 下午9:49:46
 * 
 */
public class Main {
	public static void main(String[] args){
    	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
    	 AsyncTaskService asyncTaskService =context.getBean(AsyncTaskService.class);
    	 for (int i = 0; i <10; i++) {
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);
		}
    	 context.close();
     }
}
