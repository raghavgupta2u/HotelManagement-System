package hotelmanagement.system;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.print.attribute.DateTimeSyntax;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author w
 */
public class CustomerCheckout extends javax.swing.JFrame {
   
   double pri;
    /**
     * Creates new form CustomerCheckout
     */
    public CustomerCheckout() {
        initComponents();
        
        //add current date
        /*SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd ");
        Date d = new Date();
        outdate.setText(date.format(d));
        */
      
        //add current time
        SimpleDateFormat  timeFormat;
        timeFormat = new SimpleDateFormat("hh:mm");
        Calendar calendar= Calendar.getInstance();
        Date currDate= calendar.getTime();
        String t= timeFormat.format(currDate);
        time.setText(t);
        
        //calling mathod
        s();
    }
    public void s() {

        Statement st = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        java.sql.Connection con = null;
        int q, i;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "123456");
            pst = con.prepareStatement("Select * from customer where Status=?");
            pst.setString(1, "NULL");
            rs = pst.executeQuery();
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) Recordtable.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 1; i <= q; i++) {
                    columnData.add(rs.getString("customername"));
                    columnData.add(rs.getString("mobile"));
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("Roomnumber"));
                    columnData.add(rs.getString("bedtype"));
                    columnData.add(rs.getString("Roomtype"));
                    columnData.add(rs.getString("checkin"));
                    columnData.add(rs.getString("Price"));
                    

                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception e) {

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

        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        TextNoofdays = new javax.swing.JTextField();
        TextPriceParDay = new javax.swing.JTextField();
        Textname = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TextRoomnumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        TextCheckinDate = new javax.swing.JTextField();
        TextAmount = new javax.swing.JTextField();
        Textnumber = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        TextAdhar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        paymentmathod = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Recordtable = new javax.swing.JTable();
        CHECKOUT = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 51));
        jLabel22.setText("Customer Name");
        jLabel22.setToolTipText("");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 51, 51));
        jLabel25.setText("Price Par Day");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 51));
        jLabel24.setText("Number of Days");

        TextPriceParDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPriceParDayActionPerformed(evt);
            }
        });

        Textname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextnameActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 51));
        jLabel21.setText("Room Number");

        TextRoomnumber.setBackground(new java.awt.Color(0, 51, 51));
        TextRoomnumber.setForeground(new java.awt.Color(255, 255, 255));
        TextRoomnumber.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextRoomnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextRoomnumberActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Checkout");

        Search.setBackground(new java.awt.Color(0, 51, 51));
        Search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 51, 51));
        jLabel29.setText("Total Amout");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 51));
        jLabel27.setText("Check in Date");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 51));
        jLabel23.setText("Mobile Number");

        TextCheckinDate.setEditable(false);

        Textnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextnumberActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 51, 51));
        jLabel26.setText("Adhar Number");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 51, 51));
        jLabel28.setText("Check out Date");
        jLabel28.setToolTipText("");

        Time.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Time.setForeground(new java.awt.Color(0, 51, 51));
        Time.setText("Time");

        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        TextAdhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAdharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Mode of payment");

        paymentmathod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NET BANKING", "UPI", "CASH" }));

        Recordtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer", "mobile number", "Adhar Number", "Room Number", "Bed Type", "Room Type", "Check in Date", "price per day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Recordtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecordtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Recordtable);

        CHECKOUT.setBackground(new java.awt.Color(0, 51, 51));
        CHECKOUT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CHECKOUT.setForeground(new java.awt.Color(255, 255, 255));
        CHECKOUT.setText("Check Out Now");
        CHECKOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKOUTActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(0, 51, 51));
        ClearButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextRoomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 550, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(73, 73, 73)
                                .addComponent(paymentmathod, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel22))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextNoofdays, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextPriceParDay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Textname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextCheckinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Textnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28))
                            .addComponent(jLabel26))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextAdhar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CHECKOUT)
                        .addGap(18, 18, 18)
                        .addComponent(ClearButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jButton1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TextRoomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Search))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel28)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Time)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAdhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel25)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Textname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(17, 17, 17)
                        .addComponent(TextPriceParDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNoofdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Textnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextCheckinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(1, 1, 1)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentmathod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHECKOUT)
                    .addComponent(ClearButton))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextRoomnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextRoomnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextRoomnumberActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        Textname.setText("");
        Textnumber.setText("");
        TextPriceParDay.setText("");
        TextCheckinDate.setText("");
        TextAdhar.setText("");
        PreparedStatement pst = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "123456");
            pst = con.prepareStatement("Select * from customer where Roomnumber=? AND Status=?");
            pst.setString(1, TextRoomnumber.getText());
            pst.setString(2, "NULL");
            rs = pst.executeQuery();
            if (rs.next()) {
                Textname.setText(rs.getString("customername"));
                Textnumber.setText(rs.getString("mobile"));
                TextCheckinDate.setText(rs.getString("checkin"));
                TextPriceParDay.setText(rs.getString("Price"));
                TextAdhar.setText(rs.getString("id"));
            }

           // String s1= outdate.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(jDateChooser1.getDate());
            String s1=date1;
            SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
            String f1=rs.getString("checkin");
            String f2=s1;
            try{
                Date d1=sim.parse(f1);
                Date d2=sim.parse(f2);
                long diff=d2.getTime()-d1.getTime();
                int days=(int)(diff/(1000*24*60*60));
                if(days==0){
                   days=1;
                }
                else{
                TextNoofdays.setText(String.valueOf(days));
                }
                double p=Double.parseDouble(rs.getString("Price"));
                double pri=days*p;
                if(days==0)
                TextAmount.setText(String.valueOf(p));
                else
                TextAmount.setText(String.valueOf(pri));
            }catch(Exception e){
          }
        } catch (ClassNotFoundException | SQLException ex) {
            TextCheckinDate.setText("");
            TextAmount.setText("");
            JOptionPane.showMessageDialog(this,"Record Not Found.");

            //Logger.getLogger(CustomerCheckOut.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void TextnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextnameActionPerformed

    private void TextnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextnumberActionPerformed

    private void TextPriceParDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPriceParDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPriceParDayActionPerformed

    private void TextAdharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAdharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAdharActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        Textname.setText("");
        Textnumber.setText("");
        TextAdhar.setText("");
        TextCheckinDate.setText("");
        TextPriceParDay.setText("");
        TextNoofdays.setText("");
        TextAmount.setText("");
        TextRoomnumber.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void CHECKOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKOUTActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat  timeFormat;
        timeFormat = new SimpleDateFormat("hh:mm");
        Calendar calendar= Calendar.getInstance();
        Date currDate= calendar.getTime();
        String t= timeFormat.format(currDate);

        if (Textname.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Room Number And Search it,Then Check Out Customer");
        } else {
            try {
                PreparedStatement pst = null;
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "123456");

                pst=con.prepareStatement("insert into customercheckout(customername,mobile,id,Price,amount,checkout,noofday,Roomnumber,checkin,status,time,modeofpayment)values(?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, Textname.getText());
                pst.setString(2, Textnumber.getText());
                pst.setString(3, TextAdhar.getText());
                pst.setString(4, TextPriceParDay.getText());
                /*                pst.setString(6, Textname.getText());
                pst.setString(7, Textname.getText());
                pst.setString(8, Textname.getText());
                pst.setString(9, Textname.getText());*/
                pst.setString(5, TextAmount.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sdf.format(jDateChooser1.getDate());
                pst.setString(6, date1);
                pst.setString(7, TextNoofdays.getText());
                pst.setString(8, TextRoomnumber.getText());
                pst.setString(9, TextCheckinDate.getText());
                pst.setString(10, "CHECK OUT");
                pst.setString(11, time.getText());
                pst.setString(12, paymentmathod.getItemAt(paymentmathod.getSelectedIndex()));
                pst.executeUpdate();

                pst = con.prepareStatement("update customer set Status=? where Roomnumber=?");
                pst.setString(1, "CHECK OUT");
                pst.setString(2, TextRoomnumber.getText());
                pst.executeUpdate();

                pst = con.prepareStatement("update room set status=? where roomnumber=?");
                pst.setString(1, "NOT BOOKED");
                pst.setString(2, TextRoomnumber.getText());
                pst.executeUpdate();

                //JOptionPane.showMessageDialog(this,"Check Out Successfully\n Goto to Cutomer Bill Details menu and Print Bill");
                int yes=JOptionPane.showConfirmDialog(this,"Check out Successfully.\nDo you want to see & print bill?","Check outed",JOptionPane.YES_NO_OPTION);
                if(JOptionPane.YES_OPTION==yes)
                new Customerbilling().setVisible(true);
                else{
                    s();
                    TextAdhar.setText("");
                    Textname.setText("");
                    Textnumber.setText("");
                    TextCheckinDate.setText("");
                    TextPriceParDay.setText("");
                    TextNoofdays.setText("");
                    TextAmount.setText("");
                    TextRoomnumber.setText("");
                }
            } catch (ClassNotFoundException | SQLException e) {
            }

        }
    }//GEN-LAST:event_CHECKOUTActionPerformed

    private void RecordtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordtableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel RecordTable = (DefaultTableModel) Recordtable.getModel();
        int SelectedRows = Recordtable.getSelectedRow();
        Textname.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        Textnumber.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        TextCheckinDate.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
        TextPriceParDay.setText(RecordTable.getValueAt(SelectedRows, 7).toString());
        TextAdhar.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        TextRoomnumber.setText(RecordTable.getValueAt(SelectedRows, 3).toString());

       // String s1= outdate.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = sdf.format(jDateChooser1.getDate());
        String s1= date1;
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
        String f1=RecordTable.getValueAt(SelectedRows, 6).toString();
        String f2=s1;
        try{
            Date d1=sim.parse(f1);
            Date d2=sim.parse(f2);
            long diff=d2.getTime()-d1.getTime();
            int days=(int)(diff/(1000*24*60*60));
            if(days==0){
                TextNoofdays.setText("1");
            }
            else{
                TextNoofdays.setText(String.valueOf(days));
            }
            double p=Double.parseDouble(RecordTable.getValueAt(SelectedRows,7).toString());
            pri=days*p;

            if(days==0)
            TextAmount.setText(String.valueOf(p));
            else
            TextAmount.setText(String.valueOf(pri));
        }catch(Exception e){
        }
    }//GEN-LAST:event_RecordtableMouseClicked

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHECKOUT;
    private javax.swing.JButton ClearButton;
    private javax.swing.JTable Recordtable;
    private javax.swing.JButton Search;
    private javax.swing.JTextField TextAdhar;
    private javax.swing.JTextField TextAmount;
    private javax.swing.JTextField TextCheckinDate;
    private javax.swing.JTextField TextNoofdays;
    private javax.swing.JTextField TextPriceParDay;
    private javax.swing.JTextField TextRoomnumber;
    private javax.swing.JTextField Textname;
    private javax.swing.JTextField Textnumber;
    private javax.swing.JLabel Time;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> paymentmathod;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
