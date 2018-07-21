package solpregun3;

public abstract class QuickMessenger implements IMessaging {
	 
	    public void send(String message) {
	        System.out.println("Message '" + message + "' sent via e-mail");
	    }
}
