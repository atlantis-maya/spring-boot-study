package springboot.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @author 朱赫 EmailAddress:zhuhe.6@163.com
 * @version JDK1.8
 * @createtime 2016年10月12日 下午10:30:29
 * 
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;
	private ResourceLoader loader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;

	}

	public void outputResult() {
		System.out.println("Bean的名称为: " + beanName);

		Resource resource = loader
				.getResource("classpath:springboot/ch3/aware/test.txt");
		try {
			System.out.println("ResourceLoader加载的文件内容为:"
					+ IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
