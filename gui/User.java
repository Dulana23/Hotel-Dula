 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteldula.gui;

/**
 *
 * @author dulan
 */
public class User {
    private String  firstName, lastName, address, email, password, mobile, gender;
    private int userId;
    public User(int userId, String firstName, String lastName, String address, String email, String password, String mobile, String gender) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.gender = gender;
    }

    // Getters
    public int getUserID()    { return userId;     }
    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName;  }
    public String getAddress()   { return address;   }
    public String getEmail()     { return email;     }
    public String getPassword()  { return password;  }
    public String getMobile()    { return mobile;    }
    public String getGender()    { return gender;    }


}
