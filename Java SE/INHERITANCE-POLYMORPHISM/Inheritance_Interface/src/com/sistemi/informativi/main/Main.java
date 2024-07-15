package com.sistemi.informativi.main;

import com.sistemi.informativi.DocenteJava;
import com.sistemi.informativi.DocenteMicrosoft;
import com.sistemi.informativi.Docente;


public class Main {

	public static void main(String[] args) {
		
        // reference ed oggetto controllato sono dello stesso tipo
		DocenteJava docenteJava = new DocenteJava();
		docenteJava.spiegaLinguaggio();
		docenteJava.spiegaArchitettura();
		docenteJava.spiegaFramework();
		
		// reference ed oggetto controllato sono dello stesso tipo
		DocenteMicrosoft docenteMicrosoft = new DocenteMicrosoft();
		docenteMicrosoft.spiegaLinguaggio();
		docenteMicrosoft.spiegaArchitettura();
		docenteMicrosoft.spiegaFramework();
		
		/*
		 * Implementare POLIMORFISMO DI OGGETTI SI TRADUCE
		 * NEL DICHIARARE UNA REFERENCE DI TIPO PADRE CHE
		 * REFERENZIA UN OGGETTO DI TIPO FIGLIO
		 * 
		 * POLIMORFISMO DI OGGETTI VUOL DIRE FAR ASSUMERE
		 * AD UNA REFERENCE DI TIPO PADRE LA FORMA DI UNO
		 * DEI SUOI OGGETTI FIGLIO A RUNTIME, LIMITATAMENTE
		 * AI METODI IN COMUNE
		 */
		// reference di tipo Interfaccia Padre e Oggetto di tipo Classe Figlio
		Docente docenteJavaNew = new DocenteJava();
		docenteJavaNew.spiegaLinguaggio();
		docenteJavaNew.spiegaArchitettura();
		docenteJavaNew.spiegaFramework();
		
		
	}

}
