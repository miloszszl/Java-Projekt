
import java.awt.event.ActionListener;
import javax.swing.JFrame;
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
public class MathGameView extends JFrame{
    
    public MathPanel mathPanel;
    
    
    public MathGameView()
    {
        mathPanel=new MathPanel();
        this.setSize(400,320);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Math game");
        this.add(mathPanel);
        
    }
    public String getSolution()
     {
         return mathPanel.solution.getText();
     }
    
   /* public void setText()
    {
        mathPanel.solution.setText("");
    }
    */
  
    
    public void update(String o,String t,String s,String score)
    {
        this.mathPanel.solution.setText("");
        this.mathPanel.one.setText(o);
        this.mathPanel.two.setText(t);
        this.mathPanel.sign.setText(s);
        this.mathPanel.scorePoints.setText(score);
    }
    
    
    public void updateTime(String tim)
    {
        this.mathPanel.seconds.setText(tim);
    }
    
     /*
    public static void main(String [] args)
    {
        MathFramework v=new MathFramework();
        //v.play();
    }
    */
    public void addListener(ActionListener a)
    {
        this.mathPanel.solution.addActionListener(a);
    }
}
