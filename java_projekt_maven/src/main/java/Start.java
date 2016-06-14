
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
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
public class Start extends JFrame{
    
    JPanel panelContainer;
    WelcomePanel welcomePanel;
    AuthorPanel authorPanel;
    public CardLayout card;
    
    public Start()
    {
        this.setSize(600,430);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("My games");
        
        card=new CardLayout();
        authorPanel=new AuthorPanel();  
        welcomePanel=new WelcomePanel();
        panelContainer=new JPanel();
        panelContainer.setLayout(card);
        panelContainer.add(authorPanel,"author");
        panelContainer.add(welcomePanel,"welcome");
        card.show(panelContainer,"welcome");
        this.add(panelContainer);
        
        this.setVisible(true);
    }

    
    
    public void addListeners(ActionListener a,ActionListener b,ActionListener c,ActionListener d,ActionListener e)
    {
        welcomePanel.authorButton.addActionListener(a);
        welcomePanel.exitButton.addActionListener(b);
        welcomePanel.startButton.addActionListener(c);
        authorPanel.goBackButton.addActionListener(d);
        welcomePanel.rankButton.addActionListener(e);
    }
    
    
}
