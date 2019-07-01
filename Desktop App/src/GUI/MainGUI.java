/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tm470.DataConnect;

/**
 *
 * @author zy395907
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     * @throws java.sql.SQLException
     */
    public MainGUI() throws SQLException {
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

        jTextField1 = new javax.swing.JTextField();
        lblOfficerName = new javax.swing.JLabel();
        cmboOfficer = new javax.swing.JComboBox<>();
        lblMobile = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        btnMoreDetails = new javax.swing.JButton();
        txtEstOnSite = new javax.swing.JTextField();
        lblEstOnSite = new javax.swing.JLabel();
        txtActOnSite = new javax.swing.JTextField();
        lblActOnSite = new javax.swing.JLabel();
        txtEstLeaveSite = new javax.swing.JTextField();
        lblEstLeaveSite = new javax.swing.JLabel();
        txtActLeaveSite = new javax.swing.JTextField();
        lblActLeaveSite = new javax.swing.JLabel();
        lblOnSite = new javax.swing.JLabel();
        lblLeaveSite = new javax.swing.JLabel();
        btnTestConnection = new javax.swing.JButton();
        lblSite = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnAddManager = new javax.swing.JButton();
        btnEditManager = new javax.swing.JButton();
        btnAddOfficer = new javax.swing.JButton();
        btnEditOfficer = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        lblNotes = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        lblOfficerName.setText("Officer:");

        cmboOfficer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmboOfficerMouseClicked(evt);
            }
        });
        cmboOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboOfficerActionPerformed(evt);
            }
        });
        cmboOfficer.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmboOfficerPropertyChange(evt);
            }
        });

        lblMobile.setText("Mobile:");

        txtMobile.setEditable(false);

        btnMoreDetails.setText("More Details");
        btnMoreDetails.setActionCommand("btnMoreDetails");
        btnMoreDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMoreDetailsMouseClicked(evt);
            }
        });

        lblEstOnSite.setText("Expected:");

        txtActOnSite.setEditable(false);

        lblActOnSite.setText("Actual:");

        lblEstLeaveSite.setText("Expected:");

        txtActLeaveSite.setEditable(false);

        lblActLeaveSite.setText("Actual");

        lblOnSite.setText("On Site");

        lblLeaveSite.setText("Leave Site");

        btnTestConnection.setText("Test Connection");
        btnTestConnection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTestConnectionMouseClicked(evt);
            }
        });

        lblSite.setText("Site:");

        btnExit.setText("Exit");
        btnExit.setActionCommand("btnExit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        btnAddManager.setText("Add a Manager");
        btnAddManager.setActionCommand("btnAddManager");
        btnAddManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddManagerMouseClicked(evt);
            }
        });

        btnEditManager.setText("Edit a Manager");
        btnEditManager.setActionCommand("btnEditManager");
        btnEditManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditManagerMouseClicked(evt);
            }
        });

        btnAddOfficer.setText("Add an Officer");
        btnAddOfficer.setActionCommand("btnAddOfficer");
        btnAddOfficer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOfficerMouseClicked(evt);
            }
        });

        btnEditOfficer.setText("Edit an Officer");
        btnEditOfficer.setActionCommand("btnEditOfficer");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea4);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea5);

        lblNotes.setText("Notes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTestConnection)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExit)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddManager)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditManager)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddOfficer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditOfficer)
                                .addGap(487, 487, 487))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblOfficerName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmboOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnMoreDetails)
                                .addGap(40, 40, 40)
                                .addComponent(lblActOnSite))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMobile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEstOnSite)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOnSite, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(lblLeaveSite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblSite)
                                .addGap(148, 148, 148)
                                .addComponent(lblNotes)
                                .addGap(70, 70, 70))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtActOnSite)
                                    .addComponent(txtEstOnSite))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblEstLeaveSite)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblActLeaveSite)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtActLeaveSite, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(txtEstLeaveSite))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTestConnection)
                    .addComponent(btnExit))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNotes)
                    .addComponent(lblSite)
                    .addComponent(lblLeaveSite)
                    .addComponent(lblOnSite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOfficerName)
                            .addComponent(cmboOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMobile)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstOnSite)
                            .addComponent(txtEstOnSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMoreDetails)
                            .addComponent(txtActOnSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblActOnSite)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEstLeaveSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEstLeaveSite))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtActLeaveSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblActLeaveSite)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddManager)
                    .addComponent(btnEditManager)
                    .addComponent(btnAddOfficer)
                    .addComponent(btnEditOfficer))
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestConnectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestConnectionMouseClicked
        DataConnect a = new DataConnect();
        a.testConnection();
    }//GEN-LAST:event_btnTestConnectionMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure?", "Close the system", dialogButton);
