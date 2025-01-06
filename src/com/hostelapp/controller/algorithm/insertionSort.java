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
public class insertionSort {
    public List<hostelmodel> sortByRoom_No(List<hostelmodel> unsortedData, boolean isDesc) {
        List<hostelmodel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);
    for (int i = 1; i < dataToSort.size(); i++) {
        hostelmodel key = dataToSort.get(i);
        int j = i - 1;

        if (isDesc) {
            // Sort in descending order
            while (j >= 0 && dataToSort.get(j).getRoom_No() < key.getRoom_No()) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }
        } else {
            // Sort in ascending order
            while (j >= 0 && dataToSort.get(j).getRoom_No() > key.getRoom_No()) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }
        }
        dataToSort.set(j + 1, key);
    }

    return dataToSort;
    }
}
