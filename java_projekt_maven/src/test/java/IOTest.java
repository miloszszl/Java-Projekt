/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.util.ArrayList;
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
public class IOTest {

    public IOTest() {
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
     * Test of read method, of class IO.
     */
    @Test
    public void testRead() throws Exception {
        
        System.out.println("read");
        File file = new File("scores.txt");
        assertTrue("something is wrong", file.exists());

    }

    /**
     * Test of write method, of class IO.
     */
    /**
     * Test of readPasswords method, of class IO.
     */
    @Test
    public void testReadPasswords() {

        System.out.println("passwords");
        File file = new File("passwords.txt");
        assertTrue("something is wrong", file.exists());
    }

}
