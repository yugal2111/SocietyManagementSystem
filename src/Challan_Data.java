
import Project.MyConnection;
import static java.awt.GridBagConstraints.BOTH;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yugal
 */
public class Challan_Data extends javax.swing.JFrame {

    
    public Challan_Data() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void clear(){
        jTextField_TRno.setText("");
        jTextField_amount1.setText("");
        jTextField_amount2.setText(""); 
        jTextField_amount4.setText("");
        jTextField_amount3.setText("");
//        jTextField_receiptno.setText("");
        jComboBox_Flat.setSelectedItem(null);
        jComboBox_Floor.setSelectedItem(null);
        jComboBox_Floor.setSelectedItem(null);
        jComboBox_Name.setSelectedItem(null);
        jComboBox_particulars1.setSelectedItem(null);
        jComboBox_TR.setSelectedItem(null);
        jComboBox_particulars2.setSelectedItem(null);
        jComboBox_particulars3.setSelectedItem(null);
        jComboBox_particulars4.setSelectedItem(null);
        jComboBox_year.setSelectedItem(null);
        jComboBox_sname.setSelectedItem(null);
        
          
          
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_amount4 = new javax.swing.JTextField();
        jDateChooser_date = new com.toedter.calendar.JDateChooser();
        jComboBox_year = new javax.swing.JComboBox<>();
        jComboBox_Floor = new javax.swing.JComboBox<>();
        jComboBox_Flat = new javax.swing.JComboBox<>();
        jComboBox_Name = new javax.swing.JComboBox<>();
        jButton_submit = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jComboBox_TR = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_particulars4 = new javax.swing.JComboBox<>();
        jYearChooser_year1 = new com.toedter.calendar.JYearChooser();
        jYearChooser_year = new com.toedter.calendar.JYearChooser();
        jComboBox_particulars1 = new javax.swing.JComboBox<>();
        jComboBox_particulars2 = new javax.swing.JComboBox<>();
        jComboBox_particulars3 = new javax.swing.JComboBox<>();
        jTextField_amount1 = new javax.swing.JTextField();
        jTextField_amount2 = new javax.swing.JTextField();
        jTextField_amount3 = new javax.swing.JTextField();
        jTextField_TRno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox_sname = new javax.swing.JComboBox<>();
        jMonthChooser_month = new javax.swing.JComboBox<>();
        jMonthChooser_month1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Receipt");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 25, 290, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Year :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Floor no. :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Flat no. :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Owner name :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Month :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Particulars :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Mode of Transaction :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, -1, 30));

        jTextField_amount4.setText("0");
        jTextField_amount4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_amount4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_amount4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 82, 30));

        jDateChooser_date.setDateFormatString("yyyy-mm-dd");
        jPanel1.add(jDateChooser_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 190, 30));

        jComboBox_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY-YY", "2029-30", "2028-29", "2027-28", "2026-27", "2025-26", "2024-25", "2023-24", "2022-23", "2021-22", "2020-21", "2019-20", "2018-19", "2017-18", "2016-17", "2015-16", "2014-15", "2013-14", "2012-13", "2011-12", "2010-11", "2009-10", "2008-09", "2007-08", "2006-07", "2005-06", "2004-05", "2003-04", "2002-03", "2001-02     " }));
        jPanel1.add(jComboBox_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 250, 30));

        jComboBox_Floor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_Floor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th" }));
        jComboBox_Floor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_FloorActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_Floor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 80, 30));

        jComboBox_Flat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_Flat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_FlatActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_Flat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 80, 30));

        jComboBox_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_NameActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 300, 30));

        jButton_submit.setBackground(new java.awt.Color(255, 204, 255));
        jButton_submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-submit-resume-48.png"))); // NOI18N
        jButton_submit.setText("SUBMIT");
        jButton_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_submitActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 160, 60));

        jButton_back.setBackground(new java.awt.Color(255, 204, 255));
        jButton_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-back-to-48.png"))); // NOI18N
        jButton_back.setText("BACK");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 350, 150, 60));

        jComboBox_TR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UPI No.", "RTGS", "NEFT", "MOBILE BANKING" }));
        jPanel1.add(jComboBox_TR, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 190, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Society Name :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("To ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 30, 23));

        jComboBox_particulars4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_particulars4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTRRANCE FEE", "SHARES", "DEPOSITE", "CONTRIBUTION TOWARDS CONSTRUCTION", "MUNICIPAL TAXES", "WATER CHARGES", "ELECTRICITY CHARGES", "PARKING CHARGES", "LIFT CHARGES", "SINKING FUND", "MAINTENANCE CHARGES", "INSURANCE", "NON-OCCUPING CHARGES", "DONATION FLAT TRANSFER CHARGES", "FINE/LATE FEE", "MISCELLANEOUS", "LAST YEAR BALANCE IN", " " }));
        jComboBox_particulars4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_particulars4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_particulars4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 190, 30));
        jPanel1.add(jYearChooser_year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, 30));
        jPanel1.add(jYearChooser_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, 30));

        jComboBox_particulars1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_particulars1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEFAULT", "ENTRRANCE FEE", "SHARES", "DEPOSITE", "CONTRIBUTION TOWARDS CONSTRUCTION", "MUNICIPAL TAXES", "WATER CHARGES", "ELECTRICITY CHARGES", "PARKING CHARGES", "LIFT CHARGES", "SINKING FUND", "MAINTENANCE CHARGES", "INSURANCE", "NON-OCCUPING CHARGES", "DONATION FLAT TRANSFER CHARGES", "FINE/LATE FEE", "MISCELLANEOUS", "LAST YEAR BALANCE IN" }));
        jComboBox_particulars1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_particulars1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_particulars1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 300, 30));

        jComboBox_particulars2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_particulars2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTRRANCE FEE", "SHARES", "DEPOSITE", "CONTRIBUTION TOWARDS CONSTRUCTION", "MUNICIPAL TAXES", "WATER CHARGES", "ELECTRICITY CHARGES", "PARKING CHARGES", "LIFT CHARGES", "SINKING FUND", "MAINTENANCE CHARGES", "INSURANCE", "NON-OCCUPING CHARGES", "DONATION FLAT TRANSFER CHARGES", "FINE/LATE FEE", "MISCELLANEOUS", "LAST YEAR BALANCE IN", " ", " " }));
        jPanel1.add(jComboBox_particulars2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 190, 30));

        jComboBox_particulars3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_particulars3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTRRANCE FEE", "SHARES", "DEPOSITE", "CONTRIBUTION TOWARDS CONSTRUCTION", "MUNICIPAL TAXES", "WATER CHARGES", "ELECTRICITY CHARGES", "PARKING CHARGES", "LIFT CHARGES", "SINKING FUND", "MAINTENANCE CHARGES", "INSURANCE", "NON-OCCUPING CHARGES", "DONATION FLAT TRANSFER CHARGES", "FINE/LATE FEE", "MISCELLANEOUS", "LAST YEAR BALANCE IN", " " }));
        jComboBox_particulars3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_particulars3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_particulars3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 190, 30));
        jPanel1.add(jTextField_amount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 441, 110, 30));

        jTextField_amount2.setText("0");
        jTextField_amount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_amount2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_amount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 82, 30));

        jTextField_amount3.setText("0");
        jPanel1.add(jTextField_amount3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 82, 30));
        jPanel1.add(jTextField_TRno, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, 190, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Date :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Transaction no. :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, 30));

        jComboBox_sname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soham Residency", "Sukhwani A", "Sukhwani B", "Sukhwani D", "Sukhwani E", "Sukhwani Classic", "Sukhwani Federation", "Sitaram Darshan" }));
        jPanel1.add(jComboBox_sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 250, 30));

        jMonthChooser_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(jMonthChooser_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 70, 30));

        jMonthChooser_month1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(jMonthChooser_month1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 70, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/imgonline-com-ua-resize-9IQtTkBeE5OZtAdx.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 700));

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

        setSize(new java.awt.Dimension(1314, 716));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_amount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_amount2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_amount2ActionPerformed

    private void jComboBox_particulars3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_particulars3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_particulars3ActionPerformed

    private void jComboBox_particulars1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_particulars1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_particulars1ActionPerformed

    private void jComboBox_particulars4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_particulars4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_particulars4ActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Main ob = new Main();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_submitActionPerformed
        // TODO add your handling code here:

        String date = null;
        

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        date = dateformat.format(jDateChooser_date.getDate());

