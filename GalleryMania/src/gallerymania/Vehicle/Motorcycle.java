package gallerymania.Vehicle;


public class Motorcycle extends Vehicle {
	
		
		private final String VEHICLE_TYPE = "motorcycle";
		
		public Motorcycle(String brandName, String modelName, Engine engine, int id, int price){
			super(brandName,modelName, engine, id, price);
		}
}
