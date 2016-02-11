package com.hello.logback.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbLog {

	private static Logger logger = LoggerFactory.getLogger(DbLog.class);
	
	public static void main(String[] args) {
		logger.trace("DbLog.");
		logger.debug("DbLog.");
		logger.info("DbLog.");
		logger.warn("DbLog.");
		logger.error("DbLog.");

	}

}
