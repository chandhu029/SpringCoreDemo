package corejava;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) 
	
	{
		Resource resource =new ClassPathResource("hello.xml");
		BeanFactory	beanFactory	=new XmlBeanFactory(resource);
		System.out.println("container activated");
	HelloBean hb	= (HelloBean) beanFactory.getBean("helloBean");
	
//	ApplicationContext
	
	System.out.println("The message is:" + hb.getMessage());
	
	}

}
