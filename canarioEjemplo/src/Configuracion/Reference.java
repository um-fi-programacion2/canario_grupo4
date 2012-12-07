package Configuracion;

public class Reference  implements java.io.Serializable {


     private Integer idReference;
     private User user;
     private Message message;

    public Reference() {
    }

    public Reference(User user, Message message) {
       this.user = user;
       this.message = message;
    }
   
    public Integer getIdReference() {
        return this.idReference;
    }
    
    public void setIdReference(Integer idReference) {
        this.idReference = idReference;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Message getMessage() {
        return this.message;
    }
    
    public void setMessage(Message message) {
        this.message = message;
    }
}


