
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class Picture extends JLabel implements MyShape{

    public Picture()
    {
        draw("0",0,0);
    }

    @Override
    public void draw(String text, int x, int y) {
        this.setIcon(new javax.swing.ImageIcon("indeks"+text+".png"));
        this.setBounds(10, 100, 250, 334);
    }
  

}
