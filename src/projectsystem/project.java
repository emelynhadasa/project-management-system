package projectsystem;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class project extends JFrame {

    public project() {
        initComponents();
    }
    
    @Override 
    //override
    public void setDefaultCloseOperation(int operation) {
        // provide a new implementation for the method
        if (operation == JFrame.EXIT_ON_CLOSE) {
            super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else {
            super.setDefaultCloseOperation(operation);
        }
    }
    
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        approvalCheckbox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 150));
        setName("project"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Project  ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, 330, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Matthew", "Node.js basic", "Viona Sutanto", "3"},
                {"Sheline", "Web-service", "Aurick Angsana", "5"},
                {"Emily", "Deployment", "Jennifer Thema", "1"}
            },
            new String [] {
                "User", "Project Title", "Supervisor", "Total Task"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 108, 568, 120));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 92, 568, 10));

        jButton7.setText("Detail");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 129, 65, 17));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setText("2023 TeamSync Project Management System by Emelyn ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jButton8.setText("Detail");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 152, 65, 17));

        jButton9.setText("Detail");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 175, 65, 15));

        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        approvalCheckbox.setText("Approval");
        approvalCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvalCheckboxActionPerformed(evt);
            }
        });
        getContentPane().add(approvalCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 85, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsystem/white.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 280, 370));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsystem/white.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 280, 370));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsystem/white.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 280, 370));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("Dashboard");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Back");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Project");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Project List");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Overview");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Details List");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItem3);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        details secondPageFrame = new details();
        
        secondPageFrame.setSize(700, 390);
        secondPageFrame.setLocationRelativeTo(null); 
        
        secondPageFrame.setVisible(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        details2 secondPageFrame = new details2();
        
        secondPageFrame.setSize(700, 390);
        secondPageFrame.setLocationRelativeTo(null); 
        
        secondPageFrame.setVisible(true);
        
        JFrame currentFrame = (JFrame)SwingUtilities.getWindowAncestor((JCheckBoxMenuItem)evt.getSource());
        currentFrame.dispose();             
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        details3 secondPageFrame = new details3();
        
        secondPageFrame.setSize(700, 390);
        secondPageFrame.setLocationRelativeTo(null); 
        
        secondPageFrame.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login secondPageFrame = new login();
        
        secondPageFrame.setSize(700, 430);
        secondPageFrame.setLocationRelativeTo(null); 
        
        secondPageFrame.setVisible(true);
        
        JFrame currentFrame = (JFrame)SwingUtilities.getWindowAncestor((JButton)evt.getSource());
        currentFrame.dispose();
        JOptionPane.showMessageDialog(this, 
            "You're logged out",
            "Log out",
            JOptionPane.PLAIN_MESSAGE);          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        dashboard secondPageFrame = new dashboard();
        
        secondPageFrame.setSize(700, 390);
        secondPageFrame.setLocationRelativeTo(null); 
        
        secondPageFrame.setVisible(true);
        
        JFrame currentFrame = (JFrame)SwingUtilities.getWindowAncestor((JCheckBoxMenuItem)evt.getSource());
        currentFrame.dispose();       
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        project secondPageFrame = new project();
        
        secondPageFrame.setSize(700, 390);
        secondPageFrame.setLocationRelativeTo(null);
        
        secondPageFrame.setVisible(true);

        JFrame currentFrame = (JFrame)SwingUtilities.getWindowAncestor((JCheckBoxMenuItem)evt.getSource());
        currentFrame.dispose();       
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        
        detail_mdi f = new detail_mdi();
        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.add(f);
        f.setSize(570, 240);
        f.setLocation(50, 50);
        f.setVisible(true);
        dashboard frame = new dashboard();
        frame.setContentPane(desktopPane);
        frame.setVisible(true);    
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void approvalCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvalCheckboxActionPerformed
        if (approvalCheckbox.isSelected()) {
        int choice = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to approve the project?",
            "Confirm Approval",
            JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            // Code to handle project approval
            JOptionPane.showMessageDialog(this,
                "Project approved successfully!",
                "Approval Successful",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            approvalCheckbox.setSelected(false);
        }
    }
    }//GEN-LAST:event_approvalCheckboxActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox approvalCheckbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