//        if(jTextField_receiptno.getText().equals("")){
//            JOptionPane.showMessageDialog(null, "Enter Receipt no.");
//        }
        if(jTextField_amount4.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter valid Amount");
        }
        else if(jTextField_TRno.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter correct Trno");
        }

         else if(checkUsername(String.valueOf(jComboBox_Name.getSelectedItem()))){
                JOptionPane.showMessageDialog(null, "This Flat no. is already taken");
         }

        else{
            PreparedStatement ps;
            //        String query = "INSERT INTO `receipt`(`Year`, `Receipt no`, `floor no`, `flat no`, `owner name`, `month`, `amount`, `date`, `mode`, `trno`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            String query = "INSERT INTO `flat`(`Society name.`, `Year`, `floor no.`, `flat no.`, `Owner name.`, `fromMonth`, `fromyear`, `tomonth`, `toyear`, `particulars1`, `particulars2`, `particulars3`, `particulars4`, `Amount1`, `Amount2`, `Amount3`, `Amount4`, `Date`, `mode`, `Trno`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                ps = MyConnection.getConnection().prepareStatement(query);
                
                ps.setString(1, String.valueOf(jComboBox_sname.getSelectedItem()));

                ps.setString(2, String.valueOf(jComboBox_year.getSelectedItem()));
//                ps.setString(3, jTextField_receiptno.getText());
                ps.setString(3, String.valueOf(jComboBox_Floor.getSelectedItem()));
                ps.setString(4, String.valueOf(jComboBox_Flat.getSelectedItem()));
                ps.setString(5, String.valueOf(jComboBox_Name.getSelectedItem()));
                ps.setString(6, String.valueOf(jMonthChooser_month1.getSelectedItem()));
                ps.setString(7, String.valueOf(jYearChooser_year1.getYear()));
                ps.setString(8, String.valueOf(jMonthChooser_month.getSelectedItem()));
               
                ps.setString(9, String.valueOf(jYearChooser_year.getYear()));

                ps.setString(10, String.valueOf(jComboBox_particulars1.getSelectedItem()));
                ps.setString(11, String.valueOf(jComboBox_particulars2.getSelectedItem()));
                ps.setString(12, String.valueOf(jComboBox_particulars3.getSelectedItem()));
                ps.setString(13, String.valueOf(jComboBox_particulars4.getSelectedItem()));
                ps.setString(14, jTextField_amount1.getText());
                ps.setString(15, jTextField_amount2.getText());
                ps.setString(16, jTextField_amount3.getText());
                ps.setString(17, jTextField_amount4.getText());
                ps.setString(18, date);
                ps.setString(19, String.valueOf(jComboBox_TR.getSelectedItem()));
                ps.setString(20, jTextField_TRno.getText());
                ps.executeUpdate();

                
                    JOptionPane.showMessageDialog(null, "Data saved");
                    clear();
                
            } catch (SQLException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_submitActionPerformed
    
      
    public boolean checkUsername(String flatno){
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `flat` WHERE `flat no.` =?";
        try { 
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, flatno);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
          return checkUser;
    }
    
    
    private void jComboBox_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_NameActionPerformed

    private void jComboBox_FlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_FlatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_FlatActionPerformed

    private void jComboBox_FloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_FloorActionPerformed
        // TODO add your handling code here:
        try{
            if(jComboBox_Floor.getSelectedItem().equals("1st"))
            {
                jComboBox_Name.removeAllItems();
                jComboBox_Name.setSelectedItem(null);
                jComboBox_Flat.removeAllItems();
                jComboBox_Flat.setSelectedItem(null);
                jComboBox_Name.addItem("102-E Satish  Sukhdev Patil (Rental)");
                jComboBox_Name.addItem("103-E Kakade Satish Yashwant");
                jComboBox_Flat.addItem("102");
                jComboBox_Flat.addItem("103");
            }
            else if(jComboBox_Floor.getSelectedItem().equals("2nd"))
            {
                jComboBox_Name.removeAllItems();
                jComboBox_Name.setSelectedItem(null);
                jComboBox_Flat.removeAllItems();
                jComboBox_Flat.setSelectedItem(null);
                jComboBox_Flat.addItem("201");
                jComboBox_Flat.addItem("202");
                jComboBox_Flat.addItem("203");
                jComboBox_Flat.addItem("204");
                jComboBox_Name.addItem("201-E Deshpande Ashay");
                jComboBox_Name.addItem("202-E Katti Kaustubhmony S");
                jComboBox_Name.addItem("203-E Ajnadkar Atul Vishwanath");
                jComboBox_Name.addItem("204-E Parab Rajesh Shivram");
            }
            else if(jComboBox_Floor.getSelectedItem().equals("3rd"))
            {
                jComboBox_Name.removeAllItems();
                jComboBox_Name.setSelectedItem(null);
                jComboBox_Flat.removeAllItems();
                jComboBox_Flat.setSelectedItem(null);
                jComboBox_Flat.addItem("301");
                jComboBox_Flat.addItem("302");
                jComboBox_Flat.addItem("303");
                jComboBox_Flat.addItem("304");
                jComboBox_Name.addItem("301-E Pethkar Rahul Prakash");
                jComboBox_Name.addItem("302-E RAJU VENKATESAN MOHANRAJ");
                jComboBox_Name.addItem("303-E Khole Dhanjay Bhalchandra");
                jComboBox_Name.addItem("304-E Shrivastava Sangeet Kumar (Rental)");

            }
            else if(jComboBox_Floor.getSelectedItem().equals("4th"))
            {
                jComboBox_Name.removeAllItems();
                jComboBox_Name.setSelectedItem(null);
                jComboBox_Flat.removeAllItems();
                jComboBox_Flat.setSelectedItem(null);
                jComboBox_Flat.addItem("401");
                jComboBox_Flat.addItem("402");
                jComboBox_Flat.addItem("403");
                jComboBox_Flat.addItem("404");
                jComboBox_Name.addItem("401-E Yadkikar Harshal Chandrashekhar");
                jComboBox_Name.addItem("402-E Devrajan Vijaykumar R");
                jComboBox_Name.addItem("403-E Khatavkar Uday Pandurang");
                jComboBox_Name.addItem("404-E Bamne Vivek Sakharam");
            }
            else if(jComboBox_Floor.getSelectedItem().equals("5th"))
            {
                jComboBox_Name.removeAllItems();
                jComboBox_Name.setSelectedItem(null);
                jComboBox_Flat.removeAllItems();
                jComboBox_Flat.setSelectedItem(null);
                jComboBox_Flat.addItem("501");
                jComboBox_Flat.addItem("502");
                jComboBox_Flat.addItem("503");
                jComboBox_Flat.addItem("504");
                jComboBox_Name.addItem("501-E Sanas Ramesh Rajaram");
                jComboBox_Name.addItem("502-E Phapale  Dattatrat Baban (Rental)");
                jComboBox_Name.addItem("503-E Pande Abhay Mukund (Rental)");
                jComboBox_Name.addItem("504-E Gupta Mohanlal   G (Rental)");
            }
            else if(jComboBox_Floor.getSelectedItem().equals("6th"))
            {
                jComboBox_Name.removeAllItems();
                jComboBox_Name.setSelectedItem(null);
                jComboBox_Flat.removeAllItems();
                jComboBox_Flat.setSelectedItem(null);
                jComboBox_Flat.addItem("601");
                jComboBox_Flat.addItem("602");
                jComboBox_Flat.addItem("603");
                jComboBox_Flat.addItem("604");
                jComboBox_Name.addItem("601-E Khare Ranjeet Krushnara");
                jComboBox_Name.addItem("602-E Om Hari Nishad (Rental)");
                jComboBox_Name.addItem("603-E Pawan Vijay Kale");
                jComboBox_Name.addItem("604-E Kulkarni Shrirang Ragvendra (Rental)");
            }
            else if(jComboBox_Floor.getSelectedItem().equals("7th"))
            {
                jComboBox_Flat.removeAllItems();
                jComboBox_Name.removeAllItems();
                jComboBox_Name.setSelectedItem(null);
                jComboBox_Flat.setSelectedItem(null);
                jComboBox_Flat.addItem("701");
                jComboBox_Flat.addItem("702");
                jComboBox_Flat.addItem("703");
                jComboBox_Flat.addItem("704");
                jComboBox_Name.addItem("701-E Kulkarni Guruprasad S (Rental)");
                jComboBox_Name.addItem("702-E Bhorpe Ravindra Madhukar");
                jComboBox_Name.addItem("703-E Dolaskar Sudhir Mohan");
                jComboBox_Name.addItem("704-E Palaskar Pratik Eknath");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jComboBox_FloorActionPerformed

    private void jTextField_amount4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_amount4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_amount4ActionPerformed

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
            java.util.logging.Logger.getLogger(Challan_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Challan_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Challan_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Challan_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Challan_Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_submit;
    private javax.swing.JComboBox<String> jComboBox_Flat;
    private javax.swing.JComboBox<String> jComboBox_Floor;
    private javax.swing.JComboBox<String> jComboBox_Name;
    private javax.swing.JComboBox<String> jComboBox_TR;
    private javax.swing.JComboBox<String> jComboBox_particulars1;
    private javax.swing.JComboBox<String> jComboBox_particulars2;
    private javax.swing.JComboBox<String> jComboBox_particulars3;
    private javax.swing.JComboBox<String> jComboBox_particulars4;
    private javax.swing.JComboBox<String> jComboBox_sname;
    private javax.swing.JComboBox<String> jComboBox_year;
    private com.toedter.calendar.JDateChooser jDateChooser_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jMonthChooser_month;
    private javax.swing.JComboBox<String> jMonthChooser_month1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_TRno;
    private javax.swing.JTextField jTextField_amount1;
    private javax.swing.JTextField jTextField_amount2;
    private javax.swing.JTextField jTextField_amount3;
    private javax.swing.JTextField jTextField_amount4;
    private com.toedter.calendar.JYearChooser jYearChooser_year;
    private com.toedter.calendar.JYearChooser jYearChooser_year1;
    // End of variables declaration//GEN-END:variables
}