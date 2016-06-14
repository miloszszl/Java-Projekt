
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Miłosz
 */
public class MenuController {

    int gameNumber = 0;
    int choice = 0;
    private Start bigView;     // big frame view
    private LogIn smallView;
    private Player myPlayer;
    MathFramework mathFramework;
    IO file;
    HighScores hs;

    public MenuController(Start View, LogIn View2, Player p, MathFramework mf) {
        this.bigView = View;
        this.bigView.addListeners(new AuthorListener(), new ExitListener(), new StartListener(), new GoBackListener(), new RankListener());

        this.smallView = View2;
        this.smallView.addListeners(new GoBackLogInListener(), new SubmitListener(), new StartChoiceListener());

        this.mathFramework = mf;

        myPlayer = p;

    }

    /* public void control()
    {
        if (choice > 0) {
                boolean t=mathFramework.play();
                if (t == false)
                {
                    mathFramework.view.setVisible(false);
                    bigView.setVisible(true);
                }
            }
        
       
    }*/
    class RankListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            file = new IO();
            try {
                hs = new HighScores(file.read());
                hs.addListener(new OkListener());

            } catch (IOException ex) {
                Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);

            }
            hs.setVisible(true);
            bigView.setVisible(false);
            file=null;
        }
    }

    class OkListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            
            hs.setVisible(false);
            hs=null;
            bigView.setVisible(true);
        }
    }

    class AuthorListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            bigView.card.show(bigView.panelContainer, "author");
        }
    }

    class ExitListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            bigView.dispatchEvent(new WindowEvent(bigView, WindowEvent.WINDOW_CLOSING));
        }
    }

    class StartListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            bigView.setVisible(false);
            smallView.setVisible(true);

        }
    }

    class GoBackListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            bigView.card.show(bigView.panelContainer, "welcome");
        }
    }

    class GoBackLogInListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            bigView.setVisible(true);
            smallView.setVisible(false);
        }
    }

    class SubmitListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String name = smallView.logInPanel.nameField.getText();
            myPlayer.setName(name);
            smallView.card.show(smallView.panelContainer, "choice");
        }
    }

    class StartChoiceListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            smallView.setVisible(false);
            choice = smallView.choicePanel.getSelected();

            Thread gameThread = new Thread() {
                @Override
                public void run() {
                    if (mathFramework.play() >0) {
                        myPlayer.setScore(mathFramework.logic.score);
                        mathFramework.view.setVisible(false);
                        bigView.setVisible(true);
                    }
                }
            };
            gameThread.start();

//control();
        }
    }

}
