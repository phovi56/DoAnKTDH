/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes3D;

import Shapes2D.Diem2D;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Shapes2D.Line;
import java.awt.Graphics;
/**
 *
 * @author Admin
 */
public class HinhHop extends Line{

    public final int subFrameWidth = 320, subFrameHight = 260, labelSize = 40, textSize = 75;
    private int x, y, z, dai, rong, cao;
 public HinhHop() {
    }

    public HinhHop(int x, int y, int z, int dai, int rong, int cao) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dai = dai;
        this.rong = rong;
        this.cao = cao;
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int getCao() {
        return cao;
    }

    public void setCao(int cao) {
        this.cao = cao;
    }

    public JFrame nhapToaDo3D() {
        JFrame frame = new JFrame("HÌNH HỘP");
        frame.setSize(subFrameWidth, subFrameHight);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);

        JLabel labelX, labelY, labelZ, labelDai, labelRong, labelCao;

        labelX = new JLabel("x:");
        labelX.setBounds(10, 25, labelSize, 25);
        frame.add(labelX);
        InputData.x = new JTextField();
        InputData.x.setBounds(60, 25, textSize, 25);
        frame.add(InputData.x);

        labelY = new JLabel("y:");
        labelY.setBounds(150, 25, labelSize, 25);
        frame.add(labelY);
        InputData.y = new JTextField();
        InputData.y.setBounds(180, 25, textSize, 25);
        frame.add(InputData.y);

        labelZ = new JLabel("z:");
        labelZ.setBounds(10, 75, labelSize, 25);
        frame.add(labelZ);
        InputData.z = new JTextField();
        InputData.z.setBounds(60, 75, textSize, 25);
        frame.add(InputData.z);

        labelDai = new JLabel("Dài:");
        labelDai.setBounds(150, 75, labelSize, 25);
        frame.add(labelDai);
        InputData.dai = new JTextField();
        InputData.dai.setBounds(180, 75, textSize, 25);
        frame.add(InputData.dai);

        labelRong = new JLabel("Rộng:");
        labelRong.setBounds(10, 125, labelSize, 25);
        frame.add(labelRong);
        InputData.rong = new JTextField();
        InputData.rong.setBounds(60, 125, textSize, 25);
        frame.add(InputData.rong);

        labelCao = new JLabel("Cao:");
        labelCao.setBounds(150, 125, labelSize, 25);
        frame.add(labelCao);
        InputData.cao = new JTextField();
        InputData.cao.setBounds(180, 125, textSize, 25);
        frame.add(InputData.cao);

        InputData.nutVe = new JButton("VẼ");
        InputData.nutVe.setFocusPainted(false);     	// xoa duong vien tren button khi click
        InputData.nutVe.setBackground(Color.white);	//background cho button
        InputData.nutVe.setContentAreaFilled(false);	//làm cho button khong con giong button nua
        InputData.nutVe.setOpaque(true);                  //làm cho nen khong trong suốt
        InputData.nutVe.setBounds(60, 175, textSize, 30);
        frame.add(InputData.nutVe);

