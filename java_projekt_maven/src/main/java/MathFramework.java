
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Miłosz
 */
public class MathFramework extends Strategy{

    boolean good = false;
    int flag = 1;
    public MathGameLogic logic;//= new MathGameLogic();
    public MathGameView view;//= new MathGameView();

    public MathFramework(MathGameLogic logic, MathGameView view) {
        this.logic = logic;
        this.view = view;
        this.view.addListener(new SubmitActionListener());
        //play();
    }

    
    public int getScoreAndEnd()
    {
        view.setVisible(false);
        return logic.bestScore;
    }
    
    public int play() {
        logic.bestScore=0;
        view.setVisible(true);
        int n;
        do {
            view.mathPanel.solution.setFocusable(false);
            logic.time = 20;
            logic.timeThread = logic.new TimeThread();
            logic.finished = false;
            logic.score=0;
            view.mathPanel.title.setForeground(new java.awt.Color(0, 0, 0));
            n = 0;
            flag = 1;
            if (flag == 1) {
                view.mathPanel.title.setText("Ready?");
                try {
                    Thread.sleep(2000);                 //2000 milliseconds is one second.
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                view.mathPanel.title.setText("Go");

                flag = 0;
            }
            view.mathPanel.solution.setFocusable(true);
            logic.timeThread.start();

            logic.createRandomNumbers();
            view.update(Integer.toString(logic.first), Integer.toString(logic.second), logic.createOperator1(), Integer.toString(logic.score));

            do {
                view.updateTime(logic.getStrTime());
            } while (!logic.ifEnd());

            view.updateTime(logic.getStrTime());
            view.mathPanel.title.setForeground(new java.awt.Color(0, 0, 255));
            view.mathPanel.title.setText("GAME OVER");
            logic.finished = true;
            view.mathPanel.solution.setFocusable(false);

            Object[] options = {"Yes",
                "No, thanks"};
            Component frame = null;
            String output = Integer.toString(logic.score);
            n = JOptionPane.showOptionDialog(frame,
                    "Your score: " + output + "\n"
                    + "Do you want to continue?",
                    "Question",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);

        } while (n == 0);
        
        return logic.bestScore;
    }

    class SubmitActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String ans = view.mathPanel.solution.getText();
            logic.calculateCorrect();
            try {
                logic.answer = Integer.parseInt(ans);
                
            } catch (NumberFormatException ex) 
            {
                logic.answer=-Integer.MAX_VALUE;
            }

           good = logic.ifCorrect();
           
            if(logic.bestScore<logic.score)
                    logic.bestScore=logic.score;
            
            if (good == false) {
                view.mathPanel.title.setForeground(new java.awt.Color(255, 0, 0));
                view.mathPanel.title.setText("WRONG!");
            } else {
                view.mathPanel.title.setForeground(new java.awt.Color(0, 255, 0));
                view.mathPanel.title.setText("CORRECT!");
            }
            logic.createRandomNumbers();
            view.update(Integer.toString(logic.first), Integer.toString(logic.second), logic.createOperator1(), Integer.toString(logic.score));
            
        }

    }
}
