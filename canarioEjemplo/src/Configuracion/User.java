package Configuracion;


import java.util.HashSet;
import java.util.Set;

public class User  implements java.io.Serializable {


     private Integer idUser;
     private Location location;
     private String userName;
     private String passwords;
     private String email;
     private String firstName;
     private String lastName;
     private String biography;
     private String pathPhoto;
     private Set followerNotifications = new HashSet(0);
     private Set followersForIdFollowed = new HashSet(0);
     private Set messages = new HashSet(0);
     private Set messageNotifications = new HashSet(0);
     private Set followersForIdFollower = new HashSet(0);
     private Set references = new HashSet(0);

    public User() {
    }

	
    public User(Location location, String userName, String passwords, String email, String firstName, String lastName) {
        this.location = location;
        this.userName = userName;
        this.passwords = passwords;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public User(Location location, String userName, String passwords, String email, String firstName, String lastName, String biography, String pathPhoto, Set followerNotifications, Set followersForIdFollowed, Set messages, Set messageNotifications, Set followersForIdFollower, Set references) {
       this.location = location;
       this.userName = userName;
       this.passwords = passwords;
       this.email = email;
       this.firstName = firstName;
       this.lastName = lastName;
       this.biography = biography;
       this.pathPhoto = pathPhoto;
       this.followerNotifications = followerNotifications;
       this.followersForIdFollowed = followersForIdFollowed;
       this.messages = messages;
       this.messageNotifications = messageNotifications;
       this.followersForIdFollower = followersForIdFollower;
       this.references = references;
    }
   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPasswords() {
        return this.passwords;
    }
    
    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getBiography() {
        return this.biography;
    }
    
    public void setBiography(String biography) {
        this.biography = biography;
    }
    public String getPathPhoto() {
        return this.pathPhoto;
    }
    
    public void setPathPhoto(String pathPhoto) {
        this.pathPhoto = pathPhoto;
    }
    public Set getFollowerNotifications() {
        return this.followerNotifications;
    }
    
    public void setFollowerNotifications(Set followerNotifications) {
        this.followerNotifications = followerNotifications;
    }
    public Set getFollowersForIdFollowed() {
        return this.followersForIdFollowed;
    }
    
    public void setFollowersForIdFollowed(Set followersForIdFollowed) {
        this.followersForIdFollowed = followersForIdFollowed;
    }
    public Set getMessages() {
        return this.messages;
    }
    
    public void setMessages(Set messages) {
        this.messages = messages;
    }
    public Set getMessageNotifications() {
        return this.messageNotifications;
    }
    
    public void setMessageNotifications(Set messageNotifications) {
        this.messageNotifications = messageNotifications;
    }
    public Set getFollowersForIdFollower() {
        return this.followersForIdFollower;
    }
    
    public void setFollowersForIdFollower(Set followersForIdFollower) {
        this.followersForIdFollower = followersForIdFollower;
    }
    public Set getReferences() {
        return this.references;
    }
    
    public void setReferences(Set references) {
        this.references = references;
    }

}


