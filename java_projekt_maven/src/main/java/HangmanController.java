/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class HangmanController {

    private HangManView view;
    private HangmanLogic model;

    public HangmanController(HangManView view, HangmanLogic model) {
        this.model = model;
        this.view = view;
        play();
    }

    public void play() {
        int flag = 1;
        view.setVisible(true);
        model.score = 0;
        model.mistakes = 0;
        
        int index;
        index=model.randWordAndHint();
        System.out.println(index);
        
        
        /*
        view.changeText(model.words.get(index));
        view.changePicture(index);
        */
        try {
            Thread.sleep(2000);                 //2000 milliseconds is one second.
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        view.paintButton(2);

        /*do {

        } while (flag == 1);*/
    }

    public static void main(String args[]) {
        new HangmanController(new HangManView(), new HangmanLogic());
    }

}
