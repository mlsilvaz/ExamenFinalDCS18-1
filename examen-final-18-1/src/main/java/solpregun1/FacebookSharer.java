package solpregun1;

public class FacebookSharer implements ISharing {

    @Override
    public void share(String message) {
        System.out.println("Message '" + message + "' shared on Facebook");
    }

}
