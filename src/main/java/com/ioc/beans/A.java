package com.ioc.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class A {

	private String bid;

	public void setBid(String bid) {
		this.bid = bid;
	}

	public void m2() {

		B b;

		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("/com/ioc/config/application-context.xml"));
		b = (B) beanFactory.getBean(bid);

		System.out.println(b.hashCode());
		
		b.m1();
	}
}
