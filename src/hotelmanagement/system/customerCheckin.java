/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelmanagement.system;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author w
 */
public class customerCheckin extends javax.swing.JFrame {

    public customerCheckin() {
         initComponents();
         /*SimpleDateFormat  dat=new SimpleDateFormat("yyyy/MM/dd ");
         Date d=new Date();
         customercheckindate.setText(dat.format(d));
         CUSTOMERNAME.requestFocus();
         */
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
            //st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pst=con.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bed=?");
            pst.setString(1,"NOT BOOKED");
            pst.setString(2, jComboBoxroomtype.getItemAt(jComboBoxroomtype.getSelectedIndex()));
            pst.setString(3, jComboBoxbedtype.getItemAt(jComboBoxbedtype.getSelectedIndex()));
            rs=pst.executeQuery();
            while(rs.next()){
                jComboBoxRoomnumber.addItem(rs.getString("roomnumber"));
            }
            pst=con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1,jComboBoxRoomnumber.getItemAt(jComboBoxRoomnumber.getSelectedIndex()));
            rs=pst.executeQuery();
            if(rs.next())
            roomprice.setText(rs.getString("price"));
        }catch(ClassNotFoundException | SQLException e){
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Checkin = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CUSTOMERNAME = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        customernumber = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ComboBoxgender = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        CustomerNationnality = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxbedtype = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxroomtype = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        roomprice = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        CheckInNow = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        AdharNumber = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jComboBoxRoomnumber = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jPanel13.setPreferredSize(new java.awt.Dimension(790, 530));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Checkin");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText("Name");

        CUSTOMERNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUSTOMERNAMEActionPerformed(evt);
            }
        });
        CUSTOMERNAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CUSTOMERNAMEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CUSTOMERNAMEKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 51));
        jLabel14.setText("Mobile number");

        customernumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customernumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customernumberKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 51));
        jLabel15.setText("Gender");

        ComboBoxgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 51));
        jLabel16.setText("Nationnality");

        CustomerNationnality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerNationnalityActionPerformed(evt);
            }
        });
        CustomerNationnality.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CustomerNationnalityKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 51));
        jLabel17.setText("Check in Date");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 51));
        jLabel18.setText("Bed Type");

        jComboBoxbedtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        jComboBoxbedtype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxbedtypeItemStateChanged(evt);
            }
        });
        jComboBoxbedtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxbedtypeActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 51));
        jLabel19.setText("Room Type");

        jComboBoxroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC" }));
        jComboBoxroomtype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxroomtypeItemStateChanged(evt);
            }
        });
        jComboBoxroomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxroomtypeActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 51));
        jLabel20.setText("Price");

        roomprice.setEditable(false);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 51, 51));
        jLabel30.setText("Id");

        CheckInNow.setBackground(new java.awt.Color(0, 51, 51));
        CheckInNow.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CheckInNow.setForeground(new java.awt.Color(255, 255, 255));
        CheckInNow.setText("Check in Now");
        CheckInNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInNowActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(0, 51, 51));
        Clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        AdharNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AdharNumberKeyPressed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 51, 51));
        jLabel31.setText("Room Number");

        jComboBoxRoomnumber.setMaximumRowCount(20);
        jComboBoxRoomnumber.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxRoomnumberItemStateChanged(evt);
            }
        });
        jComboBoxRoomnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRoomnumberActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CheckInNow)
                .addGap(18, 18, 18)
                .addComponent(Clear)
                .addGap(30, 30, 30))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel30))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ComboBoxgender, javax.swing.GroupLayout.Alignment.LEADING, 0, 179, Short.MAX_VALUE)
                            .addComponent(CUSTOMERNAME, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(customernumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(CustomerNationnality, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(AdharNumber, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel8)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(jComboBoxRoomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxbedtype, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roomprice, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(49, 49, 49)))
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxroomtype, 0, 171, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addGap(52, 52, 52)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(CUSTOMERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customernumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBoxroomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(55, 55, 55)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(ComboBoxgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBoxbedtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(CustomerNationnality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jComboBoxRoomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel30)
                    .addComponent(AdharNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckInNow)
                    .addComponent(Clear))
                .addContainerGap())
        );

        javax.swing.GroupLayout CheckinLayout = new javax.swing.GroupLayout(Checkin);
        Checkin.setLayout(CheckinLayout);
        CheckinLayout.setHorizontalGroup(
            CheckinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CheckinLayout.setVerticalGroup(
            CheckinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CUSTOMERNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUSTOMERNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CUSTOMERNAMEActionPerformed

    private void CustomerNationnalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNationnalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerNationnalityActionPerformed

    private void jComboBoxbedtypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxbedtypeItemStateChanged
        // TODO add your handling code here:
           PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
            //st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pst=con.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bed=?");
            pst.setString(1,"NOT BOOKED");
            pst.setString(2, jComboBoxroomtype.getItemAt(jComboBoxroomtype.getSelectedIndex()));
            pst.setString(3, jComboBoxbedtype.getItemAt(jComboBoxbedtype.getSelectedIndex()));
            rs=pst.executeQuery();
            jComboBoxRoomnumber.removeAllItems();
            while(rs.next()){
                jComboBoxRoomnumber.addItem(rs.getString("roomnumber"));
            }
            pst=con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1,jComboBoxRoomnumber.getItemAt(jComboBoxRoomnumber.getSelectedIndex()));
            rs=pst.executeQuery();
            if(rs.next())
            roomprice.setText(rs.getString("price"));
        }catch(ClassNotFoundException | SQLException e){
        }

    }//GEN-LAST:event_jComboBoxbedtypeItemStateChanged

    private void jComboBoxbedtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxbedtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxbedtypeActionPerformed

    private void jComboBoxroomtypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxroomtypeItemStateChanged
        // TODO add your handling code here:
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
            //st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pst=con.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bed=?");
            pst.setString(1,"NOT BOOKED");
            pst.setString(2, jComboBoxroomtype.getItemAt(jComboBoxroomtype.getSelectedIndex()));
            pst.setString(3, jComboBoxbedtype.getItemAt(jComboBoxbedtype.getSelectedIndex()));
            rs=pst.executeQuery();
            jComboBoxRoomnumber.removeAllItems();
            while(rs.next()){
                jComboBoxRoomnumber.addItem(rs.getString("roomnumber"));
            }
            pst=con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1,jComboBoxRoomnumber.getItemAt(jComboBoxRoomnumber.getSelectedIndex()));
            rs=pst.executeQuery();
            if(rs.next())
            roomprice.setText(rs.getString("price"));
        }catch(ClassNotFoundException | SQLException e){
        }
    }//GEN-LAST:event_jComboBoxroomtypeItemStateChanged

    private void jComboBoxroomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxroomtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxroomtypeActionPerformed

    private void CheckInNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInNowActionPerformed
        // TODO add your handling code here:
        if(CUSTOMERNAME.getText().equals("")){
      JOptionPane.showMessageDialog(this, "All Field is Requied");
      CUSTOMERNAME.requestFocus();
    }
    else if(customernumber.getText().equals("")){
       JOptionPane.showMessageDialog(this, "All Field is Requied");
       customernumber.requestFocus();
    }
    
    else if(CustomerNationnality.getText().equals("")){
       JOptionPane.showMessageDialog(this, "All Field is Requied");
       CustomerNationnality.requestFocus();
    }
    else if(AdharNumber.getText().equals("")){
      JOptionPane.showMessageDialog(this, "All Field is Requied");
      AdharNumber.requestFocus();
    }
    
    else if(roomprice.getText().equals("")){
       JOptionPane.showMessageDialog(this, "Sorry, This type of Room Not avaible Select another room ");
       roomprice.requestFocus();
    }
    else if(customernumber.getText().length()!=10){
        JOptionPane.showMessageDialog(this, "Mobile Number Should be 10 Digit.");
    }
    else if(AdharNumber.getText().length()!=12){
        JOptionPane.showMessageDialog(this, "Adhar Number Should be 12 Digit.");
    }
    else{
        try{
        long l=Long.parseLong(customernumber.getText());
        l=Long.parseLong(AdharNumber.getText());
        
        try {
            PreparedStatement pst;
            ResultSet rs;
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
            pst=con.prepareStatement("insert into customer(customername,mobile,gender,id,nationality,checkin,Roomnumber,bedtype,Roomtype,Price,Status)values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, CUSTOMERNAME.getText());
            pst.setString(2, customernumber.getText());
            pst.setString(3, ComboBoxgender.getItemAt(ComboBoxgender.getSelectedIndex()));
            pst.setString(4, AdharNumber.getText());
            pst.setString(5, CustomerNationnality.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(jDateChooser1.getDate());
            pst.setString(6, date1);
            pst.setString(7, (String) jComboBoxRoomnumber.getSelectedItem());
            pst.setString(8,(String) jComboBoxbedtype.getSelectedItem());
            pst.setString(9, (String) jComboBoxroomtype.getSelectedItem());
            pst.setString(10, roomprice.getText());
            pst.setString(11,"NULL");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Room Alloted");
            pst=con.prepareStatement("update room set status=? where roomnumber=?");
            pst.setString(1,"BOOKED" );
            pst.setString(2, (String) jComboBoxRoomnumber.getSelectedItem());
            pst.executeUpdate();
            pst=con.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bed=?");
            pst.setString(1,"NOT BOOKED");
            pst.setString(2, jComboBoxroomtype.getItemAt(jComboBoxroomtype.getSelectedIndex()));
            pst.setString(3, jComboBoxbedtype.getItemAt(jComboBoxbedtype.getSelectedIndex()));
            rs=pst.executeQuery();
            jComboBoxRoomnumber.removeAllItems();
            while(rs.next()){
                jComboBoxRoomnumber.addItem(rs.getString("roomnumber"));
            }
            pst=con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1,jComboBoxRoomnumber.getItemAt(jComboBoxRoomnumber.getSelectedIndex()));
            rs=pst.executeQuery();
            if(rs.next()){
            roomprice.setText(rs.getString("price"));
            }
            CUSTOMERNAME.setText("");
            customernumber.setText("");
            CustomerNationnality.setText("");
            AdharNumber.setText("");
            jDateChooser1.setCalendar(null);
            ComboBoxgender.setSelectedIndex(0);
            jComboBoxbedtype.setSelectedIndex(0);
            jComboBoxroomtype.setSelectedIndex(0);
            if(jComboBoxRoomnumber.getItemCount()==0)
                roomprice.setText("");
            }
        
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Either Mobile Number or Adhar Number Not valied");
                }
    }
    
     
    }//GEN-LAST:event_CheckInNowActionPerformed

    private void jComboBoxRoomnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRoomnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRoomnumberActionPerformed

    private void jComboBoxRoomnumberItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxRoomnumberItemStateChanged
        // TODO add your handling code here:
        PreparedStatement pst;
            ResultSet rs;
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
            pst=con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1,jComboBoxRoomnumber.getItemAt(jComboBoxRoomnumber.getSelectedIndex()));
            rs=pst.executeQuery();
            if(rs.next())
            roomprice.setText(rs.getString("price"));       
            }catch(ClassNotFoundException | SQLException e){
        }
    }//GEN-LAST:event_jComboBoxRoomnumberItemStateChanged

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        CUSTOMERNAME.setText("");
        customernumber.setText("");
        CustomerNationnality.setText("");
        AdharNumber.setText("");
        jDateChooser1.setCalendar(null);
        ComboBoxgender.setSelectedIndex(0);
        jComboBoxbedtype.setSelectedIndex(0);
        jComboBoxroomtype.setSelectedIndex(0);
        if(jComboBoxRoomnumber.getItemCount()==0)
        roomprice.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void AdharNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdharNumberKeyPressed
        // TODO add your handling code here:
        String adh= AdharNumber.getText();
        int length = adh.length();
        char c= evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<12){
                AdharNumber.setEditable(true);
            }
            else{
                AdharNumber.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                AdharNumber.setEditable(true);
            }
            else{
                AdharNumber.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
            }
        }
        
    }//GEN-LAST:event_AdharNumberKeyPressed

    private void customernumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customernumberKeyPressed
        // TODO add your handling code here:
         // TODO add your handling code here:
       String adh= customernumber.getText();
        int length = adh.length();
        char c= evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<10){
                customernumber.setEditable(true);
            }
            else{
                customernumber.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                }
        }
         else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                customernumber.setEditable(true);
            }
            else{
                customernumber.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
            }
        }
        
    }//GEN-LAST:event_customernumberKeyPressed

    private void CUSTOMERNAMEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CUSTOMERNAMEKeyPressed
        // TODO add your handling code here
    }//GEN-LAST:event_CUSTOMERNAMEKeyPressed

    private void CUSTOMERNAMEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CUSTOMERNAMEKeyTyped
        // TODO add your handling code here:
        if(!Character.isLetter(evt.getKeyChar())){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_CUSTOMERNAMEKeyTyped

    private void CustomerNationnalityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CustomerNationnalityKeyTyped
        // TODO add your handling code here:
        if(!Character.isLetter(evt.getKeyChar())){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_CustomerNationnalityKeyTyped

    private void customernumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customernumberKeyTyped
        // TODO add your handling code here:
             if(Character.isLetter(evt.getKeyChar())){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    
    }//GEN-LAST:event_customernumberKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(customerCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerCheckin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdharNumber;
    private javax.swing.JTextField CUSTOMERNAME;
    private javax.swing.JButton CheckInNow;
    private javax.swing.JPanel Checkin;
    private javax.swing.JButton Clear;
    private javax.swing.JComboBox<String> ComboBoxgender;
    private javax.swing.JTextField CustomerNationnality;
    private javax.swing.JTextField customernumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxRoomnumber;
    private javax.swing.JComboBox<String> jComboBoxbedtype;
    private javax.swing.JComboBox<String> jComboBoxroomtype;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JTextField roomprice;
    // End of variables declaration//GEN-END:variables
}
