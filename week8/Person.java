import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddres(String address) {
        this.address = address;
    }

    /**
     * Add.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }


    /**
     * Remove.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getRegistrationNumber() == registrationNumber) {
                vehicleList.remove(i);
                i--;
            }
        }
    }

    /**
     * Get info.
     */
    public String getVehiclesInfo() {
        String res = this.name;
        if (vehicleList.isEmpty()) {
            res += " has no vehicle!";
        } else {
            res += " has:\n\n";
            for (int i = 0; i < vehicleList.size(); i++) {
                res = res + vehicleList.get(i).getInfo() + "\n";
            }
        }
        return res;
    }
}
