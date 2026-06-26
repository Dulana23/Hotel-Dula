/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hoteldula.panel;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import hoteldula.connection.MySQL;
import hoteldula.dialog.AddNewSupplier;
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
public class SupplierPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierPanel
     */
     private HomeScreen homeScreen;
     
    public SupplierPanel() {
        initComponents();
        init();
        loadDataToTable();
    }
    
    public JTable getSupplierInfoTable(){
      return SupplierInfoTable;
   }
    
    public void init(){
          AddNewSupplierBtn.setIcon(new FlatSVGIcon("hoteldula/img/AddNew.svg", 20, 20));
          AddNewSupplierBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
          
          GenerateReportBtn.setIcon(new FlatSVGIcon("hoteldula/img/Report.svg", 20, 20));
          GenerateReportBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
    
    }
    
    public void loadDataToTable(){
               
               try {
                    ResultSet rs = MySQL.executeSearch("SELECT * FROM `supplier` INNER JOIN `company` ON `supplier`.`company_id` = `company`.`id` "
                    + " INNER JOIN `status` ON `supplier`.`status_id` = `status`.`status_id` ORDER BY `supplier_id` ASC;" );
            
            DefaultTableModel dtm = (DefaultTableModel)SupplierInfoTable.getModel();
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
    
    
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AddNewSupplierBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierInfoTable = new javax.swing.JTable();
        GenerateReportBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setText("Suppliers' Informations");

        AddNewSupplierBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddNewSupplierBtn.setText("Add New Supplier");
        AddNewSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewSupplierBtnActionPerformed(evt);
            }
        });

        SupplierInfoTable.setBackground(new java.awt.Color(235, 231, 231));
        SupplierInfoTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SupplierInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Supplier Name", "Supplier Email", "Supplier Mobile", "Supplier Company", "Supplier Status"
            }
        ));
        SupplierInfoTable.setGridColor(new java.awt.Color(51, 51, 51));
        SupplierInfoTable.setShowGrid(true);
        SupplierInfoTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(SupplierInfoTable);
        if (SupplierInfoTable.getColumnModel().getColumnCount() > 0) {
            SupplierInfoTable.getColumnModel().getColumn(0).setResizable(false);
            SupplierInfoTable.getColumnModel().getColumn(1).setResizable(false);
            SupplierInfoTable.getColumnModel().getColumn(2).setResizable(false);
            SupplierInfoTable.getColumnModel().getColumn(3).setResizable(false);
            SupplierInfoTable.getColumnModel().getColumn(4).setResizable(false);
            SupplierInfoTable.getColumnModel().getColumn(5).setResizable(false);
        }

        GenerateReportBtn.setBackground(new java.awt.Color(255, 204, 0));
        GenerateReportBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GenerateReportBtn.setForeground(new java.awt.Color(0, 0, 0));
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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddNewSupplierBtn)))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AddNewSupplierBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(GenerateReportBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewSupplierBtnActionPerformed
        AddNewSupplier addNewSupplierDialog = new AddNewSupplier(homeScreen, true, this);
        addNewSupplierDialog.setLocationRelativeTo(this);
        addNewSupplierDialog.setVisible(true);
    }//GEN-LAST:event_AddNewSupplierBtnActionPerformed

    private void GenerateReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportBtnActionPerformed
        try {
            InputStream filePath = getClass().getClassLoader()
                                    .getResourceAsStream("hoteldula/report/Supplier_Information.jasper");
            HashMap<String, Object> parameters = new HashMap<>();
            
            JRTableModelDataSource  jRTableModelDataSource = new JRTableModelDataSource(SupplierInfoTable.getModel());
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
    private javax.swing.JButton AddNewSupplierBtn;
    private javax.swing.JButton GenerateReportBtn;
    private javax.swing.JTable SupplierInfoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
