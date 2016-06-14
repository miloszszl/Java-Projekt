
import javax.swing.JButton;
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
public class AuthorPanel extends JLayeredPane implements PanelInterface{
    
    private JLabel background;
    private JLabel author;
    public JButton goBackButton;
    
    public AuthorPanel()
    {
           initialize();     
    }
    
    
    public void initialize()
    {
        this.setSize(600,430);
        this.setLayout(null);
        
        //tworzenie tla
        background=new MyBackgroundLabel1();
        
        
        //tworzenie napisu z imieniem i nazwiskiem
        author=new MyLabel(28,"AUTHOR: Miłosz Szlachetka");
        this.add(author);
        author.setBounds(150, 280, 450, 60);
        
        //tworzenie guzika powrotu
        goBackButton=new MyButton(24,"BACK");
        this.add(goBackButton);
        goBackButton.setBounds(20, 330, 120, 50);
        
        
        this.add(background);
    }
    
}
