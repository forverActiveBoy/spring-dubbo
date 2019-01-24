package org.apache.test;

import java.io.IOException;

import org.apache.inter.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, InterruptedException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		OrderService orderService = applicationContext.getBean(OrderService.class);
		orderService.initOrder("1");
		System.out.println("调用完成....");
        Thread.sleep(Long.MAX_VALUE);
	}

}
