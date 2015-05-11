package gallerymania.User;

import java.util.ArrayList;


public abstract class User {
	protected String name;
	protected String surname;
	private String userName;
	private String password;
	public User(String name, String surname, String userName, String password){
		this.name = name;
		this.surname = surname;
		this.userName = userName;
		this.password = password;
	}
	protected String getUserName(){
		return userName;
	}
	protected String getPassword(){
		return password;
	}
	protected String getName(){
		return name;
	}
	protected String getSurname(){
		return surname;
	}
	public boolean signIn(String userName, String password){
        if(this.userName.equals(userName) && this.password.equals(password))
        	return true;
        else
        	return false;
	}
	public abstract String getUserType();
}
