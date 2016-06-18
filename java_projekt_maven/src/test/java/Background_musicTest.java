/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
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
public class Background_musicTest {
    
    public Background_musicTest() {
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
     * Test of init method, of class Background_music.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("Background music test if file exists");
        File file = new File("ChillingMusic.wav");
        assertTrue("bgmusic -something is wrong",file.exists());   
       
    }

    /**
     * Test of getInstanceOfMusic method, of class Background_music.
     */
    @Test
    public void testGetInstanceOfMusic() {
        System.out.println("getInstanceOfMusic");
        
        Background_music unexpectedResult = null;
        Background_music result = Background_music.getInstanceOfMusic();
        assertNotEquals("bgmusic -something is wrong",unexpectedResult, result);
        
 
    }
    
}
