package com.sistemi.informativi.main;

import java.util.ArrayList;
import java.util.TreeMap;

import com.sistemi.informativi.enumeration.Pasto;
import com.sistemi.informativi.enumeration.Settimana;

public class Main {

	public static void main(String[] args) {

		ArrayList<Settimana> giorni = new ArrayList<>();

		for (Settimana giorno : Settimana.values()) {

			giorni.add(giorno);

		}

		System.out.println(giorni);

		TreeMap<Integer, String> pasti = new TreeMap<>();
		
		System.out.println();

		for (Pasto pasto : Pasto.values()) {

			pasti.put(pasto.getOra(), pasto.getLuogo());

		}

		System.out.println(pasti);

	}

}
