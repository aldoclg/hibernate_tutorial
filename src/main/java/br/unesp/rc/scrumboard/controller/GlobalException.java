package br.unesp.rc.scrumboard.controller;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice(basePackages = "br.unesp.rc.scrumboard.controller")
public class GlobalException {
	
	@ExceptionHandler(EntityNotFoundException.class)
	public ModelAndView handleEntityNotFoundException(EntityNotFoundException ex) {
		ModelAndView model = new ModelAndView("/");
		model.addObject("errMsg", ex.getMessage());
		return model;
	}

}
