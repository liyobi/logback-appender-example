package com.hello.logback.file;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RollingLog {
private static Logger logger = LoggerFactory.getLogger(RollingLog.class);
	
	public static void main(String[] args) {
		logger.info("start application.");

	    logger.info("end application.");

	}
}
