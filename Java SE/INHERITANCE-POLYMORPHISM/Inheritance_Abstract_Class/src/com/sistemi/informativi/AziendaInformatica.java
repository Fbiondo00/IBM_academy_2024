package com.sistemi.informativi;

public class AziendaInformatica extends Azienda{
	
	@Override
	public void produce() {
		
		System.out.println("produce software/hardware");
	}
	
	@Override
	public void assume() {
		
		System.out.println("assume programmatori/sistemisti");
	}
	
	

}
