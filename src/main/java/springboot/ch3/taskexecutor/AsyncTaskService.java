package springboot.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author 朱赫 EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年12月18日 下午9:45:33
 * 
 */
@Service
public class AsyncTaskService {

	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("执行异步任务:" + i);
	}

	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.err.println("执行异步任务");
	}

}
