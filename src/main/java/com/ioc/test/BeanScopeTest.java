package com.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ioc.beans.A;

public class BeanScopeTest {
	
	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("/com/ioc/config/application-context.xml"));
		
		A a =(A)beanFactory.getBean("a", A.class);
		
		System.out.println(a.hashCode());
		
		a.m2();
		
		 a =(A)beanFactory.getBean("a", A.class);
		
		 System.out.println(a.hashCode());
		 
		a.m2();
		
	}

}
