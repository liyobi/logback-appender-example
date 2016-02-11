package com.hello.logback.smtp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmtpLog {

	private static Logger logger = LoggerFactory.getLogger(SmtpLog.class);
	
	public static void main(String[] args) {
		logger.trace("SmtpLog.");
		logger.debug("SmtpLog.");
		logger.info("SmtpLog.");
		logger.warn("SmtpLog.");
		logger.error("SmtpLog.");
	}

}
