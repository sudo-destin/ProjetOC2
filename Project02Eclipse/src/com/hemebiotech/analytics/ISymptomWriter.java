package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;


public interface ISymptomWriter {

    void writeSymptom(Map<String,Integer> mapSymptom, String filepath) throws IOException;
}
