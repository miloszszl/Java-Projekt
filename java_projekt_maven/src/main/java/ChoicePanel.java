
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class ChoicePanel extends JLayeredPane implements PanelInterface{

    private JLabel background;
    private JLabel title;
    public JButton startButton;
    private ButtonGroup radioGroup;
    public JRadioButton mathGame;
    private JRadioButton Game2;
    private JRadioButton Game3;
    
    public int getSelected()
    {
        if(mathGame.isSelected())
        {
            return 1;
        }
        else if(Game2.isSelected())
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }
    
    public ChoicePanel()
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
        
        //tworzenie tytulu
        title=new MyLabel(24,"Chose game");
        this.add(title);
        title.setBounds(40, 0, 300, 48);
        
        //tworzenie guzika startu
        startButton=new MyButton(24,"START");
        this.add(startButton);
        startButton.setBounds(130, 120, 140, 40);
        
        //tworzenie radio buttonow
        radioGroup = new ButtonGroup();
        
        mathGame=new JRadioButton();
        mathGame.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        mathGame.setText("Math");
        mathGame.setOpaque(false);
        radioGroup.add(mathGame);
        this.add(mathGame);
        mathGame.setBounds(10, 70, 110, 30);
        
        Game2=new JRadioButton();
        Game2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Game2.setText("Game2");
        Game2.setOpaque(false);
        radioGroup.add(Game2);
        this.add(Game2);
        Game2.setBounds(140, 70, 110, 30);
        
        Game3=new JRadioButton();
        Game3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Game3.setText("Game3");
        Game3.setOpaque(false);
        radioGroup.add(Game3);
        this.add(Game3);
        Game3.setBounds(280, 70, 110, 30);
        
        this.add(background);
    }
    
    
    
}
