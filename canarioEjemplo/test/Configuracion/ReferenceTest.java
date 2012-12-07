/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import java.util.Date;
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
public class ReferenceTest {
    
    private static Location location;
     private static Topic topic;
     private static User user;
     private static User user1;
     private static Date date;
     private static Message ms;
     private static Reference rf;
    
    public ReferenceTest() {
    }
    
     @BeforeClass
    public static void setUpClass() {
        System.out.println("Begin Reference.class  Test");
        location = new Location("San martin - mendoza");
        location.setIdLocation(1);
        user = new User(location, "pepe", "123445", "pepe@gmail.com", "jose", "gomez");
        user.setIdUser(1);
        user1 = new User(location, "juanito", "123a5", "juan@hotmail.com", "juan", "perez");
        user1.setIdUser(2);
        topic = new Topic("ciencia",0);
        topic.setIdTopic(1);
        date = new Date();
        ms = new Message(topic, user, date, "Hola como estan yo muy bien", location);
        ms.setIdMessage(1);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finish Reference.class  Test");
        location = null;
        user = null;
        user1 = null;
        topic = null;
        date = null;
        ms = null;
    }
    
    @Before
    public void setUp() {
        rf = new Reference(user1,ms);
        rf.setIdReference(1);
    }
    
    @After
    public void tearDown() {
        rf = null;
    }

    /**
     * Test of getIdReference method, of class Reference.
     */
    @Test(timeout=100)
    public void testGetIdReference() {
        System.out.println("getIdReference");
        Integer expResult = 1;
        Integer result = rf.getIdReference();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdReference method, of class Reference.
     */
    @Test(timeout=100)
    public void testSetIdReference() {
        System.out.println("setIdReference");
        Integer idReference = 2;
        Reference rf1 = new Reference();
        rf1.setIdReference(idReference);
        assertNotNull(rf1.getIdReference());
    }

    /**
     * Test of getUser method, of class Reference.
     */
    @Test(timeout=100)
    public void testGetUser() {
        System.out.println("getUser");
        User expResult = user1;
        User result = rf.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class Reference.
     */
    @Test(timeout=100)
    public void testSetUser() {
        System.out.println("setUser");
        User user2 = new User();
        Reference rf1 = new Reference();
        rf1.setUser(user2);
        assertNotNull(rf1.getUser());
    }

    /**
     * Test of getMessage method, of class Reference.
     */
    @Test(timeout=100)
    public void testGetMessage() {
        System.out.println("getMessage");
        Message expResult = ms;
        Message result = rf.getMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMessage method, of class Reference.
     */
    @Test(timeout=100)
    public void testSetMessage() {
        System.out.println("setMessage");
        Message ms1 = new Message();
        Reference rf1 = new Reference();
        rf1.setMessage(ms1);
        assertNotNull(rf1.getMessage());
    }
}
