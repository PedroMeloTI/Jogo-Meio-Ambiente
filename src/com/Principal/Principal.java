
package com.Principal;

import com.Views.Inicial;

/**
 *
 * @author pedro
 */
public class Principal {
    
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }
}
