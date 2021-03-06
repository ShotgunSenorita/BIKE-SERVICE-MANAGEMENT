package frontend;

import javax.swing.ImageIcon;
import services.AdminWorkService;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Admin extends javax.swing.JFrame {
    
    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        setIconImage(new ImageIcon("D:\\lpthw\\java\\ADS_java\\BikeServiceCenter\\src\\images\\icon.png").getImage().getScaledInstance(407, 228,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        adminviewreqbtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bikenumworktf1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        amtbtn = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        prgresstf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bike Service Center");
        setMinimumSize(new java.awt.Dimension(799, 477));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setMaximumSize(new java.awt.Dimension(799, 477));
        jPanel1.setMinimumSize(new java.awt.Dimension(799, 477));
        jPanel1.setLayout(null);

        adminviewreqbtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        adminviewreqbtn.setText("View Requests");
        adminviewreqbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminviewreqbtnActionPerformed(evt);
            }
        });
        jPanel1.add(adminviewreqbtn);
        adminviewreqbtn.setBounds(10, 10, 131, 37);

        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jButton4.setText("Save");
        jButton4.setMaximumSize(new java.awt.Dimension(83, 29));
        jButton4.setMinimumSize(new java.awt.Dimension(83, 29));
        jButton4.setPreferredSize(new java.awt.Dimension(83, 29));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(100, 300, 79, 38);

        bikenumworktf1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        bikenumworktf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bikenumworktf1ActionPerformed(evt);
            }
        });
        jPanel1.add(bikenumworktf1);
        bikenumworktf1.setBounds(240, 180, 168, 22);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setText("Enter Bike Number");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 180, 140, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 160, 500, 10);

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 300, 79, 38);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setText("Enter Amount");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 250, 93, 40);

        amtbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        amtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtbtnActionPerformed(evt);
            }
        });
        jPanel1.add(amtbtn);
        amtbtn.setBounds(240, 260, 168, 22);

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 300, 79, 38);

        tb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bike_Number", "Date_Request", "Progress", "Mobile_No"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 480, 90);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setText("Progress start/end");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 210, 130, 40);

        prgresstf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        jPanel1.add(prgresstf);
        prgresstf.setBounds(240, 220, 168, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 80, 500, 350);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel3.setText("Admin Workflow");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 20, 460, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CRUD.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 0, 930, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AdminWorkService aaws = new AdminWorkService();
        String bike_number = bikenumworktf1.getText();
        String progress = prgresstf.getText();
        String amount = amtbtn.getText();
        if(null == progress){
            JOptionPane.showMessageDialog(null, "Error. try again!!");
        }
        else switch (progress) {
            case "start":
                if(aaws.startendRequest(bike_number, "Inprogress")!=0){
                    JOptionPane.showMessageDialog(null, "Service Start");
                }   break;
            case "end":
                if(aaws.startendRequest(bike_number, "Done", amount)!=0){
                    JOptionPane.showMessageDialog(null, "Service End");
                }   break;
            default:
                JOptionPane.showMessageDialog(null, "Error. try again!!");
                break;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminLogin al = new AdminLogin();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        bikenumworktf1.setText("");
        amtbtn.setText("");
        prgresstf.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void adminviewreqbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminviewreqbtnActionPerformed
        // TODO add your handling code here:
        AdminWorkService aws = new AdminWorkService();
        tb1.setModel(DbUtils.resultSetToTableModel(aws.dispRequest()));
        
    }//GEN-LAST:event_adminviewreqbtnActionPerformed

    private void amtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtbtnActionPerformed

    private void bikenumworktf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bikenumworktf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bikenumworktf1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminviewreqbtn;
    private javax.swing.JTextField amtbtn;
    private javax.swing.JTextField bikenumworktf1;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField prgresstf;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
