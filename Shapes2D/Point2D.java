/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes2D;

import Shapes3D.InputData;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author AD
 */
public class Point2D {
    private int x, y;

    public Point2D() {
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.PINK);  
        g.fillRect(InputData.Width / 2 + x * 5 - 2,InputData.Height/ 2 - y * 5 - 2, 5, 5);
    }

   
}
