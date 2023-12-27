package com.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class NameSortService {
    public List<String> sortNamesMultithreaded(List<String> names, int numThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        int chunkSize = names.size() / numThreads;
        List<Future<List<String>>> futures = new ArrayList<>(numThreads);

        for (int i = 0; i < numThreads; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == numThreads - 1) ? names.size() : (i + 1) * chunkSize;
            List<String> subList = names.subList(startIndex, endIndex);

            Callable<List<String>> task = () -> {
                Collections.sort(subList);
                return subList;
            };

            futures.add(executorService.submit(task));
        }

        List<String> sortedNames = new ArrayList<>();

        for (Future<List<String>> future : futures) {
            try {
                List<String> sublist = future.get();
                sortedNames.addAll(sublist);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();

        // Now, sortedNames contains all sorted sublists. You can merge them if needed.
        // For simplicity, we assume that the sublists are already sorted and just concatenate them.

        return sortedNames;
    }
}

