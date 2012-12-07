/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Administrador
 */
public class LocationTest {
   
    private static Location location;
    
    public LocationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Begin Location.class  Test");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finish Location.class  Test");
    }
    
    @Before
    public void setUp() {
        location = new Location("San martin - mendoza");
        location.setIdLocation(1);
    }
    
    @After
    public void tearDown() {
        location = null;
    }

    /**
     * Test of getIdLocation method, of class Location.
     */
    @Test(timeout=100)
    public void testGetIdLocation() {
        System.out.println("getIdLocation");
        Integer expResult = 1;
        Integer result = location.getIdLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdLocation method, of class Location.
     */
    @Test(timeout=100)
    public void testSetIdLocation() {
        System.out.println("setIdLocation");
        Integer idLocation = 3;
        Location location1 = new Location();
        location1.setIdLocation(idLocation);
        assertNotNull(location1.getIdLocation());
    }

    /**
     * Test of getName method, of class Location.
     */
    @Test(timeout=100)
    public void testGetName() {
        System.out.println("getName");
        String expResult = "San martin - mendoza";
        String result = location.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Location.
     */
    @Test(timeout=100)
    public void testSetName() {
        System.out.println("setName");
        Location location1 = new Location("Ciudad - mendoza");
        assertNotNull(location1.getName());
    }

    /**
     * Test of getUsers method, of class Location.
     */
    @Test(timeout=100)
    public void testGetUsers() {
        System.out.println("getUsers");
        Set expResult = new HashSet(0);
        Set result = location.getUsers();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsers method, of class Location.
     */
    @Test(timeout=100)
    public void testSetUsers() {
        System.out.println("setUsers");
        Set users = new HashSet(0);
        users.add(new User());
        Location location1 = new Location();
        location1.setUsers(users);
        assertNotNull(location1.getUsers());
    }

    /**
     * Test of getMessages method, of class Location.
     */
    @Test(timeout=100)
    public void testGetMessages() {
        System.out.println("getMessages");
        Set expResult = new HashSet(0);
        Set result = location.getMessages();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMessages method, of class Location.
     */
    @Test(timeout=100)
    public void testSetMessages() {
        System.out.println("setMessages");
        Set messages = new HashSet(0);
        messages.add(new Message());
        Location location1 = new Location();
        location1.setMessages(messages);
        assertNotNull(location1.getMessages());
    }
}
