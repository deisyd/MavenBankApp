package bankapp.com.models;

import java.util.Scanner;

public abstract class users {
	private String username;
	private String password;
	
	//constructor
	public users(String username, String pass) {
		this.setUsername(username);
		this.setPassword(pass);
	}
	
	// getters and setters
	public String getUser() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return password;
	}
	public void setPassword(String pass) {
		this.password = pass;
	}
}