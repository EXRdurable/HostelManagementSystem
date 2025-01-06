/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hostelapp.model;

/**
 *
 * @author mission dura
 * lmuid: 23048635
 */
public class hostelmodel {  
    int hosteler_No;
    String hosteler_name;
    String address;
    long contact_No;
    int room_No;
    int total_Users;   
    String usersId;
    int calllineno;
    int id;
    String name;
    String gender;
    long bookings_contact_no;
    String bookings_address;
    public hostelmodel(int hosteler_No,String hosteler_name,String address,long contact_No) {
        this.hosteler_No=hosteler_No;
        this.hosteler_name=hosteler_name;
        this.address=address;
        this.contact_No=contact_No;
}
    public hostelmodel(int room_No,int total_Users,String usersId,int calllineno) {
        this.room_No=room_No;
        this.total_Users=total_Users;
        this.usersId=usersId;
        this.calllineno=calllineno;
}
      public hostelmodel(int id,String name,String gender,long bookings_contact_no,String bookings_address) {
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.bookings_contact_no=bookings_contact_no;
        this.bookings_address=bookings_address;
}
    public int getHosteler_No() {
        return hosteler_No;
    }

    public void setHosteler_No(int hosteler_No) {
        this.hosteler_No = hosteler_No;
    }

    public String getHosteler_name() {
        return hosteler_name;
    }

    public void setHosteler_name(String hosteler_name) {
        this.hosteler_name = hosteler_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact_No() {
        return contact_No;
    }

    public void setContact_No(long contact_No) {
        this.contact_No = contact_No;
    }

    public int getRoom_No() {
        return room_No;
    }

    public void setRoom_No(int room_No) {
        this.room_No = room_No;
    }

    public int getTotal_Users() {
        return total_Users;
    }

    public void setTotal_Users(int total_Users) {
        this.total_Users = total_Users;
    }

    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }

    public int getCalllineno() {
        return calllineno;
    }

    public void setCalllineno(int calllineno) {
        this.calllineno = calllineno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getBookings_contact_no() {
        return bookings_contact_no;
    }

    public void setBookings_contact_no(long bookings_contact_no) {
        this.bookings_contact_no = bookings_contact_no;
    }

    public String getBookings_address() {
        return bookings_address;
    }

    public void setBookings_address(String bookings_address) {
        this.bookings_address = bookings_address;
    }
        
               
}
