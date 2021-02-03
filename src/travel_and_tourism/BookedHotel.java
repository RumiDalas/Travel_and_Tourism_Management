/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_and_tourism;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Start
 */
public class BookedHotel extends javax.swing.JFrame {
    Connection con ;
    ResultSet rs ;
    PreparedStatement pst;


    /**
     * Creates new form BookedHotel
     */
    public BookedHotel() {
        initComponents();
        con = DbConnection.ConnecerDb();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Hotel Booking Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 34, 247, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText(" Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 105, 83, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Room Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 153, 93, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Hotel Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 198, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Total Person");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 251, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("No of Days");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 303, 77, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Food Included");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 346, 93, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 103, 189, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "Non Ac" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 151, 189, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Spa and Resort", "La Meridin", "Spa and Resort2" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 196, 189, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 246, 189, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 301, 189, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 341, 189, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Phone Number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 392, 93, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 379, 189, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 425, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 425, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\AllProjectData\\Java_Project\\Tourism-Clone\\Mypro-Travel-and-Tourism\\Travel_and_Tourism\\img\\Color-pinl.png")); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String sql =" insert into bookhotel(Name,Room_Type,Hotel_Name,Total_Person,Num_Of_Days,Food,Phone_Number)Values(?,?,?,?,?,?,?) " ;
        try{
               pst = con.prepareStatement(sql);
               pst.setString(1,jTextField1.getText());
               pst.setString(2, (String) jComboBox1.getSelectedItem());
               pst.setString(3, (String) jComboBox2.getSelectedItem());
               pst.setString(4,jTextField2.getText());
               pst.setString(5,jTextField3.getText());
               pst.setString(6, (String) jComboBox3.getSelectedItem());
               pst.setString(7,jTextField4.getText());
               pst.execute();
               JOptionPane.showMessageDialog(null,"Hotel Booking successfull"); 
                
        }catch(Exception e){
                        
                    JOptionPane.showMessageDialog(null,e);    
                        
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        MainFrame obj = new MainFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(BookedHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookedHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookedHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookedHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookedHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}