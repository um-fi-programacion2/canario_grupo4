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
public class TopicTest {
    
     private static Location location;
     private static Topic topic;
     private static User user;
     private static Date date;
     private static Message ms;
     private Set messages = new HashSet(0);

    
    public TopicTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Begin Topic.class  Test");
        location = new Location("San martin - mendoza");
        location.setIdLocation(1);
        user = new User(location, "pepe", "123445", "pepe@gmail.com", "jose", "gomez");
        user.setIdUser(1);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finish Topic.class  Test");
        location = null;
        user = null;
    }
    
    @Before
    public void setUp() {
        date = new Date();
        topic = new Topic("ciencia",0);
        topic.setIdTopic(1);
        ms = new Message(topic, user, date, "Hola como estan yo muy bien", location);
        ms.setIdMessage(1);
        messages.add(ms);
        topic.setMessages(messages);
    }
    
    @After
    public void tearDown() {
        date = null;
        ms = null;
        messages = null;
        topic = null;
    }

    /**
     * Test of getIdMessage method, of class Message.
     */
    @Test(timeout=100)
    public void testGetIdTopic() {
        System.out.println("getIdTopic");
        Integer expResult = 1;
        Integer result = topic.getIdTopic();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdTopic method, of class Topic.
     */
    @Test(timeout=100)
    public void testSetIdTopic() {
        System.out.println("setIdTopic");
        Integer idTopic = 2;
        Topic topic1 = new Topic();
        topic1.setIdTopic(idTopic);
        assertNotNull(topic1.getIdTopic());
    }

    /**
     * Test of getName method, of class Topic.
     */
    @Test(timeout=100)
    public void testGetName() {
        System.out.println("getName");
        String expResult = "ciencia";
        String result = topic.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Topic.
     */
    @Test(timeout=100)
    public void testSetName() {
        System.out.println("setName");
        String name = "arte";
        Topic topic1 = new Topic();
        topic1.setName(name);
        assertNotNull(topic.getName());
    }

    /**
     * Test of getCounter method, of class Topic.
     */
    @Test(timeout=100)
    public void testGetCounter() {
        System.out.println("getCounter");
        int expResult = 0;
        int result = topic.getCounter();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCounter method, of class Topic.
     */
    @Test(timeout=100)
    public void testSetCounter() {
        System.out.println("setCounter");
        int counter = 3;
        Topic topic1 = new Topic();
        topic1.setCounter(counter);
    }

    /**
     * Test of getMessages method, of class Topic.
     */
    @Test(timeout=100)
    public void testGetMessages() {
        System.out.println("getMessages");
        Set expResult = messages;
        Set result = topic.getMessages();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMessages method, of class Topic.
     */
    @Test(timeout=100)
    public void testSetMessages() {
        System.out.println("setMessages");
        Set messages1 = new HashSet(0);
        Topic topic1 = new Topic();
        topic1.setMessages(messages1);
        assertNotNull(topic1.getMessages());
    }
}
