package com.alibaba.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.demo.user.User;
import com.alibaba.dubbo.demo.user.facade.AnotherUserRestService;

public class DemoRest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext(
				"META-INF/spring/dubbo-demo-consumer-rest.xml");
		AnotherUserRestService ser = con.getBean(AnotherUserRestService.class);
		User user = ser.getUser((long) 1);
		System.out.println(user.getName());
	}

}
