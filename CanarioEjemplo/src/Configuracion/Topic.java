package Configuracion;
// Generated 05/12/2012 11:15:21 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Topic generated by hbm2java
 */
public class Topic  implements java.io.Serializable {


     private Integer idTopic;
     private String name;
     private Integer counter;
     private Set<Message> messages = new HashSet<Message>(0);

    public Topic() {
    }

    public Topic(String name, Integer counter, Set<Message> messages) {
       this.name = name;
       this.counter = counter;
       this.messages = messages;
    }
   
    public Integer getIdTopic() {
        return this.idTopic;
    }
    
    public void setIdTopic(Integer idTopic) {
        this.idTopic = idTopic;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCounter() {
        return this.counter;
    }
    
    public void setCounter(Integer counter) {
        this.counter = counter;
    }
    public Set<Message> getMessages() {
        return this.messages;
    }
    
    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }




}


