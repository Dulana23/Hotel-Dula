/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteldula.connection;

/**
 *
 * @author dulan
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class MySQL {
    
    private static final  String DATABASE = "hotel_dula";
    private static final  String USERNAME = "root";
    private static final  String PASSWORD = "Dulana@2003#";
    private static Connection connection =   null;
    
     static{
         try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/"+DATABASE, USERNAME, PASSWORD);
            
                
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public static ResultSet executeSearch(String query) throws SQLException{
        return connection.createStatement().executeQuery(query);
        
    }
    
    public static void executeIUD(String query){
         try {
            connection.createStatement().executeLargeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
    
    
    public  static int executeUpdate(String query, String[] params){
         try (PreparedStatement pst = connection.prepareStatement(query)){
               for (int i = 0; i < params.length; i++){
                   pst.setString(i + 1, params[i]);
               }
               return pst.executeUpdate();
        } catch (Exception e) {
              e.printStackTrace();
              return 0;
        }
      
    }
    
   public  static int executeImgUpdate(String query, String[] params){
         try (Connection conn = getConnection();
                 PreparedStatement pst = conn.prepareStatement(query)){
               for (int i = 0; i < params.length; i++){
                   pst.setString(i + 1, params[i]);
                   
               }
               return pst.executeUpdate();
        } catch (Exception e) {
              e.printStackTrace();
              return -1;
        }
      
    }

    public static Connection getConnection(){
           try {
              return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/"+DATABASE, USERNAME, PASSWORD);
        } catch (Exception e) {
             e.printStackTrace();
            return null;
        }
        
    
        
    
    
    }
    
    
    }    
        
    

    
    
