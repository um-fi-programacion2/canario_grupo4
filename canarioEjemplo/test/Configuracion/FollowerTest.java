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
public class FollowerTest {
    
    private static Follower follow;
    private static Location location;
    private static Location location1;
    private static User instance;
    private static User instance2;     
    
    public FollowerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Begin Follower.class  Test");
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
        System.out.println("Finish Follower.class  Test");
    }
    
    @Before
    public void setUp() {
        follow = new Follower(instance, instance2);
        follow.setIdRelation(1);
    }
    
    @After
    public void tearDown() {
        follow = null;
    }

    /**
     * Test of getIdRelation method, of class Follower.
     */
    @Test(timeout=100)
    public void testGetIdRelation() {
        System.out.println("getIdRelation");
        Integer expResult = 1;
        Integer result = follow.getIdRelation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdRelation method, of class Follower.
     */
    @Test(timeout=100)
    public void testSetIdRelation() {
        System.out.println("setIdRelation");
        Integer idRelation = 2;
        follow.setIdRelation(idRelation);
        assertNotNull(follow.getIdRelation());
    }

    /**
     * Test of getUserByIdFollower method, of class Follower.
     */
    @Test(timeout=100)
    public void testGetUserByIdFollower() {
        System.out.println("getUserByIdFollower");
        User result = follow.getUserByIdFollower();
        assertNotNull(result);
    }

    /**
     * Test of setUserByIdFollower method, of class Follower.
     */
    @Test(timeout=100)
    public void testSetUserByIdFollower() {
        System.out.println("setUserByIdFollower");
        follow.setUserByIdFollower(instance);
        assertNotNull(follow.getUserByIdFollower());
    }

    /**
     * Test of getUserByIdFollowed method, of class Follower.
     */
    @Test(timeout=100)
    public void testGetUserByIdFollowed() {
        System.out.println("getUserByIdFollowed");
        User result = follow.getUserByIdFollowed();
        assertNotNull(result);
    }

    /**
     * Test of setUserByIdFollowed method, of class Follower.
     */
    @Test(timeout=100)
    public void testSetUserByIdFollowed() {
        System.out.println("setUserByIdFollowed");
        follow.setUserByIdFollowed(instance2);
        assertNotNull(follow.getUserByIdFollowed());
    }
}
