/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteldula.util;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dulan
 */
public class AppIconUtil {
   


    private static Image appIcon;

    static {
        try {
            URL iconPath = AppIconUtil.class.getResource("/hoteldula/img/logo.jpg");
            ImageIcon icon = new ImageIcon(iconPath);
            AppIconUtil.appIcon = icon.getImage();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Invalid icon path...");
        }
    }

    public static void applyIcon(JFrame frame) {
        if (frame != null) {
            frame.setIconImage(appIcon);
        }
    }
}


