package Configuracion;
// Generated 05/12/2012 11:15:21 by Hibernate Tools 3.2.1.GA



/**
 * Reference generated by hbm2java
 */
public class Reference  implements java.io.Serializable {


     private Integer idReference;
     private Message message;
     private User user;

    public Reference() {
    }

    public Reference(Message message, User user) {
       this.message = message;
       this.user = user;
    }
   
    public Integer getIdReference() {
        return this.idReference;
    }
    
    public void setIdReference(Integer idReference) {
        this.idReference = idReference;
    }
    public Message getMessage() {
        return this.message;
    }
    
    public void setMessage(Message message) {
        this.message = message;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }




}


