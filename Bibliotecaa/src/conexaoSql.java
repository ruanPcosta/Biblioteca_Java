/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ruani
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class conexaoSql {

   public static Connection getCon(){
       
       try{
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           java.sql.Connection conec = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
           return conec;
       }
       catch(Exception e) {
           
           System.out.println(e);
           return null;
       }
   }

  
     
}
