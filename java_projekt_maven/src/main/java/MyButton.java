
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class MyButton extends JButton{
    
    private Font font;
    
    public MyButton(int size,String text)
    {
        font=new java.awt.Font("Tempus Sans ITC", 1, size);
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.setFont(font);
        this.setText(text);
        this.setBackground(new java.awt.Color(255, 252, 149));
    }
    
    
    
}
