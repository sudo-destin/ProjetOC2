package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

class WriteSymptomDataFromFile implements ISymptomWriter {

    @Override
    public void writeSymptom(Map<String, Integer> mapSymptom, String filepath ) throws IOException {


        FileWriter writer = new FileWriter(filepath);

        for (String symptom : mapSymptom.keySet()) {
            writer.write(symptom + "[" + mapSymptom.get(symptom) + "]" + System.lineSeparator());
        }

        writer.close();

    }


}
