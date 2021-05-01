/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acz.model.Napedy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mateusz
 */
public class NapedTest {
    
    public NapedTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPrzebieg method, of class Naped.
     */
    @Test
    public void testGetPrzebieg() {
        System.out.println("getPrzebieg");
        Naped instance = new Mechaniczny(100, 200, 300);
        assertEquals(instance.getPrzebieg(), 300);
        
        instance = new Fizyczny();
        assertEquals(instance.getPrzebieg(), 0);
    }
    
    @Test
    public void testAddPrzebieg() {
        System.out.println("getPrzebieg");
        Naped instance = new Mechaniczny(100, 200, 300);
        assertEquals(instance.getPrzebieg(), 300);
        instance.addPrzebieg(25);
        assertEquals(instance.getPrzebieg(), 325);
        
        instance = new Fizyczny();
        assertEquals(instance.getPrzebieg(), 0);
        instance.addPrzebieg(25);
        assertEquals(instance.getPrzebieg(), 0);
    }

    @Test
    public void testGetMoc() {
        System.out.println("testMoc");
        Naped instance = new Mechaniczny(100, 200, 300);
        assertEquals(instance.getMoc(), 100);
                
        instance = new Fizyczny();
        assertEquals(instance.getMoc(), 0);
    }

    @Test
    public void testGetZuzycie_paliwa() {
        System.out.println("getZuzycie_paliwa");
        Naped instance = new Mechaniczny(100, 200, 300);
        assertEquals(instance.getZuzycie_paliwa(), 200);
        
        instance = new Fizyczny();
        assertEquals(instance.getZuzycie_paliwa(), 0);
    }

    @Test
    public void testGetType() {
        System.out.println("getType");
        Naped instance = new Mechaniczny(100, 200, 300);
        assertEquals(instance.getType(), "Mechaniczny");
        
        instance = new Fizyczny();
        assertEquals(instance.getType(), "Fizyczny");
    }
    
    @Test
    public void testToString() {
        System.out.println("getType");
        Naped instance = new Mechaniczny(100, 200, 300);
        System.out.println(instance.toString());
        
        instance = new Fizyczny();
        System.out.println(instance.toString());
    }
    
    
}
