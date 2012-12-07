/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

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
public class FollowerNotificationTest {
    
    private static FollowerNotification fn;
    private static Location location;
    private static Location location1;
    private static User instance;
    private static User instance2;
    
    public FollowerNotificationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Begin FollowerNotification.class  Test");
        location = new Location("San martin - mendoza");
        location.setIdLocation(1);
        location1 = new Location("Ciudad - mendoza");
        location.setIdLocation(2);
        instance = new User(location, "pepe", "123445", "pepe@gmail.com", "jose", "gomez");
        instance.setIdUser(1);
        instance2 = new User(location1, "juanito", "123a5", "juan@hotmail.com", "juan", "perez");
        instance.setIdUser(2);
    }
    
    @AfterClass
    public static void tearDownClass() {
        location = null;
        location1 = null;
        instance = null;
        instance2 = null;
        System.out.println("Finish FollowerNotification.class  Test");
    }
    
    @Before
    public void setUp() {
        fn = new FollowerNotification(1,1,2);
    }
    
    @After
    public void tearDown() {
        fn = null;
    }


    /**
     * Test of getId_follower method, of class FollowerNotification.
     */
    @Test(timeout=100)
    public void testGetId_follower() {
        System.out.println("getId_follower");
        int expResult = 2;
        int result = fn.getId_follower();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_follower method, of class FollowerNotification.
     */
    @Test(timeout=100)
    public void testSetId_follower() {
        System.out.println("setId_follower");
        int id_follower = 5;
        fn.setId_follower(id_follower);
        assertNotNull(fn.getId_follower());
    }
}
