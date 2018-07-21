package solpregun3;

public   abstract  class SecureVIPMessenger implements IMessaging {
    public String encrypt(String message) {
        message = message.substring(message.length() - 1) + message.substring(0, message.length() - 1);
        return message;
    }
    
    public void send(String message) {
        message = encrypt(message);
        send(message);
    }

}
