/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hoteldula.gui;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import hoteldula.util.AppIconUtil;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author dulan
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
        init();
        loadingAnimation();
    }

    private void init() {
        AppIconUtil.applyIcon(this);
        ImageIcon oI = new ImageIcon(getClass().getResource("/hoteldula/img/logo.jpg"));
        Image sI = oI.getImage().getScaledInstance(538, 319, Image.SCALE_SMOOTH);
        ImageIcon rI = new ImageIcon(sI);
        logo.setIcon(rI);
                
    }
    
    private void loadingAnimation() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    jProgressBar1.setValue(i);
                    if (i < 30) {
                        loadingLabel.setText("Starting modules: " + i + "%");
                    } else if (i > 30 && i < 50) {
                        loadingLabel.setText("Database connection established...: " + i + "%");
                    } else if (i > 80) {
                        loadingLabel.setText("Done...: " + i + "%");
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                }
                 new LogInScreen().setVisible(true);
                 splashScreen.dispose();
            }
        });

        t.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        loadingLabel = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        loadingLabel.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        loadingLabel.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    private static SplashScreen splashScreen;
    
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                splashScreen = new SplashScreen();
                splashScreen.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel loadingLabel;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
