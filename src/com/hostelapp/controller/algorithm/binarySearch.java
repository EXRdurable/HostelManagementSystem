/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hostelapp.controller.algorithm;

import com.hostelapp.model.hostelmodel;
import java.util.List;

/**
 *
 * @author mission dura
 * lmuid: 23048635
 */
public class binarySearch {
  public hostelmodel searchByHosteler_name(String searchValue, List<hostelmodel> hosteler,
            int left, int right) {

        // Base Case
        if (right < left) {
            return null;
        }

        // mid value
        int mid = (left + right) / 2;

        // checks whether searchKey lies on mid point
        if (searchValue.compareToIgnoreCase(hosteler.get(mid).getHosteler_name()) == 0) {
            return hosteler.get(mid);
        } else if (searchValue.compareToIgnoreCase(hosteler.get(mid).getHosteler_name()) < 0) {
            return searchByHosteler_name(searchValue, hosteler, left, mid - 1);
        } else {
            return searchByHosteler_name(searchValue, hosteler, mid + 1, right);
        }
  }
  public hostelmodel searchByRoom_No(int searchValue, List<hostelmodel> rooms,
            int left, int right) {
    // Base Case
    if (right < left) {
        return null;
    }
    // mid value
    int mid = (left + right) / 2;
    
    // Get room number from current hosteler and convert to integer
    int currentRoomNo = rooms.get(mid).getRoom_No();
    
    // checks whether searchKey lies on mid point   
    if (searchValue == currentRoomNo) {
        return rooms.get(mid);
    } else if (searchValue < currentRoomNo) {
        return searchByRoom_No(searchValue, rooms, left, mid - 1);
    } else {
        return searchByRoom_No(searchValue, rooms, mid + 1, right);
    }
}
}
