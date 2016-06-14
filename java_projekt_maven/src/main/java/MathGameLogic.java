
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Miłosz
 */
public class MathGameLogic extends AbstractGame {
    boolean finished=false;
    int first = 0, second = 0;
    int answer = 0;
    int correct = 0;
    int num = 0;
    private int flag = 1;
    Random generator;
    Thread timeThread;

    public MathGameLogic() {
        score = 0;
        time = 20;
        generator = new Random();
    }

    
    
    public String createOperator1() {
        
        switch (num) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2:
                return ":";
            case 3:
                return "*";
            case 4:
                return "%";
        }
        return "";
        
    }

    public void calculateCorrect() {
        switch (num) {
            case 0:
                correct = first + second;
                break;
            case 1:
                correct = first - second;
                break;
            case 2:
                correct = first / second;
                break;
            case 3:
                correct = first * second;
                break;
            case 4:
                correct = first % second;
                break;
        }

    }

    public void createRandomNumbers() {
        
        num = (generator.nextInt(5)) ;
        
        if(num==3 || num==4 ||num==2)
        {
        first = (generator.nextInt()) % (score/10 + 3) + 1;
        do
        {
            second = (generator.nextInt()) % (score/10 + 3) + 1;
        }while(second==0);
        }
        else
        {
        first = (generator.nextInt()) % (score + 10) + 1;
        second = (generator.nextInt()) % (score + 10) + 1; 
        }
        
        
    }

    public boolean ifCorrect() {
        if (correct == answer) {
            time += 5;
            score+=1;
            return true;
        } else {
            time -= 2;
            return false;
        }
    }

    public boolean ifEnd() {
        if (time <= 0) {
            return true;
        } else {
            return false;
        }
    }

   

    class TimeThread extends Thread {
        public void run() {
            while (!finished) {
                try {
                    Thread.sleep(1000);                 //1000 milliseconds is one second.
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                time -= 1;
            }

        }
    }

    public String getStrTime() {
        return Integer.toString(time);
    }
}
