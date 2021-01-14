package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.SortedMap;

/**
 * Retrieves the disordered list of symptoms
 *
 * Counts the number of occurrences
 *
 * We obtain ordered map containing each symptom followed by its occurrence
 */

public interface IAnalyticsCounter {
    /**
     *
     * @param distinctSymptom list of string containing the symptoms to be traited
     * @param filepath path to the file containing the symptoms to be read
     *
     * @return A map containing the symptoms as key and their occurrences as value
     */
    SortedMap<String, Integer> getMapSymptom(List<String> distinctSymptom,String filepath) throws IOException;
}
