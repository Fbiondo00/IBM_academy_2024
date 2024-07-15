package com.sistemi.informativi.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.sistemi.informativi.bean.Company;
import com.sistemi.informativi.bean.Course;

public class Main extends Object {

	public static void main(String[] args) {

		/*
		 * INIZIALIZZAZIONE ALTERNATIVA DI ARRAY BEST PRACTICE!!!! --->>> PERFORMANCE
		 * MIGLIORI int arrayInt [] = {24,67,89};
		 */

		// ARRAY DI PRIMITIVI
		int arrayInt[] = new int[3];
		arrayInt[0] = 24;
		arrayInt[1] = 67;
		arrayInt[2] = 89;

		for (int i = 0; i < arrayInt.length; i++) {

			System.out.println("Contenuto arrayInt " + arrayInt[i]);
		}
		// END ARRAY DI PRIMITIVI

		// ARRAY DI REFERENCE AD OBJECT
		Integer arrayInteger[] = new Integer[2];
		// arrayInteger[0] = new Integer(56);
		arrayInteger[0] = 56;
		arrayInteger[1] = 60;
		

		// forEach
		for (Integer i : arrayInteger) {

			System.out.println("Contenuto arrayInteger " + i);

		}
		// END ARRAY DI REFERENCE AD OBJECT

		// ARRAY POLIMORFICO
		/*
		 * Inizializzazione di un Array che contiene in ogni locazione di memoria
		 * reference di tipo Object
		 */
		Object array[] = new Object[2];
		/*
		 * La reference di tipo Object contenuta nella prima locazione di memoria assume
		 * a runtime la forma del suo figlio Course
		 */
		array[0] = new Course("1028A", "Java", "Rome");
		/*
		 * La reference di tipo Object contenuta nella seconda locazione di memoria
		 * assume a runtime la forma del suo figlio Company
		 */
		array[1] = new Company("Openjob", "vatNumber");

		for (Object o : array) {

			System.out.println("Contenuto array " + o);
		}
		// ARRAY POLIMORFICO

		// ARRAYLIST REFERENCE A Course
		ArrayList<Course> coursesList = new ArrayList<>();
		Course course1 = new Course("1026U", ".Net", "Milan");
		Course course2 = new Course("1026B", "Spring", "Florence");
		coursesList.add(course1);
		coursesList.add(course2);
		coursesList.remove(course1);

		for (Course course : coursesList) {

			System.out.println("Contenuto coursesList " + course);

		}
		// END ARRAYLIST REFERENCE A Course
		
		// ARRAYLIST DI STRING
		ArrayList<String> daysList = new ArrayList<>();
		daysList.add("Lunedi");
		daysList.add("Martedi");
		daysList.add("Mercoledi");
		daysList.add("Giovedi");
		daysList.add("Venerdi");
		daysList.add("Sabato");
		daysList.add("Domenica");
		daysList.add("Lunedi");
		
		// forEach (for enhanced)
		for(String day : daysList) {
			
			System.out.println("Contenuto daysList " + day);
			
		}
		// END ARRAYLIST DI STRING
		
		// ARRAY LIST INTEGER
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(11);
		
		// forEach funzionale
		numbers.forEach((number)->System.out.println("Contenuto numbers " + number));
		// END ARRAY LIST INTEGER
		
		
		// HASHSET DI STRING
		HashSet<String> daysSet = new HashSet<>();
		daysSet.add("Lunedi");
		daysSet.add("Martedi");
		daysSet.add("Mercoledi");
		daysSet.add("Giovedi");
		daysSet.add("Venerdi");
		daysSet.add("Sabato");
		daysSet.add("Domenica");
		daysSet.add("Lunedi");
		
		daysSet.forEach(day->System.out.println("Contenuto daysSet " + day ));
		// END HASHSET DI STRING
		
		// HASHSET DI COURSE
		HashSet<Course> coursesSet = new HashSet<>();
		Course course3 = new Course("1098K","Angular","Rome");
		Course course4 = new Course("1098K","Angular","Rome");
		coursesSet.add(course3);
		coursesSet.add(course4);
		coursesSet.forEach(course->System.out.println("Contenuto coursesSet " + course));
		// END HASHSET DI STRING
		
		//HASH MAP DI COURSE
		HashMap<String,Course> coursesMap = new HashMap<>();
		/*
		 * BAD PRACTICE: NON RIPETERE CHIAVI UGUALI ALL'INTERNO DELLA HASHMAP
		 *  (PER EVITARE SOVRASCRITTURA)
		 */
		coursesMap.put("key1",course1);
		coursesMap.put("key2",course2);
		coursesMap.forEach((key,value)->System.out.println("Contenuto coursesMap " + key + " " + value));
		//END HASH MAP DI COURSE
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
