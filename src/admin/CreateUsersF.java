/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;


import config.dbConnector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javafx.beans.binding.Bindings.select;
import static javafx.beans.binding.Bindings.select;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



/**
 *
 * @author User
 */
public class CreateUsersF extends javax.swing.JFrame {

    /**
     * Creates new form registF
     */
    public CreateUsersF() {
        initComponents();
    }
    public String destination;
    File selectedFile;
    public  String oldpath;   
    public  String path;   
    
public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("usf/userimages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    public static String email,username;
            
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_marc  WHERE u_username = '" + us.getText() + "' OR u_email = '" + mail.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("u_email");
                if(email.equals(mail.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      mail.setText("");
                }
                username = resultSet.getString("u_username");
                if(username.equals(us.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      us.setText("");
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
    
    public boolean UpdateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            System.out.println("");
            String query = "SELECT * FROM tbl_marc WHERE(u_username = '"+us.getText()+"' OR u_email = '"+mail.getText()+"')AND u_id !='"+id.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("u_email");
                if(email.equals(mail.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      mail.setText("");
                }
                username = resultSet.getString("u_username");
                if(username.equals(us.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      us.setText("");
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

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        us = new javax.swing.JTextField();
        pw = new javax.swing.JTextField();
        ut = new javax.swing.JComboBox<>();
        xt1 = new javax.swing.JComboBox<>();
        select = new javax.swing.JButton();
        cc = new javax.swing.JButton();
        up = new javax.swing.JButton();
        cl = new javax.swing.JButton();
        add = new javax.swing.JButton();
        del = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        rf1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        jPanel1.setBackground(new java.awt.Color(190, 109, 103));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE FORM");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 424, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-4, -3, 710, 50);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User ID:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 100, 130, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("First Name:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 150, 150, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 200, 140, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gmail:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 250, 120, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("UserName:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 300, 140, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 350, 140, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User Type:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 400, 140, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("User Status:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 450, 150, 20);

        id.setEnabled(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel3.add(id);
        id.setBounds(140, 100, 200, 30);

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel3.add(fn);
        fn.setBounds(140, 150, 200, 30);
        jPanel3.add(ln);
        ln.setBounds(140, 200, 200, 30);
        jPanel3.add(mail);
        mail.setBounds(140, 250, 200, 30);
        jPanel3.add(us);
        us.setBounds(140, 300, 200, 30);
        jPanel3.add(pw);
        pw.setBounds(140, 350, 200, 30);

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer", "DJ" }));
        jPanel3.add(ut);
        ut.setBounds(140, 400, 200, 30);

        xt1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel3.add(xt1);
        xt1.setBounds(140, 450, 200, 30);

        select.setBackground(new java.awt.Color(51, 51, 51));
        select.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        select.setText("SELECT");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel3.add(select);
        select.setBounds(370, 450, 90, 30);

        cc.setBackground(new java.awt.Color(51, 51, 51));
        cc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cc.setText("CANCEL");
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });
        jPanel3.add(cc);
        cc.setBounds(420, 40, 90, 30);

        up.setBackground(new java.awt.Color(51, 51, 51));
        up.setText("UPDATE");
        up.setEnabled(false);
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel3.add(up);
        up.setBounds(120, 40, 90, 30);

        cl.setBackground(new java.awt.Color(51, 51, 51));
        cl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cl.setText("CLEAR");
        cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clActionPerformed(evt);
            }
        });
        jPanel3.add(cl);
        cl.setBounds(320, 40, 90, 30);

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add);
        add.setBounds(20, 40, 90, 30);

        del.setBackground(new java.awt.Color(51, 51, 51));
        del.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        del.setText("DELETE");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jPanel3.add(del);
        del.setBounds(220, 40, 90, 30);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(360, 100, 240, 320);

        remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel3.add(remove);
        remove.setBounds(500, 450, 100, 25);

        rf1.setBackground(new java.awt.Color(51, 51, 51));
        rf1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rf1.setText("REFRESH");
        rf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf1ActionPerformed(evt);
            }
        });
        jPanel3.add(rf1);
        rf1.setBounds(520, 40, 90, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 40, 700, 570);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        
        
        
        if(fn.getText().isEmpty()|| ln.getText().isEmpty() || mail.getText().isEmpty()
                || us.getText().isEmpty()|| pw.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pw.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            pw.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");
            
        }else{
            
             dbConnector dbc = new dbConnector();
       
      if (dbc.insertData("INSERT INTO tbl_marc (u_fname, u_lname, u_email, u_username, u_password, u_type, u_status,u_image) VALUES('"
     + fn.getText() + "','"+ln.getText()+"','"+ mail.getText() + "','" 
     + us.getText() + "','" + pw.getText() + "','" + ut.getSelectedItem() + "','"+xt1.getSelectedItem()+"','"+destination+"')")){
          try{
         Files.copy( selectedFile.toPath(),new File(destination).toPath(),StandardCopyOption.REPLACE_EXISTING);
          JOptionPane.showMessageDialog(null, "Inserted Successfully!");
          userLoginF ads = new userLoginF();
         ads.setVisible(true);
         this.dispose();
          }catch(IOException ex){
             
              System.out.println("insert image error"+ex);
          }
      }else{
          JOptionPane.showMessageDialog(null, "Connection Error!");
      }
            
        }        
        
    }//GEN-LAST:event_addActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
   JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "usf/userimages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            select.setEnabled(false);
                            remove.setEnabled(true);
                         
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }

    }//GEN-LAST:event_selectActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
      
         if(fn.getText().isEmpty()|| ln.getText().isEmpty() || mail.getText().isEmpty()
                || us.getText().isEmpty()|| pw.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pw.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            pw.setText("");
        }else if(UpdateCheck()){
            System.out.println("Duplicate Exist!");
            
        }else{
        dbConnector dbc = new dbConnector();
       dbc.updateData("UPDATE tbl_marc SET u_fname = '"+fn.getText()+",u_lname'"+
       ln.getText()+",u_email'"+mail.getText()+",u_username'"+
       us.getText()+",u_password'"+pw.getText()+",u_type'"+ut.getSelectedItem()+",u_status'"
       +xt1.getSelectedItem()+",u_image= '"+destination+"'WHERE u_id = '"+id.getText()+"'");
       
       
       
       
       JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY!");
       if(destination.isEmpty()){
       File existingFile = new File(oldpath);
       if(existingFile.exists()){
       existingFile.delete();
       }else{
       if(!(oldpath.equals(path))){
       imageUpdater(oldpath,path);
       }
       }
       
       
       
       }
       userLoginF ads = new userLoginF();
         ads.setVisible(true);
         this.dispose();
       
        }
    }//GEN-LAST:event_upActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
       
    }//GEN-LAST:event_delActionPerformed

    private void clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
       userLoginF usf = new userLoginF();
       usf.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_ccActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          userLoginF usf = new userLoginF();
       usf.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rf1ActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
       remove.setEnabled(false);
       select.setEnabled(true);
       destination="";
       path="";
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUsersF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JButton cc;
    private javax.swing.JButton cl;
    private javax.swing.JButton del;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField id;
    public javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField mail;
    public javax.swing.JTextField pw;
    public javax.swing.JButton remove;
    private javax.swing.JButton rf1;
    public javax.swing.JButton select;
    public javax.swing.JButton up;
    public javax.swing.JTextField us;
    public javax.swing.JComboBox<String> ut;
    public javax.swing.JComboBox<String> xt1;
    // End of variables declaration//GEN-END:variables
}
