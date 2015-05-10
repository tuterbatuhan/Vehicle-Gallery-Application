package gallerymania.User;

import gallerymania.Vehicle.Vehicle;
import java.util.ArrayList;


public class Gallery {
	private String galleryName;
	private ArrayList<Vehicle> inventory;
	private int stock;
	public Gallery(String galleryName, int stock){
		this.galleryName = galleryName;
		this.stock = stock;
		inventory = new ArrayList<Vehicle>();
	}
	public boolean addVehicle(Vehicle v){
		if(inventory.size()<stock){
			inventory.add(v);
                        System.out.println("Vehicle is added to the inventory");
			return true;
		}
                System.out.println("Vehicle is NOT added to the inventory");
		return false;
                
	}
	public boolean removeVehicle(Vehicle v){
		return inventory.remove(v);
	}
          public String toString()
        {
            String result= "Gallery Name: " + galleryName+ " Inventory: \n";
            for(int i=0; i<inventory.size();i++)
            {
                result = result+inventory.get(i)+"\n";
            }
            return result;
        }
}
