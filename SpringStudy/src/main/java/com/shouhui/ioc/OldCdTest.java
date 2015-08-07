package com.shouhui.ioc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OldCdTest {

	ClassPathXmlApplicationContext ctx;
	@Before
	public void setUp() throws Exception {
		ctx = 
				new ClassPathXmlApplicationContext("classpath:beans.xml");
		
		ctx.start();
	}

	@Test
	public void testPlay() {
		Cd cd = ctx.getBean(OldCd.class);
		System.out.println(cd);
	
	}
	

}
