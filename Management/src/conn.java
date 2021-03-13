/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Employeee;
import java.sql.*;
/**
 *
 * @author MUNA PRASAD
 */
public class conn { 
public Connection c;
public Statement s;
public conn(){
  try{ 
   Class.forName("com.mysql.jdbc.Driver");
   c= DriverManager.getConnection("jdbc:mysql:///employee","root","");
   s=c.createStatement();
}
  catch(Exception e){
    e.printStackTrace();
}
} 
}
