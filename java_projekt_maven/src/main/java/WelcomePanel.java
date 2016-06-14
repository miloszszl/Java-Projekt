
import java.awt.Font;
import java.awt.event.ActionListener;
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
public class WelcomePanel extends JLayeredPane implements PanelInterface{
    
    public JLabel background;
    public JLabel title;
    public JLabel choose;
    public JButton startButton;
    public JButton exitButton;
    public JButton authorButton;
    public JButton rankButton;
    
    public WelcomePanel()
    {
        initialize();  
    }
    @Override
    public void initialize()
    {
        this.setSize(600,430);
        this.setLayout(null);
       
        //tworzenie tła
        background=new MyBackgroundLabel1();
        
        //tworzenie okna z napisem WELCOME
        title=new MyLabel(36,"WELCOME");
        title.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 51)));
        title.setPreferredSize(new java.awt.Dimension(150, 50));
        this.add(title);
        title.setBounds(0, 0, 280, 70);
        
        //napis choose your destiny
        choose=new MyLabel(36,"Chose your destiny");
        this.add(choose);
        choose.setBounds(20, 270, 330, 50);
        
        //przycisk start
        startButton=new MyButton(36,"Start");
        this.add(startButton);
        startButton.setBounds(410, 230, 140, 90);
        
        //przycisk exit
        exitButton=new MyButton(24,"EXIT");
        this.add(exitButton);
        exitButton.setBounds(30, 340, 170, 40);
        
        //przycisk autora
        authorButton=new MyButton(24,"AUTHOR");
        this.add(authorButton);
        authorButton.setBounds(215, 340, 170, 40);
        
        //przycisk rankingu
        rankButton=new MyButton(24,"Rank");
        this.add(rankButton);
        rankButton.setBounds(400, 340, 170, 40);
        
        
        //ustawianie widzialnosci panelu
        this.add(background);
    }
   /* 
    public void addAuthorButtonListener(ActionListener a)
    {
        authorButton.addActionListener(a);
    }
    
    void addExitButtonListener(ActionListener a)
    {
        exitButton.addActionListener(a);
    }
    
    void addStartButtonListener(ActionListener a)
    {
        startButton.addActionListener(a);
    }
    */
}
