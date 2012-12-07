package Configuracion;

public class FollowerNotification  extends Notification {


     private int id_follower;

    public FollowerNotification() {
    }

    public FollowerNotification(int id_notification, int id_user, int id_follower) {
        super(id_notification, id_user);
        this.id_follower = id_follower;
    }

    public int getId_follower() {
        return id_follower;
    }

    public void setId_follower(int id_follower) {
        this.id_follower = id_follower;
    }

}