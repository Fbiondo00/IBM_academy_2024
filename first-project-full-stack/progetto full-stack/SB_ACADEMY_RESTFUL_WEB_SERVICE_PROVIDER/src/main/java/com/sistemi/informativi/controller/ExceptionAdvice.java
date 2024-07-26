package com.sistemi.informativi.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.sistemi.informativi.exception.ErrorMessage;

/*
 * Grazie all'annotation @RestControllerAdvice
 * questa classe a runtime sta in ascolto su eventuali
 * eccezioni che si verificano nei RestController e 
 * possiamo chiedere che, al verificarsi di una o piu' eccezioni,
 * venga restituito un json CUSTOM
 */
@RestControllerAdvice
public class ExceptionAdvice {
	
	/*
	 * Tramite l'annotation @ExceptionHandler chiediamo che,
	 * al verificarsi dell'eccezione MethodArgumentNotValidException,
	 * venga eseguito il metodo notValidExceptionHandler.
	 * Nel caso specifico il metodo notValidExceptionHandler
	 * si occupa di restituire un Oggetto ErrorMessage che verrà
	 * convertito in un json con messaggio custom
	 * 
	 * 
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(value= HttpStatus.BAD_REQUEST)
    public ErrorMessage notValidExceptionHandler(Exception ex, WebRequest request) {

        ErrorMessage message = new ErrorMessage(HttpStatus.BAD_REQUEST.value(), new Date(),
                "code must of be of 4 characters", "wrong code");

        return message;

    }


}
