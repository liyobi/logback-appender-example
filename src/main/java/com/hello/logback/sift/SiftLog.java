package com.hello.logback.sift;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * sift logging
 * ex) ss
 * @author dev
 *
 */
public class SiftLog {

	private static Logger logger = LoggerFactory.getLogger(SiftLog.class);
	
	public static void main(String[] args) {
		MDC.put("userid", "scott");
		logger.info("scott start application.");
		logger.info("scott end application.");
		
		MDC.put("userid", "tiget");
		logger.info("tiget start application.");
		logger.info("tiget end application.");
	    
	    MDC.clear();
	}

}
