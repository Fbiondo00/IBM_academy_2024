package com.sistemi.informativi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.hateoas.EntityModel;

import org.springframework.web.bind.annotation.*;

import com.sistemi.informativi.entity.Academy;
import com.sistemi.informativi.service.AcademyService;

import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


import jakarta.validation.Valid;

/*
 * TEST DA EFFETTUARE TRAMITE POSTMAN

 * GET http://localhost:8080/rest/api/academies (all academies)
 * GET http://localhost:8080/rest/api/academies/code/{code} (una academy per code)
 * POST http://localhost:8080/rest/api/academies (una academy inserita sul database)
 * PUT http://localhost:8080/rest/api/academies (una academy inserita sul database)
 * DELETE http://localhost:8080/rest/api/academies/code/{code} (messaggio di cancellazione corretta)
 */

/*
 * L'annotation @RequestMapping
 * consente di identificare l'intero
 * Web Service Provider con un superpath
 * 
 * In pratica tutte le operazioni
 * esposte dal servizio avranno un prefisso
 * comune di uri: /rest/api/academies
 *
 * @CrossOrigin cosente di rendere disponibile
 * il servizio web Service Provider ad applicazioni esterne
 * (remote)
 */
@CrossOrigin
@RestController
@RequestMapping("/rest/api/academies")
public class AcademyController {

	// Dependency Injection Service Layer
	private AcademyService academyService;

	public AcademyController(AcademyService academyService) {

		this.academyService = academyService;
	}

	// http://localhost:8080/rest/api/academies (GET)
	@GetMapping
	public List<Academy> getAcademies() {

		/*
		 * Il Bean Jackson Object Mapper (eseguito di default da Spring Boot dietro le
		 * quinte) sta in ascolto sul ritorno di ogni singolo metodo del RestController
		 * ed è in grado di convertire ogni Oggetto in un JSON da restituire al consumer
		 */
		return academyService.getAcademies();
	}

	/*
	 * L'annotation @PathVariable comunica al Jackson ObjectMapper di convertire una
	 * variabile contenuta nella url http in una variabile Java
	 */
	@GetMapping("/code/{code}")
	public Academy getAcademyByCode(@PathVariable String code) {

		return academyService.getAcademyByCode(code);

	}

	/*
	 * L'annotation @Valid chiede al Jackson Object Mapper di controllare
	 * all'interno del JSON che arriva dal consumer se soo rispettate le regole di
	 * validazione impostate nel sistema del WSP
	 * 
	 * Nel caso in cui venga violata qualche regola di validazione viene restituita
	 * la seguente eccezione : MethodNotArgumentValidException
	 */
	@PostMapping
	public Academy saveAcademy(@Valid @RequestBody Academy academy) {

		return academyService.saveOrUpdateAcademy(academy);

	}

	@PutMapping
	public Academy updateAcademy(@RequestBody Academy academy) {

		return academyService.saveOrUpdateAcademy(academy);

	}

	@DeleteMapping("/code/{code}")
	public Map<String, Boolean> removeAcademy(@PathVariable String code) {

		return academyService.removeAcademy(code);

	}

	@GetMapping("/hateoas/code/{code}")
	public EntityModel<Academy> getAcademyByCodeHateoas(@PathVariable String code) {

		// recupero di una academy per code inviato dal consumer
		Academy academy = academyService.getAcademyByCode(code);

		/*
		 * 1. occorre inizializzare una variabile di tipo
		 * EntityModel che consentirà di fare l'attach
		 * di uno o più link all'interno del JSON
		 * di risposta
		 */
		EntityModel<Academy> resource = EntityModel.of(academy);

		/*
		 * 2. occorre inizializzare una variabile di tipo
		 * WebMvcLinkBuilder che costruisce fisicamente un
		 * hyperlink all'interno del JSON di risposta
		 * 
		 *e fare un riferimento preciso all'interno
		 *del link sull'operazione che si può consumare
		 *in base al click 
		 * 
		 */
		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAcademies());

		/*
		 * 3. è preferibile associare all'hyperlink
		 * una label che faccia capire al consumer
		 * l'operazione che si consumerà al click
		 * sul link
		 */
		resource.add(linkTo.withRel("all-academies"));

		return resource;

	}
	
	@GetMapping(value="/xml",produces=MediaType.APPLICATION_XML_VALUE)
	public List<Academy> getXmlAcademies(){
		
		return academyService.getAcademies();
		
	}
	
	/*
	 * L'API Spring Restful ResponseEntity
	 * consente di customizzare sia il contenuto
	 * del JSON di risposta, sia lo status code
	 * ad esso associato
	 */
	@PostMapping("/custom/response")
	public ResponseEntity<?> customSaveAcademy(@RequestBody Academy academy) {

		academyService.saveOrUpdateAcademy(academy);
		
		/*
		 * viene costruito un Oggetto HashMap che poi
		 * verrà utilizzato come contenutpo del json
		 */
		Map<String, String> responseMap = new HashMap<>();
		responseMap.put("save academy operation", "ok");

		/*
		 * viene istanziato il costruttore dell'API ResponseEntity
		 * che prende in input sia l'Oggetto che rappresenta il
		 * contentuto (CUSTOMIZZABILE) sia uno status code ad esso
		 * associato (diverso da quello di default)
		 * 
		 * Ha senso utilizzare l'API ResponseEntity quando si intente
		 * restituire un json con uno status code associato diverso
		 * da quello di default specificato dall'Architettura REST
		 */
		return new ResponseEntity<>(responseMap, HttpStatus.CREATED);

	}

	

}
