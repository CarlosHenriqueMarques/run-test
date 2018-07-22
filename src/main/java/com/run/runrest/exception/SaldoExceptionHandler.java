package com.run.runrest.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class SaldoExceptionHandler {

	private MessageSource messageSource;
	

	@Autowired
	public SaldoExceptionHandler(MessageSource messageSource) {
		this.messageSource = messageSource;

	}
	
	@ExceptionHandler
	@ResponseBody
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Object handle(NoContentException ex) {
		return ex;
	}
	
}
