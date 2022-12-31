package prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypePattern {
    
    public static void main(String[] args) {
        
        List<Vehicle> vehicles = new ArrayList();
        vehicles.add(new Car("M", "A", "red", 200, new Driver("ahmad", 900)));
        vehicles.add(new Bus("W", "Z", "black", 600, new Driver("osama", 1000)));
        Vehicle p=new Car("W", "Z", "black", 600, new Driver("osama", 1000));
        List<Vehicle> copyList = new ArrayList<>();
        
        for (Vehicle vehicle : vehicles) {
            copyList.add((Vehicle) vehicle.clone());
        }
        copyList.get(1).getDriver().setId(0);
        copyList.get(1).setData(0);
        System.out.println("First ArrayList  :" + vehicles);
        System.out.println("==========================================");
        System.out.println("Secend ArrayList :" + copyList);
        System.out.println("==========================================");
        
        VehicleCache Database = new VehicleCache();
        
        Database.put(vehicles);
        Database.get("M A");
        
    }
    
}
