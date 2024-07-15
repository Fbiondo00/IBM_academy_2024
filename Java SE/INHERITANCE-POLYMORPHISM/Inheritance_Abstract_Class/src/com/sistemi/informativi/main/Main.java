package com.sistemi.informativi.main;

import com.sistemi.informativi.AziendaInformatica;
import com.sistemi.informativi.AziendaMeccanica;

public class Main extends Object{

	public static void main(String[] args) {
		
		AziendaMeccanica aziendaMeccanica = new AziendaMeccanica();
		
		aziendaMeccanica.assume();
		aziendaMeccanica.produce();
		aziendaMeccanica.fattura();
		
		AziendaInformatica aziendaInformatica = new AziendaInformatica();
		
		aziendaInformatica.assume();
		aziendaInformatica.produce();
		aziendaInformatica.fattura();
		
		
		

	}

}
