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
public class MessageNotificationTest {
    
    private static Location location;
     private static Topic topic;
     private static User user;
     private static Date date;
     private static Message ms;
     private static MessageNotification msn;
    
    public MessageNotificationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Begin MessageNotification.class  Test");
        location = new Location("San martin - mendoza");
        location.setIdLocation(1);
        user = new User(location, "pepe", "123445", "pepe@gmail.com", "jose", "gomez");
        user.setIdUser(1);
        topic = new Topic("ciencia",0);
        topic.setIdTopic(1);
        date = new Date();
        ms = new Message(topic, user, date, "Hola como estan yo muy bien", location);
        ms.setIdMessage(1);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finish MessageNotification.class  Test");
        location = null;
        user = null;
        topic = null;
        ms = null;
    }
    
    @Before
    public void setUp() {
        msn = new MessageNotification(1,1, ms);
    }
    
    @After
    public void tearDown() {
        date = null;
        ms = null;
    }

    /**
     * Test of getMessage method, of class MessageNotification.
     */
    @Test(timeout=100)
    public void testGetMessage() {
        System.out.println("getMessage");
        Message expResult = ms;
        Message result = msn.getMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMessage method, of class MessageNotification.
     */
    @Test(timeout=100)
    public void testSetMessage() {
        System.out.println("setMessage");
        Message message = new Message();
        MessageNotification msn1 = new MessageNotification();
        msn1.setMessage(message);
        assertNotNull(msn1.getMessage());
    }
}
