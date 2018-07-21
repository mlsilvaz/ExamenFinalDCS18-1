package solpregun3;

public abstract class SelDestructingVIPMessenger implements IMessaging {
    public void send(String message) {
        message = "☠" + message + "☠";
        send(message);
    }

}
