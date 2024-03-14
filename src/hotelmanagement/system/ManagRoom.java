package hotelmanagement.system;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author w
 */
public class ManagRoom extends javax.swing.JFrame {
    String s2;
    /**
     * Creates new form ManagRoom
     */
    public ManagRoom() {
        initComponents();
        Manageroom1();
        
    }
    
    public void Manageroom1(){
    PreparedStatement pst=null;
    java.sql.Statement st=null;
    ResultSet rs=null;
    java.sql.Connection con=null; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
            pst=con.prepareStatement("Select * from room");
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
                    columnData.add(rs.getString("roomnumber"));
                    columnData.add(rs.getString("roomtype"));
                    columnData.add(rs.getString("bed"));
                    columnData.add(rs.getString("price"));
                    columnData.add(rs.getString("status"));
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Textroomnumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ComboBoxroomtype = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Textprice = new javax.swing.JTextField();
        ComboBoxbedtype = new javax.swing.JComboBox<>();
        ADDroom = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(70, 30));
        setUndecorated(true);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(1790, 1000));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Manage Room");

        jTable1.setBackground(new java.awt.Color(0, 51, 51));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Room Number", "Room Type", "Bed Type", "Price", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Textroomnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextroomnumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextroomnumberKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Room Number");

        jLabel6.setBackground(new java.awt.Color(0, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Room Type");
        jLabel6.setToolTipText("");

        ComboBoxroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC" }));
        ComboBoxroomtype.setPreferredSize(new java.awt.Dimension(64, 22));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("Bed");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12.setText("Price");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Textprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextpriceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextpriceKeyTyped(evt);
            }
        });

        ComboBoxbedtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));

        ADDroom.setText("ADD");
        ADDroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDroomActionPerformed(evt);
            }
        });

        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1741, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Textroomnumber)
                            .addComponent(ComboBoxbedtype, 0, 298, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ADDroom, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Textprice, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187)
                                .addComponent(ComboBoxroomtype, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(108, 108, 108))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Textroomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ComboBoxroomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxbedtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Textprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADDroom)
                    .addComponent(UPDATE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 1784, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.getAccessibleContext().setAccessibleName("");

        setBounds(142, 78, 1790, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        // TODO add your handling code here:
          if(Textprice.getText().equals(""))
            JOptionPane.showMessageDialog(this, "All Field id Required");
        else{
                
                PreparedStatement pst;
                java.sql.Connection con;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "123456");
                    //pst=con.prepareStatement("update room set price="+txtprice.getText()+","+"roomtype="+type+" where roomnumber="+s2);
                    pst=con.prepareStatement("update room set price=?,roomtype=?,bed=? where roomnumber=?");
                    pst.setString(1,Textprice.getText() );
                    pst.setString(2,ComboBoxroomtype.getItemAt(ComboBoxroomtype.getSelectedIndex()));
                    pst.setString(3,ComboBoxbedtype.getItemAt(ComboBoxbedtype.getSelectedIndex()));
                    pst.setString(4,s2);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Room Updated");
                    Manageroom1();
                    ADDroom.setVisible(true);
                    UPDATE.setVisible(false);
                  
                }catch(Exception e){
                    
                }
                }        
    }//GEN-LAST:event_UPDATEActionPerformed

    private void ADDroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDroomActionPerformed
        // TODO add your handling code here:
        if(Textroomnumber.getText().equals("")){
      JOptionPane.showMessageDialog(this, "All Field is Requied");
      Textroomnumber.requestFocus();
    }
    else if(Textprice.getText().equals("")){
       JOptionPane.showMessageDialog(this, "All Field is Requied");
       Textprice.requestFocus();
    }   
    else{   
        
        PreparedStatement pst=null;
        java.sql.Statement st=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
           // st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pst=con.prepareStatement("select * from room where roomnumber=?");
            pst.setString(1, Textroomnumber.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this,"Room Number Already Exist");
            }
            else{
                try{
                    double pric=Double.parseDouble(Textprice.getText());
                       
                        try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","123456");
                        pst=con.prepareStatement("insert into room(roomnumber,roomtype,bed,price,status)values(?,?,?,?,?)");
                        pst.setString(1, Textroomnumber.getText());
                        pst.setString(2, ComboBoxroomtype.getItemAt(ComboBoxroomtype.getSelectedIndex()));
                        pst.setString(3, ComboBoxbedtype.getItemAt(ComboBoxbedtype.getSelectedIndex()));
                        pst.setString(4, Textprice.getText());
                        pst.setString(5, "NOT BOOKED");                       
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Room Added");
                        Manageroom1();
                        Textprice.setText("");
                        Textroomnumber.setText("");
                  
                } catch (ClassNotFoundException | SQLException ex) {}
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Price is not valied");
                    }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
           //Logger.getLogger(Record.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }    
        
    }//GEN-LAST:event_ADDroomActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         if(evt.getClickCount()==1){
        String check=JOptionPane.showInputDialog(this,"If you want to Delete this Record Write here to Delete\nIf you want to Update this Record then Write here update");
        if(check.equalsIgnoreCase("delete")){
            DefaultTableModel dmodel=(DefaultTableModel) jTable1.getModel();
            int rows=jTable1.getSelectedRow();
            s2=(String) dmodel.getValueAt(rows,0);
            String s1=(String) dmodel.getValueAt(rows,4);
            if(s1.equalsIgnoreCase("booked"))
               JOptionPane.showMessageDialog(this,"Sorry Room is Booked So unable to delete it");
            else{
                PreparedStatement pst;
                java.sql.Connection con;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "123456");
                    pst = con.prepareStatement("delete from room where roomnumber=?");
                    pst.setString(1,s2);
                    pst.executeUpdate();
                    Manageroom1();
                }
                catch(Exception e){}               
            }
        }
        if(check.equalsIgnoreCase("update")){
            DefaultTableModel dmodel=(DefaultTableModel) jTable1.getModel();
            int rows=jTable1.getSelectedRow();
            s2=(String) dmodel.getValueAt(rows,0);
            String s1=(String) dmodel.getValueAt(rows,4);
            String s3=(String) dmodel.getValueAt(rows,1);
            String s4=(String) dmodel.getValueAt(rows,2);
            String s5=(String) dmodel.getValueAt(rows,3);
            if(s1.equalsIgnoreCase("booked"))
               JOptionPane.showMessageDialog(this,"Sorry Room is Booked So unable to Update it");
            else{
                UPDATE.setVisible(true);
                ADDroom.setVisible(false);
                Textroomnumber.setText(s2);
                Textprice.setText(s5);
                Textroomnumber.setEditable(false);
                Textroomnumber.setEditable(true);
                
            }
        }
        
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextroomnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextroomnumberKeyPressed

    }//GEN-LAST:event_TextroomnumberKeyPressed

    private void TextpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextpriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextpriceKeyPressed

    private void TextroomnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextroomnumberKeyTyped
        if(Character.isLetter(evt.getKeyChar())){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_TextroomnumberKeyTyped

    private void TextpriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextpriceKeyTyped
        // TODO add your handling code here:
           if(Character.isLetter(evt.getKeyChar())){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_TextpriceKeyTyped

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
            java.util.logging.Logger.getLogger(ManagRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDroom;
    private javax.swing.JComboBox<String> ComboBoxbedtype;
    private javax.swing.JComboBox<String> ComboBoxroomtype;
    private javax.swing.JTextField Textprice;
    private javax.swing.JTextField Textroomnumber;
    private javax.swing.JButton UPDATE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
}
