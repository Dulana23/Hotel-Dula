/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hoteldula.panel;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import hoteldula.connection.MySQL;
import hoteldula.dialog.AddNewStockItem;
import hoteldula.gui.HomeScreen;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author dulan
 */
public class StockPanel extends javax.swing.JPanel {

    /**
     * Creates new form StockPanel
     */
    private HomeScreen homeScreen;
    
    public StockPanel() {
        initComponents();
        init();
        loadDataToTable();
    }
     
    public void init(){
          AddNewStockItemBtn.setIcon(new FlatSVGIcon("hoteldula/img/AddNew.svg", 20, 20));
          AddNewStockItemBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
          
          GenerateReportBtn.setIcon(new FlatSVGIcon("hoteldula/img/Report.svg", 20, 20));
          GenerateReportBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
    
    }
    
    public JTable getStockItemInfoTable(){
      return StockItemInfoTable;
   }
    
    public void loadDataToTable(){
               
               try {
                    ResultSet rs = MySQL.executeSearch("SELECT * FROM `stock` INNER JOIN `stock_category` ON `stock`.`category_id` = `stock_category`.`id` INNER JOIN `supplier` ON `stock`.`supplier_id` = `supplier`.`supplier_id` "
                    + " INNER JOIN `status` ON `stock`.`status_id` = `status`.`status_id` ORDER BY `stock_id` ASC;" );
            
            DefaultTableModel dtm = (DefaultTableModel)StockItemInfoTable.getModel();
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
    
    
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AddNewStockItemBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StockItemInfoTable = new javax.swing.JTable();
        GenerateReportBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));
        setPreferredSize(new java.awt.Dimension(550, 350));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setText("Stock Informations");

        AddNewStockItemBtn.setBackground(new java.awt.Color(255, 255, 0));
        AddNewStockItemBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddNewStockItemBtn.setText("Add new Stock Item");
        AddNewStockItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewStockItemBtnActionPerformed(evt);
            }
        });

        StockItemInfoTable.setBackground(new java.awt.Color(235, 231, 231));
        StockItemInfoTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StockItemInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock Item ID", "Stock Item Name", "Stock Catagory", "Stock Item Price (Rs)", "Stock Items Count", "Stock Item Total Amount (Rs)", "Supplier Name", "Item Status"
            }
        ));
        StockItemInfoTable.setGridColor(new java.awt.Color(51, 51, 51));
        StockItemInfoTable.setShowGrid(true);
        jScrollPane1.setViewportView(StockItemInfoTable);
        if (StockItemInfoTable.getColumnModel().getColumnCount() > 0) {
            StockItemInfoTable.getColumnModel().getColumn(0).setResizable(false);
            StockItemInfoTable.getColumnModel().getColumn(1).setResizable(false);
            StockItemInfoTable.getColumnModel().getColumn(2).setResizable(false);
            StockItemInfoTable.getColumnModel().getColumn(3).setResizable(false);
            StockItemInfoTable.getColumnModel().getColumn(4).setResizable(false);
            StockItemInfoTable.getColumnModel().getColumn(5).setResizable(false);
            StockItemInfoTable.getColumnModel().getColumn(6).setResizable(false);
            StockItemInfoTable.getColumnModel().getColumn(7).setResizable(false);
        }

        GenerateReportBtn.setBackground(new java.awt.Color(255, 204, 0));
        GenerateReportBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GenerateReportBtn.setText("Generate Report");
        GenerateReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GenerateReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddNewStockItemBtn)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AddNewStockItemBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(GenerateReportBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewStockItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewStockItemBtnActionPerformed
        AddNewStockItem addNewStockItemDialog = new AddNewStockItem(homeScreen, true, this);
        addNewStockItemDialog.setLocationRelativeTo(this);
        addNewStockItemDialog.setVisible(true);
    }//GEN-LAST:event_AddNewStockItemBtnActionPerformed

    private void GenerateReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportBtnActionPerformed
          try {
            InputStream filePath = getClass().getClassLoader()
                                    .getResourceAsStream("hoteldula/report/StockInformation.jasper");
            HashMap<String, Object> parameters = new HashMap<>();
            
            JRTableModelDataSource  jRTableModelDataSource = new JRTableModelDataSource(StockItemInfoTable.getModel());
            JasperPrint fillReport = JasperFillManager.fillReport(filePath, parameters, jRTableModelDataSource);
            JasperViewer viewer = new JasperViewer(fillReport, false);
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            viewer.setVisible(true);
            
            JasperExportManager.exportReportToPdfFile(fillReport, "report.pdf");
            
        } catch (JRException e) {
            e.printStackTrace();
        }    
        
    }//GEN-LAST:event_GenerateReportBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewStockItemBtn;
    private javax.swing.JButton GenerateReportBtn;
    private javax.swing.JTable StockItemInfoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
