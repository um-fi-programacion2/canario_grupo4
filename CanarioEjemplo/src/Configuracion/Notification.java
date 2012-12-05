/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public abstract class Notification implements Serializable {
    
    private int id_notification;
    private int id_user;

    public Notification() {
    }

    public Notification(int id_notification, int id_user) {
        this.id_notification = id_notification;
        this.id_user = id_user;
    }
    
    
    

    public int getId_notification() {
        return id_notification;
    }

    public void setId_notification(int id_notification) {
        this.id_notification = id_notification;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
    
    
    
}
