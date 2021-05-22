/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes3D;

import Shapes2D.Point2D;

/**
 *
 * @author AD
 */
public class Cabinet {
    public static Point2D p(int x, int y, int z) {
        int X = (int) (x - y * (Math.sqrt(2)) / 4);
        int Y = (int) (z - y * (Math.sqrt(2)) / 4);
        Point2D d = new Point2D(X, Y);
        return d;
    }
}
