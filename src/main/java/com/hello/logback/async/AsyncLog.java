package com.hello.logback.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 비동기 로깅의 경우 Method name, Line Number 등이 출력되지 않는다.
 * WARN 이하 레벨의 로그는 기본적으로 20% 유실 될 수 있다
 * 비동기 큐에 로그가 쌓인 상태에서 프로세스가 종료되면 해당 로그는 기록되지 않고 종료된다.
 * 	The maximum capacity of the blocking queue. By default, queueSize is set to 256.
 */
public class AsyncLog {

	private static Logger logger = LoggerFactory.getLogger(AsyncLog.class);
	
	public static void main(String[] args) {
		logger.info("start application.");

	    logger.info("end application.");


	}

}
