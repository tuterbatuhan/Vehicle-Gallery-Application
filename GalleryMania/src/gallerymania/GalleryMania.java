
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallerymania;
import java.util.ArrayList;
import gallerymania.Vehicle.*;
import gallerymania.User.*;


/**
 *
 * @author Batu
 */
public class GalleryMania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int id=0;
        ArrayList<User> myUsers = new ArrayList();
        Customer cust1 = new Customer("ali","sasmaz", "alisasmaz", "sasmaz");
        Customer cust2 = new Customer("ali","korkmaz", "alikorkmaz", "korkmaz");
        Customer cust3 = new Customer("ahmet","hüsam", "ahmethüsam", "hüsam");
        
        Engine eng1 = new Engine("diesel", 1.6, 120);
        Engine eng2 = new Engine("gasoline", 2.0, 200);

        Vehicle veh1 = new Car("Opel", "Astra", eng1,1,50000);
        Vehicle veh2 = new Car("BMW", "3.20", eng2,2,200000);
        
        Gallery gal1 = new Gallery("Opel",5);
        Gallery gal2 = new Gallery("BMW",10);

        
        GalleryOwner own1 = new GalleryOwner("mustafa", "bas", "mbas", "123", gal1);
        GalleryOwner own2 = new GalleryOwner("ozgur", "tan", "tanoz", "ozzgur", gal2);
        
        own1.addVehicle(veh1);
        own2.addVehicle(veh2);
        
        myUsers.add(cust1);
        myUsers.add(cust2);
        myUsers.add(cust3);
        myUsers.add(own1);
        myUsers.add(own2);
        
        cust1.changeGallery(gal1);
        cust1.buyVehicle(veh1);
        
        System.out.println(cust1);
  
        
        
        

    }
    
}
