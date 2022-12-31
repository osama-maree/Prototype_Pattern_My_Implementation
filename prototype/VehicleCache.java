package prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleCache {

    private final Map<String, Vehicle> cache = new HashMap<>();

    public Vehicle get(String key) {
        return (Vehicle) cache.get(key).clone();
    }

    public void put(List<Vehicle> vehicles) {
        vehicles.forEach(vehicle -> cache.put(vehicle.getBrand() + " " + vehicle.getModel(), vehicle));

    }

}
