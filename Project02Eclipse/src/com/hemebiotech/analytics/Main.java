package com.hemebiotech.analytics;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[]args) throws IOException {

        String filepath = new File("Project02Eclipse/src/symptoms.txt").getAbsolutePath();    //Path to the file containing the symptoms to be treated

        ISymptomReader reader = new ReadSymptomDataFromFile(filepath);

        List<String> distinctSymptom = reader.getSymptoms();    //Retrieves the list of symptoms

        IAnalyticsCounter counter = new AnalyticsCounter();

        Map<String, Integer> mapSymptom = counter.getMapSymptom(distinctSymptom,filepath);      //Counts the number of occurrence of symptoms

        String filepathWriter = new File("Project02Eclipse/src/resultat.txt").getAbsolutePath();        //Path to the result file

        ISymptomWriter writer = new WriteSymptomDataFromFile();

        writer.writeSymptom(mapSymptom,filepathWriter);     //Write the results obtained in the file
    }
}

