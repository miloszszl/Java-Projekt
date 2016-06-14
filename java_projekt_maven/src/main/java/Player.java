/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class Player {
    
    private String name;
    int score;
    
    public Player()
    {
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getScore()
    {
        return this.score;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setScore(int score)
    {
        this.score=score;
    }

}
