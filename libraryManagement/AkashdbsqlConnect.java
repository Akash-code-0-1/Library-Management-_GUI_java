/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akashapplication;
import java.sql.*;


public class AkashdbsqlConnect {
    
         static Connection cn;
    public static Connection ConnectedDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/akashdb","root","Akash360@");
            System.out.println("Connected!");
            return cn;
        }catch(Exception ex){
            System.out.println(ex);
                    
            return null;
        }
    }
    
}
