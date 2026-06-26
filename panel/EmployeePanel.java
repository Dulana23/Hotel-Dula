/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hoteldula.panel;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import hoteldula.connection.MySQL;
import hoteldula.dialog.AddNewEmployee;
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
public class EmployeePanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployeePanel
     */
    private HomeScreen homeScreen;
    
    public EmployeePanel() {
        initComponents();
        init();
        loadDataToTable();
    }
    
    public void init(){
          AddNewEmployeeBtn.setIcon(new FlatSVGIcon("hoteldula/img/AddNew.svg", 20, 20));
          AddNewEmployeeBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
          
          GenerateReportBtn.setIcon(new FlatSVGIcon("hoteldula/img/Report.svg", 20, 20));
          GenerateReportBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        
    
    }
    
     public JTable getEmployeeInfoTable(){
      return EmployeeInfoTable;
   }
    
    public void loadDataToTable(){
           try {
                    ResultSet rs = MySQL.executeSearch("SELECT * FROM `employee` INNER JOIN `section` ON `employee`.`section_id` = `section`.`id` "
                    + " INNER JOIN `status` ON `employee`.`status_id` = `status`.`status_id` ORDER BY `employee_id` ASC;" );
            
            DefaultTableModel dtm = (DefaultTableModel)EmployeeInfoTable.getModel();
            dtm.setRowCount(0);
            
            while (rs.next()) {                
                Vector<String> v = new Vector<>();
                v.add(rs.getString("employee_id"));
                v.add(rs.getString("first_name") + " " + rs.getString("last_name"));
                v.add(rs.getString("email"));
                v.add(rs.getString("mobile"));
                v.add(rs.getString("section_name"));
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
        AddNewEmployeeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeInfoTable = new javax.swing.JTable();
        GenerateReportBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));
        setPreferredSize(new java.awt.Dimension(550, 350));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setText("Employees' Informations");

        AddNewEmployeeBtn.setBackground(new java.awt.Color(204, 204, 204));
        AddNewEmployeeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddNewEmployeeBtn.setText("Add New Employee");
        AddNewEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewEmployeeBtnActionPerformed(evt);
            }
        });

        EmployeeInfoTable.setBackground(new java.awt.Color(235, 231, 231));
        EmployeeInfoTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EmployeeInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Employee Email", "Employee Number", "Employee Section", "Employee Status"
            }
        ));
        EmployeeInfoTable.setGridColor(new java.awt.Color(51, 51, 51));
        EmployeeInfoTable.setShowGrid(true);
        jScrollPane1.setViewportView(EmployeeInfoTable);
        if (EmployeeInfoTable.getColumnModel().getColumnCount() > 0) {
            EmployeeInfoTable.getColumnModel().getColumn(0).setResizable(false);
            EmployeeInfoTable.getColumnModel().getColumn(1).setResizable(false);
            EmployeeInfoTable.getColumnModel().getColumn(2).setResizable(false);
            EmployeeInfoTable.getColumnModel().getColumn(3).setResizable(false);
            EmployeeInfoTable.getColumnModel().getColumn(4).setResizable(false);
            EmployeeInfoTable.getColumnModel().getColumn(5).setResizable(false);
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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddNewEmployeeBtn)))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AddNewEmployeeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenerateReportBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewEmployeeBtnActionPerformed
        AddNewEmployee addNewEmployeeDialog = new AddNewEmployee(homeScreen, true, this);
        addNewEmployeeDialog.setLocationRelativeTo(this);
        addNewEmployeeDialog.setVisible(true);
    }//GEN-LAST:event_AddNewEmployeeBtnActionPerformed

    private void GenerateReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportBtnActionPerformed
             try {
            InputStream filePath = getClass().getClassLoader()
                                    .getResourceAsStream("hoteldula/report/Employee_Informations.jasper");
            HashMap<String, Object> parameters = new HashMap<>();
            
            JRTableModelDataSource  jRTableModelDataSource = new JRTableModelDataSource(EmployeeInfoTable.getModel());
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
    private javax.swing.JButton AddNewEmployeeBtn;
    private javax.swing.JTable EmployeeInfoTable;
    private javax.swing.JButton GenerateReportBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   
}
