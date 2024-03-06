/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelmanagement.system;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author w
 */
public class Customerbilling extends javax.swing.JFrame {
static String idd;
    /**
     * Creates new form Customerbilling
     */
    public Customerbilling() {
        initComponents();
        SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        TextDate.setText(d.format(date));
        s();
    }
    
     public void s() {

        Statement st = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        java.sql.Connection con = null;
        int f,q, i;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "123456");
            pst = con.prepareStatement("Select * from customer where Status=?");
            pst.setString(1, "CHECK OUT");
            rs = pst.executeQuery();
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            f = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable3.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 1; i <= f; i++) {
                    columnData.add(rs.getString("customername"));
                    columnData.add(rs.getString("mobile"));
                    columnData.add(rs.getString("gender"));
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("nationality"));
                    columnData.add(rs.getString("checkin"));
                    columnData.add(rs.getString("Roomnumber"));
                    columnData.add(rs.getString("bedtype"));
                    columnData.add(rs.getString("Roomtype"));
                    columnData.add(rs.getString("price"));
                    }
                RecordTable.addRow(columnData);
            }
            
            /*pst = con.prepareStatement("Select * from customercheckout where status=?");
            pst.setString(1, "CHECK OUT");
            rs = pst.executeQuery();
            ResultSetMetaData mydata = (ResultSetMetaData) rs.getMetaData();
            q = mydata.getColumnCount();
            DefaultTableModel RT = (DefaultTableModel) jTable1.getModel();
            RT.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 0; i <= q; i++) {
                    columnData.add(rs.getString("amount"));
                    columnData.add(rs.getString("checkout"));
                    columnData.add(rs.getString("bill"));
                    columnData.add(rs.getString("noofday"));
                    }
                RecordTable.addRow(columnData);
            }*/
            
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

        billing = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        TextDate = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        billing.setPreferredSize(new java.awt.Dimension(406, 44));

        jPanel8.setPreferredSize(new java.awt.Dimension(789, 548));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("billing");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 51, 51));
        jLabel32.setText("Double Click on row to open bill");

        jTable3.setBackground(new java.awt.Color(0, 51, 51));
        jTable3.setForeground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Mobile No", "Gender", "Adhar No", "Nationality", "Check in Date", "Room No", "Bed Type", "Room Type", "Price"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 51, 51));
        jLabel33.setText("Search By Check-Out Date");

        jButton9.setBackground(new java.awt.Color(0, 51, 51));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Refresh");
        jButton9.setToolTipText("");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(0, 51, 51));
        SearchButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(255, 255, 255));
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(0, 51, 51));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Amount", "Check out", "bill", "noofday"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(375, 375, 375))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(298, 298, 298))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(SearchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jButton9)
                    .addComponent(SearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout billingLayout = new javax.swing.GroupLayout(billing);
        billing.setLayout(billingLayout);
        billingLayout.setHorizontalGroup(
            billingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );
        billingLayout.setVerticalGroup(
            billingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(billing, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(billing, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        Statement st = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        java.sql.Connection con = null;
        int f,q, i;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "123456");
            pst = con.prepareStatement("Select * from customer where status=?");
            pst.setString(1, "CHECK OUT");
           
            rs = pst.executeQuery();
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            f = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable3.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 0; i <= f; i++) {
                    columnData.add(rs.getString("customername"));
                    columnData.add(rs.getString("mobile"));
                    columnData.add(rs.getString("gender"));
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("nationality"));
                    columnData.add(rs.getString("checkin"));
                    columnData.add(rs.getString("Roomnumber"));
                    columnData.add(rs.getString("bedtype"));
                    columnData.add(rs.getString("Roomtype"));
                    columnData.add(rs.getString("price"));   
                 }
                RecordTable.addRow(columnData);
            }
            
            /*pst = con.prepareStatement("Select * from customercheckout where status=?");
            pst.setString(1, "CHECK OUT");
            rs = pst.executeQuery();
            ResultSetMetaData mydata = (ResultSetMetaData) rs.getMetaData();
            q = mydata.getColumnCount();
            DefaultTableModel RT = (DefaultTableModel) jTable1.getModel();
            RT.setRowCount(10);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 10; i <= q; i++) {
                    columnData.add(rs.getString("amount"));
                    columnData.add(rs.getString("checkout"));
                    columnData.add(rs.getString("bill"));
                    columnData.add(rs.getString("noofday"));
                    }
                RecordTable.addRow(columnData);
            }*/
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Record Not Found.");
        }
             
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
   
    DefaultTableModel RecordTable= (DefaultTableModel) jTable3.getModel();
    int SelectedRows=jTable3.getSelectedRow();
    idd=((String) RecordTable.getValueAt(SelectedRows,0));
     new GenerateBill().setVisible(true);
}              
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        s();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Customerbilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customerbilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customerbilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customerbilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customerbilling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField TextDate;
    private javax.swing.JPanel billing;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
