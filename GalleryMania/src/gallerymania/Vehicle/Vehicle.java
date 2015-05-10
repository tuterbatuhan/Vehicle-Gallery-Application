package gallerymania.Vehicle;


public class Vehicle {
	private String brandName;
	private String modelName;
	private int id;
	private int price;
	private Engine engine;
	public Vehicle(String brandName, String modelName, Engine engine, int id, int price){
		this.brandName = brandName;
		this.modelName = modelName;
		this.engine = engine;
		this.id = id;
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
          public String toString()
        {
            return "Brand Name: " + brandName+ "\nModel Name: "+ modelName + "\nId: " + id + "\nPrice: " + price + "\nEngine Specifications: \n" + engine; 
        }
}
