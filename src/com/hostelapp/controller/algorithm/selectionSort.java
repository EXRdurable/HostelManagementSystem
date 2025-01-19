/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hostelapp.controller.algorithm;

import com.hostelapp.model.hostelmodel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mission dura
 * lmuid: 23048635
 */
public class selectionSort {
    public List<hostelmodel> sortByhosteler_No(List<hostelmodel> unsortedData, boolean isDesc) {
    List<hostelmodel> dataToSort = new ArrayList<>();
    dataToSort.addAll(unsortedData);
    
    for (int i = 0; i < dataToSort.size() - 1; i++) {
        int targetIndex = i;
        
        for (int j = i + 1; j < dataToSort.size(); j++) {
            if (isDesc) {
                // Sort in descending order (largest to smallest)
                if (dataToSort.get(j).getHosteler_No() > dataToSort.get(targetIndex).getHosteler_No()) {
                    targetIndex = j;
                }
            } else {
                // Sort in ascending order (smallest to largest)
                if (dataToSort.get(j).getHosteler_No() < dataToSort.get(targetIndex).getHosteler_No()) {
                    targetIndex = j;
                }
            }
        }
        
        // Swap elements if needed
        if (targetIndex != i) {
            hostelmodel temp = dataToSort.get(i);
            dataToSort.set(i, dataToSort.get(targetIndex));
            dataToSort.set(targetIndex, temp);
        }
    }
    
    return dataToSort;
}
}

