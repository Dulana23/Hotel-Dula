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
import hoteldula.dialog.statusDialog.RoomStatusChange;
import hoteldula.gui.HomeScreen;
import hoteldula.panel.FinancialPanel;
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
public class AddNewPayment extends javax.swing.JDialog {

    /**
     * Creates new form AddNewInvoice
     */
    private static FinancialPanel financialPanel;
    private AddNewPayment addNewPayment;
    private HomeScreen homeScreen;
    Map<String, Integer> statusMap = new HashMap<>();
    
    public AddNewPayment(java.awt.Frame parent, boolean modal, FinancialPanel panel) {
        super(parent, modal);
        this.financialPanel = panel;
        initComponents();
        init();
        loadReserverID();
        loadStatusDetails();
    }
    
    public void init(){
          AddNewPaymentBtn.setIcon(new FlatSVGIcon("hoteldula/img/Submit.svg", 15, 15));
          AddNewPaymentBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
          
          AddNewPaymentLoadDataBtn.setIcon(new FlatSVGIcon("hoteldula/img/LoadData.svg", 20, 20));
          AddNewPaymentLoadDataBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
          
          ChangePaymentBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
    
    }
     
    public void loadReserverID(){
          try {
              ResultSet rs = MySQL.executeSearch("SELECT * FROM `reserver`" );
            
            Vector <String> v = new Vector<>();  
            v.add("Select");
            while (rs.next()) {
                String name = rs.getString("reserver_id");
                 v.add(name);
                
            }
            DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel(v);
            ReserverIDComboBox.setModel(dcm);
            
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
            StatusIDComboBox.setModel(dcm);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IssueDateInput = new javax.swing.JTextField();
        TotalAmountINput = new javax.swing.JTextField();
        DiscountInput = new javax.swing.JTextField();
        FinalAmountInput = new javax.swing.JTextField();
        AddNewPaymentBtn = new javax.swing.JButton();
        AddNewPaymentLoadDataBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        PaymentMethodComboBox = new javax.swing.JComboBox<>();
        ReserverIDComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        StatusIDComboBox = new javax.swing.JComboBox<>();
        InvoiceIDInput = new javax.swing.JTextField();
        ChangePaymentBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        jLabel9.setText("Add New Payment");

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel1.setText("Invoice ID");

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel2.setText("Reserver ID");

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date");

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel4.setText("Total Amount");

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel5.setText("Discount ");

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel6.setText("Final Amount");

        AddNewPaymentBtn.setBackground(new java.awt.Color(0, 153, 255));
        AddNewPaymentBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddNewPaymentBtn.setText("Submit");
        AddNewPaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewPaymentBtnActionPerformed(evt);
            }
        });

        AddNewPaymentLoadDataBtn.setBackground(new java.awt.Color(0, 204, 0));
        AddNewPaymentLoadDataBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddNewPaymentLoadDataBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddNewPaymentLoadDataBtn.setText("Load Data");
        AddNewPaymentLoadDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewPaymentLoadDataBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel7.setText("Payment Method");

        PaymentMethodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Method --", "By Cash", "Credit Card or Debit Card", "Bank Transfer" }));

        ReserverIDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel8.setText("Status");

        StatusIDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ChangePaymentBtn.setBackground(new java.awt.Color(255, 0, 51));
        ChangePaymentBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ChangePaymentBtn.setForeground(new java.awt.Color(255, 255, 255));
        ChangePaymentBtn.setText("Change Status");
        ChangePaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePaymentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IssueDateInput)
                            .addComponent(TotalAmountINput)
                            .addComponent(DiscountInput)
                            .addComponent(FinalAmountInput)
                            .addComponent(PaymentMethodComboBox, 0, 205, Short.MAX_VALUE)
                            .addComponent(ReserverIDComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StatusIDComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InvoiceIDInput)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(ChangePaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddNewPaymentLoadDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddNewPaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ChangePaymentBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(InvoiceIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ReserverIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IssueDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TotalAmountINput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DiscountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FinalAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaymentMethodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(StatusIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(AddNewPaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddNewPaymentLoadDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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

    private void AddNewPaymentLoadDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewPaymentLoadDataBtnActionPerformed
        try {
                    ResultSet rs = MySQL.executeSearch("SELECT * FROM `financial` INNER JOIN `reserver` ON `financial`.`reserver_id` = `reserver`.`reserver_id` "
                    + " INNER JOIN `status` ON `financial`.`status_id` = `status`.`status_id` ORDER BY `id` ASC;" );
            
            JTable table = financialPanel.getFinancialInfoTable();       
            DefaultTableModel dtm = (DefaultTableModel)table.getModel();
            dtm.setRowCount(0);
            
            while (rs.next()) {                
                Vector<String> v = new Vector<>();
                v.add(rs.getString("invoice_id"));
                v.add(rs.getString("reserver_id"));
                v.add(rs.getString("issue_date"));
                v.add(rs.getString("total_amount"));
                v.add(rs.getString("discount"));
                v.add(rs.getString("final_amount"));
                v.add(rs.getString("payment_method"));
                v.add(rs.getString("status_name"));
                
                dtm.addRow(v);
            }
            
        } catch (java.sql.SQLException e) {
              e.printStackTrace();
        }
    }//GEN-LAST:event_AddNewPaymentLoadDataBtnActionPerformed

    private void AddNewPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewPaymentBtnActionPerformed
              String invoiceID       = InvoiceIDInput.getText();
              String reserverID      = ReserverIDComboBox.getSelectedItem().toString();
              String issueDate       = IssueDateInput.getText();
              String totalAmount     = TotalAmountINput.getText();
              String discount        = DiscountInput.getText();
              String finalAmount     = FinalAmountInput.getText();
              String paymentMethod   = PaymentMethodComboBox.getSelectedItem().toString();
              
              String statusName        = (String) StatusIDComboBox.getSelectedItem();
               int statusID            = statusMap.get(statusName);
              
              try {
              MySQL.executeIUD("INSERT INTO `financial`(`invoice_id`,`reserver_id`,`issue_date`,`total_amount`,`discount`,`final_amount`,`payment_method`,`status_id`) VALUES"
                       + "('"+invoiceID+"','"+reserverID+"','"+issueDate+"','"+totalAmount+"','"+discount+"','"+finalAmount+"','"+paymentMethod+"','"+statusID+"')");
               
                JOptionPane.showMessageDialog(this,"New Invoice Details Add Succeess","Success Message",JOptionPane.INFORMATION_MESSAGE);
                
        } catch (Exception e) {
             e.printStackTrace();
        }
    }//GEN-LAST:event_AddNewPaymentBtnActionPerformed

    private void ChangePaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePaymentBtnActionPerformed
           PaymentStatusChange statusDialog = new PaymentStatusChange(addNewPayment, true, this);
            statusDialog.setVisible(true);
    }//GEN-LAST:event_ChangePaymentBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNewPayment dialog = new AddNewPayment(new javax.swing.JFrame(), true, financialPanel);
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
    private javax.swing.JButton AddNewPaymentBtn;
    private javax.swing.JButton AddNewPaymentLoadDataBtn;
    private javax.swing.JButton ChangePaymentBtn;
    private javax.swing.JTextField DiscountInput;
    private javax.swing.JTextField FinalAmountInput;
    private javax.swing.JTextField InvoiceIDInput;
    private javax.swing.JTextField IssueDateInput;
    private javax.swing.JComboBox<String> PaymentMethodComboBox;
    private javax.swing.JComboBox<String> ReserverIDComboBox;
    private javax.swing.JComboBox<String> StatusIDComboBox;
    private javax.swing.JTextField TotalAmountINput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
