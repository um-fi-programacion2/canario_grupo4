/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package canarioejemplo;

import Configuracion.Location;
import Configuracion.Notification;
import DAO.AbstractDAO;

/**
 *
 * @author usuario
 */
public class CanarioEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Notification not = new Notification(1,2) {};
       AbstractDAO.almacenaEntidad(not);
        
        
    }
}
