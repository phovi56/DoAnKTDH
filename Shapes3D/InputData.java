/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes3D;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JTextField;


/**
 *
 * @author Admin
 */
public class InputData {
     public final static int Width = 500;
    public final static int Height = 500;
 
    public static JTextField x, y, z, r, dai, rong, cao;
    public static JButton nutVe, nutXoa;
    public static int bkBanh;
    public static void veToaDo (Graphics2D g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 700, 500);
        g.setColor(Color.LIGHT_GRAY);
        for (int j = 5; j < 700; j += 5) {
            g.drawLine(j, 0, j, InputData.Height);
        }
        for (int j = 5; j < InputData.Height; j += 5) {
            g.drawLine(0, j, 700, j);
        }
        g.setColor(Color.red);
        g.drawLine(700 / 2, 0, 700 / 2,InputData.Height);//y
        g.drawLine(0, InputData.Height / 2, 700, InputData.Height / 2);//x
    }
    
}