        InputData.nutXoa = new JButton("XÓA");
        InputData.nutXoa.setFocusPainted(false);
        InputData.nutXoa.setBackground(Color.white);
        InputData.nutXoa.setContentAreaFilled(false);
        InputData.nutXoa.setOpaque(true);
        InputData.nutXoa.setBounds(180, 175, textSize, 30);
        frame.add(InputData.nutXoa);
        frame.setResizable(false);
        frame.setVisible(true);
        return frame;
    }

    public void xoaDuLieu() {
        InputData.x.setText("");
        InputData.x.requestFocus();
        InputData.y.setText("");
        InputData.z.setText("");
        InputData.dai.setText("");
        InputData.rong.setText("");
        InputData.cao.setText("");
    }

    public void xuLyDuLieu() {
        setX(Integer.parseInt(InputData.x.getText()));
        setY(Integer.parseInt(InputData.y.getText()));
        setZ(Integer.parseInt(InputData.z.getText()));
        setDai(Integer.parseInt(InputData.dai.getText()));
        setRong(Integer.parseInt(InputData.rong.getText()));
        setCao(Integer.parseInt(InputData.cao.getText()));
    }

    public String layDuLieu() {
        String str = "\n\t\tTỌA ĐỘ HÌNH HỘP\n\n\tTọa độ đáy dưới\tTọa độ đáy trên\n\n";

        str += "\tA1 (" + x + ", " + y + ", " + z + ")";
        str += "\t\tA2 (" + x + ", " + y + ", " + (z + cao) + ")\n\n";

        str += "\tB1 (" + (x + dai) + ", " + y + ", " + z + ")";
        str += "\t\tB2 (" + (x + dai) + ", " + y + ", " + (z + cao) + ")\n\n";

        str += "\tC1 (" + (x + dai) + ", " + (y + rong) + ", " + z + ")";
        str += "\t\tC2 (" + (x + dai) + ", " + (y + rong) + ", " + (z + cao) + ")\n\n";

        str += "\tD1 (" + x + ", " + (y + rong) + ", " + z + ")";
        str += "\t\tD2 (" + x + ", " + (y + rong) + ", " + (z + cao) + ")";

        return str;
    }

    public void draw(Graphics2D g) {

        //các điểm đáy dưới
        Diem3D a1 = new Diem3D(x, y, z);
        Diem3D b1 = new Diem3D(x + dai, y, z);
        Diem3D c1 = new Diem3D(x + dai, y + rong, z);
        Diem3D d1 = new Diem3D(x, y + rong, z);

        //các điểm đáy trên
        Diem3D a2 = new Diem3D(x, y, z + cao);
        Diem3D b2 = new Diem3D(x + dai, y, z + cao);
        Diem3D d2 = new Diem3D(x, y + rong, z + cao);
        Diem3D c2 = new Diem3D(x + dai, y + rong, z + cao);

        //chuyển đổi sang 2D bằng phép chiếu Cabinet
        Diem2D A1 = Cabinet.chieu(a1.getX(), a1.getY(), a1.getZ());
        Diem2D B1 = Cabinet.chieu(b1.getX(), b1.getY(), b1.getZ());
        Diem2D C1 = Cabinet.chieu(c1.getX(), c1.getY(), c1.getZ());
        Diem2D D1 = Cabinet.chieu(d1.getX(), d1.getY(), d1.getZ());

        Diem2D A2 = Cabinet.chieu(a2.getX(), a2.getY(), a2.getZ());
        Diem2D B2 = Cabinet.chieu(b2.getX(), b2.getY(), b2.getZ());
        Diem2D C2 = Cabinet.chieu(c2.getX(), c2.getY(), c2.getZ());
        Diem2D D2 = Cabinet.chieu(d2.getX(), d2.getY(), d2.getZ());

        //Vẽ các đoạn thẳng đáy dưới
        Line A1B1  = new Line();
        A1B1.Net_Dut( A1.getX(), A1.getY(), B1.getX(), B1.getY());
        A1B1.draw(g);
        Lineof3D B1C1 = new Lineof3D(B1.getX(), B1.getY(), C1.getX(), C1.getY());
        B1C1.draw(g);
        Lineof3D D1C1 = new Lineof3D(D1.getX(), D1.getY(), C1.getX(), C1.getY());
        D1C1.draw(g);
         Line D1A1  = new Line();
        D1A1.Net_Dut(D1.getX(), D1.getY(), A1.getX(), A1.getY());
        D1A1.draw(g);

        //Vẽ các đoạn thẳng đáy trên
        Lineof3D A2B2 = new Lineof3D(A2.getX(), A2.getY(), B2.getX(), B2.getY());
        A2B2.draw(g);
        Lineof3D B2C2 = new Lineof3D(B2.getX(), B2.getY(), C2.getX(), C2.getY());
        B2C2.draw(g);
        Lineof3D D2C2 = new Lineof3D(D2.getX(), D2.getY(), C2.getX(), C2.getY());
        D2C2.draw(g);
        Lineof3D D2A2 = new Lineof3D(D2.getX(), D2.getY(), A2.getX(), A2.getY());
        D2A2.draw(g);

        //Vẽ các cạnh bên
        Line A1A2 = new Line();
        A1A2.Net_Dut(A1.getX(), A1.getY(), A2.getX(), A2.getY());
        A1A2.draw(g);
        Lineof3D B1B2 = new Lineof3D(B1.getX(), B1.getY(), B2.getX(), B2.getY());
        B1B2.draw(g);
        Lineof3D C1C2 = new Lineof3D(C1.getX(), C1.getY(), C2.getX(), C2.getY());
        C1C2.draw(g);
        Lineof3D D1D2 = new Lineof3D(D1.getX(), D1.getY(), D2.getX(), D2.getY());
        D1D2.draw(g);

        //Vẽ tên các điểm
        g.setColor(Color.red);
        g.drawString("A1", InputData.Width / 2 + A1.getX() * 5 + 5, InputData.Height / 2 - A1.getY() * 5 - 5);
        g.drawString("B1", InputData.Width / 2 + B1.getX() * 5 + 5, InputData.Height / 2 - B1.getY() * 5 - 5);
        g.drawString("C1", InputData.Width / 2 + C1.getX() * 5 - 10, InputData.Height / 2 - C1.getY() * 5 + 15);
        g.drawString("D1", InputData.Width / 2 + D1.getX() * 5 - 10, InputData.Height / 2 - D1.getY() * 5 + 15);
        g.drawString("A2", InputData.Width / 2 + A2.getX() * 5 + 5, InputData.Height / 2 - A2.getY() * 5 - 7);
        g.drawString("B2", InputData.Width / 2 + B2.getX() * 5 + 5, InputData.Height / 2 - B2.getY() * 5 - 7);
        g.drawString("C2", InputData.Width / 2 + C2.getX() * 5 - 10, InputData.Height / 2 - C2.getY() * 5 - 5);
        g.drawString("D2", InputData.Width / 2 + D2.getX() * 5 - 10, InputData.Height / 2 - D2.getY() * 5 - 5);

    }   
}
