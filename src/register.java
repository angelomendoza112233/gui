
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendo
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public register() {
        initComponents();
    }
     Color mycolor = new Color(202,70,70);
     Color headcolor = new Color(234,207,181);
     Color bodycolor = new Color(11,180,158);
     Color panel = new Color (162,158,152);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        cpass = new javax.swing.JPasswordField();
        phonenumber = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cpw = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        pn1 = new javax.swing.JLabel();
        errorLabelEmail = new javax.swing.JLabel();
        us = new javax.swing.JLabel();
        pw = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        firstname2 = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        acct = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(234, 207, 181));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(211, 180, 158));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(234, 207, 181));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATION");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angelo-removebg-preview.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 150, 280, 190));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-back-50 (1).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 320));

        lastname.setBackground(new java.awt.Color(222, 180, 138));
        lastname.setBorder(new javax.swing.border.MatteBorder(null));
        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastnameFocusLost(evt);
            }
        });
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 130, 20));

        cpass.setBackground(new java.awt.Color(222, 180, 138));
        cpass.setBorder(new javax.swing.border.MatteBorder(null));
        cpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpassFocusLost(evt);
            }
        });
        jPanel1.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 130, 20));

        phonenumber.setBackground(new java.awt.Color(222, 180, 138));
        phonenumber.setBorder(new javax.swing.border.MatteBorder(null));
        phonenumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phonenumberFocusLost(evt);
            }
        });
        phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberActionPerformed(evt);
            }
        });
        jPanel1.add(phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 130, 20));

        pass.setBackground(new java.awt.Color(222, 180, 138));
        pass.setBorder(new javax.swing.border.MatteBorder(null));
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 130, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Confirm Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 130, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("First Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 130, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Last Name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 130, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Phone number");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 95, 130, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Email");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 130, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Username");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 130, 20));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Password");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 130, 20));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Signup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 448, -1, -1));

        jButton2.setBackground(new java.awt.Color(155, 139, 105));
        jButton2.setText("Signup");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 170, 30));
        jPanel1.add(cpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 150, 10));
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 130, 10));
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 120, 10));
        jPanel1.add(pn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 130, -1));
        jPanel1.add(errorLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 130, -1));
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 110, 10));

        pw.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 220, 10));

        jLabel4.setText("Already have an account? Login here");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        user.setBackground(new java.awt.Color(222, 180, 138));
        user.setBorder(new javax.swing.border.MatteBorder(null));
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFocusLost(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 130, 20));

        firstname2.setBackground(new java.awt.Color(222, 180, 138));
        firstname2.setBorder(new javax.swing.border.MatteBorder(null));
        firstname2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstname2FocusLost(evt);
            }
        });
        firstname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname2ActionPerformed(evt);
            }
        });
        jPanel1.add(firstname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 130, 20));

        email1.setBackground(new java.awt.Color(222, 180, 138));
        email1.setBorder(new javax.swing.border.MatteBorder(null));
        email1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                email1FocusLost(evt);
            }
        });
        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });
        jPanel1.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 130, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Account Type");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        acct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "user", " " }));
        jPanel1.add(acct, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 130, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 545, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusLost
        String lname = lastname.getText();

        if (lname.isEmpty()) {

            lastname.setForeground(mycolor);
            ln.setText("This field is required");
            ln.setForeground(mycolor);

        } else {
            lastname.setForeground(Color.BLACK);
            ln.setText("");
            ln.setForeground(mycolor);
        }

        lastname.repaint();
    }//GEN-LAST:event_lastnameFocusLost

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void cpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpassFocusLost
        String lname = cpass.getText();

        if (lname.isEmpty()) {
            cpass.setForeground(mycolor);
            cpw.setText("This field is required");
            cpw.setForeground(mycolor);
        } else {
            cpass.setForeground(Color.BLACK);
            cpw.setText("");
            cpw.setForeground(mycolor);
        }

        cpass.repaint();
    }//GEN-LAST:event_cpassFocusLost

    private void phonenumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phonenumberFocusLost
        String phoneRegex = "^[0-9]{11}$";
        String phoneInput = phonenumber.getText();

        if (phoneInput.isEmpty()) {

            phonenumber.setForeground(mycolor);
            pn1.setText("Number is required");
            pn1.setForeground(mycolor);

        } else if (!phoneInput.matches(phoneRegex)) {

            phonenumber.setForeground(mycolor);
            pn1.setText("Number is invalid");
            pn1.setForeground(mycolor);
        } else {

            phonenumber.setForeground(Color.BLACK);
            pn1.setText("");

        }

        phonenumber.repaint();
    }//GEN-LAST:event_phonenumberFocusLost

    private void phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberActionPerformed

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        String passInput = pass.getText();

        if (passInput.isEmpty()) {
            pass.setForeground(mycolor);
            pw.setText("Password is required");
            pw.setForeground(mycolor);
        } else if (passInput.length() < 8) {

            pass.setForeground(mycolor);
            pw.setText("Password too short. 8 characters or more");
            pw.setForeground(mycolor);
        } else {
            pass.setForeground(Color.BLACK);
            pw.setText("");
        }
        pass.repaint();
    }//GEN-LAST:event_passFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        login log = new login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        login log = new login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusLost
String lname = user.getText();

        if (lname.isEmpty()) {
            user.setForeground(mycolor);
            us.setText("This field is required");
            us.setForeground(mycolor);
        } else {
            user.setForeground(Color.BLACK);
            us.setText("");
            us.setForeground(mycolor);
        }

        user.repaint();        
    }//GEN-LAST:event_userFocusLost

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void firstname2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstname2FocusLost
        String fname = firstname2.getText();

        if (fname.isEmpty()) {
            firstname2.setForeground(mycolor);
            fn.setText("This field is required");
            fn.setForeground(mycolor);
        } else {
            firstname2.setForeground(Color.BLACK);
            fn.setText("");
            fn.setForeground(mycolor);
        }

        firstname2.repaint();      
    }//GEN-LAST:event_firstname2FocusLost

    private void firstname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname2ActionPerformed
    
    
    private void email1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_email1FocusLost

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acct;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JLabel cpw;
    private javax.swing.JTextField email1;
    private javax.swing.JLabel errorLabelEmail;
    private javax.swing.JTextField firstname2;
    private javax.swing.JLabel fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel ln;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JLabel pn1;
    private javax.swing.JLabel pw;
    private javax.swing.JLabel us;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
