package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AnalyticsCounter implements IAnalyticsCounter {


	@Override
	public SortedMap<String, Integer> GetMapSymptom() throws IOException {


		SortedMap<String, Integer> listSymptomOccurrence = new TreeMap<>();


		List<String> distinctSymptom = new ReadSymptomDataFromFile("C:\\dev\\ProjetOC\\ProjetOC2\\Project02Eclipse\\src\\symptoms.txt").GetSymptoms();


		for (String symptom : distinctSymptom) {    //boucle for{} qui permet de comptabiliser les occurences

			BufferedReader reader = new BufferedReader(new FileReader("C:\\dev\\ProjetOC\\ProjetOC2\\Project02Eclipse\\src\\symptoms.txt"));

			String line = reader.readLine();

			int counter = 0;

			while (line != null) {

				if (line.equals(symptom)) {
					counter++;
				}
				listSymptomOccurrence.put(symptom,counter);
				
				line = reader.readLine();
			}
		}

		return listSymptomOccurrence;

	}

}
