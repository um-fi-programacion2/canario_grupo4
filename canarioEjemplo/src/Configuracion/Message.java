package Configuracion;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Message  implements java.io.Serializable {


     private Integer idMessage;
     private Location location;
     private Topic topic;
     private User user;
     private Date date;
     private String body;
     private Set references = new HashSet(0);
     private Set messageNotifications = new HashSet(0);

    public Message() {
    }
	
    public Message(Topic topic, User user, Date date, String body, Location location) {
        this.topic = topic;
        this.user = user;
        this.date = date;
        this.body = body;
        this.location = location;
    }
    public Message(Location location, Topic topic, User user, Date date, String body, Set references, Set messageNotifications) {
       this.location = location;
       this.topic = topic;
       this.user = user;
       this.date = date;
       this.body = body;
       this.references = references;
       this.messageNotifications = messageNotifications;
    }
   
    public Integer getIdMessage() {
        return this.idMessage;
    }
    
    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }
    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    public Topic getTopic() {
        return this.topic;
    }
    
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    public Set getReferences() {
        return this.references;
    }
    
    public void setReferences(Set references) {
        this.references = references;
    }
    public Set getMessageNotifications() {
        return this.messageNotifications;
    }
    
    public void setMessageNotifications(Set messageNotifications) {
        this.messageNotifications = messageNotifications;
    }
}


