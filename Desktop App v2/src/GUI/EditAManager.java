/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import desktop.app.v2.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zy395907
 */
public class EditAManager extends javax.swing.JFrame {

    /**
     * Creates new form AddAnOfficer
     *
     * @throws java.sql.SQLException
     */
    public EditAManager() throws SQLException {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCarReg = new javax.swing.JTextField();
        txtNextOfKin = new javax.swing.JTextField();
        txtNextOfKinPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEditManagerOutcome = new javax.swing.JTextArea();
        cmboManagerName = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id Number:");

        jLabel2.setText("Edit A Manager");

        txtId.setEditable(false);

        jLabel4.setText("Name:");

        jLabel5.setText("Work Mobile:");

        btnReturn.setText("Return");
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });

        jLabel6.setText("Car Reg:");

        jLabel7.setText("Next of Kin:");

        jLabel8.setText("Phone Number:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtEditManagerOutcome.setEditable(false);
        txtEditManagerOutcome.setColumns(20);
        txtEditManagerOutcome.setRows(5);
        jScrollPane1.setViewportView(txtEditManagerOutcome);

        cmboManagerName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmboManagerNameMouseClicked(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnLoad.setText("Load");
        btnLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(txtCarReg)
                                    .addComponent(txtNextOfKin)
                                    .addComponent(txtNextOfKinPhone)
                                    .addComponent(cmboManagerName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 172, Short.MAX_VALUE)
                .addComponent(btnLoad)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmboManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCarReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNextOfKin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNextOfKinPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Return to the main menu when clicking return
     * @param evt 
     */
    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnMouseClicked

    /**
     * Delete the selected manager and display an appropriate outcome message, before finally setting all the values to blank
     * @param evt 
     */
    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if (cmboManagerName.getSelectedItem() == null) {
            txtEditManagerOutcome.setText("Please select a manager before trying to delete");
        } else {
               String id = txtId.getText();
        String name = (String)cmboManagerName.getSelectedItem();
        try {
            this.deleteManager(id);
            txtEditManagerOutcome.setText((String)name + " has been deleted, you may now\n"
                    + "edit/delete another manager or close this screen by clicking Return");
                txtId.setText("");
                cmboManagerName.setSelectedIndex(-1);
                txtMobileNumber.setText("");
                txtCarReg.setText("");
                txtNextOfKin.setText("");
                txtNextOfKinPhone.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(EditAManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    /**
     * Updates the selected manager with the details provided
     * @param evt 
     */
    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        if (cmboManagerName.getSelectedItem() == null) {
            txtEditManagerOutcome.setText("Please select a manager before trying to update");
        } else {
        String id = txtId.getText();
        String name = (String)cmboManagerName.getSelectedItem();
        try {
            this.updateManager(id);
            txtEditManagerOutcome.setText((String)name + " has been updated, you may now\n"
                    + "edit/delete another manager or close this screen by clicking Return");
                txtId.setText("");
                cmboManagerName.setSelectedIndex(-1);
                txtMobileNumber.setText("");
                txtCarReg.setText("");
                txtNextOfKin.setText("");
                txtNextOfKinPhone.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(EditAManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    /**
     * Display the list of managers when clicking on the manager drop down menu
     * @param evt 
     */
    private void cmboManagerNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmboManagerNameMouseClicked
        cmboManagerName.removeAllItems();
        List<String> managers = null;
        try {
            managers = this.getManagers();
        } catch (SQLException ex) {
            Logger.getLogger(EditAManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        managers.forEach((manager) -> {
            cmboManagerName.addItem(manager);
        });
    }//GEN-LAST:event_cmboManagerNameMouseClicked

    /**
     * Load the current details for the selected manager
     * @param evt 
     */
    private void btnLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadMouseClicked
        if (cmboManagerName.getSelectedItem() == null) {
            txtEditManagerOutcome.setText("Please select a manager before clicking load");
        } else {
            String name = (String)cmboManagerName.getSelectedItem();
       
        try {
            ResultSet results = getManagersDetails(name);
            while (results.next()){
            txtId.setText(results.getString(1));
            txtMobileNumber.setText(results.getString(3));
            txtCarReg.setText(results.getString(4));
            txtNextOfKin.setText(results.getString(5));
            txtNextOfKinPhone.setText(results.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditAManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnLoadMouseClicked

    /**
     * Helper method for btnLoadMouseClicked
     * @param name
     * @return ResultSet of selected manager details
     * @throws SQLException 
     */
    public ResultSet getManagersDetails(String name) throws SQLException {
        DBConnect conn = new DBConnect();
        Connection openConn = conn.openConnection();
        try {
            Statement stmt = openConn.createStatement();
            String query = "SELECT * FROM tblmanagers WHERE name = \"" + name + "\" ORDER BY name";
            ResultSet results = stmt.executeQuery(query);
            System.out.println(results);
            return results;

        } catch (SQLException e) {
            System.out.println("Exception = " + e);
        }
        //System.out.println(list);
        return null;
    }

    /**
     * Helper method for cmboManagerNameMouseClicked
     * @return A list of all managers in tblmanagers
     * @throws SQLException 
     */
    private List<String> getManagers() throws SQLException {
        List<String> list = new ArrayList();
        DBConnect conn = new DBConnect();
        Connection openConn = conn.openConnection();
        try {
            Statement stmt = openConn.createStatement();
            String query = "SELECT name FROM tblmanagers ORDER BY name";
            ResultSet results = stmt.executeQuery(query);
            list.add(null);
            while (results.next()) {
                list.add(results.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println("Exception = " + e);
        }

        return list;
    }

    /**
     * Helper method for btnDeleteMouseClicked, deletes the managers with the specified id.
     * @param managerId
     * @throws SQLException 
     */
    public void deleteManager(String managerId) throws SQLException {
        DBConnect conn = new DBConnect();
        Connection openConn = conn.openConnection();
        PreparedStatement st = openConn.prepareStatement("DELETE FROM tblmanagers WHERE id = \"" + managerId + "\"");
        st.executeUpdate();
        
    }
    
    /**
     * Helper method for btnUpdateMouseClicked, updates all details for the specified manager
     * @param managerId
     * @throws SQLException 
     */
    public void updateManager (String managerId) throws SQLException {
        String name = (String)cmboManagerName.getSelectedItem();
        String id = txtId.getText();
        String mobileNumber = txtMobileNumber.getText();
        String carReg = txtCarReg.getText();
        String nextOfKin = txtNextOfKin.getText();
        String nextOfKinPhone = txtNextOfKinPhone.getText();
        
        DBConnect conn = new DBConnect();
        Connection openConn = conn.openConnection();
        PreparedStatement st = openConn.prepareStatement("UPDATE tblmanagers SET name = \"" + name + 
                "\", mobileNumber = \"" + mobileNumber + "\", carReg = \"" + carReg + 
                "\", nextOfKin = \"" + nextOfKin + "\", nextOfKinPhone = \"" + nextOfKinPhone +
                "\" WHERE id = \"" + id + "\" ");
        st.executeUpdate();
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
            java.util.logging.Logger.getLogger(EditAManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new EditAManager().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(EditAManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmboManagerName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCarReg;
    private javax.swing.JTextArea txtEditManagerOutcome;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtNextOfKin;
    private javax.swing.JTextField txtNextOfKinPhone;
    // End of variables declaration//GEN-END:variables
}
