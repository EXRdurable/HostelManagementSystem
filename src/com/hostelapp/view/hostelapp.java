/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hostelapp.view;


import com.hostelapp.controller.algorithm.binarySearch;
import com.hostelapp.controller.algorithm.insertionSort;
import com.hostelapp.controller.algorithm.mergeSort;
import com.hostelapp.controller.algorithm.selectionSort;
import com.hostelapp.model.hostelmodel;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mission dura
 * lmuid: 23048635
 */
public class hostelapp extends javax.swing.JFrame {
    ArrayList<hostelmodel> hosteler = new ArrayList<hostelmodel>(); //arraylist for hostel table
    LinkedList<hostelmodel> rooms = new LinkedList<hostelmodel>();  //arraylist for room table
    ArrayList<hostelmodel> bookings = new ArrayList<hostelmodel>(); //arraylist for booking table
    private DefaultTableModel tableModelhosteler; 
    private DefaultTableModel tableModelrooms;
    private DefaultTableModel tableModelbookings;
    // Declaration of sorting algorithm objects
    selectionSort SelectionSorting = new selectionSort();
    insertionSort InsertionSorting = new insertionSort();
    mergeSort mergeSorting = new mergeSort();
    
    // Declaration of a binary search utility object
    binarySearch searcher = new binarySearch();
    /**
     
     */
    public hostelapp() {
        initComponents();
        tableModelhosteler = (DefaultTableModel) TableHosteler.getModel(); // Initialize the table model for hostelers using the model from the hosteler table component
        addInitialHostelerInformation();
        tableModelrooms = (DefaultTableModel) TableRoom.getModel(); // Initialize the table model for rooms using the model from the room table component
        addInitialRoomInformation();
        tableModelbookings = (DefaultTableModel) TableBookings.getModel();// Initialize the table model for bookings using the model from the bookings table component
        addInitialBookingsInformation();
    }
    private void addInitialHostelerInformation()
    {
        hostelmodel Hosteler1 = new hostelmodel(123,"Ram","Kathmandu",9876543210L);
        hostelmodel Hosteler2 = new hostelmodel(27,"Hari","Pokhara",123456789L);
        hostelmodel Hosteler3 = new hostelmodel(3678,"Shyam","Lumbuni",891230L);
        hostelmodel Hosteler4 = new hostelmodel(3678,"Shuva","Chitwan",4891230L);
        hostelmodel Hosteler5 = new hostelmodel(378,"Shivam","Narayani",45678L);
        hosteler.add(Hosteler1); // Add Hosteler data to the hosteler list
        addDataToHostelerTable(Hosteler1); // Add Hosteler's data to the hosteler table in the GUI
        hosteler.add(Hosteler2);
        addDataToHostelerTable(Hosteler2);
        hosteler.add(Hosteler3);
        addDataToHostelerTable(Hosteler3);
        hosteler.add(Hosteler4);
        addDataToHostelerTable(Hosteler4);
        hosteler.add(Hosteler5);
        addDataToHostelerTable(Hosteler5);
    }
    private void addDataToHostelerTable(hostelmodel hosteler)
    {
        tableModelhosteler = (DefaultTableModel) TableHosteler.getModel();
        tableModelhosteler.addRow(new Object[]{hosteler.getHosteler_No(), hosteler.getHosteler_name(), hosteler.getAddress(), hosteler.getContact_No()}); // Add a new row to the hosteler table with the hosteler's details
    }
    private void addInitialRoomInformation()
    {
        hostelmodel Room1 = new hostelmodel(12,4,"12,14,17,4",9);
        hostelmodel Room2 = new hostelmodel(23,4,"1,191,79,41",1);
        hostelmodel Room3 = new hostelmodel(35,4,"28,945,116,49",42);
        hostelmodel Room4 = new hostelmodel(45,4,"238,145,216,19",24);
        hostelmodel Room5 = new hostelmodel(55,4,"218,45,16,79",14);

        rooms.add(Room1);   // Add room data to the hosteler list
        addDataToRoomTable(Room1);  // Add room's data to the room table in the GUI
        rooms.add(Room2);
        addDataToRoomTable(Room2);
        rooms.add(Room3);
        addDataToRoomTable(Room3);
        rooms.add(Room4);
        addDataToRoomTable(Room4);
        rooms.add(Room5);
        addDataToRoomTable(Room5);
    }
    private void addDataToRoomTable(hostelmodel rooms)
    {
        tableModelrooms = (DefaultTableModel) TableRoom.getModel();
        tableModelrooms.addRow(new Object[]{rooms.getRoom_No(), rooms.getTotal_Users(), rooms.getUsersId(), rooms.getCalllineno()});// Add a new row to the room table with the room's details
    }
    private void addInitialBookingsInformation()
    {
        hostelmodel Bookings1 = new hostelmodel(1,"Ram","Male",13L,"KTM");
        hostelmodel Bookings2 = new hostelmodel(2,"Hari","Male",3213L,"London");
        hostelmodel Bookings3 = new hostelmodel(3,"Shyam","Male",132343L,"Vietnam");
        hostelmodel Bookings4 = new hostelmodel(4,"Karan","Male",343L,"Norway");
        hostelmodel Bookings5 = new hostelmodel(5,"Shuva","Male",343L,"Antartica");
        bookings.add(Bookings1);    // Add a new row to the booking table with the booking's details
        addDataToBookingsTable(Bookings1);  // Add booking's data to the room table in the GUI
        bookings.add(Bookings2);
        addDataToBookingsTable(Bookings2);
        bookings.add(Bookings3);
        addDataToBookingsTable(Bookings3);
        bookings.add(Bookings4);
        addDataToBookingsTable(Bookings4);
        bookings.add(Bookings5);
        addDataToBookingsTable(Bookings5);
    }
    private void addDataToBookingsTable(hostelmodel bookings)
    {
        tableModelbookings = (DefaultTableModel) TableBookings.getModel();
        tableModelbookings.addRow(new Object[]{bookings.getId(),bookings.getName(), bookings.getGender(), bookings.getBookings_contact_no(), bookings.getBookings_address()}); // Add a new row to the booking table with the booking's details
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlAdmin = new javax.swing.JPanel();
        TbdPnMain = new javax.swing.JTabbedPane();
        PnlHome = new javax.swing.JPanel();
        Pnlbg1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PnlNoticemain = new javax.swing.JPanel();
        PnlNoticbg = new javax.swing.JPanel();
        PnlTxtnotice = new javax.swing.JPanel();
        LblNotice = new javax.swing.JLabel();
        PnlNoticeinfo = new javax.swing.JPanel();
        ScllPnareaInfo = new javax.swing.JScrollPane();
        TxtAreaNoticeInfo = new javax.swing.JTextArea();
        PnlSystmMnt = new javax.swing.JPanel();
        PnlsysmMntHead = new javax.swing.JPanel();
        LblSystmMnt = new javax.swing.JLabel();
        PnlSystmMntbody = new javax.swing.JPanel();
        scrlPnSystmMnt = new javax.swing.JScrollPane();
        TxtAreaSystmMntMain = new javax.swing.JTextArea();
        PnlAdnminEditTabHldr = new javax.swing.JPanel();
        tbdPnAdminedit = new javax.swing.JTabbedPane();
        PnlHstlrEdit = new javax.swing.JPanel();
        ScrlPnHstlrtablehldr = new javax.swing.JScrollPane();
        TableHosteler = new javax.swing.JTable();
        TxtfldHstlrAddress = new javax.swing.JTextField();
        TxtfldHstlrNo = new javax.swing.JTextField();
        TxtfldHstlrCntcNo = new javax.swing.JTextField();
        TxtfldHstlrName = new javax.swing.JTextField();
        BtnAddHstlr = new javax.swing.JButton();
        BtnRemoveHstlr = new javax.swing.JButton();
        BtnUpdtHstlr = new javax.swing.JButton();
        txtFldSearchHosteler = new javax.swing.JTextField();
        cmbBxsortbyhosteler = new javax.swing.JComboBox<>();
        jBtnsortHstlr = new javax.swing.JButton();
        jBtnSearchhstlr = new javax.swing.JButton();
        PnlRoomEdit = new javax.swing.JPanel();
        ScrollPnTableGHldr = new javax.swing.JScrollPane();
        TableRoom = new javax.swing.JTable();
        TxtfldttlUsers = new javax.swing.JTextField();
        TxtfldUsersId = new javax.swing.JTextField();
        TxtFldCallLineNo = new javax.swing.JTextField();
        TxtfldRoom = new javax.swing.JTextField();
        BtnAddRoom = new javax.swing.JButton();
        BtnRmvRoom = new javax.swing.JButton();
        BtnUpdroom = new javax.swing.JButton();
        txtFldSearchRooms = new javax.swing.JTextField();
        btnSearchRooms = new javax.swing.JButton();
        btnSortrooms = new javax.swing.JButton();
        cmbBxsortbyRooms = new javax.swing.JComboBox<>();
        PnlBookingEdit = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableBookings = new javax.swing.JTable();
        TxtFldBkngGender = new javax.swing.JTextField();
        TxtFldBkngsName = new javax.swing.JTextField();
        TxtFldBkngsCntctNo = new javax.swing.JTextField();
        TxtFldBkngsAddress = new javax.swing.JTextField();
        BtnBkngsAdd = new javax.swing.JButton();
        BtnBkngsUpdate = new javax.swing.JButton();
        TxtFldBkngsId = new javax.swing.JTextField();
        BtnBkngsRemove = new javax.swing.JButton();
        txtFldSearchBookings = new javax.swing.JTextField();
        btnSearchBkngs = new javax.swing.JButton();
        btnSortbookings = new javax.swing.JButton();
        cmbBxsortbyBookings = new javax.swing.JComboBox<>();
        PnlLogoHldr = new javax.swing.JPanel();
        LblLogo = new javax.swing.JLabel();
        lblMainHeading = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        PnlAdmin.setBackground(new java.awt.Color(204, 255, 255));

        TbdPnMain.setBackground(new java.awt.Color(255, 255, 255));

        PnlHome.setBackground(new java.awt.Color(255, 255, 255));

        Pnlbg1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hostelapp/resource/pic1.png"))); // NOI18N

        javax.swing.GroupLayout Pnlbg1Layout = new javax.swing.GroupLayout(Pnlbg1);
        Pnlbg1.setLayout(Pnlbg1Layout);
        Pnlbg1Layout.setHorizontalGroup(
            Pnlbg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnlbg1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pnlbg1Layout.setVerticalGroup(
            Pnlbg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnlbg1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hostelapp/resource/library.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hostelapp/resource/cafe.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Quality Living is our policy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setBackground(new java.awt.Color(102, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Make Friends and memories");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PnlHomeLayout = new javax.swing.GroupLayout(PnlHome);
        PnlHome.setLayout(PnlHomeLayout);
        PnlHomeLayout.setHorizontalGroup(
            PnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlHomeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlHomeLayout.createSequentialGroup()
                        .addComponent(Pnlbg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PnlHomeLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlHomeLayout.setVerticalGroup(
            PnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlHomeLayout.createSequentialGroup()
                        .addGroup(PnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pnlbg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlHomeLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        TbdPnMain.addTab("Home Page", PnlHome);

        PnlNoticbg.setBackground(new java.awt.Color(153, 255, 255));

        LblNotice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblNotice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblNotice.setText("Notice/Guidelines");

        javax.swing.GroupLayout PnlTxtnoticeLayout = new javax.swing.GroupLayout(PnlTxtnotice);
        PnlTxtnotice.setLayout(PnlTxtnoticeLayout);
        PnlTxtnoticeLayout.setHorizontalGroup(
            PnlTxtnoticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTxtnoticeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LblNotice, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PnlTxtnoticeLayout.setVerticalGroup(
            PnlTxtnoticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTxtnoticeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblNotice, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        TxtAreaNoticeInfo.setColumns(20);
        TxtAreaNoticeInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtAreaNoticeInfo.setRows(5);
        TxtAreaNoticeInfo.setText("\n*Bookings Id cannot be more than 4 bytes.\n*Call Line no is from 1-10 for the rooms.\n\n*Hosteler Number must be as well less than 4 bytes.\n*Room Number must be as well less than 4 bytes.\n\n*If any problem please feel free to contact us:\n*G-mail:np01abcde@hostel.com\n\n*More Features soon on Ded 29.\n*Stay Tuned!!\n");
        ScllPnareaInfo.setViewportView(TxtAreaNoticeInfo);

        javax.swing.GroupLayout PnlNoticeinfoLayout = new javax.swing.GroupLayout(PnlNoticeinfo);
        PnlNoticeinfo.setLayout(PnlNoticeinfoLayout);
        PnlNoticeinfoLayout.setHorizontalGroup(
            PnlNoticeinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNoticeinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScllPnareaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnlNoticeinfoLayout.setVerticalGroup(
            PnlNoticeinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNoticeinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScllPnareaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnlNoticbgLayout = new javax.swing.GroupLayout(PnlNoticbg);
        PnlNoticbg.setLayout(PnlNoticbgLayout);
        PnlNoticbgLayout.setHorizontalGroup(
            PnlNoticbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNoticbgLayout.createSequentialGroup()
                .addGroup(PnlNoticbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlNoticbgLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(PnlNoticeinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlNoticbgLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(PnlTxtnotice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PnlNoticbgLayout.setVerticalGroup(
            PnlNoticbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNoticbgLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(PnlTxtnotice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PnlNoticeinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        PnlSystmMnt.setBackground(new java.awt.Color(153, 255, 255));

        LblSystmMnt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblSystmMnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblSystmMnt.setText("System Maintenance");

        javax.swing.GroupLayout PnlsysmMntHeadLayout = new javax.swing.GroupLayout(PnlsysmMntHead);
        PnlsysmMntHead.setLayout(PnlsysmMntHeadLayout);
        PnlsysmMntHeadLayout.setHorizontalGroup(
            PnlsysmMntHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlsysmMntHeadLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(LblSystmMnt, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        PnlsysmMntHeadLayout.setVerticalGroup(
            PnlsysmMntHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlsysmMntHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblSystmMnt, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        TxtAreaSystmMntMain.setColumns(20);
        TxtAreaSystmMntMain.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtAreaSystmMntMain.setRows(5);
        TxtAreaSystmMntMain.setText("Every:\n\tSunday (8:00 P.M. -10:00 P.M.)\n\tMonday\n\tTuesday\n\tWednesday\n\tThursday\n\tFriday\n\t\nIf there is Emergency cases then the system maintenance time will be notifi\n-ed on their respective E-mail\n\n\t** (●'◡'●)**Sorry If any Inconvinence**^_^**");
        scrlPnSystmMnt.setViewportView(TxtAreaSystmMntMain);

        javax.swing.GroupLayout PnlSystmMntbodyLayout = new javax.swing.GroupLayout(PnlSystmMntbody);
        PnlSystmMntbody.setLayout(PnlSystmMntbodyLayout);
        PnlSystmMntbodyLayout.setHorizontalGroup(
            PnlSystmMntbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSystmMntbodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrlPnSystmMnt, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnlSystmMntbodyLayout.setVerticalGroup(
            PnlSystmMntbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSystmMntbodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrlPnSystmMnt, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnlSystmMntLayout = new javax.swing.GroupLayout(PnlSystmMnt);
        PnlSystmMnt.setLayout(PnlSystmMntLayout);
        PnlSystmMntLayout.setHorizontalGroup(
            PnlSystmMntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSystmMntLayout.createSequentialGroup()
                .addGroup(PnlSystmMntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlSystmMntLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(PnlSystmMntbody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlSystmMntLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(PnlsysmMntHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        PnlSystmMntLayout.setVerticalGroup(
            PnlSystmMntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSystmMntLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(PnlsysmMntHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PnlSystmMntbody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PnlNoticemainLayout = new javax.swing.GroupLayout(PnlNoticemain);
        PnlNoticemain.setLayout(PnlNoticemainLayout);
        PnlNoticemainLayout.setHorizontalGroup(
            PnlNoticemainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNoticemainLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(PnlNoticbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(PnlSystmMnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnlNoticemainLayout.setVerticalGroup(
            PnlNoticemainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNoticemainLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PnlNoticemainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlNoticbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlSystmMnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        TbdPnMain.addTab("Notice Board", PnlNoticemain);

        PnlAdnminEditTabHldr.setBackground(new java.awt.Color(204, 204, 255));

        tbdPnAdminedit.setBackground(new java.awt.Color(204, 204, 204));

        PnlHstlrEdit.setBackground(new java.awt.Color(204, 204, 204));

        TableHosteler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hosteler No.", "Name", "Address", "Contact No."
            }
        ));
        ScrlPnHstlrtablehldr.setViewportView(TableHosteler);

        TxtfldHstlrAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));
        TxtfldHstlrAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfldHstlrAddressActionPerformed(evt);
            }
        });

        TxtfldHstlrNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Hosteler No."));
        TxtfldHstlrNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfldHstlrNoActionPerformed(evt);
            }
        });

        TxtfldHstlrCntcNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact No."));
        TxtfldHstlrCntcNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfldHstlrCntcNoActionPerformed(evt);
            }
        });

        TxtfldHstlrName.setBorder(javax.swing.BorderFactory.createTitledBorder("Name"));
        TxtfldHstlrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfldHstlrNameActionPerformed(evt);
            }
        });

        BtnAddHstlr.setText("Add");
        BtnAddHstlr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddHstlrActionPerformed(evt);
            }
        });

        BtnRemoveHstlr.setText("Remove");
        BtnRemoveHstlr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveHstlrActionPerformed(evt);
            }
        });

        BtnUpdtHstlr.setText("Update");
        BtnUpdtHstlr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdtHstlrActionPerformed(evt);
            }
        });

        txtFldSearchHosteler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldSearchHostelerActionPerformed(evt);
            }
        });

        cmbBxsortbyhosteler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        cmbBxsortbyhosteler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBxsortbyhostelerActionPerformed(evt);
            }
        });

        jBtnsortHstlr.setText("Sort");
        jBtnsortHstlr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnsortHstlrActionPerformed(evt);
            }
        });

        jBtnSearchhstlr.setText("Search");
        jBtnSearchhstlr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSearchhstlrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlHstlrEditLayout = new javax.swing.GroupLayout(PnlHstlrEdit);
        PnlHstlrEdit.setLayout(PnlHstlrEditLayout);
        PnlHstlrEditLayout.setHorizontalGroup(
            PnlHstlrEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrlPnHstlrtablehldr, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PnlHstlrEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlHstlrEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlHstlrEditLayout.createSequentialGroup()
                        .addComponent(BtnAddHstlr, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(BtnRemoveHstlr, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(BtnUpdtHstlr, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlHstlrEditLayout.createSequentialGroup()
                        .addComponent(TxtfldHstlrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(TxtfldHstlrName, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(TxtfldHstlrAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(TxtfldHstlrCntcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlHstlrEditLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbBxsortbyhosteler, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnsortHstlr, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219)
                .addComponent(txtFldSearchHosteler, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnSearchhstlr, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        PnlHstlrEditLayout.setVerticalGroup(
            PnlHstlrEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlHstlrEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlHstlrEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlHstlrEditLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnsortHstlr))
                    .addGroup(PnlHstlrEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFldSearchHosteler, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnSearchhstlr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmbBxsortbyhosteler))
                .addGap(7, 7, 7)
                .addComponent(ScrlPnHstlrtablehldr, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(PnlHstlrEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtfldHstlrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtfldHstlrAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtfldHstlrName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtfldHstlrCntcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PnlHstlrEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAddHstlr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRemoveHstlr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnUpdtHstlr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        tbdPnAdminedit.addTab("Hosteler Edit", PnlHstlrEdit);

        PnlRoomEdit.setBackground(new java.awt.Color(204, 204, 204));

        TableRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No.", "Total users", "Users Id", "Call Line No."
            }
        ));
        ScrollPnTableGHldr.setViewportView(TableRoom);

        TxtfldttlUsers.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Users"));
        TxtfldttlUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfldttlUsersActionPerformed(evt);
            }
        });

        TxtfldUsersId.setBorder(javax.swing.BorderFactory.createTitledBorder("Users Id"));
        TxtfldUsersId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfldUsersIdActionPerformed(evt);
            }
        });

        TxtFldCallLineNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Call Line No."));
        TxtFldCallLineNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFldCallLineNoActionPerformed(evt);
            }
        });

        TxtfldRoom.setBorder(javax.swing.BorderFactory.createTitledBorder("Room no."));
        TxtfldRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfldRoomActionPerformed(evt);
            }
        });

        BtnAddRoom.setText("Add");
        BtnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddRoomActionPerformed(evt);
            }
        });

        BtnRmvRoom.setText("Remove");
        BtnRmvRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRmvRoomActionPerformed(evt);
            }
        });

        BtnUpdroom.setText("Update");
        BtnUpdroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdroomActionPerformed(evt);
            }
        });

        btnSearchRooms.setText("Search");
        btnSearchRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchRoomsActionPerformed(evt);
            }
        });

        btnSortrooms.setText("Sort");
        btnSortrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortroomsActionPerformed(evt);
            }
        });

        cmbBxsortbyRooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));

        javax.swing.GroupLayout PnlRoomEditLayout = new javax.swing.GroupLayout(PnlRoomEdit);
        PnlRoomEdit.setLayout(PnlRoomEditLayout);
        PnlRoomEditLayout.setHorizontalGroup(
            PnlRoomEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlRoomEditLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlRoomEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlRoomEditLayout.createSequentialGroup()
                        .addComponent(BtnAddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233)
                        .addComponent(BtnRmvRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnUpdroom, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(PnlRoomEditLayout.createSequentialGroup()
                        .addComponent(TxtfldRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(TxtfldttlUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(TxtfldUsersId, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(TxtFldCallLineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
            .addGroup(PnlRoomEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPnTableGHldr))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlRoomEditLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbBxsortbyRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSortrooms)
                .addGap(223, 223, 223)
                .addComponent(txtFldSearchRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchRooms)
                .addGap(83, 83, 83))
        );
        PnlRoomEditLayout.setVerticalGroup(
            PnlRoomEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRoomEditLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PnlRoomEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldSearchRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSortrooms)
                    .addComponent(cmbBxsortbyRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPnTableGHldr, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(PnlRoomEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtfldRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtfldttlUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtfldUsersId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFldCallLineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(PnlRoomEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRmvRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnUpdroom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        tbdPnAdminedit.addTab("Room Edit", PnlRoomEdit);

        PnlBookingEdit.setBackground(new java.awt.Color(204, 204, 204));

        TableBookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Gender", "Contact No.", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableBookings);
        if (TableBookings.getColumnModel().getColumnCount() > 0) {
            TableBookings.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        TxtFldBkngGender.setBorder(javax.swing.BorderFactory.createTitledBorder("Gender"));

        TxtFldBkngsName.setBorder(javax.swing.BorderFactory.createTitledBorder("Name"));
        TxtFldBkngsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFldBkngsNameActionPerformed(evt);
            }
        });

        TxtFldBkngsCntctNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact No."));

        TxtFldBkngsAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));

        BtnBkngsAdd.setText("Add");
        BtnBkngsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBkngsAddActionPerformed(evt);
            }
        });

        BtnBkngsUpdate.setText("Update");
        BtnBkngsUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBkngsUpdateActionPerformed(evt);
            }
        });

        TxtFldBkngsId.setBorder(javax.swing.BorderFactory.createTitledBorder("Id"));
        TxtFldBkngsId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFldBkngsIdActionPerformed(evt);
            }
        });

        BtnBkngsRemove.setText("Remove");
        BtnBkngsRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBkngsRemoveActionPerformed(evt);
            }
        });

        btnSearchBkngs.setText("Search");
        btnSearchBkngs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBkngsActionPerformed(evt);
            }
        });

        btnSortbookings.setText("Sort");
        btnSortbookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortbookingsActionPerformed(evt);
            }
        });

        cmbBxsortbyBookings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));

        javax.swing.GroupLayout PnlBookingEditLayout = new javax.swing.GroupLayout(PnlBookingEdit);
        PnlBookingEdit.setLayout(PnlBookingEditLayout);
        PnlBookingEditLayout.setHorizontalGroup(
            PnlBookingEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBookingEditLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlBookingEditLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PnlBookingEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlBookingEditLayout.createSequentialGroup()
                        .addComponent(BtnBkngsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(BtnBkngsRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtFldBkngsCntctNo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(BtnBkngsUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(PnlBookingEditLayout.createSequentialGroup()
                        .addComponent(TxtFldBkngsId, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(TxtFldBkngsName, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtFldBkngGender, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)
                        .addComponent(TxtFldBkngsAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlBookingEditLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cmbBxsortbyBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSortbookings)
                .addGap(139, 139, 139)
                .addComponent(txtFldSearchBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchBkngs)
                .addGap(59, 59, 59))
        );
        PnlBookingEditLayout.setVerticalGroup(
            PnlBookingEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBookingEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlBookingEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlBookingEditLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(PnlBookingEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchBkngs, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSortbookings, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(txtFldSearchBookings)
                    .addGroup(PnlBookingEditLayout.createSequentialGroup()
                        .addComponent(cmbBxsortbyBookings)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PnlBookingEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlBookingEditLayout.createSequentialGroup()
                        .addGroup(PnlBookingEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtFldBkngGender, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtFldBkngsAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtFldBkngsCntctNo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(PnlBookingEditLayout.createSequentialGroup()
                        .addGroup(PnlBookingEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtFldBkngsName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlBookingEditLayout.createSequentialGroup()
                                .addComponent(TxtFldBkngsId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGap(18, 18, 18)
                        .addGroup(PnlBookingEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnBkngsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBkngsRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBkngsUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );

        tbdPnAdminedit.addTab("Bookings", PnlBookingEdit);

        javax.swing.GroupLayout PnlAdnminEditTabHldrLayout = new javax.swing.GroupLayout(PnlAdnminEditTabHldr);
        PnlAdnminEditTabHldr.setLayout(PnlAdnminEditTabHldrLayout);
        PnlAdnminEditTabHldrLayout.setHorizontalGroup(
            PnlAdnminEditTabHldrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPnAdminedit)
        );
        PnlAdnminEditTabHldrLayout.setVerticalGroup(
            PnlAdnminEditTabHldrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAdnminEditTabHldrLayout.createSequentialGroup()
                .addComponent(tbdPnAdminedit, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TbdPnMain.addTab("Administration", PnlAdnminEditTabHldr);

        LblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hostelapp/resource/Untitled.png"))); // NOI18N

        javax.swing.GroupLayout PnlLogoHldrLayout = new javax.swing.GroupLayout(PnlLogoHldr);
        PnlLogoHldr.setLayout(PnlLogoHldrLayout);
        PnlLogoHldrLayout.setHorizontalGroup(
            PnlLogoHldrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlLogoHldrLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LblLogo)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        PnlLogoHldrLayout.setVerticalGroup(
            PnlLogoHldrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlLogoHldrLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(LblLogo)
                .addGap(17, 17, 17))
        );

        lblMainHeading.setBackground(new java.awt.Color(153, 204, 255));
        lblMainHeading.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMainHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainHeading.setText("Hostel Management System");
        lblMainHeading.setToolTipText("");

        BtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hostelapp/resource/corss.png"))); // NOI18N
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlAdminLayout = new javax.swing.GroupLayout(PnlAdmin);
        PnlAdmin.setLayout(PnlAdminLayout);
        PnlAdminLayout.setHorizontalGroup(
            PnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAdminLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(PnlLogoHldr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMainHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(TbdPnMain)
        );
        PnlAdminLayout.setVerticalGroup(
            PnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAdminLayout.createSequentialGroup()
                .addGroup(PnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlAdminLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PnlLogoHldr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMainHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TbdPnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(PnlAdmin, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFldBkngsIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFldBkngsIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFldBkngsIdActionPerformed

    private void BtnBkngsUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBkngsUpdateActionPerformed
        if(TxtFldBkngsId.getText().isEmpty() || TxtFldBkngsName.getText().isEmpty()|| TxtFldBkngGender.getText().isEmpty() || TxtFldBkngsCntctNo.getText().isEmpty() || TxtFldBkngsAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill out all the required information","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        try
        {

            int id = Integer.parseInt(TxtFldBkngsId.getText());
            String name = TxtFldBkngsName.getText();
            String gender = TxtFldBkngGender.getText();
            long bookings_contact_no = Integer.parseInt(TxtFldBkngsCntctNo.getText());
            String bookings_address = TxtFldBkngsAddress.getText();
            boolean left = false;
            for(hostelmodel object_bookings : bookings)
            {

                if(object_bookings.getId()==Integer.parseInt(TxtFldBkngsId.getText()))
                {
                    left = true;
                }
            }

            if(left == true)
            {
                hostelmodel room_info = new hostelmodel(id,name,gender,bookings_contact_no,bookings_address);
                tableModelbookings = (DefaultTableModel) TableBookings.getModel();
                int rowCount = tableModelbookings.getRowCount();

                for (int i = 0; i < rowCount; i++){

                    if (tableModelbookings.getValueAt(i, 0).equals(id)) {
                        tableModelbookings.removeRow(i);
                        bookings.remove(i);
                        break; // Exit loop after removing the row
                    }
                }

                bookings.add(room_info );
                addDataToBookingsTable(room_info);
                JOptionPane.showMessageDialog(rootPane,"Booking Updated sucessfully.","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Booking doesnot exists","Alert",JOptionPane.WARNING_MESSAGE);
            }

        }
        catch(NumberFormatException e1) //catch message if try passes
        {
            JOptionPane.showMessageDialog(rootPane,"Id, Bookings Contact No should be an Integer.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnBkngsUpdateActionPerformed

    private void BtnBkngsRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBkngsRemoveActionPerformed
        if(TxtFldBkngsId.getText().isEmpty() || TxtFldBkngsName.getText().isEmpty()|| TxtFldBkngGender.getText().isEmpty() || TxtFldBkngsCntctNo.getText().isEmpty() || TxtFldBkngsAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill out all the required information","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        try
        {
            int id = Integer.parseInt(TxtFldBkngsId.getText());
            boolean left = false;
            for(hostelmodel object_bookings : bookings)
            {

                if(object_bookings.getId()==Integer.parseInt(TxtFldBkngsId.getText()))
                {
                    left = true;
                }
            }

            if(left == true)
            {

                
                int rowCount = tableModelbookings.getRowCount();

                for (int i = 0; i < rowCount; i++){

                    if (tableModelbookings.getValueAt(i, 0).equals(id)) {
                        tableModelbookings.removeRow(i);
                        bookings.remove(i);
                        break; // Exit loop after removing the row
                    }
                }
                JOptionPane.showMessageDialog(rootPane,"Booking removed sucessfully.","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Booking doesnot exists","Alert",JOptionPane.WARNING_MESSAGE);
            }

        }
        catch(NumberFormatException e1) //catch message if try passes
        {
            JOptionPane.showMessageDialog(rootPane,"Id,Bookings Contact No should be an Integer.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnBkngsRemoveActionPerformed

    private void BtnBkngsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBkngsAddActionPerformed

        if(TxtFldBkngsId.getText().isEmpty() || TxtFldBkngsName.getText().isEmpty()|| TxtFldBkngGender.getText().isEmpty() || TxtFldBkngsCntctNo.getText().isEmpty() || TxtFldBkngsAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill out all the required information","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        try
        {   int id = Integer.parseInt(TxtFldBkngsId.getText());
            String name = TxtFldBkngsName.getText();
            String gender = TxtFldBkngGender.getText();
            long bookings_contact_no = Integer.parseInt(TxtFldBkngsCntctNo.getText());
            String bookings_address = TxtFldBkngsAddress.getText();
            boolean left = false;
            for(hostelmodel object_bookings : bookings)
            {

                if(object_bookings.getId()==Integer.parseInt(TxtFldBkngsId.getText()))
                {
                    left = true;
                }
            }

            if(left == false)
            {
                hostelmodel bookings_info = new hostelmodel(id,name,gender,bookings_contact_no,bookings_address);
                bookings.add(bookings_info);
                addDataToBookingsTable(bookings_info);
                JOptionPane.showMessageDialog(rootPane,"Booking added sucessfully.","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Booking already exists","Alert",JOptionPane.WARNING_MESSAGE);
            }

        }
        catch(NumberFormatException e1) //catch message if try passes
        {
            JOptionPane.showMessageDialog(rootPane,"Id,Bookings Contact No should be an Integer.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnBkngsAddActionPerformed

    private void TxtFldBkngsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFldBkngsNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFldBkngsNameActionPerformed

    private void BtnUpdroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdroomActionPerformed
        if(TxtfldRoom.getText().isEmpty() || TxtfldttlUsers.getText().isEmpty()|| TxtfldUsersId.getText().isEmpty() || TxtFldCallLineNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill out all the required information","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        try
        {

            int room_No = Integer.parseInt(TxtfldRoom.getText());
            int total_Users = Integer.parseInt(TxtfldttlUsers.getText());
            String usersId = TxtfldUsersId.getText();
            int calllineno = Integer.parseInt(TxtFldCallLineNo.getText());
            boolean left = false;
            for(hostelmodel object_room : rooms)
            {

                if(object_room.getRoom_No()==Integer.parseInt(TxtfldRoom.getText()))
                {
                    left = true;
                }
            }

            if(left == true)
            {
                hostelmodel room_info = new hostelmodel(room_No,total_Users,usersId,calllineno);
                
                int rowCount = tableModelrooms.getRowCount();

                for (int i = 0; i < rowCount; i++){

                    if (tableModelrooms.getValueAt(i, 0).equals(room_No)) {
                        tableModelrooms.removeRow(i);
                        rooms.remove(i);
                        break; // Exit loop after removing the row
                    }
                }

                rooms.add(room_info );
                addDataToRoomTable(room_info);
                JOptionPane.showMessageDialog(rootPane,"Room Updated sucessfully.","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Room doesnot exists","Alert",JOptionPane.WARNING_MESSAGE);
            }

        }
        catch(NumberFormatException e1) //catch message if try passes
        {
            JOptionPane.showMessageDialog(rootPane,"Room No, Total users,Contact No should be an Integer.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnUpdroomActionPerformed

    private void BtnRmvRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRmvRoomActionPerformed
        if(TxtfldRoom.getText().isEmpty() || TxtfldttlUsers.getText().isEmpty()|| TxtfldUsersId.getText().isEmpty() || TxtFldCallLineNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill out all the required information","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        try
        {
            int room_No = Integer.parseInt(TxtfldRoom.getText());
            boolean left = false;
            for(hostelmodel object_room : rooms)
            {

                if(object_room.getRoom_No()==Integer.parseInt(TxtfldRoom.getText()))
                {
                    left = true;
                }
            }

            if(left == true)
            {

                
                int rowCount = tableModelrooms.getRowCount();

                for (int i = 0; i < rowCount; i++){

                    if (tableModelrooms.getValueAt(i, 0).equals(room_No)) {
                        tableModelrooms.removeRow(i);
                        rooms.remove(i);
                        break; // Exit loop after removing the row
                    }
                }
                JOptionPane.showMessageDialog(rootPane,"Room removed sucessfully.","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Room doesnot exists","Alert",JOptionPane.WARNING_MESSAGE);
            }

        }
        catch(NumberFormatException e1) //catch message if try passes
        {
            JOptionPane.showMessageDialog(rootPane,"Room No, Total users,Contact No should be an Integer.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnRmvRoomActionPerformed

    private void BtnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddRoomActionPerformed
        try
        {

            int room_No = Integer.parseInt(TxtfldRoom.getText());
            int total_Users = Integer.parseInt(TxtfldttlUsers.getText());
            String usersId = TxtfldUsersId.getText();
            int calllineno = Integer.parseInt(TxtFldCallLineNo.getText());

            boolean left = false;
            for(hostelmodel object_room : rooms)
            {

                if(object_room.getRoom_No()==Integer.parseInt(TxtfldRoom.getText()))
                {
                    left = true;
                }
            }

            if(left == false)
            {
                hostelmodel room_info = new hostelmodel(room_No,total_Users,usersId,calllineno);
                rooms.add(room_info );
                addDataToRoomTable(room_info);
                JOptionPane.showMessageDialog(rootPane,"Room added sucessfully.","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Room already exists","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(NumberFormatException e1) //catch message if try passes
        {
            JOptionPane.showMessageDialog(rootPane,"Room No, Total users,Contact No should be an Integer.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnAddRoomActionPerformed

    private void TxtfldRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfldRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfldRoomActionPerformed

    private void TxtFldCallLineNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFldCallLineNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFldCallLineNoActionPerformed

    private void TxtfldUsersIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfldUsersIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfldUsersIdActionPerformed

    private void TxtfldttlUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfldttlUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfldttlUsersActionPerformed

    private void BtnUpdtHstlrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdtHstlrActionPerformed
        if(TxtfldHstlrNo.getText().isEmpty() || TxtfldHstlrName.getText().isEmpty()|| TxtfldHstlrAddress.getText().isEmpty() || TxtfldHstlrCntcNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill out all the required information","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        try
        {

            int hosteler_No = Integer.parseInt(TxtfldHstlrNo.getText());
            String hosteler_name = TxtfldHstlrName.getText();
            String address = TxtfldHstlrAddress.getText();
            long contact_No = Integer.parseInt(TxtfldHstlrCntcNo.getText());
            boolean left = false;
            for(hostelmodel object_hosteler : hosteler)
            {

                if(object_hosteler.getHosteler_No()==Integer.parseInt(TxtfldHstlrNo.getText()))
                {
                    left = true;
                }
            }

            if(left == true)
            {
                hostelmodel hosteler_info = new hostelmodel(hosteler_No,hosteler_name,address,contact_No);
                
                int rowCount = tableModelhosteler.getRowCount();

                for (int i = 0; i < rowCount; i++){

                    if (tableModelhosteler.getValueAt(i, 0).equals(hosteler_No)) {
                        tableModelhosteler.removeRow(i);
                        hosteler.remove(i);
                        break; // Exit loop after removing the row
                    }
                }

                hosteler.add(hosteler_info );
                addDataToHostelerTable(hosteler_info);
                JOptionPane.showMessageDialog(rootPane,"Hosteler Updated sucessfully.","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Hosteler doesnot exists","Alert",JOptionPane.WARNING_MESSAGE);
            }

        }
        catch(NumberFormatException e1) //catch message if try passes
        {
            JOptionPane.showMessageDialog(rootPane,"Hosteler No,Contact No should be an Integer.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnUpdtHstlrActionPerformed

    private void BtnRemoveHstlrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveHstlrActionPerformed
        if(TxtfldHstlrNo.getText().isEmpty() || TxtfldHstlrName.getText().isEmpty()|| TxtfldHstlrAddress.getText().isEmpty() || TxtfldHstlrCntcNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill out all the required information","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        try
        {
            int hosteler_No = Integer.parseInt(TxtfldHstlrNo.getText());
            boolean left = false;
            for(hostelmodel object_hosteler : hosteler)
            {
                if(object_hosteler.getHosteler_No()==Integer.parseInt(TxtfldHstlrNo.getText()))
                {
                    left = true;
                }
            }
            if(left == true)
            {   
                
                
                int rowCount = tableModelhosteler.getRowCount();
                for (int i = 0; i < rowCount; i++){
                    if (tableModelhosteler.getValueAt(i, 0).equals(hosteler_No)) {
                        tableModelhosteler.removeRow(i);
                        hosteler.remove(i);
                        break; // Exit loop after removing the row
                    }
                }
                JOptionPane.showMessageDialog(rootPane,"Hosteler removed sucessfully.","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Hosteler doesnot exists","Alert",JOptionPane.WARNING_MESSAGE);
            }

        }
        catch(NumberFormatException e1) //catch message if try passes
        {
            JOptionPane.showMessageDialog(rootPane,"Hosteler No,Contact No should be an Integer.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnRemoveHstlrActionPerformed

    private void BtnAddHstlrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddHstlrActionPerformed
        if(TxtfldHstlrNo.getText().isEmpty() || TxtfldHstlrName.getText().isEmpty()|| TxtfldHstlrAddress.getText().isEmpty() || TxtfldHstlrCntcNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill out all the required information","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        try
        {

            int hosteler_No = Integer.parseInt(TxtfldHstlrNo.getText());
            String hosteler_name = TxtfldHstlrName.getText();
            String address = TxtfldHstlrAddress.getText();
            long contact_No = Integer.parseInt(TxtfldHstlrCntcNo.getText());
            boolean left = false;
            for(hostelmodel object_hosteler : hosteler)
            {

                if(object_hosteler.getHosteler_No()==Integer.parseInt(TxtfldHstlrNo.getText()))
                {
                    left = true;
                }
            }

            if(left == false)
            {
                hostelmodel hosteler_info = new hostelmodel(hosteler_No,hosteler_name,address,contact_No);
                hosteler.add(hosteler_info );
                addDataToHostelerTable(hosteler_info);
                JOptionPane.showMessageDialog(rootPane,"Hosteler added sucessfully.","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Hosteler already exists","Alert",JOptionPane.WARNING_MESSAGE);
            }

        }
        catch(NumberFormatException e1) //catch message if try passes
        {
            JOptionPane.showMessageDialog(rootPane,"Hosteler No,Contact No should be an Integer.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnAddHstlrActionPerformed

    private void TxtfldHstlrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfldHstlrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfldHstlrNameActionPerformed

    private void TxtfldHstlrCntcNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfldHstlrCntcNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfldHstlrCntcNoActionPerformed

    private void TxtfldHstlrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfldHstlrNoActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_TxtfldHstlrNoActionPerformed

    private void TxtfldHstlrAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfldHstlrAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfldHstlrAddressActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        dispose();
    }//GEN-LAST:event_BtnExitActionPerformed

    private void txtFldSearchHostelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldSearchHostelerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldSearchHostelerActionPerformed

    private void cmbBxsortbyhostelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBxsortbyhostelerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBxsortbyhostelerActionPerformed

    private void jBtnsortHstlrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnsortHstlrActionPerformed
        tableModelhosteler.setRowCount(0);  //clearing table 
        String sortingmethod = (String) cmbBxsortbyhosteler.getSelectedItem();  
        if(sortingmethod.equals("Ascending")){

            List<hostelmodel> selectionSort = SelectionSorting.sortByhosteler_No(hosteler,false); //calling sort method
            for(hostelmodel hostelers : selectionSort)
            {
            addDataToHostelerTable(hostelers);  //adding sorted list
            }
        }
        else{

            List<hostelmodel> selectionSort = SelectionSorting.sortByhosteler_No(hosteler,true);
            for(hostelmodel hostelers : selectionSort)
            {
            addDataToHostelerTable(hostelers);  //adding sorted list
            }
        }
    }//GEN-LAST:event_jBtnsortHstlrActionPerformed

    private void btnSortroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortroomsActionPerformed
        
        tableModelrooms.setRowCount(0);
        String sortingmethod = (String) cmbBxsortbyRooms.getSelectedItem();
        if(sortingmethod.equals("Ascending")){

            List<hostelmodel> insertionSort = InsertionSorting.sortByRoom_No(rooms,false);//calling sort method
            for(hostelmodel roomlist : insertionSort)
            {
            addDataToRoomTable(roomlist);//adding sorted list
            }
        }
        else{

            List<hostelmodel> insertionSort = InsertionSorting.sortByRoom_No(rooms,true);
            for(hostelmodel roomlist : insertionSort)
            {
            addDataToRoomTable(roomlist);//adding sorted list
            }
        }
    }//GEN-LAST:event_btnSortroomsActionPerformed

    private void btnSortbookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortbookingsActionPerformed
        
        tableModelbookings.setRowCount(0);
        String sortingmethod = (String) cmbBxsortbyBookings.getSelectedItem();
        if(sortingmethod.equals("Ascending")){  //checking the check box value is either asc or desc

            List<hostelmodel> mergeSort = mergeSorting.sortById(bookings,false);
            for(hostelmodel bookinglist : mergeSort)
            {
            addDataToBookingsTable(bookinglist);
            }
        }
        else{

            List<hostelmodel> mergeSort = mergeSorting.sortById(bookings,true);
            for(hostelmodel bookinglist : mergeSort)
            {
            addDataToBookingsTable(bookinglist);
            }
        }
                
    }//GEN-LAST:event_btnSortbookingsActionPerformed

    private void jBtnSearchhstlrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchhstlrActionPerformed
        // TODO add your handling code here:
         String searchValue = txtFldSearchHosteler.getText().trim();
         if (searchValue.isEmpty()) {
        JOptionPane.showMessageDialog(
            this,
            "Please enter a name to search",
            "Empty Search",
            JOptionPane.WARNING_MESSAGE
        );
        return;
        }
        hostelmodel result = searcher.searchByHosteler_name(searchValue, hosteler, 0, hosteler.size() - 1);
        if (result != null) {
        // Creating message with found hosteler's information
        String message = String.format("""
                                       Hosteler Found!
                                       Name: %s
                                       ID: %s
                                       Address: %s
                                       Contact: %s""", result.getHosteler_name(), result.getHosteler_No(), result.getAddress(), result.getContact_No());
        
        JOptionPane.showMessageDialog(this,message, "Search Result",JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
        JOptionPane.showMessageDialog(this,"No hosteler found with the name: " + searchValue,"Not Found",JOptionPane.INFORMATION_MESSAGE);
        
    }
    }//GEN-LAST:event_jBtnSearchhstlrActionPerformed

    private void btnSearchRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchRoomsActionPerformed
        // TODO add your handling code here:
        if (txtFldSearchRooms.getText().isEmpty()) {
        JOptionPane.showMessageDialog(
            this,
            "Please enter a room no to search",
            "Empty Search",
            JOptionPane.WARNING_MESSAGE
        );
        return;
        }

        
        try
        {   //try catch if user inputs string or any exceptions
        
        int searchValue = Integer.parseInt(txtFldSearchRooms.getText().trim());
        hostelmodel result = searcher.searchByRoom_No(searchValue, rooms, 0, rooms.size() - 1);
        if (result != null) {
        // Creating message with found room information
        String message = String.format("""
                                       Room Found!
                                       Room id: %s
                                       Total Users: %s
                                       users Id: %s
                                       Call lineno: %s""", result.getRoom_No(), result.getTotal_Users(), result.getUsersId(), result.getCalllineno());
        
                JOptionPane.showMessageDialog(this,message, "Search Result",JOptionPane.INFORMATION_MESSAGE);
            } 
            else {
            JOptionPane.showMessageDialog(this,"No room is found with the room no: " + searchValue,"Not Found",JOptionPane.INFORMATION_MESSAGE);
        
            }
        }
        catch(NumberFormatException e1) //catch message if try passes
        {
            JOptionPane.showMessageDialog(rootPane,"the input on search should be an Integer.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchRoomsActionPerformed

    private void btnSearchBkngsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBkngsActionPerformed
        // TODO add your handling code here:
        String searchValue = txtFldSearchBookings.getText().trim(); 
         if (searchValue.isEmpty()) { //check and validate empty txtfld
        JOptionPane.showMessageDialog(
            this,
            "Please enter a name to search",
            "Empty Search",
            JOptionPane.WARNING_MESSAGE
        );
        return;
        }
        hostelmodel result = searcher.searchByName(searchValue, bookings, 0, bookings.size() - 1);
        if (result != null) {
        // Create message with found Booking's information
        String message = String.format("""
                                        Booking Found!
                                       ID: %s
                                       Name: %s
                                       Gender: %s
                                       Contact: %s
                                       Address: %s """, result.getId(), result.getName(), result.getGender(), result.getBookings_contact_no(), result.getBookings_address());
        
        JOptionPane.showMessageDialog(this,message, "Search Result",JOptionPane.INFORMATION_MESSAGE);
    } 
        else {
        JOptionPane.showMessageDialog(this,"No bookings found with the name: " + searchValue,"Not Found",JOptionPane.INFORMATION_MESSAGE);
        
    }
    }//GEN-LAST:event_btnSearchBkngsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hostelapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hostelapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hostelapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hostelapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hostelapp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddHstlr;
    private javax.swing.JButton BtnAddRoom;
    private javax.swing.JButton BtnBkngsAdd;
    private javax.swing.JButton BtnBkngsRemove;
    private javax.swing.JButton BtnBkngsUpdate;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnRemoveHstlr;
    private javax.swing.JButton BtnRmvRoom;
    private javax.swing.JButton BtnUpdroom;
    private javax.swing.JButton BtnUpdtHstlr;
    private javax.swing.JLabel LblLogo;
    private javax.swing.JLabel LblNotice;
    private javax.swing.JLabel LblSystmMnt;
    private javax.swing.JPanel PnlAdmin;
    private javax.swing.JPanel PnlAdnminEditTabHldr;
    private javax.swing.JPanel PnlBookingEdit;
    private javax.swing.JPanel PnlHome;
    private javax.swing.JPanel PnlHstlrEdit;
    private javax.swing.JPanel PnlLogoHldr;
    private javax.swing.JPanel PnlNoticbg;
    private javax.swing.JPanel PnlNoticeinfo;
    private javax.swing.JPanel PnlNoticemain;
    private javax.swing.JPanel PnlRoomEdit;
    private javax.swing.JPanel PnlSystmMnt;
    private javax.swing.JPanel PnlSystmMntbody;
    private javax.swing.JPanel PnlTxtnotice;
    private javax.swing.JPanel Pnlbg1;
    private javax.swing.JPanel PnlsysmMntHead;
    private javax.swing.JScrollPane ScllPnareaInfo;
    private javax.swing.JScrollPane ScrlPnHstlrtablehldr;
    private javax.swing.JScrollPane ScrollPnTableGHldr;
    private javax.swing.JTable TableBookings;
    private javax.swing.JTable TableHosteler;
    private javax.swing.JTable TableRoom;
    private javax.swing.JTabbedPane TbdPnMain;
    private javax.swing.JTextArea TxtAreaNoticeInfo;
    private javax.swing.JTextArea TxtAreaSystmMntMain;
    private javax.swing.JTextField TxtFldBkngGender;
    private javax.swing.JTextField TxtFldBkngsAddress;
    private javax.swing.JTextField TxtFldBkngsCntctNo;
    private javax.swing.JTextField TxtFldBkngsId;
    private javax.swing.JTextField TxtFldBkngsName;
    private javax.swing.JTextField TxtFldCallLineNo;
    private javax.swing.JTextField TxtfldHstlrAddress;
    private javax.swing.JTextField TxtfldHstlrCntcNo;
    private javax.swing.JTextField TxtfldHstlrName;
    private javax.swing.JTextField TxtfldHstlrNo;
    private javax.swing.JTextField TxtfldRoom;
    private javax.swing.JTextField TxtfldUsersId;
    private javax.swing.JTextField TxtfldttlUsers;
    private javax.swing.JButton btnSearchBkngs;
    private javax.swing.JButton btnSearchRooms;
    private javax.swing.JButton btnSortbookings;
    private javax.swing.JButton btnSortrooms;
    private javax.swing.JComboBox<String> cmbBxsortbyBookings;
    private javax.swing.JComboBox<String> cmbBxsortbyRooms;
    private javax.swing.JComboBox<String> cmbBxsortbyhosteler;
    private javax.swing.JButton jBtnSearchhstlr;
    private javax.swing.JButton jBtnsortHstlr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMainHeading;
    private javax.swing.JScrollPane scrlPnSystmMnt;
    private javax.swing.JTabbedPane tbdPnAdminedit;
    private javax.swing.JTextField txtFldSearchBookings;
    private javax.swing.JTextField txtFldSearchHosteler;
    private javax.swing.JTextField txtFldSearchRooms;
    // End of variables declaration//GEN-END:variables
}
