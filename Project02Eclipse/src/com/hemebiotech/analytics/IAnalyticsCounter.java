package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.SortedMap;

public interface IAnalyticsCounter {
    SortedMap<String, Integer> getMapSymptom(List<String> distinctSymptom,String filepath) throws IOException;
}
