
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class MainClass {
     public static void main(String args []) 
    {
        //ustawienie muzyki
        //Background_music music1=Background_music.getInstanceOfMusic();
       
        MenuController m=new MenuController(new Start(),new LogIn(),new Player(),new MathFramework(new MathGameLogic(),new MathGameView()));
        //m.control();
//new HighScores("SDASDASDASDASD");
        
        
        /*
        MathGameView v=new  MathGameView();
        v.setVisible(true);
        */
        
        }
    }

