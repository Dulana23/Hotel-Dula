/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package hoteldula.dialog;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import hoteldula.connection.MySQL;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import hoteldula.panel.ReservationPanel;
import java.awt.Frame;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author dulan
 */
public class AddNewReserver extends javax.swing.JDialog {

    /**
     * Creates new form addNewResever
     */
    private static ReservationPanel reservationPanel;
    Map<String, String> roomMap = new HashMap<>();
    
    public AddNewReserver(Frame parent, boolean modal, ReservationPanel panel) {
        super(parent, modal);
        this.reservationPanel = panel;
        
        initComponents();
        init();
        loadRoomDetails();
    }
    
    public void init(){
          AddNewReserverSubmitBtn.setIcon(new FlatSVGIcon("hoteldula/img/Submit.svg", 15, 15));
          AddNewReserverSubmitBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
          
          AddNewReserverLoadDataBtn.setIcon(new FlatSVGIcon("hoteldula/img/LoadData.svg", 20, 20));
          AddNewReserverLoadDataBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
    
    }
   
    public void loadRoomDetails(){
          try {
              ResultSet rs = MySQL.executeSearch("SELECT * FROM `room`" );
            
            Vector <String> v = new Vector<>();  
            v.add("Select");
            while (rs.next()) {
                String id = rs.getString("room_id");
                String name = rs.getString("room_number");
                 v.add(name);
                 
                 roomMap.put(name, id);
                
            }
            DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel(v);
            RoomDetailsLoadComboBox.setModel(dcm);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddNewReserverFirstNameInput = new javax.swing.JTextField();
        AddNewReserverLastNameInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AddNewReserverEmailInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AddNewReserverMobileInput = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        AddNewReserverIDInput = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        AddNewReserverMembersCountInput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AddNewReserverSubmitBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        AddNewReserverLoadDataBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        AddNewReserverAddressInput = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        RoomDetailsLoadComboBox = new javax.swing.JComboBox<>();
        AddNewReserverCheckInInput = new javax.swing.JFormattedTextField();
        AddNewReserverCheckOutInput = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        jLabel1.setText("Add New Reserver");

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel5.setText("Mobile Number");

        try {
            AddNewReserverMobileInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel6.setText("Reserver ID");

        jLabel7.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel7.setText("Members Count");

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel8.setText("Room ID");

        jLabel11.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel11.setText("Check In");

        AddNewReserverSubmitBtn.setBackground(new java.awt.Color(0, 153, 255));
        AddNewReserverSubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddNewReserverSubmitBtn.setText("Submit");
        AddNewReserverSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewReserverSubmitBtnActionPerformed(evt);
            }
        });

        AddNewReserverLoadDataBtn.setBackground(new java.awt.Color(0, 204, 51));
        AddNewReserverLoadDataBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddNewReserverLoadDataBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddNewReserverLoadDataBtn.setText("Load Data");
        AddNewReserverLoadDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewReserverLoadDataBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel12.setText("Address");

        jLabel13.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel13.setText("Check Out");

        RoomDetailsLoadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        RoomDetailsLoadComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomDetailsLoadComboBoxActionPerformed(evt);
            }
        });

        try {
            AddNewReserverCheckInInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            AddNewReserverCheckOutInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddNewReserverSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddNewReserverLoadDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(AddNewReserverMembersCountInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(AddNewReserverCheckInInput, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RoomDetailsLoadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(AddNewReserverCheckOutInput)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddNewReserverEmailInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddNewReserverAddressInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddNewReserverMobileInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(AddNewReserverFirstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddNewReserverLastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddNewReserverIDInput)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddNewReserverIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewReserverLastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddNewReserverFirstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddNewReserverEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddNewReserverAddressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddNewReserverMobileInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewReserverMembersCountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomDetailsLoadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewReserverCheckInInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddNewReserverCheckOutInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(AddNewReserverSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddNewReserverLoadDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void AddNewReserverSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewReserverSubmitBtnActionPerformed
              String reserverID   = AddNewReserverIDInput.getText();
              String firstName    = AddNewReserverFirstNameInput.getText();
              String lastName     = AddNewReserverLastNameInput.getText();
              String email        = AddNewReserverEmailInput.getText();
              String address      = AddNewReserverAddressInput.getText();
              String mobile       = AddNewReserverMobileInput.getText();
              String membercount  = AddNewReserverMembersCountInput.getText();
              
              String roomNumber      = (String) RoomDetailsLoadComboBox.getSelectedItem();
              String roomID           =  roomMap.get(roomNumber);
              
              String checkIn      = AddNewReserverCheckInInput.getText();
              String checkOut     = AddNewReserverCheckOutInput.getText();
              
              try {
              MySQL.executeIUD("INSERT INTO `reserver`(`reserver_id`,`first_name`,`last_name`,`address`,`email`,`mobile`,`member_count`,`room_id`,`check_in`,`check_out`) VALUES"
                       + "('"+reserverID+"','"+firstName+"','"+lastName+"','"+address+"','"+email+"','"+mobile+"','"+membercount+"','"+roomID+"','"+checkIn+"','"+checkOut+"')");
               
                JOptionPane.showMessageDialog(this,"New Reserver Add Succeess!!!","Success Message",JOptionPane.INFORMATION_MESSAGE);
                
        } catch (Exception e) {
             e.printStackTrace();
        }
    }//GEN-LAST:event_AddNewReserverSubmitBtnActionPerformed

    private void AddNewReserverLoadDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewReserverLoadDataBtnActionPerformed
         try {
            ResultSet rs = MySQL.executeSearch("SELECT * FROM `reserver` INNER JOIN `room` ON `reserver`.`room_id` = `room`.`room_id` "
                    + " INNER JOIN `room_type` ON `room`.`room_type_id` = `room_type`.`id` ORDER BY `reserver_id` ASC;" );
            
            JTable table = reservationPanel.getReserversInfoTable();
            DefaultTableModel dtm = (DefaultTableModel)table.getModel();
            dtm.setRowCount(0);
            
            while (rs.next()) {                
                Vector<String> v = new Vector<>();
                v.add(rs.getString("reserver_id"));
                v.add(rs.getString("first_name") + " " + rs.getString("last_name"));
                v.add(rs.getString("email"));
                v.add(rs.getString("mobile"));
                v.add(rs.getString("address"));
                v.add(rs.getString("member_count"));
                v.add(rs.getString("room_number"));
                v.add(rs.getString("room_type"));
                v.add(rs.getString("check_in"));
                v.add(rs.getString("check_out"));
               
                dtm.addRow(v);
            }
            
        } catch (java.sql.SQLException e) {
        }
    }//GEN-LAST:event_AddNewReserverLoadDataBtnActionPerformed

    private void RoomDetailsLoadComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomDetailsLoadComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomDetailsLoadComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         FlatIntelliJLaf.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNewReserver dialog = new AddNewReserver(new javax.swing.JFrame(), true, reservationPanel);
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
    private javax.swing.JTextField AddNewReserverAddressInput;
    private javax.swing.JFormattedTextField AddNewReserverCheckInInput;
    private javax.swing.JFormattedTextField AddNewReserverCheckOutInput;
    private javax.swing.JTextField AddNewReserverEmailInput;
    private javax.swing.JTextField AddNewReserverFirstNameInput;
    private javax.swing.JFormattedTextField AddNewReserverIDInput;
    private javax.swing.JTextField AddNewReserverLastNameInput;
    private javax.swing.JButton AddNewReserverLoadDataBtn;
    private javax.swing.JTextField AddNewReserverMembersCountInput;
    private javax.swing.JFormattedTextField AddNewReserverMobileInput;
    private javax.swing.JButton AddNewReserverSubmitBtn;
    private javax.swing.JComboBox<String> RoomDetailsLoadComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
