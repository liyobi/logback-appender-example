package com.hello.logback.smtp;

import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.spi.ContextAwareBase;
/**
 * 
 * 
 *
 */
public class CounterBasedEvaluator extends ContextAwareBase implements EventEvaluator {

	static int LIMIT = 1024;
	int counter = 0;
	String name;
	private boolean isStarted = false;
	
	@Override
	public boolean evaluate(Object event) throws NullPointerException,	EvaluationException {
		counter++;

		if (counter == LIMIT) {
			counter = 0;

			return true;
		} else {
			return false;
		}
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