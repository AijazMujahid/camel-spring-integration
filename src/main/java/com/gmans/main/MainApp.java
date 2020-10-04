package com.gmans.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ctx.start();
		System.out.println("Application Context started");
		
		try {
			Thread.sleep(1000);
			//Thread.sleep(5*60*1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			ctx.stop();
			ctx.close();	
			System.out.println("Application Ended");
		}
	}
	
	

}
