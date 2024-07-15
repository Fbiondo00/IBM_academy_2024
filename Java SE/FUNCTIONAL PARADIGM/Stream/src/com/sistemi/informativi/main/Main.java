package com.sistemi.informativi.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		// STREAM DI STRING
		Stream<String> colorsStream = Stream.of("blue", "red", "yellow");

		colorsStream = Stream.concat(Stream.of("brown"), colorsStream);
		colorsStream.forEach(color -> System.out.println(color));

		Stream<String> coursesStream = Stream.of("Java", ".Net", "Angular");

		/*
		 * filter è un operatore funzionale che applicato ad uno Stream di partenza
		 * restituisce un nuovo Stream sulla base della verifica di una condizione
		 * richiesta al filter
		 */
		coursesStream.filter((course) -> course.equals("Angular")).forEach(course -> System.out.println(course));

		Stream<Integer> numbersStream = Stream.of(4, 8, 9);
		numbersStream.map((number) -> number * 2).forEach(number -> System.out.println(number));

		Stream<String> daysStream = Stream.of("Java", "Net", "Angular", "Angular");
		daysStream.sorted().distinct().forEach(day -> System.out.println(day));

		/*
		 * CONVERSIONE DA STREAM A LIST
		 */
		Stream<String> sports = Stream.of("football", "basket");
		List<String> sportsList = sports.toList();
		sportsList.forEach(sport -> System.out.println(sport));

		/*
		 * CONVERSIONE DA STREAM A ARRAY
		 */
		Stream<String> players = Stream.of("Messi", "Ronaldo");
		Object playersArray[] = players.toArray();

		for (Object player : playersArray) {

			System.out.println(player);

		}
		
		
		/*
		 * CONVERSIONE DA LIST A STREAM
		 */
		ArrayList<Integer> numbersList = new ArrayList<>();
		numbersList.add(3);
		numbersList.add(4);
		Stream<Integer> numberStream = numbersList.stream();
		numberStream.forEach(number -> System.out.println(number));
		
		/*
		 * CONVERSIONE DA ARRAY A STREAM
		 */
		Integer numbersArray [] = {78,89};
		Stream<Integer> numberStreamNew = Stream.of(numbersArray);
		numberStreamNew.forEach(number -> System.out.println(number));

	}

}
