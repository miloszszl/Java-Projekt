
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class Password extends JLabel implements MyShape{
    
    private Font font;
    public Password()
    {
        font=new java.awt.Font("Tempus Sans ITC", 1, 50);
        this.setForeground(Color.white);
        this.setFont(font);
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //password.setPreferredSize(new java.awt.Dimension(400, 50));
        //password.setBounds(100, 20, 400, 70);
    }
    public void draw(String text,int x,int y)
    {
        this.setText(text);
        this.setBounds(100, 20, 400, 70);
    }
    
}
