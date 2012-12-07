package Configuracion;


import java.util.HashSet;
import java.util.Set;


public class Location  implements java.io.Serializable {


     private Integer idLocation;
     private String name;
     private Set users = new HashSet(0);
     private Set messages = new HashSet(0);

    public Location() {
    }
    
    public Location(String name) {
       this.name = name;

    }
   
    public Integer getIdLocation() {
        return this.idLocation;
    }
    
    public void setIdLocation(Integer idLocation) {
        this.idLocation = idLocation;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
    public Set getMessages() {
        return this.messages;
    }
    
    public void setMessages(Set messages) {
        this.messages = messages;
    }

}


