
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
public class HangmanController extends Strategy{

    HangManView view;
    HangmanLogic model;
    int currentPicture = 0;
    boolean flag;
    boolean end;
    boolean returnedValue;
    boolean clicked;

    //int index;
    public HangmanController(HangManView view, HangmanLogic model) {
        this.model = model;
        this.view = view;
        view.addButtonListener(new AlphabetListener());
        view.hintText.addMouseListener(new HintListener());

    }

    public int getScoreAndEnd()
    {
        view.setVisible(false);
        return model.bestScore;
    }
    public int play() {

        model.bestScore = 0;
        int n = 0;
        model.score = 0;
        model.usedIndexes.clear();
        view.setVisible(true);

        do {
            clicked = false;
            end = false;
            currentPicture = 0;
            flag = false;
            model.correct = true;
            model.mistakes = 0;
            model.points = 2;

            model.index = model.randWordAndHint();
            StringBuilder word = model.encrypt(model.words.get(model.index));
            view.repaint(word);

            //iew.changeText(word);
            do {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            } while (end != true);
            
            Object[] options = {"Yes",
                "No, thanks"};
            Component frame = null;
            String output = Integer.toString(model.score);
            n = JOptionPane.showOptionDialog(frame,
                    "Your score: " + output + "\n"
                    + "Continue?",
                    "Question",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
            if (flag == false) {
                model.score = 0;
            }

            //System.out.println(model.score);
        } while (n == 0);

        return model.bestScore;
    }

    /*
    public static void main(String args[]) {
        new HangmanController(new HangManView(), new HangmanLogic());
    }
     */
    public class AlphabetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i <= 25; i++) {
                if (e.getSource() == view.abutton[i]) {
                    view.paintButton(i);
                    model.indexOfLetter = i;
                }
            }
            model.checkWord();

            if (model.correct == false) {
                currentPicture++;
                view.changePicture(currentPicture);
                model.mistakes += 1;
            } else {
                model.decode();
                view.changeText(model.encrypted);
                flag = model.checkIfGuessed();
            }

            if (model.bestScore < model.score) {
                model.bestScore = model.score;
            }
            
            if (model.checkMistakes() == false) {
                end = true;
                StringBuilder w=new StringBuilder(model.words.get(model.index));
                view.changeText(w);

            } else if (flag == true) {
                model.score += model.points;
                end = true;
                StringBuilder w=new StringBuilder(model.words.get(model.index));
                view.changeText(w);
            }

        }

    }

    public class HintListener implements MouseListener {

        @Override
        public void mousePressed(MouseEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (clicked == false) {
                view.changeHint(model.getHint());//Character.toString()
                model.points -= 1;
                clicked = true;
            }

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

}
