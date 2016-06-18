
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
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
public class HangmanLogic {
    
    public boolean correct=true;
    public int score;
    public ArrayList  <String> words;
    public ArrayList <String> hints;
    public ArrayList <Integer> usedIndexes;
    public char [] characters;
    public int mistakes;
    Random generator;
    public int indexOfLetter;
    StringBuilder encrypted;
    public int index;
    public int bestScore;
    public IO file;
    public int points;
    
    
    public HangmanLogic()
    {
        bestScore=0;
        this.characters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        hints=new ArrayList<String>();
        usedIndexes=new ArrayList<Integer>();
        score=0;
        mistakes=0;
        generator=new Random();
        
        loadWords();
        points=2;
      /*  hints.add("das2rw23r");
        hints.add("das2rw23r");
        hints.add("das2rw23r");
        hints.add("das2rw23r");
        hints.add("das2rw23r");
        hints.add("324234");
        hints.add("das2rw23r");*/
        
    }
    
    
    public void loadWords() 
    {
        
        file=new IO();
        words=new ArrayList<String>(file.readPasswords());
        //System.out.println(words.get(0));
        file=null;
       
    }
    
    public StringBuilder encrypt(String s)
    {
        encrypted=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            encrypted.append('-');
        }
        return encrypted;   
    }
    
    public int randWordAndHint()
    {    
        int flag;
        int index;
            do
            {
            flag=1;
            index=generator.nextInt(words.size());
            //System.out.println(index);
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
    
    public void checkWord()
    {
        if(words.get(index).indexOf(characters[indexOfLetter])==-1)
        {
            correct=false;
        }
        else
        {
            correct=true;
        }
    }
    
    public String getHint()
    {
        //System.out.println(words.get(index).charAt(0));
        //return Character.toString(words.get(index).charAt(0))+"*"+Character.toString(words.get(index).charAt(words.get(index).length()));
     return ((words.get(index).charAt(0))+"*"+(words.get(index).charAt(words.get(index).length()-1))).toString();
    
    }
    
    public void decode()
    {
        char letter=characters[indexOfLetter];
        
        for(int i=0;i<encrypted.length();i++)
        {
            if(this.words.get(this.index).charAt(i)==letter)
            {
                this.encrypted.setCharAt(i, letter);
            }
        }
        
        
    }
    
    public boolean checkIfGuessed()
    {
            if(encrypted.indexOf("-")==-1)
            {
                return true;
            }
            else
            {
                return false;
            }
                
        
    }
    
}