/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LALA
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import javax.swing.*;
public class UtilityConnection {
    
     
    Connection conn = null;
    public static Connection ConnecrDb(){
        
  try{
      
  Class.forName("org.sqlite.JDBC");
  Connection conn= DriverManager.getConnection("jdbc:sqlite:Database Utility.sqlite");
  //JOptionPane.showMessageDialog(null, "CONNECTION ESTABLISHED....");
   return conn; 

}
  catch(Exception e)
  {
JOptionPane.showMessageDialog(null, e);
return null;

}
    }
    
}
