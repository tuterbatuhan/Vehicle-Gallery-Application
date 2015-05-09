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
			return true;
		}
		return false;
	}
	public boolean removeVehicle(Vehicle v){
		boolean result = inventory.remove(v);
		return result;	
	}
}
