package com.sistemi.informativi.main;

import com.sistemi.informativi.Persona;
import com.sistemi.informativi.Studente;
import com.sistemi.informativi.StudenteScolastico;
import com.sistemi.informativi.StudenteUniversitario;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		persona.cammina();
		persona.dorme();
		persona.mangia();
		
		
		Studente studente = new Studente();
		studente.cammina();
		studente.dorme();
		studente.mangia();
		studente.studia();
		
		StudenteScolastico studenteScolastico = new StudenteScolastico();
		studenteScolastico.cammina();
		studenteScolastico.mangia();
		studenteScolastico.dorme();
		/*
		 * non verrà invocato il metodo
		 * inizialmente ereditato dal padre
		 * ma quello "overridato"
		 */
		studenteScolastico.studia();
		
		StudenteUniversitario studenteUniversitario = new StudenteUniversitario();
		studenteUniversitario.cammina();
		studenteUniversitario.mangia();
		studenteUniversitario.dorme();
		/*
		 * non verrà invocato il metodo
		 * inizialmente ereditato dal padre
		 * ma quello "overridato"
		 */
		studenteUniversitario.studia();
		
		

	}

}
