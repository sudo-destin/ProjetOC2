package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[]args) throws IOException {

        String filepath = "C:\\dev\\ProjetOC\\ProjetOC2\\Project02Eclipse\\src\\symptoms.txt";

        ISymptomReader reader = new ReadSymptomDataFromFile(filepath);

        List<String> distinctSymptom = reader.getSymptoms();

        IAnalyticsCounter counter = new AnalyticsCounter();

        Map<String, Integer> mapSymptom = counter.getMapSymptom(distinctSymptom,filepath);

        String filepathWriter = "C:\\dev\\ProjetOC\\ProjetOC2\\Project02Eclipse\\src\\resultat.txt";

        ISymptomWriter writer = new WriteSymptomDataFromFile();

        writer.writeSymptom(mapSymptom,filepathWriter);
    }
}

