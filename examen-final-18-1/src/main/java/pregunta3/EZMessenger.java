package pregunta3;

public class EZMessenger implements Messaging {
    @Override
    public void send(String message) {
        System.out.println("Message '" + message + "' sent via EZ");
    }
}
