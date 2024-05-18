/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelmanagement.system;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Pickup extends javax.swing.JFrame {

    /**
     * Creates new form Pickup
     */
    public Pickup() {
        initComponents();
        Alldriver();
    }
    public void Alldriver(){
    PreparedStatement pst=null;
    java.sql.Statement st=null;
    ResultSet rs=null;
    java.sql.Connection con=null; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
            pst=con.prepareStatement("Select * from driver");
            rs=pst.executeQuery();
            ResultSetMetaData stData=(ResultSetMetaData) rs.getMetaData();
            //System.out.print(stData);
            int q=stData.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
            //System.out.print(RecordTable);
            RecordTable.setRowCount(0);
            while(rs.next()){
                //Vector is like the dynamic array.
                Vector columnData=new Vector();
                for(int i=1;i<=q;i++){
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("available"));
                    columnData.add(rs.getString("company"));
                    columnData.add(rs.getString("brand"));
                    columnData.add(rs.getString("phone"));
                    
                }
                RecordTable.addRow(columnData);
                //System.out.println(columnData);

            }  
        } catch (ClassNotFoundException | SQLException ex) {}
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        carmodelCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        carcompanyCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "name", "Avilabale", "Brand", "Model", "phone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Car Company");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Car Model");

        carcompanyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Ford", "Toyota", "Honda" }));
        carcompanyCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carcompanyComboActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carcompanyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1))
                    .addComponent(carmodelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(carcompanyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(carmodelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carcompanyComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carcompanyComboActionPerformed
        // TODO add your handling code here:
        try{
            if(carcompanyCombo.getSelectedItem().equals("Ford")){
                carmodelCombo.removeAllItems();
                carmodelCombo.addItem("Ford Endeavour");
                carmodelCombo.addItem("Ford Figo");
                carmodelCombo.addItem("Ford Aspire");

            }
            else if(carcompanyCombo.getSelectedItem().equals("Toyota")){
                carmodelCombo.removeAllItems();
                carmodelCombo.addItem("Toyota Innova Crysta");
                carmodelCombo.addItem("Toyota Urban Cruiser Taisor");
                carmodelCombo.addItem("Toyota Rumion");
            }
            else if(carcompanyCombo.getSelectedItem().equals("Honda")){
                carmodelCombo.removeAllItems();
                carmodelCombo.addItem("Honda City");
                carmodelCombo.addItem("Honda Amaze");
                carmodelCombo.addItem("Honda WR-V");
            }
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_carcompanyComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            PreparedStatement pst=null;
    java.sql.Statement st=null;
    ResultSet rs=null;
    java.sql.Connection con=null; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
            pst=con.prepareStatement("Select * from Driver where company=? and brand=?");
            pst.setString(1, carcompanyCombo.getItemAt(carcompanyCombo.getSelectedIndex()));
            pst.setString(2, carmodelCombo.getItemAt(carmodelCombo.getSelectedIndex()));
            rs=pst.executeQuery();
            ResultSetMetaData stData=(ResultSetMetaData) rs.getMetaData();
            //System.out.print(stData);
            int q=stData.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
            //System.out.print(RecordTable);
            RecordTable.setRowCount(0);
            while(rs.next()){
                //Vector is like the dynamic array.
                Vector columnData=new Vector();
                for(int i=1;i<=q;i++){
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("available"));
                    columnData.add(rs.getString("company"));
                    columnData.add(rs.getString("brand"));
                    columnData.add(rs.getString("phone"));
                }
                RecordTable.addRow(columnData);
                //System.out.println(columnData);

            }  
        } catch (ClassNotFoundException | SQLException ex) {}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pickup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pickup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pickup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pickup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pickup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> carcompanyCombo;
    private javax.swing.JComboBox<String> carmodelCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
