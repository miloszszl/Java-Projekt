
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
public class AlphabetButton extends JButton implements MyShape{
    
    private Font font;
    public AlphabetButton()
    {
        font=new java.awt.Font("Tempus Sans ITC", 1, 12);
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.setFont(font);
        this.setBackground(new java.awt.Color(230, 230, 230));
    }

    @Override
    public void draw(String text, int x, int y) {
        if(text!="")
        {
            this.setText(text);
            this.setBounds(x, y, 50, 50);
        }
        else if(x<0 && y<0)
        {
            this.setBackground(new java.awt.Color(50, 200, 120));
            this.setEnabled(false);
        }
        else
        {
           this.setBackground(new java.awt.Color(230,230,230));
           this.setEnabled(true); 
        }
    }
    
    
    
}
