
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class HighScores extends JFrame{
    
    private JButton backButton;
    private JLabel title;
    private JLayeredPane jLayeredPane;
    private JList<String> HSList;
    private JScrollPane jScrollPane;
    private JLabel background;
    String s="";
    DefaultListModel<String> model ;
    
    public HighScores(String s)
    {
        this.setSize(400,600);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("HIGH SCORES");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        background=new JLabel();
        background.setIcon(new javax.swing.ImageIcon("images.jpg"));
        background.setBounds(0, 0, 400, 600);
        
        this.s=s;
        model = new DefaultListModel<>();
        
        HSList = new JList<>( model );
        HSList.setBackground(new Color(227, 253, 222));
        HSList.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        HSList.setFocusable(false);
        HSList.setRequestFocusEnabled(false);
        HSList.setEnabled(false);
        
        addContent();
        
        jLayeredPane = new JLayeredPane();
        jLayeredPane.setSize(400,600);
        
        title = new MyLabel(24,"HIGH SCORES");
        jLayeredPane.add(title);
        title.setBounds(90,10, 213, 63);
        
        backButton= new MyButton(24,"OK");
        jLayeredPane.add(backButton);
        backButton.setBounds(150, 480, 100, 50);
        
        jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(HSList);
        jLayeredPane.add(jScrollPane);
        jScrollPane.setBounds(30, 80, 340, 350);

        this.add(jLayeredPane);
        jLayeredPane.add(background);
        //this.setVisible(true);
    }
    
    void addContent()
    {
        String lines[] = s.split("\\r?\\n");
        for(int i=0;i<lines.length;i++)
        {
            model.addElement(lines[i]);
        }
        
    }
    
    void addListener(ActionListener a)
    {
        backButton.addActionListener(a);
    }
    
    
}
