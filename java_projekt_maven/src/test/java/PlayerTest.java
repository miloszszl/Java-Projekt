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
public class PlayerTest {
    
    public PlayerTest() {
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

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        
        System.out.println("getName");
        
        Player instance = new Player();
        instance.setName("Milosz");
        String expResult = "Milosz";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getScore method, of class Player.
     */
    @Test
    public void testGetScore() {
        
        System.out.println("getScore");
        
        Player instance = new Player();
        instance.setScore(20);
        int expResult = 20;
        int result = instance.getScore();
        assertEquals(expResult, result);

    }
    
}
