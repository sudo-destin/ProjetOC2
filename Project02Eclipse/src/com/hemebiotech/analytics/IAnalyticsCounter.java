package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.SortedMap;

public interface IAnalyticsCounter {
    SortedMap<String, Integer> GetMapSymptom() throws IOException;
}
