/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
/**
 *
 * @author SCC32
 */
public class admindashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public admindashboard() {
        initComponents();
    }
     Color mycolor = new Color(158,146,100);
     Color headcolor = new Color(234,207,181);
     Color bodycolor = new Color(11,180,158);

     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        REPORTS = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        USER = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(140, 125, 80));
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(211, 180, 158));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(158, 146, 100));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        REPORTS.setBackground(new java.awt.Color(158, 146, 100));
        REPORTS.setToolTipText("");
        REPORTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REPORTSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REPORTSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                REPORTSMouseExited(evt);
            }
        });
        REPORTS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACCOUNT");
        REPORTS.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 19));

        jPanel3.add(REPORTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 140, 40));

        USER.setBackground(new java.awt.Color(158, 146, 100));
        USER.setToolTipText("");
        USER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                USERMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                USERMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                USERMouseExited(evt);
            }
        });
        USER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USER");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        USER.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 19));

        jPanel3.add(USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 140, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-layout-96.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 19));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 450));

        jPanel2.setBackground(new java.awt.Color(234, 207, 181));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("WELLCOME TO AGIENCY MANAGEMENT SYSTEM");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 670, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 670, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/123332-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 480, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void REPORTSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTSMouseEntered
        REPORTS.setBackground(bodycolor);
    }//GEN-LAST:event_REPORTSMouseEntered

    private void REPORTSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTSMouseExited
        REPORTS.setBackground(mycolor);
    }//GEN-LAST:event_REPORTSMouseExited

    private void USERMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USERMouseEntered
        USER.setBackground(bodycolor);
    }//GEN-LAST:event_USERMouseEntered

    private void USERMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USERMouseExited
                USER.setBackground(mycolor);
    }//GEN-LAST:event_USERMouseExited

    private void USERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USERMouseClicked
        aprovmanagement us =new aprovmanagement();
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_USERMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
   
    }//GEN-LAST:event_jLabel4MouseClicked

    private void REPORTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTSMouseClicked
        profile1 prp = new profile1();
        prp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_REPORTSMouseClicked

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
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admindashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel REPORTS;
    private javax.swing.JPanel USER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
