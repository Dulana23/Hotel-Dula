/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hoteldula.gui;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import hoteldula.panel.DashboardPanel;
import hoteldula.panel.EmployeePanel;
import hoteldula.panel.FinancialPanel;
import hoteldula.panel.InvoicePanel;
import hoteldula.panel.ReservationPanel;
import hoteldula.panel.RoomsPanel;
import hoteldula.panel.StockPanel;
import hoteldula.panel.SupplierPanel;
import hoteldula.panel.UserInformation;

import hoteldula.util.AppIconUtil;
import java.awt.CardLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author dulan
 */
public class HomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
      private DashboardPanel dashboardPanel;
      private ReservationPanel reservationPanel;
      private RoomsPanel roomsPanel;
      private SupplierPanel suppliersPanel;
      private EmployeePanel employeesPanel;
      private StockPanel stockPanel;
      private FinancialPanel financialpanel;
      private InvoicePanel invoicepanel;
      
      
      private CardLayout contentPanelLayout;
      private HomeScreen homeScreen;
      private User currentUser;


      
      
    
    public HomeScreen(String FullName, User user) {
              this.currentUser = user;
              initComponents();
              init();
              loadPanels();
         
               UserNameLabel.setText(FullName);
             UserProfileBtn.addActionListener(e -> {
               UserInformation userInfoFrame = new UserInformation(currentUser);
               userInfoFrame.setVisible(true);
               
});
        
    }
     
      public void init(){
        AppIconUtil.applyIcon(this);
        
        ImageIcon oI = new ImageIcon(getClass().getResource("/hoteldula/img/logo.jpg"));
        Image sI = oI.getImage().getScaledInstance(88, 88, Image.SCALE_SMOOTH);
        ImageIcon rI = new ImageIcon(sI);
        logoLabel.setIcon(rI);
        
        iconLabel.setIcon(new FlatSVGIcon("hoteldula/img/home.svg", iconLabel.getWidth(), iconLabel.getHeight()));
        userIcon.setIcon(new FlatSVGIcon("hoteldula/img/user.svg", userIcon.getWidth(), userIcon.getHeight()));
        
        DashboardBtn.setIcon(new FlatSVGIcon("hoteldula/img/dashboard.svg", 20, 20));
        DashboardBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        
        ReservationBtn.setIcon(new FlatSVGIcon("hoteldula/img/reservation.svg", 20, 20));
        ReservationBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        
        StockBtn.setIcon(new FlatSVGIcon("hoteldula/img/stock.svg", 20, 20));
        StockBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        
        RoomsBtn.setIcon(new FlatSVGIcon("hoteldula/img/rooms.svg", 20, 20));
        RoomsBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        
        SupplierBtn.setIcon(new FlatSVGIcon("hoteldula/img/suppliers.svg", 20, 20));
        SupplierBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        
        EmployeeBtn.setIcon(new FlatSVGIcon("hoteldula/img/employees.svg", 20, 20));
        EmployeeBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        
        FinancialBtn.setIcon(new FlatSVGIcon("hoteldula/img/financial.svg", 20, 20));
        FinancialBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        
        InvoiceBtn.setIcon(new FlatSVGIcon("hoteldula/img/Invoice.svg", 20, 20));
        InvoiceBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        
        UserProfileBtn.setIcon(new FlatSVGIcon("hoteldula/img/user.svg", 20, 20));
        UserProfileBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        
        
        
        
    }
      
    
    
    private void loadPanels(){
          if (contentPanelLayout == null && containerPanel.getLayout() instanceof CardLayout) {
              this.contentPanelLayout = (CardLayout)containerPanel.getLayout();
           }
      
            this.dashboardPanel = new DashboardPanel();
            this.dashboardPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
            
            
            
            this.reservationPanel = new ReservationPanel();
            this.reservationPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
            
            this.roomsPanel = new RoomsPanel();
            this.roomsPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
            
            this.suppliersPanel = new SupplierPanel();
            this.suppliersPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
            
            this.employeesPanel = new EmployeePanel();
            this.employeesPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
            
            this.stockPanel = new StockPanel();
            this.stockPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
            
            this.financialpanel = new FinancialPanel();
            this.financialpanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
            
            this.invoicepanel = new InvoicePanel();
            this.invoicepanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
            
            this.containerPanel.add(dashboardPanel, "dashboard_panel");
            this.containerPanel.add(reservationPanel, "reservation_panel");
            this.containerPanel.add(roomsPanel, "rooms_panel");
            this.containerPanel.add(suppliersPanel, "supplier_panel");
            this.containerPanel.add(employeesPanel, "employee_panel");
            this.containerPanel.add(stockPanel, "stock_panel");
            this.containerPanel.add(financialpanel, "financial_panel");
            this.containerPanel.add(invoicepanel, "invoice_panel");
            
            SwingUtilities.updateComponentTreeUI(containerPanel);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        menuItemPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DashboardBtn = new javax.swing.JButton();
        ReservationBtn = new javax.swing.JButton();
        StockBtn = new javax.swing.JButton();
        RoomsBtn = new javax.swing.JButton();
        SupplierBtn = new javax.swing.JButton();
        EmployeeBtn = new javax.swing.JButton();
        FinancialBtn = new javax.swing.JButton();
        UserProfileBtn = new javax.swing.JButton();
        InvoiceBtn = new javax.swing.JButton();
        headPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        containerPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dulana Beach Resort - Home");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        menuItemPanel.setBackground(new java.awt.Color(255, 204, 0));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Home");

        DashboardBtn.setBackground(new java.awt.Color(255, 51, 51));
        DashboardBtn.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        DashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        DashboardBtn.setText("Dashboard");
        DashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DashboardBtnActionPerformed(evt);
            }
        });

        ReservationBtn.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        ReservationBtn.setText("Reservations");
        ReservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationBtnActionPerformed(evt);
            }
        });

        StockBtn.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        StockBtn.setText("Stock");
        StockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockBtnActionPerformed(evt);
            }
        });

        RoomsBtn.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        RoomsBtn.setText("Rooms");
        RoomsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsBtnActionPerformed(evt);
            }
        });

        SupplierBtn.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        SupplierBtn.setText("Suppliers");
        SupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierBtnActionPerformed(evt);
            }
        });

        EmployeeBtn.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        EmployeeBtn.setText("Employees");
        EmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeBtnActionPerformed(evt);
            }
        });

        FinancialBtn.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        FinancialBtn.setText("Financial");
        FinancialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinancialBtnActionPerformed(evt);
            }
        });

        UserProfileBtn.setBackground(new java.awt.Color(51, 153, 255));
        UserProfileBtn.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        UserProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        UserProfileBtn.setText("User Profile");
        UserProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserProfileBtnActionPerformed(evt);
            }
        });

        InvoiceBtn.setBackground(new java.awt.Color(51, 204, 0));
        InvoiceBtn.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        InvoiceBtn.setText("Invoice");
        InvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuItemPanelLayout = new javax.swing.GroupLayout(menuItemPanel);
        menuItemPanel.setLayout(menuItemPanelLayout);
        menuItemPanelLayout.setHorizontalGroup(
            menuItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItemPanelLayout.createSequentialGroup()
                .addGroup(menuItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuItemPanelLayout.createSequentialGroup()
                        .addGroup(menuItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuItemPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(menuItemPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItemPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(menuItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserProfileBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FinancialBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmployeeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SupplierBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RoomsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StockBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReservationBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(DashboardBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InvoiceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        menuItemPanelLayout.setVerticalGroup(
            menuItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RoomsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SupplierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FinancialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InvoiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UserProfileBtn)
                .addGap(18, 18, 18)
                .addGroup(menuItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItemPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 56, 173));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dulana");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Beach Resort");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setPreferredSize(new java.awt.Dimension(70, 19));

        UserNameLabel.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        UserNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
                        .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
                        .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        containerPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void DashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardBtnActionPerformed
        this.contentPanelLayout.show(containerPanel, "dashboard_panel");
    }//GEN-LAST:event_DashboardBtnActionPerformed

    private void UserProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserProfileBtnActionPerformed
           
    }//GEN-LAST:event_UserProfileBtnActionPerformed

    private void ReservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationBtnActionPerformed
        this.contentPanelLayout.show(containerPanel, "reservation_panel");
    }//GEN-LAST:event_ReservationBtnActionPerformed

    private void RoomsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsBtnActionPerformed
        this.contentPanelLayout.show(containerPanel, "rooms_panel");
    }//GEN-LAST:event_RoomsBtnActionPerformed

    private void SupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierBtnActionPerformed
        this.contentPanelLayout.show(containerPanel, "supplier_panel");
    }//GEN-LAST:event_SupplierBtnActionPerformed

    private void EmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeBtnActionPerformed
        this.contentPanelLayout.show(containerPanel, "employee_panel");
    }//GEN-LAST:event_EmployeeBtnActionPerformed

    private void StockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockBtnActionPerformed
        this.contentPanelLayout.show(containerPanel, "stock_panel");
    }//GEN-LAST:event_StockBtnActionPerformed

    private void FinancialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinancialBtnActionPerformed
        this.contentPanelLayout.show(containerPanel, "financial_panel");
    }//GEN-LAST:event_FinancialBtnActionPerformed

    private void InvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceBtnActionPerformed
        this.contentPanelLayout.show(containerPanel, "invoice_panel");
    }//GEN-LAST:event_InvoiceBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DashboardBtn;
    private javax.swing.JButton EmployeeBtn;
    private javax.swing.JButton FinancialBtn;
    private javax.swing.JButton InvoiceBtn;
    private javax.swing.JButton ReservationBtn;
    private javax.swing.JButton RoomsBtn;
    private javax.swing.JButton StockBtn;
    private javax.swing.JButton SupplierBtn;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JButton UserProfileBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel menuItemPanel;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
