/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelmanagement.system;

import java.awt.print.PrinterException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author w
 */
public class GenerateBill extends javax.swing.JFrame {
    String id=Customerbilling.idd;
    String nm;
    String mobile;
    String roomnumber;
    String bed;
    String type;
    String indate;
    String outdate;
    String price;
    String days;
    String amount;
    String peymant;
    /**
     * Creates new form GenerateBill
     */
    public GenerateBill() {
        initComponents();
        connect();
        txtbill.setText("\t\t-: Hotel Magnificent :-\n");
        txtbill.setText(txtbill.getText()+"**********************************************************************************\n");
        txtbill.setText(txtbill.getText()+"Bill ID:- "+id+"\n");
        txtbill.setText(txtbill.getText()+"Customer Details:- \n");
        txtbill.setText(txtbill.getText()+"Name:- "+nm+"\n");
        txtbill.setText(txtbill.getText()+"Mobile Number:- "+mobile+"\n");
        txtbill.setText(txtbill.getText()+"**********************************************************************************\n");
        txtbill.setText(txtbill.getText()+"Room Details:- \n");
        txtbill.setText(txtbill.getText()+"Room Number:- "+roomnumber+"\n");
        txtbill.setText(txtbill.getText()+"Type:- "+type+"\n");
        txtbill.setText(txtbill.getText()+"Bed:- "+bed+"\n");
        txtbill.setText(txtbill.getText()+"Price:- "+price+"\n");
        txtbill.setText(txtbill.getText()+"Check IN Date="+indate+"\t\tNumber of Days="+days+"\n");
        txtbill.setText(txtbill.getText()+"Mode of Paymant:- "+peymant+"\n");
        txtbill.setText(txtbill.getText()+"Check OUT Date="+outdate+"\t\tTotal Amount="+amount+"\n");
        txtbill.setText(txtbill.getText()+"**********************************************************************************\n");
        txtbill.setText(txtbill.getText()+"\t\t"+"                    Thank You,Please Visit Again.");
        }
    
        public void connect(){
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
            pst=con.prepareStatement("select * from customer where id=?");
            pst.setString(1,id);
            rs=pst.executeQuery();
            if(rs.next()){
                nm=rs.getString("customername");
                mobile=rs.getString("mobile");
                roomnumber=rs.getString("Roomnumber");
                bed=rs.getString("bedtype");
                type=rs.getString("Roomtype");
                indate=rs.getString("checkin");
                price=rs.getString("Price");
                
   
            }
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GenerateBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
            pst=con.prepareStatement("select * from customercheckout where id=?");
            pst.setString(1,id);
            rs=pst.executeQuery();
            if(rs.next()){
                days=rs.getString("noofday");
                outdate=rs.getString("checkout");
                amount=rs.getString("amount");
                peymant=rs.getString("modeofpeymant");
            }
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GenerateBill.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        PrintBill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane1.setViewportView(txtbill);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PrintBill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PrintBill.setForeground(new java.awt.Color(0, 51, 51));
        PrintBill.setText("Print");
        PrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(PrintBill)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PrintBill)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     dispose();
     // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBillActionPerformed
        try {
            txtbill.print();        // TODO add your handling code here:
        } catch (PrinterException ex) {
            Logger.getLogger(GenerateBill.class.getName()).log(Level.SEVERE, null, ex);
        }      // TODO add your handling code here:
    }//GEN-LAST:event_PrintBillActionPerformed

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
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PrintBill;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtbill;
    // End of variables declaration//GEN-END:variables
}
