package solpregun1;

public class TwitterSharrer implements ISharing {

    @Override
    public void share(String message) {
        System.out.println("Message '" + message + "' shared on Twitter");
    }	
}
