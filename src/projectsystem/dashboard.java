package projectsystem;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class dashboard extends javax.swing.JFrame {
    public dashboard() {
        initComponents();
    }

    @Override 
    //override
    public void setDefaultCloseOperation(int operation) {
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        projectDoerComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectsLedTree = new javax.swing.JTree();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        back_dashboard = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        detailslist = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Welcome, Manager");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 38, 330, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 75, 529, 10));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Project Doer");

        projectDoerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matthew Javier", "Sheline Tan", "Emily Hadasa" }));
        projectDoerComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        projectDoerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectDoerComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(projectDoerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(projectDoerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 91, -1, 138));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Projects Led");

        projectsLedTree.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Matthew Javier");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Global object");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Process Object");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Readable stream");
        treeNode1.add(treeNode2);
        projectsLedTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        projectsLedTree.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                projectsLedTreeTreeExpanded(evt);
            }
        });
        jScrollPane1.setViewportView(projectsLedTree);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 91, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Running Project");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("9");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 91, -1, 138));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setText("2023 TeamSync Project Management System by Emelyn ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 297, -1, -1));

        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 294, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsystem/white.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 280, 400));

        jLabel8.setBackground(new java.awt.Color(0, 255, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsystem/white.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 280, 400));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsystem/white.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 280, 400));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setName("dashboard"); // NOI18N

        jMenu1.setText("Dashboard");

        back_dashboard.setSelected(true);
        back_dashboard.setText("Back");
        back_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_dashboardActionPerformed(evt);
            }
        });
        jMenu1.add(back_dashboard);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Project");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Project List");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Overview");

        detailslist.setSelected(true);
        detailslist.setText("Details list");
        detailslist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailslistActionPerformed(evt);
            }
        });
        jMenu5.add(detailslist);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projectDoerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectDoerComboBoxActionPerformed
    String selectedProjectDoer = (String) projectDoerComboBox.getSelectedItem();
    DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(selectedProjectDoer);
    // Add child nodes to the root node based on the selected project doer
    if (selectedProjectDoer.equals("Matthew Javier")) {
        DefaultMutableTreeNode project1 = new DefaultMutableTreeNode("Global object");
        DefaultMutableTreeNode project2 = new DefaultMutableTreeNode("Process object");
        DefaultMutableTreeNode project3 = new DefaultMutableTreeNode("Readable stream");
        rootNode.add(project1);
        rootNode.add(project2);
        rootNode.add(project3);
    } else if (selectedProjectDoer.equals("Sheline Tan")) {
        DefaultMutableTreeNode project4 = new DefaultMutableTreeNode("HTTP server");
        DefaultMutableTreeNode project5 = new DefaultMutableTreeNode("Web framework");
        DefaultMutableTreeNode project6 = new DefaultMutableTreeNode("Path parameter");
        DefaultMutableTreeNode project7 = new DefaultMutableTreeNode("Query parameter");
        DefaultMutableTreeNode project8 = new DefaultMutableTreeNode("ESLint");
        rootNode.add(project4);
        rootNode.add(project5);
        rootNode.add(project6);
        rootNode.add(project7);
        rootNode.add(project8);
    } else if (selectedProjectDoer.equals("Emily Hadasa")) {
        DefaultMutableTreeNode project9 = new DefaultMutableTreeNode("AECC");
        rootNode.add(project9);
    }
    DefaultTreeModel model = (DefaultTreeModel) projectsLedTree.getModel();
    model.setRoot(rootNode);
    }//GEN-LAST:event_projectDoerComboBoxActionPerformed



    
    private void projectsLedTreeTreeExpanded(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_projectsLedTreeTreeExpanded

    }//GEN-LAST:event_projectsLedTreeTreeExpanded

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

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
     
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        project secondPageFrame = new project();
        
        secondPageFrame.setSize(720, 430);
        secondPageFrame.setLocationRelativeTo(null); 
        
        secondPageFrame.setVisible(true);
        
        JFrame currentFrame = (JFrame)SwingUtilities.getWindowAncestor((JCheckBoxMenuItem)evt.getSource());
        currentFrame.dispose();
        
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void detailslistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailslistActionPerformed
        detail_mdi f = new detail_mdi();
        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.add(f);
        f.setSize(570, 240);
        f.setLocation(50, 50);
        f.setVisible(true);
        dashboard frame = new dashboard();
        frame.setContentPane(desktopPane);
        frame.setVisible(true);
        
    }//GEN-LAST:event_detailslistActionPerformed

    private void back_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_dashboardActionPerformed
        dashboard secondPageFrame = new dashboard();
        
        secondPageFrame.setSize(698, 353);
        secondPageFrame.setLocationRelativeTo(null); 
        
        secondPageFrame.setVisible(true);
        
        JFrame currentFrame2 = (JFrame)SwingUtilities.getWindowAncestor((JCheckBoxMenuItem)evt.getSource());
        currentFrame2.dispose();
        JOptionPane.showMessageDialog(this, 
            "Log in succesfull",
            "Success",
            JOptionPane.PLAIN_MESSAGE); 
    }//GEN-LAST:event_back_dashboardActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem back_dashboard;
    private javax.swing.JCheckBoxMenuItem detailslist;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> projectDoerComboBox;
    private javax.swing.JTree projectsLedTree;
    // End of variables declaration//GEN-END:variables
}
