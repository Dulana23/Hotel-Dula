/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package hoteldula.dialog;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import hoteldula.connection.MySQL;
import hoteldula.dialog.statusDialog.StockItemStatusChange;
import hoteldula.panel.StockPanel;
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
public class AddNewStockItem extends javax.swing.JDialog {

    /**
     * Creates new form AddNewStock
     */
    
    private static StockPanel stockItemPanel;
    private static AddNewStockItem addNewStockItem;
    Map<String, Integer> statusMap = new HashMap<>();
    Map<String, Integer> stockCategoryMap = new HashMap<>();
    
    
    public AddNewStockItem(Frame parent, boolean modal, StockPanel panel) {
        super(parent, modal);
        this.stockItemPanel = panel;
        
        initComponents();
        init();
        loadCategoryDetails();
        loadSupplierDetails();
        loadStatusDetails();
    }
    
    public void init(){
          AddNewStockItemSubmitBtn.setIcon(new FlatSVGIcon("hoteldula/img/Submit.svg", 15, 15));
          AddNewStockItemSubmitBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
          
          AddNewStockItemLoadDataBtn.setIcon(new FlatSVGIcon("hoteldula/img/LoadData.svg", 20, 20));
          AddNewStockItemLoadDataBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
          
          jButton1.putClientProperty(FlatClientProperties.STYLE, "arc:20");
    
    }
    
    public void loadCategoryDetails(){
          try {
              ResultSet rs = MySQL.executeSearch("SELECT * FROM `stock_category`" );
            
            Vector <String> v = new Vector<>();  
            v.add("Select");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("category_name");
                 v.add(name);
                
                 stockCategoryMap.put(name, id);
            }
            DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel(v);
            StockCategoryComboBox.setModel(dcm);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    public void loadSupplierDetails(){
          try {
              ResultSet rs = MySQL.executeSearch("SELECT * FROM `supplier`" );
            
            Vector <String> v = new Vector<>();  
            v.add("Select");
            while (rs.next()) {
                String name = rs.getString("supplier_id");
                 v.add(name);
                
            }
            DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel(v);
            SupplierIDComboBox.setModel(dcm);
            
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
            StockStatusComboBox.setModel(dcm);
            
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
        StockItemIDInput = new javax.swing.JTextField();
        StockItemPriceInput = new javax.swing.JTextField();
        StockItemCountInput = new javax.swing.JTextField();
        StockItemTotalPriceInput = new javax.swing.JTextField();
        SupplierIDComboBox = new javax.swing.JComboBox<>();
        AddNewStockItemSubmitBtn = new javax.swing.JButton();
        AddNewStockItemLoadDataBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        StockStatusComboBox = new javax.swing.JComboBox<>();
        StockItemNameInput = new javax.swing.JTextField();
        StockCategoryComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        jLabel1.setText("Add New Stock Item");

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel2.setText("Stock Item ID");

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel3.setText("Stock Category");

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel4.setText("Item Name");

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel5.setText("Item Price");

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel6.setText("Item Count");

        jLabel7.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel7.setText("Supplier ID");

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel8.setText("Item Total Price");

        StockItemIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockItemIDInputActionPerformed(evt);
            }
        });

        StockItemTotalPriceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockItemTotalPriceInputActionPerformed(evt);
            }
        });

        SupplierIDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        AddNewStockItemSubmitBtn.setBackground(new java.awt.Color(0, 153, 255));
        AddNewStockItemSubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddNewStockItemSubmitBtn.setText("Submit");
        AddNewStockItemSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewStockItemSubmitBtnActionPerformed(evt);
            }
        });

        AddNewStockItemLoadDataBtn.setBackground(new java.awt.Color(0, 204, 51));
        AddNewStockItemLoadDataBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddNewStockItemLoadDataBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddNewStockItemLoadDataBtn.setText("Load Data");
        AddNewStockItemLoadDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewStockItemLoadDataBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel9.setText("Stock Status");

        StockStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        StockStatusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockStatusComboBoxActionPerformed(evt);
            }
        });

        StockCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(StockItemTotalPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StockStatusComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SupplierIDComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(StockItemIDInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(StockItemPriceInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(StockItemCountInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(StockItemNameInput)
                                        .addComponent(StockCategoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))))))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddNewStockItemSubmitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddNewStockItemLoadDataBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(StockItemIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(StockCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(StockItemNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(StockItemPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(StockItemCountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(StockItemTotalPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SupplierIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(StockStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(AddNewStockItemSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddNewStockItemLoadDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StockItemIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockItemIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StockItemIDInputActionPerformed

    private void StockItemTotalPriceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockItemTotalPriceInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StockItemTotalPriceInputActionPerformed

    private void AddNewStockItemSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewStockItemSubmitBtnActionPerformed
              String stockID        = StockItemIDInput.getText();
              String categoryName   = (String) StockCategoryComboBox.getSelectedItem();
              int    categoryID     = stockCategoryMap.get(categoryName);
              
              String itemName       = StockItemNameInput.getText();
              String itemPrice      = StockItemPriceInput.getText();
              String itemCount      = StockItemCountInput.getText();
              String itemTotalPrice = StockItemTotalPriceInput.getText();
              String supplierID     = SupplierIDComboBox.getSelectedItem().toString();
              String stockStatusName  = (String) StockStatusComboBox.getSelectedItem();
              int    stockStatusID  = statusMap.get(stockStatusName);
              try {
              MySQL.executeIUD("INSERT INTO `stock`(`stock_id`,`category_id`,`item_name`,`item_price`,`item_count`,`item_total_price`,`supplier_id`,`status_id`) VALUES"
                       + "('"+stockID+"','"+categoryID+"','"+itemName+"','"+itemPrice+"','"+itemCount+"','"+itemTotalPrice+"','"+supplierID+"','"+stockStatusID+"')");
               
                JOptionPane.showMessageDialog(this,"New Stock Item Add Succeess!!!","Success Message",JOptionPane.INFORMATION_MESSAGE);
                
        } catch (Exception e) {
             e.printStackTrace();
        }
    }//GEN-LAST:event_AddNewStockItemSubmitBtnActionPerformed

    private void StockStatusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockStatusComboBoxActionPerformed
            
    }//GEN-LAST:event_StockStatusComboBoxActionPerformed

    private void AddNewStockItemLoadDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewStockItemLoadDataBtnActionPerformed
                    try {
                    ResultSet rs = MySQL.executeSearch("SELECT * FROM `stock` INNER JOIN `stock_category` ON `stock`.`category_id` = `stock_category`.`id` INNER JOIN `supplier` ON `stock`.`supplier_id` = `supplier`.`supplier_id` "
                    + " INNER JOIN `status` ON `stock`.`status_id` = `status`.`status_id` ORDER BY `stock_id` ASC;" );
            
                    JTable table = stockItemPanel.getStockItemInfoTable();
            DefaultTableModel dtm = (DefaultTableModel)table.getModel();
            dtm.setRowCount(0);
            
            while (rs.next()) {                
                Vector<String> v = new Vector<>();
                v.add(rs.getString("stock_id"));
                v.add(rs.getString("category_name"));
                v.add(rs.getString("item_name"));
                v.add(rs.getString("item_price"));
                v.add(rs.getString("item_count"));
                v.add(rs.getString("item_total_price"));
                v.add(rs.getString("first_name") + " " + rs.getString("last_name"));
                v.add(rs.getString("status_name"));
              
               
                dtm.addRow(v);
            }
            
        } catch (java.sql.SQLException e) {
             e.printStackTrace();
        }
    }//GEN-LAST:event_AddNewStockItemLoadDataBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 StockItemStatusChange statusDialog = new StockItemStatusChange(addNewStockItem, true, this);
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
                AddNewStockItem dialog = new AddNewStockItem(new javax.swing.JFrame(), true, stockItemPanel);
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
    private javax.swing.JButton AddNewStockItemLoadDataBtn;
    private javax.swing.JButton AddNewStockItemSubmitBtn;
    private javax.swing.JComboBox<String> StockCategoryComboBox;
    private javax.swing.JTextField StockItemCountInput;
    private javax.swing.JTextField StockItemIDInput;
    private javax.swing.JTextField StockItemNameInput;
    private javax.swing.JTextField StockItemPriceInput;
    private javax.swing.JTextField StockItemTotalPriceInput;
    private javax.swing.JComboBox<String> StockStatusComboBox;
    private javax.swing.JComboBox<String> SupplierIDComboBox;
    private javax.swing.JButton jButton1;
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
