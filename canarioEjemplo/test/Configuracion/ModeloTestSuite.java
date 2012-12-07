/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Administrador
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Configuracion.FollowerNotificationTest.class, Configuracion.MessageNotificationTest.class, Configuracion.MessageTest.class, Configuracion.LocationTest.class, Configuracion.ReferenceTest.class, Configuracion.UserTest.class, Configuracion.FollowerTest.class, Configuracion.TopicTest.class})
public class ModeloTestSuite {

     @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Begin test ModelSuite");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("Finish test ModelSuite");
    }


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
