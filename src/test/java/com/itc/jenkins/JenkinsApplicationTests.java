package com.itc.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {
	public static Logger Logger=LoggerFactory.getLogger(JenkinsApplication.class);
	
	@Test
	void contextLoads() {
		Logger.info("***************Test case executed*********");
		assertEquals(true,true);
		
	}

}
