
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

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
    //ArrayList<String> s;
    DefaultListModel<String> model ;
    public HighscoresData hsData;
    //public String [][] tab;
    
    
    
    public HighScores(ArrayList<String> s)
    {
        this.setSize(400,600);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("HIGH SCORES");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        background=new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/images.jpg")));//new javax.swing.ImageIcon("/images.jpg"));
        background.setBounds(0, 0, 400, 600);
        
        
        model = new DefaultListModel<>();
        hsData=new HighscoresData();
        hsData.s=new ArrayList<String>(s);
        hsData.readData();
        hsData.sortData();
        
        //tab=new String[this.s.size()][2];
        
        
        
        HSList = new JList<>( model );
        HSList.setBackground(new Color(227, 253, 222));
        HSList.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        HSList.setFocusable(false);
        HSList.setRequestFocusEnabled(false);
        HSList.setEnabled(false);
        DefaultListCellRenderer renderer = (DefaultListCellRenderer) HSList.getCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        addContent();
        
       /* 
       for(int i=0;i<s.size();i++)
       {
           //a.add(String.format("%1$12s%2$20s",tab[i][0],tab[i][1]));
           System.out.println(s.get(i));
       }*/
        
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
        //String lines[] = s.split("\\r?\\n");
        for(int i=0;i<hsData.s.size();i++)
        {
            model.addElement(hsData.s.get(i));
        }
        
    }
    
    void addListener(ActionListener a)
    {
        backButton.addActionListener(a);
    }
    
    
    
    
}
