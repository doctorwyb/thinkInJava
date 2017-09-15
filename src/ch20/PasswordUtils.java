package ch20;

import java.util.List;

public class PasswordUtils {
	@UseCase(id = 47, description = "password must contain at least one numeric")
	public boolean validatePassword(String password){
		return (password.matches("\\w*\\d\\w*"));
	}
	@UseCase(id = 48)
	public String encryptPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}
	@UseCase(id = 49, description = "New password can't equal previously use ones")
	public boolean checkFoeNowPassword(List<String> prevPassword ,String password){
		return !prevPassword.contains(password);
	}
	
}
