package solpregun3;

public abstract class SelfDestructingQuickMessenger implements IMessaging {

	public void send(String message) {
        message = "☠" + message + "☠";
        send(message);
    }
}
