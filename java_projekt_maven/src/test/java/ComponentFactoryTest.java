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
public class ComponentFactoryTest {
    
    public ComponentFactoryTest() {
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
     * Test of getMyShape method, of class ComponentFactory.
     */
    @Test
    public void testGetMyShape() {
        System.out.println("getMyShape");
        
        ComponentFactory instance = new ComponentFactory();
        MyShape result = instance.getMyShape("a");
        assertEquals("Something is wrong",null, result);
        

    }
    
}
