
import java.util.ArrayList;
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
public class HangmanLogic {
    
    public int score;
    public ArrayList  <String> words;
    public ArrayList <String> hints;
    public ArrayList <Integer> usedIndexes;
    public int mistakes;
    Random generator;
    public HangmanLogic()
    {
        
        words=new ArrayList<String>();
        hints=new ArrayList<String>();
        usedIndexes=new ArrayList<Integer>();
        score=0;
        mistakes=0;
        generator=new Random();
        words.add("asdsdads");
        words.add("wqeqweqw");
        hints.add("das2rw23r");
        hints.add("324234");
    }
    
    
    public void renewValues()
    {
        mistakes=0;
        score=0;
        usedIndexes.clear();
    }
    
    public int randWordAndHint()
    {    
        int flag=1;
        int index;
            do
            {
            index=generator.nextInt(words.size());
                for(int i=0;i<usedIndexes.size();i++)
                {
                    if(index==usedIndexes.get(i))
                    {
                        flag=0;
                    }
                }
            }while(flag==0);
            
            usedIndexes.add(index);
        return index;
    }
    
    public void addPoints()
    {
        score+=1;
    }
    
    public boolean checkMistakes()
    {
        if (mistakes>=6)
            return false;
        else
            return true;
    }
    
    
}