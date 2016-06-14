
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class LogInPanel extends JLayeredPane implements PanelInterface{
    
    private JLabel background;
    private JLabel title;
    private JLabel nameLabel;
    public JTextField nameField;
    public JButton goBackButton;
    public JButton submitButton;
    
    public LogInPanel()
    {
        initialize();
    }
    
    public void initialize()
    {
        
        this.setSize(400,200);
        this.setLayout(null);
        
        //tworzenie tla
        background=new JLabel();
        background.setIcon(new javax.swing.ImageIcon("background-header.jpg"));
        background.setBounds(0,0,400,200);
        
        
        
        //tworzenie tytulowego napisu
        title=new MyLabel(24,"Please type your name");
        this.add(title);
        title.setBounds(40, 0, 300, 48);
        
        //tworzenie labela z nazwa
        nameLabel=new MyLabel(24,"NAME:");
        nameLabel.setForeground(new java.awt.Color(6, 136, 6));
        this.add(nameLabel);
        nameLabel.setBounds(60, 45, 110, 50);
        
        //tworzenie textfielda na imie
        nameField = new JTextField();
        nameField.setBackground(new java.awt.Color(223, 255, 185));
        nameField.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        this.add(nameField);
        nameField.setBounds(170, 50, 170, 40);
        
        //tworzenie guzika back
        goBackButton=new MyButton(24,"BACK");
        this.add(goBackButton);
        goBackButton.setBounds(50, 120, 130, 40);
        
        //tworzenie guzika submit
        submitButton=new MyButton(24,"SUBMIT");
        this.add(submitButton);
        submitButton.setBounds(220, 120, 130, 40);
        
        
        //dodawanie tla do panelu
        this.add(background);
    }
    
    
    
    
}
