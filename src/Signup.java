/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Project.MyConnection;
import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
        
/**
 *
 * @author yugal
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_user = new javax.swing.JTextField();
        jTextField_answer = new javax.swing.JTextField();
        jPasswordField_retypepass = new javax.swing.JPasswordField();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jButton_create = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Signup Page");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIGNUP PAGE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 30, 170, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Security Question :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 270, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Username :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 110, 78, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Name :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 150, 49, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Password :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 190, 80, 30);

        jTextField_user.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField_user);
        jTextField_user.setBounds(220, 120, 220, 20);

        jTextField_answer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_answer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField_answer);
        jTextField_answer.setBounds(220, 322, 220, 20);

        jPasswordField_retypepass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPasswordField_retypepass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jPasswordField_retypepass);
        jPasswordField_retypepass.setBounds(220, 240, 220, 19);

        jPasswordField_pass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPasswordField_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jPasswordField_pass);
        jPasswordField_pass.setBounds(220, 200, 220, 20);

        jButton_create.setBackground(new java.awt.Color(102, 0, 204));
        jButton_create.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_create.setForeground(new java.awt.Color(255, 255, 255));
        jButton_create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-add-user-group-man-man-48.png"))); // NOI18N
        jButton_create.setText("Create");
        jButton_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_createActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_create);
        jButton_create.setBounds(120, 370, 160, 50);

        jButton_back.setBackground(new java.awt.Color(255, 102, 255));
        jButton_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_back.setForeground(new java.awt.Color(255, 255, 255));
        jButton_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-back-to-48.png"))); // NOI18N
        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_back);
        jButton_back.setBounds(340, 370, 170, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ReType Password :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 230, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Answer :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 320, 70, 20);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your mother Toungue?", "What is nick name?", "What is your first's Childhood friend?", "What is your school name?" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(220, 280, 220, 20);

        jTextField_name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField_name);
        jTextField_name.setBounds(220, 160, 220, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sign.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 950);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(604, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_createActionPerformed
        // TODO add your handling code here:
        String uname = jTextField_user.getText();
        String name = jTextField_name.getText();
        String pass = String.valueOf(jPasswordField_pass.getPassword());
        String re_pass = String.valueOf(jPasswordField_retypepass.getPassword());
        String question = String.valueOf(jComboBox1.getSelectedItem());
        String answer = jTextField_answer.getText();

        
        if(uname.equals("")){
            JOptionPane.showMessageDialog(null, "Add a Username");
        }
        else if(pass.equals("")){
            JOptionPane.showMessageDialog(null, "Add a Password");
        }
        else if(!pass.equals(re_pass)){
            JOptionPane.showMessageDialog(null, "Retype the Password Again");
        }
        else if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Enter Name");
        }else if(answer.equals("")){
            JOptionPane.showMessageDialog(null, "Enter Answer");
        }
        
        else if(checkUsername(uname)){
            JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }
        
        else{
        PreparedStatement ps;
        String quary = "INSERT INTO `login`(`uname`, `name`, `pass`, `repass`, `Question`, `Answer`) VALUES (?,?,?,?,?,?)";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(quary);
            
            ps.setString(1, uname);
            ps.setString(2, name);
            ps.setString(3, pass);
            ps.setString(4, re_pass); 
            ps.setString(5, question);
            ps.setString(6, answer);
            

            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "New User Add");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton_createActionPerformed
    
    public boolean checkUsername(String username){
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `login` WHERE `uname` =?";
        try { 
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
          return checkUser;
    }
    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login ob =new Login();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_create;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JPasswordField jPasswordField_retypepass;
    private javax.swing.JTextField jTextField_answer;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_user;
    // End of variables declaration//GEN-END:variables
}
