package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

class WriteSymptomDataFromFile extends AnalyticsCounter implements ISymptomWriter {


    @Override
    public void WriteSymptom () throws IOException {

        GetMapSymptom();


        FileWriter writer = new FileWriter("C:\\dev\\ProjetOC\\ProjetOC2\\Project02Eclipse\\src\\resultat.txt");

        for (String symptom : GetMapSymptom().keySet()) {
            writer.write(symptom + "[" + GetMapSymptom().get(symptom) + "]" + System.lineSeparator());
        }

        writer.close();

    }


}