if(dialogResult == 0) {
  System.exit(0);
} else {
  System.out.println("No Option");
} 
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnAddManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddManagerMouseClicked
        AddAManager aManager = new AddAManager();
        aManager.setVisible(true);
    }//GEN-LAST:event_btnAddManagerMouseClicked

    private void btnAddOfficerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOfficerMouseClicked
        AddAnOfficer anOfficer = null;
        try {
            anOfficer = new AddAnOfficer();
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        anOfficer.setVisible(true);
    }//GEN-LAST:event_btnAddOfficerMouseClicked

    private void btnEditManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditManagerMouseClicked
        EditAManager aManager = null;
        try {
            aManager = new EditAManager();
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        aManager.setVisible(true);
    }//GEN-LAST:event_btnEditManagerMouseClicked

    private void cmboOfficerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmboOfficerMouseClicked
        cmboOfficer.removeAllItems();
        DataConnect dbc = new DataConnect();
        List<String> officers = null;
        try {
            officers = dbc.getOfficers();
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        officers.forEach((officer) -> {
            cmboOfficer.addItem(officer);
        });
    }//GEN-LAST:event_cmboOfficerMouseClicked

    private void btnMoreDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoreDetailsMouseClicked
        MoreDetails more = null;
        try {
            more = new MoreDetails();
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String officerName = (String)cmboOfficer.getSelectedItem();
        more.setVisible(true);
        try {
            more.getDetails(officerName);
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMoreDetailsMouseClicked

    private void cmboOfficerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmboOfficerPropertyChange
        System.out.println("Changed");
    }//GEN-LAST:event_cmboOfficerPropertyChange

    private void cmboOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboOfficerActionPerformed
        String vdbDriver = "jdbc:sqlite:";
        String vDatabase = "D:/Program Files/SQLiteDatabaseBrowserPortable/Data/TM470.db";
        Connection vConnection = null;
        String name = (String) this.cmboOfficer.getSelectedItem();
        if (name != null ){
        try {
            vConnection = DriverManager.getConnection(vdbDriver + vDatabase);
            Statement stmt = vConnection.createStatement();
            String query = "SELECT mobileNumber FROM Officers WHERE name = \"" + name + "\"";
            ResultSet results = stmt.executeQuery(query);
            txtMobile.setText(results.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_cmboOfficerActionPerformed
    }
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MainGUI().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddManager;
    private javax.swing.JButton btnAddOfficer;
    private javax.swing.JButton btnEditManager;
    private javax.swing.JButton btnEditOfficer;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMoreDetails;
    private javax.swing.JButton btnTestConnection;
    private javax.swing.JComboBox<String> cmboOfficer;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblActLeaveSite;
    private javax.swing.JLabel lblActOnSite;
    private javax.swing.JLabel lblEstLeaveSite;
    private javax.swing.JLabel lblEstOnSite;
    private javax.swing.JLabel lblLeaveSite;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblNotes;
    private javax.swing.JLabel lblOfficerName;
    private javax.swing.JLabel lblOnSite;
    private javax.swing.JLabel lblSite;
    private javax.swing.JTextField txtActLeaveSite;
    private javax.swing.JTextField txtActOnSite;
    private javax.swing.JTextField txtEstLeaveSite;
    private javax.swing.JTextField txtEstOnSite;
    private javax.swing.JTextField txtMobile;
    // End of variables declaration//GEN-END:variables
}
