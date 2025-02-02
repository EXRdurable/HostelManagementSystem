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
public class mergeSort {
    public List<hostelmodel> sortById(List<hostelmodel> unsortedData, boolean isDesc) {
        List<hostelmodel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);
    // If list is empty or has only one element, return as is
    if (dataToSort.size() <= 1) {
        return dataToSort;
    }
    
    // Perform merge sort
    mergeSort(dataToSort, 0, dataToSort.size() - 1, isDesc);
    return dataToSort;
}

private void mergeSort(List<hostelmodel> data, int left, int right, boolean isDesc) {
    if (left < right) {
        int mid = left + (right - left) / 2;
        
        // Sort first and second halves
        mergeSort(data, left, mid, isDesc);
        mergeSort(data, mid + 1, right, isDesc);
        
        // Merge the sorted halves
        merge(data, left, mid, right, isDesc);
    }
}

private void merge(List<hostelmodel> data, int left, int mid, int right, boolean isDesc) {
    // Calculate sizes of two subarrays to be merged
    int n1 = mid - left + 1;
    int n2 = right - mid;
    
    // Create temp arrays
    List<hostelmodel> leftArray = new ArrayList<>(data.subList(left, left + n1));
    List<hostelmodel> rightArray = new ArrayList<>(data.subList(mid + 1, mid + 1 + n2));
    
    // Initial indexes of first and second subarrays
    int i = 0, j = 0;
    // Initial index of merged subarray
    int k = left;
    
    // Merge the temp arrays
    while (i < n1 && j < n2) {
        if (isDesc) {
            // Sort in descending order
            if (leftArray.get(i).getId() >= rightArray.get(j).getId()) {
                data.set(k, leftArray.get(i));
                i++;
            } else {
                data.set(k, rightArray.get(j));
                j++;
            }
        } else {
            // Sort in ascending order
            if (leftArray.get(i).getId() <= rightArray.get(j).getId()) {
                data.set(k, leftArray.get(i));
                i++;
            } else {
                data.set(k, rightArray.get(j));
                j++;
            }
        }
        k++;
    }
    
    // Copy remaining elements of leftArray[] if any
    while (i < n1) {
        data.set(k, leftArray.get(i));
        i++;
        k++;
    }
    
    // Copy remaining elements of rightArray[] if any
    while (j < n2) {
        data.set(k, rightArray.get(j));
        j++;
        k++;
    }
}
}
