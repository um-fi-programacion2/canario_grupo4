package Configuracion;

public class Follower  implements java.io.Serializable {


     private Integer idRelation;
     private User userByIdFollower;
     private User userByIdFollowed;

    public Follower() {
    }

    public Follower(User userByIdFollower, User userByIdFollowed) {
       this.userByIdFollower = userByIdFollower;
       this.userByIdFollowed = userByIdFollowed;
    }
   
    public Integer getIdRelation() {
        return this.idRelation;
    }
    
    public void setIdRelation(Integer idRelation) {
        this.idRelation = idRelation;
    }
    public User getUserByIdFollower() {
        return this.userByIdFollower;
    }
    
    public void setUserByIdFollower(User userByIdFollower) {
        this.userByIdFollower = userByIdFollower;
    }
    public User getUserByIdFollowed() {
        return this.userByIdFollowed;
    }
    
    public void setUserByIdFollowed(User userByIdFollowed) {
        this.userByIdFollowed = userByIdFollowed;
    }

}
