/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventorysoftware.LogIn;

/**
 *
 * @author RoXen
 */
public class MinFrame {
 
    public static void main(String[] args) {
        SpalshScreen screen = new SpalshScreen();
        NewSignin sign = new NewSignin();
        screen.setVisible(true);
        try {
            for (int row = 0; row <=50; row++) {
                Thread.sleep(50);
                screen.loadingnumber.setText(Integer.toString(row)+"%");
                screen.loadingprogress.setValue(row);
                if (row == 50) {
                    
                    screen.setVisible(false);
                    sign.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
}
