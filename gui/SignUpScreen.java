/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hoteldula.gui;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import hoteldula.connection.MySQL;
import hoteldula.util.AppIconUtil;
import hoteldula.validation.Validator;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dulan
 */
public class SignUpScreen extends javax.swing.JFrame {

    /**
     * Creates new form SignUpScreen
     */
    public SignUpScreen() {
        initComponents();
        init();
    }

    public void init(){
         AppIconUtil.applyIcon(this);
        ImageIcon bgI = new ImageIcon(getClass().getResource("/hoteldula/img/logo.jpg"));
        Image bgSI = bgI.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        ImageIcon bgRI = new ImageIcon(bgSI);
        logo3.setIcon(bgRI);
        
         signInImg.setIcon(
         
                   new FlatSVGIcon("hoteldula/img/SignUp.svg",
                          signInImg.getWidth(),
                          signInImg.getHeight())
         );
         
          CreateAccountBtn.setIcon(new FlatSVGIcon("hoteldula/img/CreateAccount.svg", 20, 20));
          CreateAccountBtn.putClientProperty(FlatClientProperties.STYLE, "arc:20");
          
          
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        logo3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserFirstNameInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UserLastNameInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        signInImg = new javax.swing.JLabel();
        UserAddressInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UserPasswordInput = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        UserMobileInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        UserGenderInput = new javax.swing.JComboBox<>();
        CreateAccountBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        UserEmailInput = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("Create New Account");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Address");

        UserAddressInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserAddressInputActionPerformed(evt);
            }
        });

        jLabel5.setText("Password");

        jLabel6.setText("Mobile");

        UserMobileInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserMobileInputActionPerformed(evt);
            }
        });

        jLabel7.setText("Gender");

        UserGenderInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Your Gender -- ", "Male", "Female", "Other" }));

        CreateAccountBtn.setBackground(new java.awt.Color(51, 153, 255));
        CreateAccountBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CreateAccountBtn.setText("Create Account");
        CreateAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signInImg, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(UserMobileInput, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UserGenderInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(UserPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(logo3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(288, 288, 288))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(UserFirstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(UserLastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UserAddressInput)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UserEmailInput))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(CreateAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logo3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(signInImg, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserLastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserFirstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserAddressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(UserPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(UserGenderInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserMobileInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(CreateAccountBtn)
                        .addGap(36, 36, 36))))
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

    private void UserAddressInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserAddressInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserAddressInputActionPerformed

    private void CreateAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountBtnActionPerformed
           String firstName = UserFirstNameInput.getText();
           String lastName  = UserLastNameInput.getText();
           String address   = UserAddressInput.getText();
           String email     = UserEmailInput.getText();
           String password  = String.valueOf(UserPasswordInput.getPassword());
           String mobile    = UserMobileInput.getText();
           String gender    = UserGenderInput.getSelectedItem().toString();
                
                if (!Validator.isFirstNameInputField(firstName)) {
                    return;
                }
                if (!Validator.isLastNameInputField(lastName)) {
                    return;
                }
                 if (!Validator.isAddressInputField(address)) {
                    return;
               }
                if (!Validator.isEmailValid(email)) {
                    return;
                }
                 if (!Validator.isPasswordValid(password)) {
                    return;
                }
                 if (!Validator.isMobileValid(mobile)) {
                    return;
                }
              
            
        
                
           
           try {
              MySQL.executeIUD("INSERT INTO `user`(`first_name`,`last_name`,`address`,`email`,`password`,`mobile`,`gender`) VALUES"
                       + "('"+firstName+"','"+lastName+"','"+address+"','"+email+"','"+password+"','"+mobile+"','"+gender+"')");
               
                JOptionPane.showMessageDialog(this,"Registration Succeess","Success Message",JOptionPane.INFORMATION_MESSAGE);
                
        } catch (Exception e) {
             e.printStackTrace();
        }
           
    }//GEN-LAST:event_CreateAccountBtnActionPerformed

    private void UserMobileInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserMobileInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserMobileInputActionPerformed

    /**
     * @param args the command line arguments
     */
     private static SignUpScreen signInScreen;
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpScreen().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccountBtn;
    private javax.swing.JTextField UserAddressInput;
    private javax.swing.JTextField UserEmailInput;
    private javax.swing.JTextField UserFirstNameInput;
    private javax.swing.JComboBox<String> UserGenderInput;
    private javax.swing.JTextField UserLastNameInput;
    private javax.swing.JTextField UserMobileInput;
    private javax.swing.JPasswordField UserPasswordInput;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel logo3;
    private javax.swing.JLabel signInImg;
    // End of variables declaration//GEN-END:variables
}
