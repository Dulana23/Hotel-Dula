/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteldula.validation;

import javax.swing.JOptionPane;

/**
 *
 * @author dulan
 */
public class Validator {
    
    public static boolean isFirstNameInputField(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    ". . . First Name field can't be empty . . . \n "
                  + ". . . Please Enter Your First Name . . .",
                    "First Name Empty Message",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean isLastNameInputField(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    ". . . Last Name field can't be empty . . . \n"
                  + ". . . Please Enter Your Last Name . . .",
                    "Last Name Empty Message",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean isAddressInputField(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    ". . . Address field can't be empty . . . \n"
                  + ". . . Please Enter Your Address . . .",
                    "Address Empty Message",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
 
    public static boolean isEmailValid(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    ". . . Email input can't be empty . . . \n"
                  + ". . . Please Enter Your Email . . .",
                    "Email Empty message",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (!value.matches(Validation.EMAIL.validate())) {
            JOptionPane.showMessageDialog(null,
                    "Please Enter valid Email Address",
                    "Email Validation",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
     public static boolean isPasswordValid(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    ". . . Password field can't be empty . . . \n"
                  + ". . .  Please Enter Your Password . . .",
                    "Password Empty Message",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (!value.matches(Validation.PASSWORD.validate())) {
            JOptionPane.showMessageDialog(null,
                    "Password must include the following characters. \n"
                    + "At least one lowercase, \n"
                    + "at least one uppercase, \n"
                    + "a special character, \n"
                    + "and at least one digit. \n"
                    + "The password must be greater than 4 and less than 13 characters",
                    "Password Validation",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean isMobileValid(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    ". . . Mobile Number field can't be empty . . . \n"
                  + ". . . Please Enter Your Mobile Number . . .",
                    "Mobile Empty Message",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (!value.matches(Validation.MOBILE.validate())) {
            JOptionPane.showMessageDialog(null,
                    "Please Enter a valid Mobile Number" ,
                    "Mobile Validation",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean isSelectedItemValid(int value) {
        if (value == 0) {
            JOptionPane.showMessageDialog(null,
                    ". . . Please select your gender . . .",
                    "Gender Selection Message",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
}


