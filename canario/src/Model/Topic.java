package Model;
// Generated 04-dic-2012 11:46:29 by Hibernate Tools 3.2.1.GA



/**
 * Topic generated by hbm2java
 */
public class Topic  implements java.io.Serializable {


     private Integer idTopic;
     private String name;
     private Integer counter;

    public Topic() {
    }

    public Topic(String name, Integer counter) {
       this.name = name;
       this.counter = counter;
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




}

