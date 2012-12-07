/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package canarioejemplo;


import Configuracion.Location;
import DAO.AbstractDAO;


/**
 *
 * @author usuario
 */
public class CanarioEjemplo {


    public static void main(String[] args) {
        // TODO code application logic here
        Location location1 = new Location("San martin");
       AbstractDAO.almacenaEntidad(location1);
        
    }
}
