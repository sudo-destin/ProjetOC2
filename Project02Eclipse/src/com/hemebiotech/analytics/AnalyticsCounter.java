package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class AnalyticsCounter {

	
	public static void main(String[] args) throws Exception {


		List<Symptom> listSymptomOccurrence = new ArrayList<>();

		BufferedReader reader = new BufferedReader(new FileReader("C:\\dev\\ProjetOC\\ProjetOC2\\Project02Eclipse\\src\\symptoms.txt"));


		List<String> distinctSymptom = new ArrayList<>();

		String line = reader.readLine();

		distinctSymptom.add(line);

		while (line != null) {


			line = reader.readLine();

			if (!distinctSymptom.contains(line)) {
				distinctSymptom.add(line);
			}
		}
		for (String symptom : distinctSymptom) {    //boucle for{} qui permet de comptabiliser les occurences

			reader = new BufferedReader(new FileReader("C:\\dev\\ProjetOC\\ProjetOC2\\Project02Eclipse\\src\\symptoms.txt"));

			line = reader.readLine();

			int counter = 0;

			Symptom symptomAndOccurence = new Symptom(symptom, counter);

			while (line != null) {

				if (line.equals(symptom)) {
					counter++;
				}
				symptomAndOccurence.setRecurrence(counter);

				if (!listSymptomOccurrence.contains(symptomAndOccurence)) { 	//Vérifie que la list ne contient pas le symptom

					symptomAndOccurence = new Symptom(symptom, counter);

					listSymptomOccurrence.add(symptomAndOccurence);

				}
				line = reader.readLine();
			}
		}

		for (Symptom readSymptom : listSymptomOccurrence) {


			FileWriter writer = new FileWriter("C:\\dev\\ProjetOC\\ProjetOC2\\Project02Eclipse\\src\\resultat.txt");

			writer.append(readSymptom.getNomSymptom()).append("[").append(String.valueOf(readSymptom.getRecurrence())).append("]");

		}

	}
}
