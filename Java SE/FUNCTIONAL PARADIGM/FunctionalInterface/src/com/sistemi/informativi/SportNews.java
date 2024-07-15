package com.sistemi.informativi;

@FunctionalInterface
public interface SportNews {
	
	public void sayWelcome();
	
	public  default void basketNews() {
		
		System.out.println("say basket news");
		
	}
	
	public static void footballNews(){
		
		System.out.println("say football news");
		
	}

}
