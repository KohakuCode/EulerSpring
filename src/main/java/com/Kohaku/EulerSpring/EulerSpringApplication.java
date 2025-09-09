package com.Kohaku.EulerSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EulerSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EulerSpringApplication.class, args);
		var euler6 = context.getBean(Euler6.class);
		System.out.println(euler6.sumSquareDifference());
	}

}
