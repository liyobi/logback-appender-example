package com.hello.logback.smtp;

import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.spi.ContextAwareBase;

public class TimeBasedEvaluator extends ContextAwareBase implements EventEvaluator {
	private long beforeTime = 0;
	
	private long intervalTime = 1000 * 60 * 5;

	@Override
	public boolean evaluate(Object event) throws NullPointerException, EvaluationException {
		long current = System.currentTimeMillis();
		long backupBeforeTime = this.beforeTime;

		if (current - backupBeforeTime > intervalTime) {
			this.beforeTime = current;
			return true;
		}
		return false;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isStarted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
}