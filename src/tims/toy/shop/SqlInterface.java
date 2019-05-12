/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tims.toy.shop;

import java.sql.*;
/**
 *
 * @author gryff
 */
public class SqlInterface {
    String url, user, pass;
    Connection conn;
    
    
    public SqlInterface(String url, String user, String pass){
        this.url = url;
        this.user = user;
        this.pass = pass;   
        
    }
    
    public void makeConnection(){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");  
            
             conn = DriverManager.getConnection(url, user, pass);
             System.out.println("Successfully connected");
        }
        catch(Exception e){
            System.out.println("Error connecting to SQL server");
            System.out.println(e);
        }
       
    }
    
    public boolean makeLogin(String user, String pass){

        try{
            Statement statement = conn.createStatement();
            System.out.println("created connection");
            //ResultSet result = statement.executeQuery("SELECT * FROM USER WHERE \"username\" = "+user+";");
            ResultSet result = statement.executeQuery("SELECT * FROM USER WHERE username='"+user+"';");
            while(result.next()){
                if(result.getString("password").equals(pass)){
                    return true;
                }
            }
            //System.out.println(result);
            
        }
        catch(Exception e){
            System.out.println(e);
         
        }
        
        return false;
    }

    
}
