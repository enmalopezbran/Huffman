/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enmalopezbran
 */
public class HuffmanTest {
    
    public HuffmanTest() {
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
     * Test of busquedaChar method, of class Huffman.
     */
    @Test
    public void testBusquedaChar() {
        System.out.println("busquedaChar");
        String input = "";
        Huffman instance = null;
        char expResult = ' ';
        char result = instance.busquedaChar(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frequencyTable method, of class Huffman.
     */
    @Test
    public void testFrequencyTable() {
        System.out.println("frequencyTable");
        String value = "";
        Huffman.frequencyTable(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAscii method, of class Huffman.
     */
    @Test
    public void testGetAscii() {
        System.out.println("getAscii");
        char substringValue = ' ';
        int expResult = 0;
        int result = Huffman.getAscii(substringValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nodeArrange method, of class Huffman.
     */
    @Test
    public void testNodeArrange() {
        System.out.println("nodeArrange");
        Huffman.nodeArrange();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTree method, of class Huffman.
     */
    @Test
    public void testCreateTree() {
        System.out.println("createTree");
        Nodo expResult = null;
        Nodo result = Huffman.createTree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
