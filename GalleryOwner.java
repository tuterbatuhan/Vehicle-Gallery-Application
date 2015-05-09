
public class GalleryOwner extends User{
	
	Gallery gallery;
	public GalleryOwner(String name, String surname, String userName, String password, Gallery gallery){
		super(name, surname, userName, password);
		this.gallery = gallery;
	}
	public boolean addVehicle(Vehicle v){
		boolean result = gallery.addVehicle(v);
		return result;
	}
	public boolean removeVehicle(Vehicle v){
		boolean result = gallery.removeVehicle(v);
		return result;
	}
}
