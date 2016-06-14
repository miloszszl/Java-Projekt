/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class ComponentFactory {

    public MyShape getMyShape(String componentName)
    {
        if(componentName=="button")
        {
            return new AlphabetButton();
        }
        else if(componentName=="password")
        {
            return new Password();
        }
        else if(componentName=="picture")
        {
            return new Picture();
        }
        else
        {
            return null;
        }
    }
    
}
