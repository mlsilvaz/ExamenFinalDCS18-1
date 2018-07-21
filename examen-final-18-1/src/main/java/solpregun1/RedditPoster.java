package solpregun1;

import pregunta1.SharerFactory;
import pregunta1.SharerType;
import pregunta1.Sharing;

public class RedditPoster implements IReddit {
	  @Override
	 public void shareEveryWhere(String message)
	    {
	        for (SharerType sharerType : SharerType.values()) {
	            Sharing sharer = SharerFactory.FACTORY.getSharer(sharerType);
	            if (sharer != null) {
	                sharer.share(message);
	            }
	        }
	        //Also share on Reddit
	        /*redditPoster.post(message);*/
	    }
	    @Override
	    public void share(String message, SharerType sharerType)
	    {
	        if (sharerType == SharerType.Reddit) {
	            RedditPoster.post(message);
	        } else {
	            Sharing sharer = SharerFactory.FACTORY.getSharer(sharerType);
	            sharer.share(message);
	        }
	    }
        @Override
	    public static void post(String text) {
	        System.out.println("Message '" + text + "' posted to Reddit");
	    }

}
