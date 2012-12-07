package Configuracion;


import java.util.HashSet;
import java.util.Set;

public class Topic  implements java.io.Serializable {


     private Integer idTopic;
     private String name;
     private int counter = 0;
     private Set messages = new HashSet(0);

    public Topic() {
    }
	
    public Topic(String name, int counter) {
        this.name = name;
        this.counter = counter;
    }
    public Topic(String name, int counter, Set messages) {
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
    public int getCounter() {
        return this.counter;
    }
    
    public void setCounter(int counter) {
        this.counter = counter;
    }
    public Set getMessages() {
        return this.messages;
    }
    
    public void setMessages(Set messages) {
        this.messages = messages;
    }
}
