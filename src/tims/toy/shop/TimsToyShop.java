/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tims.toy.shop;

/**
 *
 * @author gryff
 */
public class TimsToyShop {
    
    static boolean isLoggedIn = false;
    static Login_Window login_window = new Login_Window();
    static Main_Menu main_menu = new Main_Menu();
    static SqlInterface sql;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        
        login_window.setVisible(true);
        
        String url = "jdbc:mysql://localhost:3306/csit334";
        sql = new SqlInterface(url, "root", "");
        sql.makeConnection();
        System.out.println(sql);
        
    }
    
    public static void LogIn(){
        isLoggedIn = true;
        System.out.println("loggedin");
        
        login_window.setVisible(false);
        main_menu.setExtendedState(main_menu.MAXIMIZED_BOTH);
        main_menu.setVisible(true);
    }
    
    public static SqlInterface getSql(){
        System.out.println(sql);
        return sql;
    }
    
}

