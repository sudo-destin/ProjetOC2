package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AnalyticsCounter implements IAnalyticsCounter {


	@Override
	public SortedMap<String, Integer> getMapSymptom(List<String> distinctSymptom, String filepath) throws IOException {


		SortedMap<String, Integer> listSymptomOccurrence = new TreeMap<>();


		for (String symptom : distinctSymptom) {    //boucle for{} qui permet de comptabiliser les occurences

			BufferedReader reader = new BufferedReader(new FileReader(filepath));

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
