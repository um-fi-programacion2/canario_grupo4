package Model;
// Generated 04-dic-2012 11:46:29 by Hibernate Tools 3.2.1.GA



/**
 * Follower generated by hbm2java
 */
public class Follower  implements java.io.Serializable {


     private Integer idRelation;
     private Integer idFollower;
     private String idFollowed;

    public Follower() {
    }

    public Follower(Integer idFollower, String idFollowed) {
       this.idFollower = idFollower;
       this.idFollowed = idFollowed;
    }
   
    public Integer getIdRelation() {
        return this.idRelation;
    }
    
    public void setIdRelation(Integer idRelation) {
        this.idRelation = idRelation;
    }
    public Integer getIdFollower() {
        return this.idFollower;
    }
    
    public void setIdFollower(Integer idFollower) {
        this.idFollower = idFollower;
    }
    public String getIdFollowed() {
        return this.idFollowed;
    }
    
    public void setIdFollowed(String idFollowed) {
        this.idFollowed = idFollowed;
    }




}


