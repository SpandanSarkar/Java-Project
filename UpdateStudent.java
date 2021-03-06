
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sunanda
 */
public class UpdateStudent extends javax.swing.JFrame {

    /**
     * Creates new form UpdateStudent
     */
    String name;
    public UpdateStudent(String n) {
        name = n;
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
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton_Cancel2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton_Cancel = new javax.swing.JButton();
        jButton_Previous = new javax.swing.JButton();
        LName = new javax.swing.JTextField();
        UName = new javax.swing.JTextField();
        FName = new javax.swing.JTextField();
        jButton_Update = new javax.swing.JButton();
        Pass = new javax.swing.JPasswordField();
        AC_delete = new javax.swing.JLabel();
        jButton_MyProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Last Name:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Username:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Password:");

        jButton_Cancel2.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Cancel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton_Cancel2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cancel2.setText("Return to Home");
        jButton_Cancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Upadate");

        jButton_Cancel.setBackground(new java.awt.Color(204, 0, 0));
        jButton_Cancel.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jButton_Previous.setBackground(new java.awt.Color(51, 0, 255));
        jButton_Previous.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton_Previous.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Previous.setText("See Previous Data");
        jButton_Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PreviousActionPerformed(evt);
            }
        });

        LName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        UName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        FName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jButton_Update.setBackground(new java.awt.Color(51, 153, 0));
        jButton_Update.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton_Update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        Pass.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        AC_delete.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        AC_delete.setForeground(new java.awt.Color(255, 255, 255));
        AC_delete.setText("Delete my account");
        AC_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC_deleteMouseClicked(evt);
            }
        });

        jButton_MyProfile.setBackground(new java.awt.Color(51, 153, 0));
        jButton_MyProfile.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton_MyProfile.setForeground(new java.awt.Color(255, 255, 255));
        jButton_MyProfile.setText("My Profile");
        jButton_MyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MyProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Cancel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel9))
                                        .addGap(12, 12, 12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(15, 15, 15)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(FName)
                                    .addComponent(UName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_Cancel)
                                        .addGap(44, 44, 44)
                                        .addComponent(jButton_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(AC_delete)
                                        .addGap(56, 56, 56)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_MyProfile)
                                    .addComponent(jButton_Update))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton_Cancel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(UName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AC_delete)
                    .addComponent(jButton_MyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
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

    private void jButton_Cancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel2ActionPerformed
        FrontPage fp = new FrontPage();
        fp.setVisible(true);
        fp.pack();
        fp.setLocationRelativeTo(null);
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Cancel2ActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PreviousActionPerformed
        final String secretKey = "ssshhhhhhhhhhh!!!!";
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM `student profile` WHERE `Uname` =?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();
            String pass = "";
            String originalString = pass;
            String encryptedString = AES.encrypt(originalString, secretKey) ;
        
            if(rs.next()){
                FName.setText(rs.getString("Fname")); 
                LName.setText(rs.getString("Lname")); 
                UName.setText(rs.getString("Uname")); 
                pass = rs.getString("Pass");
                String decryptedString = AES.decrypt(pass, secretKey) ;
                Pass.setText(decryptedString);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton_PreviousActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        PreparedStatement ps;
        String uname = UName.getText();
        String fname = FName.getText();
        String lname = LName.getText();
        String pass = Pass.getText();
        final String secretKey = "ssshhhhhhhhhhh!!!!";
        String originalString = pass;
        String encryptedString = AES.encrypt(originalString, secretKey) ;
        String decryptedString = AES.decrypt(encryptedString, secretKey) ;
        String query1;
        query1 = "UPDATE `student profile` SET `Fname` =?,`Lname` =?,`Uname` =?, `Pass` =? WHERE `Uname` =?";
        try {
            
            ps = MyConnection.getConnection().prepareStatement(query1);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, uname);
            ps.setString(4, encryptedString);
            ps.setString(5, name);
            ps.executeUpdate();
                PassSuccess mf = new PassSuccess(name);
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                //mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.dispose();
            
        }catch(SQLException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void AC_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC_deleteMouseClicked
                Delete_ST mf = new Delete_ST(name);
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                //mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.dispose();
    }//GEN-LAST:event_AC_deleteMouseClicked

    private void jButton_MyProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MyProfileActionPerformed
        HOME_Frame mf = new HOME_Frame(name);
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                //mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.dispose();
    }//GEN-LAST:event_jButton_MyProfileActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AC_delete;
    private javax.swing.JTextField FName;
    private javax.swing.JTextField LName;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField UName;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Cancel2;
    private javax.swing.JButton jButton_MyProfile;
    private javax.swing.JButton jButton_Previous;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
