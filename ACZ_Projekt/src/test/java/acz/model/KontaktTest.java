package acz.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KontaktTest {
    
    public KontaktTest() {
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
    public void testConstructorSetterGetter() 
    {
        System.out.println("test_Constructor_Setter_Getter");
        
        String email = "example@email.com";
        String nr_telefonu = "123456789";
        
        String change = "_plus";
        
        Kontakt kontakt = new Kontakt(email, nr_telefonu);
        
        assertEquals(kontakt.getEmail(), email);
        assertEquals(kontakt.getNrTelefonu(), nr_telefonu);
        
        kontakt.setEmail(email+change);
        kontakt.setNrTelefonu(nr_telefonu+change);
        
        assertEquals(kontakt.getEmail(), email+change);
        assertEquals(kontakt.getNrTelefonu(), nr_telefonu+change);
    }
    
    @Test
    public void testMain() 
    {
        System.out.println("test_Main");
        System.out.println("----------=----------=----------=----------=----------=----------");
        
        Kontakt kontakt = new Kontakt("example@email.com", "123456789");
        System.out.println(kontakt.toString());
        
        System.out.println("----------=----------=----------=----------=----------=----------");
    }
}
