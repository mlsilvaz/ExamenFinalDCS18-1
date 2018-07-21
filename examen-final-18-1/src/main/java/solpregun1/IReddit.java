package solpregun1;

import pregunta1.SharerType;

public interface IReddit {
	public void post(String text);
	 public void shareEveryWhere(String message);
	 public void share(String message, SharerType sharerType);

}
