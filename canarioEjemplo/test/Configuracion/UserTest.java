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

public class UserTest {
    
    private static Location location;
    private static User instance;
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Begin User.class  Test");
        location = new Location("San martin - mendoza");
        location.setIdLocation(1);
    }
    
    @AfterClass
    public static void tearDownClass() {
        location = null;
        System.out.println("Finish User.class  Test");
    }
    
    @Before
    public void setUp() {
        instance = new User(location, "pepe", "123445", "pepe@gmail.com", "jose", "gomez");
        instance.setIdUser(1);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getIdUser method, of class User.
     */
    @Test(timeout=100)
    public void testGetIdUser() {
        System.out.println("getIdUser");
        Integer expResult = 1;
        Integer result = instance.getIdUser();
        assertEquals(expResult, result);

    }

    /**
     * Test of setIdUser method, of class User.
     */
    @Test(timeout=100)
    public void testSetIdUser() {
        System.out.println("setIdUser");
        Integer idUser = 3;
        instance.setIdUser(idUser);
        assertNotNull(instance.getIdUser());
    }

    /**
     * Test of getLocation method, of class User.
     */
    @Test(timeout=100)
    public void testGetLocation() {
        System.out.println("getLocation");
        Location expResult = location;
        Location result = instance.getLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocation method, of class User.
     */
    @Test(timeout=100)
    public void testSetLocation() {
        System.out.println("setLocation");
        Location location1 = new Location("Ciudad - mendoza");
        location.setIdLocation(2);
        User instance2 = new User();
        instance2.setIdUser(2);
        instance2.setLocation(location1);
        assertNotNull(instance2.getLocation());
    }

    /**
     * Test of getUserName method, of class User.
     */
    @Test(timeout=100)
    public void testGetUserName() {
        System.out.println("getUserName");
        String expResult = "pepe";
        String result = instance.getUserName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserName method, of class User.
     */
    @Test(timeout=100)
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "juan";
        User instance2 = new User();
        instance2.setUserName(userName);
        assertNotNull(instance2.getUserName());
    }

    /**
     * Test of getPasswords method, of class User.
     */
    @Test(timeout=100)
    public void testGetPasswords() {
        System.out.println("getPasswords");
        String expResult = "123445";
        String result = instance.getPasswords();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPasswords method, of class User.
     */
    @Test(timeout=100)
    public void testSetPasswords() {
        System.out.println("setPasswords");
        String passwords = "1234";
        User instance2 = new User();
        instance2.setPasswords(passwords);
        assertNotNull(instance2.getPasswords());
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test(timeout=100)
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "pepe@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test(timeout=100)
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "juan@hotmail.com";
        User instance2 = new User();
        instance2.setEmail(email);
        assertNotNull(instance2.getEmail());
    }

    /**
     * Test of getFirstName method, of class User.
     */
    @Test(timeout=100)
    public void testGetFirstName() {
        System.out.println("getFirstName");
        String expResult = "jose";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class User.
     */
    @Test(timeout=100)
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "juan";
        User instance2 = new User();
        instance2.setFirstName(firstName);
        assertNotNull(instance2.getFirstName());
    }

    /**
     * Test of getLastName method, of class User.
     */
    @Test(timeout=100)
    public void testGetLastName() {
        System.out.println("getLastName");
        String expResult = "gomez";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class User.
     */
    @Test(timeout=100)
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "perez";
        User instance2 = new User();
        instance2.setLastName(lastName);
        assertNotNull(instance2.getLastName());
    }

    /**
     * Test of getBiography method, of class User.
     */
    @Test(timeout=100)
    public void testGetBiography() {
        System.out.println("getBiography");
        String expResult = null;
        String result = instance.getBiography();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBiography method, of class User.
     */
    @Test(timeout=100)
    public void testSetBiography() {
        System.out.println("setBiography");
        String biography = "hola soy juan";
        User instance2 = new User();
        instance2.setBiography(biography);
        assertNotNull(instance2.getBiography());
    }

    /**
     * Test of getPathPhoto method, of class User.
     */
    @Test(timeout=100)
    public void testGetPathPhoto() {
        System.out.println("getPathPhoto");
        String expResult = null;
        String result = instance.getPathPhoto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPathPhoto method, of class User.
     */
    @Test(timeout=100)
    public void testSetPathPhoto() {
        System.out.println("setPathPhoto");
        String pathPhoto = "c:/canario/photos";
        User instance2 = new User();
        instance2.setPathPhoto(pathPhoto);
        assertNotNull(instance2.getPathPhoto());
    }

    /**
     * Test of getFollowerNotifications method, of class User.
     */
    @Test(timeout=100)
    public void testGetFollowerNotifications() {
        System.out.println("getFollowerNotifications");
        Set expResult = new HashSet(0);
        Set result = instance.getFollowerNotifications();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFollowerNotifications method, of class User.
     */
    @Test(timeout=100)
    public void testSetFollowerNotifications() {
        System.out.println("setFollowerNotifications");
        Set followerNotifications = new HashSet(0);
        followerNotifications.add(new FollowerNotification(1,1,2));
        User instance2 = new User();
        instance2.setFollowerNotifications(followerNotifications);
        assertNotNull(instance2.getFollowerNotifications());
    }

    /**
     * Test of getFollowersForIdFollowed method, of class User.
     */
    @Test(timeout=100)
    public void testGetFollowersForIdFollowed() {
        System.out.println("getFollowersForIdFollowed");
        Set expResult = new HashSet(0);
        Set result = instance.getFollowersForIdFollowed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFollowersForIdFollowed method, of class User.
     */
    @Test(timeout=100)
    public void testSetFollowersForIdFollowed() {
        System.out.println("setFollowersForIdFollowed");
        Set followersForIdFollowed = new HashSet(0);
        followersForIdFollowed.add(new Follower());
        User instance2 = new User();
        instance2.setFollowersForIdFollowed(followersForIdFollowed);
        assertNotNull(instance2.getFollowersForIdFollowed());
    }

    /**
     * Test of getMessages method, of class User.
     */
    @Test(timeout=100)
    public void testGetMessages() {
        System.out.println("getMessages");
        Set expResult = new HashSet(0);
        Set result = instance.getMessages();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMessages method, of class User.
     */
    @Test
    public void testSetMessages() {
        System.out.println("setMessages");
        Set messages = new HashSet(0);
        messages.add(new Message());
        User instance2 = new User();
        instance2.setMessages(messages);
    }

    /**
     * Test of getMessageNotifications method, of class User.
     */
    @Test(timeout=100)
    public void testGetMessageNotifications() {
        System.out.println("getMessageNotifications");
        Set expResult = new HashSet(0);
        Set result = instance.getMessageNotifications();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMessageNotifications method, of class User.
     */
    @Test(timeout=100)
    public void testSetMessageNotifications() {
        System.out.println("setMessageNotifications");
        Set messageNotifications = new HashSet(0);
        messageNotifications.add(new MessageNotification()); 
        User instance2 = new User();
        instance2.setMessageNotifications(messageNotifications);
        assertNotNull(instance2.getMessageNotifications());
    }

    /**
     * Test of getFollowersForIdFollower method, of class User.
     */
    @Test(timeout=100)
    public void testGetFollowersForIdFollower() {
        System.out.println("getFollowersForIdFollower");
        Set expResult = new HashSet(0);
        Set result = instance.getFollowersForIdFollower();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFollowersForIdFollower method, of class User.
     */
    @Test(timeout=100)
    public void testSetFollowersForIdFollower() {
        System.out.println("setFollowersForIdFollower");
        Set followersForIdFollower = new HashSet(0);
        followersForIdFollower.add(new Follower());
        User instance2 = new User();
        instance2.setFollowersForIdFollower(followersForIdFollower);
        assertNotNull(instance2.getFollowersForIdFollower());
    }

    /**
     * Test of getReferences method, of class User.
     */
    @Test(timeout=100)
    public void testGetReferences() {
        System.out.println("getReferences");
        Set expResult = new HashSet(0);
        Set result = instance.getReferences();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReferences method, of class User.
     */
    @Test(timeout=100)
    public void testSetReferences() {
        System.out.println("setReferences");
        Set references = new HashSet(0);
        references.add(new Reference());
        User instance2 = new User();
        instance2.setReferences(references);
        assertNotNull(instance2.getReferences());
    }
}
