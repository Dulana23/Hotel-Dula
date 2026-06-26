/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package hoteldula.dialog;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import hoteldula.connection.MySQL;
import hoteldula.dialog.statusDialog.PaymentStatusChange;
import hoteldula.dialog.statusDialog.SupplierStatusChange;
import hoteldula.panel.SupplierPanel;
import java.awt.Frame;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dulan
 */
public class AddNewSupplier extends javax.swing.JDialog {

    /**
     * Creates new form AddNewSupplier
     */
    private static SupplierPanel supplierPanel;
    private AddNewSupplier addNewSupplier;
    Map<String, Integer> statusMap = new HashMap<>();
    Map<String, Integer> companyMap = new HashMap<>();
    
    public AddNewSupplier(Frame parent, boolean modal, SupplierPanel panel) {
        super(parent, modal);
        this.supplierPanel = panel;
        initComponents();
        init();
        
        loadCompanyDetails();
        loadStatusDetails();
    }
    
    public void init(){
          AddNewSupplierSubmitBtn.setIcon(new FlatSVGIcon("hoteldula/img/Submit.svg", 15, 15));
          AddNewSupplierSubmitBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
          
          AddNewSupplierLoadDataBtn.setIcon(new FlatSVGIcon("hoteldula/img/LoadData.svg", 20, 20));
          AddNewSupplierLoadDataBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
          
          jButton1.putClientProperty(FlatClientProperties.STYLE, "arc:20");
    
    }
    
    public void loadCompanyDetails(){
          try {
              ResultSet rs = MySQL.executeSearch("SELECT * FROM `company`" );
            
            Vector <String> v = new Vector<>();  
            v.add("Select");
            while (rs.next()) {
                int id      = rs.getInt("id");
                String name = rs.getString("company_name");
                 v.add(name);
                 
                 companyMap.put(name, id);
                
            }
            DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel(v);
            CompanyIDComboBox.setModel(dcm);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
     public void loadStatusDetails(){
          try {
              ResultSet rs = MySQL.executeSearch("SELECT * FROM `status`" );
            
            Vector <String> v = new Vector<>();  
            v.add("Select");
            while (rs.next()) {
                int id = rs.getInt("status_id");
                String name = rs.getString("status_name");
                 v.add(name);
                 
                 statusMap.put(name, id);
                
            }
            DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel(v);
            SupplierStatusInput.setModel(dcm);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SupplierIDInput = new javax.swing.JTextField();
        SupplierFirstNameInput = new javax.swing.JTextField();
        SupplierLastNameInput = new javax.swing.JTextField();
        SupplierEmailInput = new javax.swing.JTextField();
        SupplierMobileInput = new javax.swing.JFormattedTextField();
        CompanyIDComboBox = new javax.swing.JComboBox<>();
        SupplierStatusInput = new javax.swing.JComboBox<>();
        AddNewSupplierSubmitBtn = new javax.swing.JButton();
        AddNewSupplierLoadDataBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        jLabel1.setText("Add New Supplier");

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel2.setText("Supplier ID");

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel5.setText("Mobile");

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel6.setText("Company ID");

        jLabel7.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel7.setText(" Status ID");

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel8.setText("First Name");

        try {
            SupplierMobileInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CompanyIDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SupplierStatusInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        AddNewSupplierSubmitBtn.setBackground(new java.awt.Color(0, 153, 255));
        AddNewSupplierSubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddNewSupplierSubmitBtn.setText("Submit");
        AddNewSupplierSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewSupplierSubmitBtnActionPerformed(evt);
            }
        });

        AddNewSupplierLoadDataBtn.setBackground(new java.awt.Color(0, 204, 51));
        AddNewSupplierLoadDataBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddNewSupplierLoadDataBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddNewSupplierLoadDataBtn.setText("Load Data");
        AddNewSupplierLoadDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewSupplierLoadDataBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Change Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGap(28, 28, 28))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SupplierIDInput)
                                .addComponent(SupplierFirstNameInput)
                                .addComponent(SupplierLastNameInput)
                                .addComponent(SupplierEmailInput)
                                .addComponent(SupplierMobileInput)
                                .addComponent(CompanyIDComboBox, 0, 220, Short.MAX_VALUE)
                                .addComponent(SupplierStatusInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddNewSupplierSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddNewSupplierLoadDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SupplierIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SupplierFirstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SupplierLastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SupplierEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SupplierMobileInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CompanyIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SupplierStatusInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(AddNewSupplierSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddNewSupplierLoadDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewSupplierSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewSupplierSubmitBtnActionPerformed
              String supplierID   = SupplierIDInput.getText();
              String firstName    = SupplierFirstNameInput.getText();
              String lastName     = SupplierLastNameInput.getText();
              String email        = SupplierEmailInput.getText();
              String mobile       = SupplierMobileInput.getText();
              String companyName  = (String) CompanyIDComboBox.getSelectedItem();
              int companyID       = companyMap.get(companyName);
              
              String statusName     = (String) SupplierStatusInput.getSelectedItem();
              int statusID        = statusMap.get(statusName);
             
              
              try {
              MySQL.executeIUD("INSERT INTO `supplier`(`supplier_id`,`first_name`,`last_name`,`email`,`mobile`,`company_id`,`status_id`) VALUES"
                       + "('"+supplierID+"','"+firstName+"','"+lastName+"','"+email+"','"+mobile+"','"+companyID+"','"+statusID+"')");
               
                JOptionPane.showMessageDialog(this,"New Supplier Add Succeess!!!","Success Message",JOptionPane.INFORMATION_MESSAGE);
                
        } catch (Exception e) {
             e.printStackTrace();
        }
    }//GEN-LAST:event_AddNewSupplierSubmitBtnActionPerformed

    private void AddNewSupplierLoadDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewSupplierLoadDataBtnActionPerformed
                       try {
                    ResultSet rs = MySQL.executeSearch("SELECT * FROM `supplier` INNER JOIN `company` ON `supplier`.`company_id` = `company`.`id` "
                    + " INNER JOIN `status` ON `supplier`.`status_id` = `status`.`status_id` ORDER BY `supplier_id` ASC;" );
            
                    JTable table = supplierPanel.getSupplierInfoTable();
                    DefaultTableModel dtm = (DefaultTableModel)table.getModel();
                     dtm.setRowCount(0);
            
            while (rs.next()) {                
                Vector<String> v = new Vector<>();
                v.add(rs.getString("supplier_id"));
                v.add(rs.getString("first_name") + " " + rs.getString("last_name"));
                v.add(rs.getString("email"));
                v.add(rs.getString("mobile"));
                v.add(rs.getString("company_name"));
                v.add(rs.getString("status_name"));
              
               
                dtm.addRow(v);
            }
            
        } catch (java.sql.SQLException e) {
        }
    }//GEN-LAST:event_AddNewSupplierLoadDataBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              SupplierStatusChange statusDialog = new SupplierStatusChange(addNewSupplier, true, this);
               statusDialog.setVisible(true);                
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNewSupplier dialog = new AddNewSupplier(new javax.swing.JFrame(), true, supplierPanel);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewSupplierLoadDataBtn;
    private javax.swing.JButton AddNewSupplierSubmitBtn;
    private javax.swing.JComboBox<String> CompanyIDComboBox;
    private javax.swing.JTextField SupplierEmailInput;
    private javax.swing.JTextField SupplierFirstNameInput;
    private javax.swing.JTextField SupplierIDInput;
    private javax.swing.JTextField SupplierLastNameInput;
    private javax.swing.JFormattedTextField SupplierMobileInput;
    private javax.swing.JComboBox<String> SupplierStatusInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
