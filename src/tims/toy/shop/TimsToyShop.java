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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        login_window.setVisible(true);
        
    }
    
    public static void LogIn(){
        isLoggedIn = true;
        System.out.println("loggedin");
        
        login_window.setVisible(false);
        main_menu.setExtendedState(main_menu.MAXIMIZED_BOTH);
        main_menu.setVisible(true);
    }
    
}

