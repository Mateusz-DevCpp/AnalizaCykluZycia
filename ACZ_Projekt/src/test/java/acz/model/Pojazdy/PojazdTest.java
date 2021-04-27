/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acz.model.Pojazdy;

import acz.model.Napedy.Mechaniczny;
import acz.model.Napedy.Naped;
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
public class PojazdTest {
    
    public PojazdTest() {
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

    @Test
    public void testMain() {
        
        System.out.println("test_Main");
        System.out.println("----------=----------=----------=----------=----------=----------");

        Pojazd p = new Osobowy(new Mechaniczny(100, 10, 1), "PL 123", 125, 1000, 5);
        System.out.println(p.toString());
        
        p = null;
        p = new Transportowy(new Mechaniczny(100, 10, 1), "PL 123", 125, 1000, 2, 1000);
        System.out.println(p.toString());
        
        p = null;
        p = new Motor(new Mechaniczny(100, 10, 1), "PL 123", 125, 1000);
        System.out.println(p.toString());
        
        p = null;
        p = new Rower(new Mechaniczny(100, 10, 1), "PL 123", 125, 1000);
        System.out.println(p.toString());
        
        System.out.println("----------=----------=----------=----------=----------=----------");
    }
    
}
