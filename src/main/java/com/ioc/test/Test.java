package com.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ioc.beans.Humpty;
import com.ioc.beans.MessageDisplay;

public class Test {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("/com/ioc/config/application-context.xml"));
		
		//Humpty humpty = (Humpty)beanFactory.getBean("humpty");
		
		//humpty.showDumpty();
		
		MessageDisplay messageDisplay = beanFactory.getBean("messagedisplay", MessageDisplay.class);
		
		messageDisplay.display("Hello");
		
		
		

	}

}
