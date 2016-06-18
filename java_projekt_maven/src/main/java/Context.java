/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class Context {
    private Strategy strategy;
    
    public Context(Strategy strategy)
    {
        this.strategy=strategy;
    }
    
    public int executePlay()
    {
        return strategy.play();
    }
    
    public int executeEnd()
    {
        return strategy.getScoreAndEnd();
    }
    
}
