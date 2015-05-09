import java.util.ArrayList;


public class Customer extends User{
	private ArrayList<Vehicle> vehicles;
	int balance;
	Gallery g;
	public Customer(String name, String surname, String userName, String password){
		super(name, surname, userName, password);
		vehicles = new ArrayList<Vehicle>();
		balance = 1000000;
	}
	public boolean buyVehicle(Vehicle v){
		if(balance >= v.getPrice()){
			boolean r = g.removeVehicle(v);
			if(!r)
				return false;
			else{
			vehicles.add(v);
			balance = balance - v.getPrice();
			return true;
			}
		}
		else 
			return false;
	}
	public boolean sellVehicle(Vehicle v){
		boolean result = vehicles.contains(v);
		if(result){
			g.addVehicle(v);
			vehicles.remove(v);
		}
		return result;
	}
	public boolean signIn(String userName, String password){
		if(super.getUserName().equals(userName) && super.getPassword().equals(password))
			return true;
		return false;
	}
	public void changeGallery(Gallery g){
		this.g = g;
	}
}
