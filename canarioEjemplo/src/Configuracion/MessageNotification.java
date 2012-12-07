package Configuracion;

public class MessageNotification  extends Notification {


  private Message message;

    public MessageNotification() {
    }

    public MessageNotification(int id_notification, int id_user, Message message) {
        super(id_notification, id_user);
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
    
    
  
}
