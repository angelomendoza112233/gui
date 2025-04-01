
import config.dbConnector;
import config.session;
import gfx.RoundedTextField;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();

    }
    public static class LoginHandler {
        public static String[] loginAcc(String username, String password) {
            
            String query = "SELECT u_roles, u_status FROM user WHERE u_username = ? AND u_password = ?";
            
            try (Connection conn = dbConnector.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(query)) {

                pstmt.setString(1, username);
                pstmt.setString(2, password);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        return new String[]{rs.getString("u_roles"), rs.getString("u_status")};
                    }
                }

            } catch (SQLException ex) {
                System.err.println("Login Error: " + ex.getMessage());
            }

            return null; // Return null if login fails
        }
    

    }
    Color mycolo = new Color(202, 70, 70);

    Color mycolor = new Color(158, 146, 100);
    Color headcolor = new Color(234, 207, 181);
    Color bodycolor = new Color(11, 180, 158);
    Color panel = new Color(162, 158, 152);

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
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pms = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        errorlabelpass = new javax.swing.JLabel();
        errorlabeluser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(234, 207, 181));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(158, 146, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Back");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 270, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(162, 158, 152));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, 20));

        pms.setBackground(new java.awt.Color(158, 146, 100));
        pms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pmsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pmsMouseExited(evt);
            }
        });
        jPanel3.add(pms, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 250, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel6.setText("Don't  have an account yet? Sign up.");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, 50));

        username.setToolTipText("Username");
        username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 190, 20));

        password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 190, 20));

        errorlabelpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(errorlabelpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 170, 10));
        jPanel2.add(errorlabeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/angelo-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 510, 300));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(bodycolor);

    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(panel);

    }//GEN-LAST:event_jPanel3MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        register reg =new register();     
       reg.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_jLabel6MouseClicked

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        String user = username.getText();

        if (user.isEmpty()) {
            username.setForeground(mycolo);
            errorlabeluser.setText("Username is required");
            errorlabeluser.setForeground(mycolo);
        } else {
            username.setForeground(Color.BLACK);
            errorlabeluser.setText("");
        }

        username.repaint();
    }//GEN-LAST:event_usernameFocusLost

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        String pass = password.getText();

        if (pass.isEmpty()) {
            password.setForeground(mycolo);
            errorlabelpass.setText("Password is required");
            errorlabelpass.setForeground(mycolo);
        } else {
            password.setForeground(Color.BLACK);
            errorlabelpass.setText("");
        }

        password.repaint();
    }//GEN-LAST:event_passwordFocusLost

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered

    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited

    }//GEN-LAST:event_jLabel6MouseExited

    private void pmsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmsMouseEntered
        pms.setBackground(bodycolor);
    }//GEN-LAST:event_pmsMouseEntered

    private void pmsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmsMouseExited
        pms.setBackground(panel);

    }//GEN-LAST:event_pmsMouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
       String u_username = username.getText().trim();
    String u_password = password.getText().trim();

    if (u_username.isEmpty() || u_password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username and/or password cannot be empty.", "Login Error", JOptionPane.ERROR_MESSAGE);
        username.requestFocus();
        return;
    }

    // Validate login credentials
    String[] loginData = LoginHandler.loginAcc(u_username, u_password);
    if (loginData == null) {
        JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String acct = loginData[0]; // User type (e.g., "admin", "applicant")
    String accStatus = loginData[1]; // Status (e.g., "active", "pending")

    if (!"active".equalsIgnoreCase(accStatus)) {
        JOptionPane.showMessageDialog(this, "Your account is still pending. Please contact the administrator.", "Login Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Fetch user details from database
    try {
        Connection conn = dbConnector.getConnection(); // Ensure you have a method to get a connection
            String query = "SELECT * FROM user WHERE u_username = ? AND u_password = ?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, u_username);
        pst.setString(2, u_password);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) { // Check if a result was found
            session sess = session.getInstance();

            sess.setU_id(rs.getInt("u_id"));
            sess.setFirstName(rs.getString("u_fname"));
            sess.setLastName(rs.getString("u_lname"));
            sess.setContact(rs.getString("u_number"));
            sess.setEmail(rs.getString("u_email"));
            sess.setUsername(rs.getString("u_username"));
            sess.setPassword(rs.getString("u_password")); // Store password securely!
            sess.setRoles(rs.getString("u_roles"));
            sess.setAcc_status(rs.getString("u_status"));
            

            // Redirect based on account type
            if ("admin".equalsIgnoreCase(acct)) {
                new admindashboard().setVisible(true);
            } else if ("applicant".equalsIgnoreCase(acct)) {
                new applicant().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Unknown user type!", "Login Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            this.dispose(); // Close login window
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect username or password.", "Login Error", JOptionPane.ERROR_MESSAGE);
            password.requestFocus();
        }

        // Close resources
        rs.close();
        pst.close();
        conn.close();
        
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error occurred!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jPanel3MouseClicked

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        new login().setVisible(true);
    });

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorlabelpass;
    private javax.swing.JLabel errorlabeluser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel pms;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
