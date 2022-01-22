/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonalgradient;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class DiagonalGradient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        GradientPanel p = new GradientPanel();
        f.getContentPane().add( p);
        p.init();
        f.pack();
        f.setSize(new Dimension(1000, 1000));
        f.show();
    }
    
}
