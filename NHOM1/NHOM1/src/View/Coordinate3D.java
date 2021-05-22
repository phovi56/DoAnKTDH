/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class Coordinate extends JPanel{
    public void drawCoor(JPanel panel, Graphics g){
        int w = panel.getWidth();
        int h = panel.getHeight();
        
        g.drawLine(w, h/2, w/2, h/2);
        g.drawLine(w/2, 0, w/2, h/2);
        g.drawLine(w/2, h/2, 150, 550);
        g.drawString("X", w-20, h/2 -20);
        g.drawString("Y", w/2-20, 20);
        g.drawString("Z", 150-15, 550-15);
    }
    
    public void drawGrill(JPanel panel, Graphics g){
        int w = panel.getWidth();
        int h = panel.getHeight();
        
        for(int i = 1; i<w/2; i++){
            
        }
    }
}
