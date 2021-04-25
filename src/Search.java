
import Project.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yugal
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
        jtable();
    }
    
    
    public void clear(){
        jTextField_search.setText(null);
        jTextField_flatno.setText(null);
        jTextField_owner.setText(null);
        jTextField_phoneno.setText(null);
        jTextField_email.setText(null);
        jTextField_aadhar.setText(null);
        jTextField_search.requestFocus();
    }
    
    public void delete(){
         PreparedStatement ps;    
          
        try {
            String query = "DELETE FROM `flat` WHERE `flat no.`=?";   
//            String query = "DELETE FROM `receipt` WHERE `flat no`=?";        
            ps = MyConnection.getConnection().prepareStatement(query);
           
            ps.setString(1, jTextField_flatno.getText()); 
            ps.execute();
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    
    }
    
     public void jtable(){
      PreparedStatement ps;
        try{
             
           String sql ="SELECT * FROM `flat`";  // `Year`, `Receipt no.`, `floor no.`, `flat no.`, `Owner name.`, `fromMonth`, `fromyear`, `tomonth`, `toyear`, `particulars`, `Amount`, `Date`, `Bank Tran.`, `Trno' FROM `flat`";
           ps = MyConnection.getConnection().prepareStatement(sql); 
           ResultSet rs=ps.executeQuery(sql);
//           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           while (rs.next()){ 
//           String sname = String.valueOf(rs.getString("society name"));
           String flatno = String.valueOf(rs.getInt("flat no."));
           String oname = String.valueOf(rs.getString("Owner name."));
           String phoneno = String.valueOf(rs.getString("Phone no."));
           String emailid = String.valueOf(rs.getString("Email id."));
           String aadhar = String.valueOf(rs.getString("aadhar"));
            
           
            String tbData[] = {flatno, oname, phoneno, emailid, aadhar};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            tblModel.addRow(tbData);
            
          }
           ps.close();
        }
           catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_search = new javax.swing.JTextField();
        jTextField_flatno = new javax.swing.JTextField();
        jTextField_owner = new javax.swing.JTextField();
        jTextField_phoneno = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jTextField_aadhar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_save = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Search");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 50, 66, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Flat no. ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 108, 66, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Owner name ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 164, 91, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phone no.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 220, 91, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email Id.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 276, 91, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Aadhar Card");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 332, 91, 30));

        jTextField_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 52, 180, 30));

        jTextField_flatno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField_flatno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, 30));

        jTextField_owner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField_owner, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 166, 180, 30));

        jTextField_phoneno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField_phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 222, 180, 30));

        jTextField_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 278, 180, 30));

        jTextField_aadhar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField_aadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 326, 180, 30));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flat no", "Owner Name", "Phone no.", "Email Id", "Aadhar Card"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 11, 543, 170));

        jButton_save.setBackground(new java.awt.Color(0, 0, 0));
        jButton_save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_save.setForeground(new java.awt.Color(255, 255, 255));
        jButton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-submit-resume-48.png"))); // NOI18N
        jButton_save.setText("Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 401, 140, 50));

        jButton_update.setBackground(new java.awt.Color(0, 0, 0));
        jButton_update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_update.setText("Update");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 130, 50));

        jButton_delete.setBackground(new java.awt.Color(0, 0, 0));
        jButton_delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 130, 50));

        jButton_reset.setBackground(new java.awt.Color(0, 0, 0));
        jButton_reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_reset.setForeground(new java.awt.Color(255, 255, 255));
        jButton_reset.setText("Reset");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 120, 50));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-back-to-48.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 130, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/s1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 6, 910, 480));

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

        setSize(new java.awt.Dimension(932, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchActionPerformed
        // TODO add your handling code here:
         PreparedStatement ps;
       String abc=jTextField_search.getText();
       String sql;
        sql = "SELECT * FROM `flat` WHERE `flat no.` = "+abc+"";
//        sql = "SELECT * FROM `receipt` WHERE `flat no` = "+abc+"";
             
       try {
            
            
           ps = MyConnection.getConnection().prepareStatement(sql);
           ResultSet rs=ps.executeQuery();  
           if(rs.next()){
               jTextField_flatno.setText(rs.getString(4));
               jTextField_owner.setText(rs.getString(5));
               jTextField_phoneno.setText(rs.getString(16));
               jTextField_email.setText(rs.getString(15));
               jTextField_aadhar.setText(rs.getString(18));
                rs.close();
                ps.close();
                 
           }
           else
           {
                 JOptionPane.showMessageDialog(null,"Flat no. is wrong");
           }
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_jTextField_searchActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        // TODO add your handling code here:
          
        PreparedStatement ps;    
          String query = "INSERT INTO `flat`(`flat no.`, `Owner name.`, `Phone no.`, `Email id.`, `aadhar`) VALUES (?,?,?,?,?)";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
           
            ps.setString(1, jTextField_flatno.getText()); 
            ps.setString(2, jTextField_owner.getText());
            ps.setString(3, jTextField_phoneno.getText());
            ps.setString(4, jTextField_email.getText());
           
            ps.setString(5, jTextField_aadhar.getText());
            
            

            if(ps.executeUpdate() > 0){
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Data saved Successfulley");
                setVisible(false);
                new  Search().setVisible(true);
                clear();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
//        int selectedIndex = jTable1.getSelectedRow();
        
        PreparedStatement ps;    
          String query = "UPDATE `flat` SET `Owner name.`='?',`Phone no.`='?',`Email id.`='?',`aadhar`='?' WHERE `flat no.`='?'";
        try {
            

            
            
            ps = MyConnection.getConnection().prepareStatement(query);
            
           
           
            ps.setString(1, jTextField_owner.getText());
            ps.setString(2, jTextField_phoneno.getText());
            ps.setString(3, jTextField_email.getText());
            
            ps.setString(4, jTextField_aadhar.getText());
            ps.setString(5, jTextField_flatno.getText());
            
            ps.executeUpdate();
     
                JOptionPane.showMessageDialog(null, "Data updated Successfulley");
           
        } catch (SQLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        // TODO add your handling code here:

            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null,"Deleted Successfulley"); 
            delete();
            setVisible(false);
            new  Search().setVisible(true);
            clear();

    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        // TODO add your handling code here:
       clear();
    }//GEN-LAST:event_jButton_resetActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        jTextField_flatno.setText(model.getValueAt(selectedIndex, 0).toString());
        jTextField_owner.setText(model.getValueAt(selectedIndex, 1).toString());
        jTextField_phoneno.setText(model.getValueAt(selectedIndex, 2).toString());
        jTextField_email.setText(model.getValueAt(selectedIndex, 3).toString());
        jTextField_aadhar.setText(model.getValueAt(selectedIndex, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Main ob = new Main();
        ob.setVisible(true);
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JButton jButton_save;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_aadhar;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_flatno;
    private javax.swing.JTextField jTextField_owner;
    private javax.swing.JTextField jTextField_phoneno;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
