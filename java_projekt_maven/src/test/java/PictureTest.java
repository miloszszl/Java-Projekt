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
public class PictureTest {

    public PictureTest() {
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
     * Test of draw method, of class Picture.
     */
    @Test
    public void testDraw() {
        System.out.println("hangman pictures");

        for (int i = 0; i <= 6; i++) {
            File file = new File("indeks" + i + ".png");
            assertTrue("something is wrong", file.exists());
        }

    }

}
