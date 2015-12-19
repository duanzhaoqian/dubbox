package com.alibaba.dubbo.demo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoRest {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext(
				"META-INF/spring/dubbo-demo-provider-rest.xml");
		con.start();
		System.in.read();
	}

}
