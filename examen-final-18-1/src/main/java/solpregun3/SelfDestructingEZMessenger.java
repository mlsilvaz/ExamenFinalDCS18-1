package solpregun3;

public abstract class SelfDestructingEZMessenger implements IMessaging {
    public void send(String message) {
        message = "☠" + message + "☠";
        send(message);
    }

}
