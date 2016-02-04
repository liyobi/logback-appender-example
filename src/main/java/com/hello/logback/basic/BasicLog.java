package com.hello.logback.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicLog {

	private static Logger logger = LoggerFactory.getLogger(BasicLog.class);
	
	public static void main(String[] args) {
		logger.trace("BasicLog.");
		logger.debug("BasicLog.");
		logger.info("BasicLog.");
		logger.warn("BasicLog.");
		logger.error("BasicLog.");

	}

}
