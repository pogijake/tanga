/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caht;

import MARCDJ.Dj21;
import config.dbConnector;
import customer.customer;
import customer.userDash;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import testappnew.PILI;
import testappnew.loginF;


/**
 *
 * @author User
 */
public class sche1 extends javax.swing.JFrame {

    /**
     * Creates new form registF
     */
    public sche1() {
        initComponents();
    }
    
    public static String number,date;
            
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_dule  WHERE u_date = '" + dt.getText() + "' OR u_number = '" + nb.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                number = resultSet.getString("u_number");
                if(number.equals(nb.getText())){
                      JOptionPane.showMessageDialog(null, "number is Already Used!");
                      nb.setText("");
                }
                date = resultSet.getString("u_date");
                if(date.equals(dt.getText())){
                      JOptionPane.showMessageDialog(null, "THIS DATE IS ALREADY BOOK !");
                      dt.setText("");
            }
            return true;
            }else{
                return false;
            }
          
        }catch (SQLException ex) {
            System.out.println(""+ex);
            return false;
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        nb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pl = new javax.swing.JTextField();
        dt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tt = new javax.swing.JTextField();
        ut = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 50, 120, 22);
        jPanel1.add(fn);
        fn.setBounds(150, 50, 240, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last Name:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 90, 120, 16);
        jPanel1.add(ln);
        ln.setBounds(150, 90, 240, 30);
        jPanel1.add(nb);
        nb.setBounds(150, 130, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Number:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 130, 120, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Place:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 170, 90, 22);
        jPanel1.add(pl);
        pl.setBounds(150, 170, 240, 30);
        jPanel1.add(dt);
        dt.setBounds(150, 210, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 210, 120, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Time:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 250, 110, 22);
        jPanel1.add(tt);
        tt.setBounds(150, 250, 240, 30);

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WEDDING", "FIESTA", "BIRTHDAY" }));
        jPanel1.add(ut);
        ut.setBounds(150, 290, 240, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AccountType:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 290, 130, 22);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("SCHEDULED");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 330, 110, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 330, 67, 30);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(240, 0, 450, 410);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/71ad4d48-39f6-4c0c-b50c-7e7631af6759.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 190, 370);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        if(fn.getText().isEmpty()||ln.getText().isEmpty()||nb.getText().isEmpty()  ||pl.getText().isEmpty()||dt.getText().isEmpty()
                ||tt.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"ALL FIELDS ARE REQUIRED");
        }else if(tt.getText().length()<0) { 
          JOptionPane.showMessageDialog(null,"  only time ");
          tt.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");
        
        }else{
        dbConnector dbc = new dbConnector();
        if(dbc.insertData("INSERT INTO tbl_dule(u_fname,u_lname,u_number,u_place ,u_date,u_time,u_type)"
+"VALUES('"+fn.getText()+"','"+ln.getText()+"','"+nb.getText()+"','"+pl.getText()+"','"+dt.getText()+"','"+tt.getText()+"','"+ut.getSelectedItem()+"')"))
            
        {
        JOptionPane.showMessageDialog(null,"REGISTERED SUCCESS");
      Dj21 lfr= new Dj21();
      lfr.setVisible(true);
      this.dispose();
       }else{
       JOptionPane.showMessageDialog(null,"REGISTERED FAILDED");
        }  
        }
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      customer ads = new customer();
       ads.setVisible(true);
      this.dispose();
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
            java.util.logging.Logger.getLogger(sche1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sche1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sche1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sche1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sche1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dt;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField nb;
    private javax.swing.JTextField pl;
    private javax.swing.JTextField tt;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
