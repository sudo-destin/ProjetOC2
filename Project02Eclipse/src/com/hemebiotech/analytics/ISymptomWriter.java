package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * Writes the contents of the map in a text file
 */

public interface ISymptomWriter {
    /**
     * @param filepath path to the file writer
     * @param mapSymptom Map containing symptoms and their occurrences
     */
    void writeSymptom(Map<String,Integer> mapSymptom, String filepath) throws IOException;
}
