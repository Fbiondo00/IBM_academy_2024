package com.sistemi.informativi;

public class DocenteMicrosoft implements Docente{

	@Override
	public void spiegaLinguaggio() {
		
		System.out.println("spiega C#");
		
	}

	@Override
	public void spiegaFramework() {
		
		System.out.println("spiega .Net");
		
	}

	@Override
	public void spiegaArchitettura() {
		
		System.out.println("spiega IIS");
		
	}

}
