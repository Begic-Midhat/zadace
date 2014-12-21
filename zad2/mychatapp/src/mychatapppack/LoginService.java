package mychatapppack;

public class LoginService {
	public boolean authenticate(String userName) {
		if (userName == null || userName.trim().equals("")) {
			return false;
		}
		return true;
	}
}
