package gallerymania.User;


import gallerymania.Vehicle.Vehicle;


public class GalleryOwner extends User{
	public final String UserType = "galleryowner";
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
        public boolean signIn(String userName, String password){
		if(super.getUserName().equals(userName) && super.getPassword().equals(password))
			return true;
		return false;
	}
          public String toString()
        {
            String result=name+" "+ surname + "'s Gallery: \n " + gallery;
            
            return result;
        }
}
