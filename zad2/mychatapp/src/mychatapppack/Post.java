package mychatapppack;

public class Post {
	private String user;
	private String msg;

	public Post(String user, String msg) {
		this.user = user;
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public String getUser() {
		return user;
	}

	@Override
	public String toString() {
		return this.user + ": " + msg;
	}

}
