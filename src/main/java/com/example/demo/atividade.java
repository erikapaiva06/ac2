package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class atividade {

	 	
		 @RequestMapping(value = "/multiplicacao/{numero1}/{numero2}", method = RequestMethod.GET)

	 			public Integer multiplicacao(@PathVariable Integer numero1, @PathVariable Integer numero2) {
	       
	 	
	 	Integer resultado;
	 	
	 	resultado = numero1 * numero2;
	 	
	 	
	 	return resultado;

	 	}
	 

	 }


