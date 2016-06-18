
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
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
public class MathPanel extends JLayeredPane implements PanelInterface{
    
    
    private JLabel background;
    public JLabel title;
    public JLabel time;
    public JLabel seconds;
    public JLabel one;
    public JLabel two;
    public JLabel sign;
    public JTextField solution;
    public JSeparator separator;
    public JLabel scoreLabel;
    public JLabel scorePoints;
    
    public MathPanel()
    {
        
        initialize();
        
        this.add(background);
    }
    
    
    public void initialize()
    {
        this.setLayout(null);
        this.setSize(400,300);
        
        background=new JLabel();
        
        background.setIcon(new ImageIcon(getClass().getResource("Green-and-black-blackboards-chalkboards-set.jpg")));//new javax.swing.ImageIcon("Green-and-black-blackboards-chalkboards-set.jpg"));
        background.setBounds(0, 0, 400, 300);
        
        
        title=new MyLabel(24,"SLVE THIS!");
        this.add(title);
        title.setBounds(90, 0, 220, 50);
           
        solution=new JTextField();
        solution.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        solution.setHorizontalAlignment(JTextField.RIGHT);
        solution.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48));
        this.add(solution);
        solution.setBounds(190, 180, 150, 50);
        
        separator=new JSeparator();
        this.add(separator);
        separator.setBounds(50, 170, 290, 10);
        
        sign=new JLabel();
        sign.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48));
        sign.setForeground(new java.awt.Color(255, 255, 255));
        sign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sign.setText("+");
        this.add(sign);
        sign.setBounds(70, 120, 50, 40);
        
        one=new JLabel();
        one.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); 
        one.setForeground(new java.awt.Color(255, 255, 255));
        one.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        one.setText("one");
        this.add(one);
        one.setBounds(190, 80, 140, 40);

        two=new JLabel();
        two.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36));
        two.setForeground(new java.awt.Color(255, 255, 255));
        two.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        two.setText("two");
        this.add(two);
        two.setBounds(200, 120, 130, 40);
        
        time=new JLabel();
        time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("TIME");
        this.add(time);
        time.setBounds(0, 0, 70, 30);
        
        seconds=new JLabel();
        seconds.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        seconds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seconds.setText("00");
        this.add(seconds);
        seconds.setBounds(20, 10, 30, 40);
        
        
        
        scoreLabel=new JLabel();
        scoreLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("SCORE");
        this.add(scoreLabel);
        scoreLabel.setBounds(320, 0, 70, 30);

        scorePoints=new JLabel();
        scorePoints.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        scorePoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scorePoints.setText("00");
        this.add(scorePoints);
        scorePoints.setBounds(340, 10, 30, 40);
        
        
    }
     
    
   
}
