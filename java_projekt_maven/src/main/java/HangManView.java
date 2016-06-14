
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.List;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Miłosz
 */
public class HangManView extends JFrame {

    private final JLabel background;
    private JLayeredPane jLayeredPane;
    public JLabel hintText;
    MyShape [] abutton;
    MyShape password;
    MyShape picture;
    
    public HangManView()
    {
        this.setSize(600,600);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("HANG MAN");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        background=new JLabel();
        background.setIcon(new javax.swing.ImageIcon("background-green.jpg"));
        background.setBounds(0, 0, 600, 600);
        
        jLayeredPane = new JLayeredPane();
        jLayeredPane.setSize(600,600);
        
        ComponentFactory factory=new ComponentFactory();
        //ArrayList<String> list=list = new ArrayList<String>();
        //String [] aplhabet=new [35]String;
        
        abutton=new MyShape[26];
        int x=310,y=120;
        for(int i=1;i<=26;i++)
        {
            abutton[i-1]=factory.getMyShape("button");
            abutton[i-1].draw(Character.toString ((char) (i+64)),x , y);
            x+=55;
            if(i%5==0)
            {
                x=310;
                y+=55;
            }
            jLayeredPane.add((Component) abutton[i-1]);
        }
        
        
        password= factory.getMyShape("password");
        password.draw("-------",0,0);
        jLayeredPane.add((Component) password);
        
        picture =factory.getMyShape("picture");
        jLayeredPane.add((Component) picture);
        
        hintText=new MyLabel(40,"hint");
        hintText.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hintText.setForeground(Color.white);
        hintText.setBounds(100, 470, 400, 100);
        jLayeredPane.add(hintText);
        
        this.add(jLayeredPane);
        jLayeredPane.add(background);
        
    }
    
    public void changeText(String s)
    {
        password.draw(s,0,0);
    }
    
    public void changePicture(int index)
    {
        picture.draw(Integer.toString(index),0,0);
    }
    
    public void paintButton(int index)
    {
        abutton[index].draw("",-100,-100);
    }
    
    public void refreshButtons()
    {
        for(int i=0;i<=25;i++)
        {
            abutton[i].draw("", 1, 1);
        }
    }
    
    public void repaint(String s)
    {
        changePicture(0);
        changeText(s);
        refreshButtons();
    }
    
    
  /*  
    public void addButtonListener(ActionListener a)
    {
        for(int i=0;i<=25;i++)
        {
            abutton[i].addActionListener(a);
            
        }
    }
    
*/
}
