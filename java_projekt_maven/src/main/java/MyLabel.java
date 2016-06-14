
import java.awt.Font;
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
public class MyLabel extends JLabel{
    
    private Font font;
    
    public MyLabel(int size,String text)
    {
        font=new java.awt.Font("Tempus Sans ITC", 1, size);
        this.setFont(font);
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setText(text);
    }
    
}
