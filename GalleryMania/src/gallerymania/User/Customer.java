package gallerymania.User;

import gallerymania.Vehicle.Vehicle;
import java.util.ArrayList;


public class Customer extends User{
	private ArrayList<Vehicle> vehicles;
	int balance;
	Gallery g;
	public Customer(String name, String surname, String userName, String password){
		super(name, surname, userName, password);
		vehicles = new ArrayList<Vehicle>();
		balance = 1000000;  //Think about this how to pass
	}
	public boolean buyVehicle(Vehicle v){
		if(balance >= v.getPrice()){
			boolean r = g.removeVehicle(v);
			if(!r)
                        {
                            System.out.println("Vehicle does not exist!");
                            return false;
                        }
			else{
			vehicles.add(v);
			balance = balance - v.getPrice();
			return true;
			}
		}
                else{
                    System.out.println("Vehicle can not be bought!");
                    return false;
                } 
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
          public String toString()
        {
            String result=name+" "+ surname +" Balance: " + balance +"\nVehicles: \n";
            for(int i=0; i<vehicles.size();i++)
            {
                result = result+vehicles.get(i)+"\n";
            }
            return result;
        }
}
