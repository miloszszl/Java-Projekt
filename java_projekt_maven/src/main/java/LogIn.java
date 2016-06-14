
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
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
public class LogIn extends JFrame{
    
    public LogInPanel logInPanel;
    public ChoicePanel choicePanel;
    public JPanel panelContainer;
    public CardLayout card ;
    public LogIn()
    {
        initialize();
        
    }
    
    void initialize()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Please write your name");
        
        card = new CardLayout();
        logInPanel=new LogInPanel();  
        choicePanel=new ChoicePanel();
        panelContainer=new JPanel();
        panelContainer.setLayout(card);
        panelContainer.add(logInPanel,"login");
        panelContainer.add(choicePanel,"choice");
        card.show(panelContainer,"login");
        this.add(panelContainer);
        
        
        this.setVisible(false);
    }
    
    public void addListeners(ActionListener a,ActionListener b,ActionListener c)
    {
        logInPanel.goBackButton.addActionListener(a);
        logInPanel.submitButton.addActionListener(b);
        choicePanel.startButton.addActionListener(c);
    }
    
    
}
