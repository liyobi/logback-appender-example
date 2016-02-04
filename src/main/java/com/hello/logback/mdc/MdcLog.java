package com.hello.logback.mdc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * mdc add logging
 * ex) %X{host} : host mdc
 *     %mdc : all mdc key=value (host=127.0.0.1, userid=dec)
 * @author dev
 *
 */
public class MdcLog {

	private static Logger logger = LoggerFactory.getLogger(MdcLog.class);
	
	public static void main(String[] args) {
		MDC.put("userid", "scott");
		
		logger.info("start application.");
		
		MDC.put("host", "127.0.0.1");
		logger.info("add host.");
		
	    MDC.remove("host");
	    logger.info("remove host.");
	    
	    MDC.put("host", "127.0.0.1");
	    logger.info("end application.");
	    
	    MDC.clear();
	}

}
