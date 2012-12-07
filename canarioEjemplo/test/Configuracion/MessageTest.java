/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import java.util.Date;
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
public class MessageTest {
    
     private static Location location;
     private static Topic topic;
     private static User user;
     private static Date date;
     private static Message ms;
    
    public MessageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Begin Message.class  Test");
        location = new Location("San martin - mendoza");
        location.setIdLocation(1);
        user = new User(location, "pepe", "123445", "pepe@gmail.com", "jose", "gomez");
        user.setIdUser(1);
        topic = new Topic("ciencia",0);
        topic.setIdTopic(1);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finish Message.class  Test");
        location = null;
        user = null;
        topic = null;
    }
    
    @Before
    public void setUp() {
        date = new Date();
        ms = new Message(topic, user, date, "Hola como estan yo muy bien", location);
        ms.setIdMessage(1);
    }
    
    @After
    public void tearDown() {
        date = null;
        ms = null;
    }

    /**
     * Test of getIdMessage method, of class Message.
     */
    @Test(timeout=100)
    public void testGetIdMessage() {
        System.out.println("getIdMessage");
        Integer expResult = 1;
        Integer result = ms.getIdMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdMessage method, of class Message.
     */
    @Test(timeout=100)
    public void testSetIdMessage() {
        System.out.println("setIdMessage");
        Integer idMessage = 3;
        Message ms1 = new Message();
        ms1.setIdMessage(idMessage);
        assertNotNull(ms1.getIdMessage());
    }

    /**
     * Test of getLocation method, of class Message.
     */
    @Test(timeout=100)
    public void testGetLocation() {
        System.out.println("getLocation");
        Location expResult = location;
        Location result = ms.getLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocation method, of class Message.
     */
    @Test(timeout=100)
    public void testSetLocation() {
        System.out.println("setLocation");
        Location location1 = new Location("Ciudad - mendoza");
        location1.setIdLocation(1);
        Message ms1 = new Message();
        ms1.setLocation(location1);
        assertNotNull(ms1.getLocation());
    }

    /**
     * Test of getTopic method, of class Message.
     */
    @Test(timeout=100)
    public void testGetTopic() {
        System.out.println("getTopic");
        Topic expResult = topic;
        Topic result = ms.getTopic();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTopic method, of class Message.
     */
    @Test(timeout=100)
    public void testSetTopic() {
        System.out.println("setTopic");
        Topic topic1 = new Topic("arte",2);
        Message ms1 = new Message();
        ms1.setTopic(topic1);
        assertNotNull(ms1.getTopic());
    }

    /**
     * Test of getUser method, of class Message.
     */
    @Test(timeout=100)
    public void testGetUser() {
        System.out.println("getUser");
        User expResult = user;
        User result = ms.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class Message.
     */
    @Test(timeout=100)
    public void testSetUser() {
        System.out.println("setUser");
        User user1 = new User(location, "juanito", "123a5", "juan@hotmail.com", "juan", "perez");
        Message ms1 = new Message();
        ms1.setUser(user1);
    }

    /**
     * Test of getDate method, of class Message.
     */
    @Test(timeout=100)
    public void testGetDate() {
        System.out.println("getDate");
        Date expResult = date;
        Date result = ms.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Message.
     */
    @Test(timeout=100)
    public void testSetDate() {
        System.out.println("setDate");
        Date date1 = new Date();
        Message ms1 = new Message();
        ms1.setDate(date1);
        assertNotNull(ms1.getDate());
    }

    /**
     * Test of getBody method, of class Message.
     */
    @Test(timeout=100)
    public void testGetBody() {
        System.out.println("getBody");
        String expResult = "Hola como estan yo muy bien";
        String result = ms.getBody();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBody method, of class Message.
     */
    @Test(timeout=100)
    public void testSetBody() {
        System.out.println("setBody");
        String body = "hola gente buen dia!!";
        Message ms1 = new Message();
        ms1.setBody(body);
        assertNotNull(ms1.getBody());
    }

    /**
     * Test of getReferences method, of class Message.
     */
    @Test(timeout=100)
    public void testGetReferences() {
        System.out.println("getReferences");
        Set expResult = new HashSet(0);
        Set result = ms.getReferences();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReferences method, of class Message.
     */
    @Test(timeout=100)
    public void testSetReferences() {
        System.out.println("setReferences");
        Set references = new HashSet(0);
        references.add(ms);
        Message ms1 = new Message();
        ms1.setReferences(references);
    }

    /**
     * Test of getMessageNotifications method, of class Message.
     */
    @Test(timeout=100)
    public void testGetMessageNotifications() {
        System.out.println("getMessageNotifications");
        Set expResult = new HashSet(0);
        Set result = ms.getMessageNotifications();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMessageNotifications method, of class Message.
     */
    @Test(timeout=100)
    public void testSetMessageNotifications() {
        System.out.println("setMessageNotifications");
        Set messageNotifications = new HashSet(0);
        messageNotifications.add(ms);
        Message ms1 = new Message();
        ms1.setMessageNotifications(messageNotifications);
    }
}
