package com.github.vspiewak.loggenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionRequest implements Runnable {
	
	private static final Logger log = LoggerFactory.getLogger(ExceptionRequest.class);
	
	@Override
	public void run() {
		log.error("Unexpected error", new RuntimeException());
	}

}
