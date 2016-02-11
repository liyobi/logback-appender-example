package com.hello.logback.smtp;

import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.spi.ContextAwareBase;

public class TimeBasedEvaluator extends ContextAwareBase implements EventEvaluator {
	private long beforeTime = 0;
	
	private long intervalTime = 1000 * 60 * 5;
	
	private boolean isStarted = false;
	
	private String name;
	
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isStarted() {
        return isStarted;
    }

    public void start() {
        isStarted = true;
    }

    public void stop() {
        isStarted = false;
    }
}