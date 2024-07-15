package com.sistemi.informativi.handler;

import com.sistemi.informativi.exception.EccezioneCustom;

public class GestioneEccezioneCustom {
	
	
	public void riceviEta(int eta) throws EccezioneCustom{
		
		if(eta>18) {
			
			System.out.println("Eta consentita");
		}
		
		else {
			
			/*
			 * facciamo la richiesta alla JVM di restituire EccezioneCustom
			 * istanziandola tramite Costruttore.
			 * La richiesta alla JVM viene effettuata tramite la keyword throw
			 */
			throw new EccezioneCustom("eta inferiore a 18 non possibile");
			
		}
		
		
	}

}
