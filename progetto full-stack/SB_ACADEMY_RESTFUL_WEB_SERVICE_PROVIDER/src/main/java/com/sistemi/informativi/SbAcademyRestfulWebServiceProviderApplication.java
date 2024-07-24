package com.sistemi.informativi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;


/*
 * L'annotation @EnableCaching
 * abilita la cache di secondo livello
 * di Hibernate
 */
@SpringBootApplication
//@EnableCaching
public class SbAcademyRestfulWebServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAcademyRestfulWebServiceProviderApplication.class, args);
	}
	
	/*
	 * Grazie all'annotation @Bean
	 * chiediamo espressamente a Spring Boot
	 * di caricare,all'avvio dell'appplicazione,
	 * il Bean di Hazelcast e possiamo settare
	 * un nome per la cache tramite il metodo
	 * setInstanceName e setName (nel nostro
	 * caso academies)
	 */



}
