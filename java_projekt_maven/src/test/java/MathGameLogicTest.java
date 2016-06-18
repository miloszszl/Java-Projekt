/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miłosz
 */
public class MathGameLogicTest {
    
    public MathGameLogicTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testCreateRandomNumbers() {
        
        System.out.println("createRandomNumbers");
        MathGameLogic instance = new MathGameLogic();
        for(int i=0;i<5000;i++)
        {
            instance.createRandomNumbers();
            if(instance.num==2)
            {
               assertNotEquals("dividing by zero problem",instance.second, 0); 
               assertEquals("something is wrong with integral quotient",instance.first%instance.second, 0);
            }
            
        }
        
        
        
    }

    
}
