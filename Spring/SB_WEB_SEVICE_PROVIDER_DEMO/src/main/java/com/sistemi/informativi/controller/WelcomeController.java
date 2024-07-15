package com.sistemi.informativi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemi.informativi.bean.MessageBean;

	@RestController
	public class WelcomeController {
		
		/*
		 * Esposizione di una operazione
		 * rest composta dalla coppia:
		 * 
		 * GET (VERBO HTTP) + URI "welcome"
		 * Tutte le applicazioni Consumer 
		 * che intendacono consumare questa
		 * operazione dovranno eseguire la
		 * seguente richiesta http:
		 * 
		 * http://localhost:8080/welcome
		 */
		@GetMapping("/welcome")
		public MessageBean welcome(){
			
			return new MessageBean("welcome");
		}


}
