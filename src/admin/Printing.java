/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static admin.CreateUsersF.getHeightFromWidth;
import config.PanelPrinter;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Marc Gerard
 */
public class Printing extends javax.swing.JFrame {

    /**
     * Creates new form Meeting
     */
    public Printing() {
        initComponents();
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        page = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        xt1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        pfn2 = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        pl = new javax.swing.JLabel();
        ut = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        un = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(null);

        page.setBackground(new java.awt.Color(0, 51, 51));
        page.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        page.setForeground(new java.awt.Color(0, 51, 51));
        page.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EVENT ORGANAZIER");
        page.add(jLabel2);
        jLabel2.setBounds(150, 0, 420, 44);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CITY OF NAGA, CEBU");
        page.add(jLabel3);
        jLabel3.setBounds(270, 40, 200, 22);

        xt1.setBackground(new java.awt.Color(0, 0, 0));
        xt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xt1.setForeground(new java.awt.Color(255, 255, 255));
        page.add(xt1);
        xt1.setBounds(110, 420, 220, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FIRST NAME:");
        page.add(jLabel5);
        jLabel5.setBounds(29, 192, 119, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STATUS:");
        page.add(jLabel6);
        jLabel6.setBounds(30, 430, 150, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EMAIL:");
        page.add(jLabel7);
        jLabel7.setBounds(30, 270, 65, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("USERNAME:");
        page.add(jLabel8);
        jLabel8.setBounds(30, 350, 108, 22);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        page.add(jSeparator1);
        jSeparator1.setBounds(0, 80, 690, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID:");
        page.add(jLabel9);
        jLabel9.setBounds(29, 152, 100, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LAST NAME:");
        page.add(jLabel10);
        jLabel10.setBounds(30, 230, 109, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ACCOUNT TYPE:");
        page.add(jLabel11);
        jLabel11.setBounds(30, 390, 150, 22);

        id.setBackground(new java.awt.Color(0, 0, 0));
        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        page.add(id);
        id.setBounds(70, 140, 170, 40);

        ln.setBackground(new java.awt.Color(0, 0, 0));
        ln.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ln.setForeground(new java.awt.Color(255, 255, 255));
        page.add(ln);
        ln.setBounds(140, 220, 220, 40);

        fn.setBackground(new java.awt.Color(0, 0, 0));
        fn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fn.setForeground(new java.awt.Color(255, 255, 255));
        page.add(fn);
        fn.setBounds(150, 180, 220, 40);

        pfn2.setBackground(new java.awt.Color(0, 0, 0));
        pfn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        page.add(pfn2);
        pfn2.setBounds(160, 230, 220, 30);

        mail.setBackground(new java.awt.Color(0, 0, 0));
        mail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mail.setForeground(new java.awt.Color(255, 255, 255));
        page.add(mail);
        mail.setBounds(100, 260, 220, 40);

        pl.setBackground(new java.awt.Color(0, 0, 0));
        pl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pl.setForeground(new java.awt.Color(255, 255, 255));
        page.add(pl);
        pl.setBounds(100, 300, 220, 40);

        ut.setBackground(new java.awt.Color(0, 0, 0));
        ut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ut.setForeground(new java.awt.Color(255, 255, 255));
        page.add(ut);
        ut.setBounds(180, 380, 210, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PLACE:");
        page.add(jLabel12);
        jLabel12.setBounds(30, 310, 64, 22);

        un.setBackground(new java.awt.Color(0, 0, 0));
        un.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        un.setForeground(new java.awt.Color(255, 255, 255));
        page.add(un);
        un.setBounds(140, 340, 220, 40);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        image.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        image.setForeground(new java.awt.Color(255, 255, 255));
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setText("NO IMAGE FOUND");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        page.add(jPanel2);
        jPanel2.setBounds(330, 90, 340, 410);

        jPanel1.add(page);
        page.setBounds(40, 110, 690, 510);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRINTING FORMS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 220, 29);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(660, 20, 100, 31);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 70, 110, 31);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     JPanel myPanel=new JPanel();
     PanelPrinter pPrint = new PanelPrinter(page);
     pPrint.printPanel();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userLoginF ds = new    userLoginF();
        ds.setVisible(true);
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
            java.util.logging.Logger.getLogger(Printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Printing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel fn;
    public javax.swing.JLabel id;
    public javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel ln;
    public javax.swing.JLabel mail;
    private javax.swing.JPanel page;
    private javax.swing.JLabel pfn2;
    public javax.swing.JLabel pl;
    public javax.swing.JLabel un;
    public javax.swing.JLabel ut;
    public javax.swing.JLabel xt1;
    // End of variables declaration//GEN-END:variables

    Icon ResizeImage(String string, Object object, JLabel userimages) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}