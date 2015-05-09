import java.util.ArrayList;


public class User {
	private String name;
	private String surname;
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
}
