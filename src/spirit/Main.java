/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spirit;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Elcot
 */
public class Main {
    public static void main(String[] args) 
    {        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        try
        {                    			
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");                                                            
            
            Homepage uf=new Homepage();
            uf.setTitle("Homepage");
            uf.setVisible(true);
            uf.setResizable(true);             
	}
	catch (Exception ex)
	{            
            //System.out.println(ex);
	}        
    }
}
