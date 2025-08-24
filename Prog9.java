import java.util.ArrayList;

class Spaceship {
    private String name;
    private String mission;

    public Spaceship(String name, String mission) {
        this.name = name;
        this.mission = mission;
    }

    public String getName() {
        return name;
    }

    public String getMission() {
        return mission;
    }

    public void displayInfo() {
        System.out.println("Spaceship: " + name + " | Mission: " + mission);
    }
}

public class Prog9 {
    public static void main(String[] args) {
        // Creating a dynamic list of Spaceship objects
        ArrayList<Spaceship> fleet = new ArrayList<>();

        // Add ships to the list
        fleet.add(new Spaceship("USCSS Nostromo", "Towing refinery ship"));
        fleet.add(new Spaceship("USS Sulaco", "Colonial Marines transport"));
        fleet.add(new Spaceship("USCSS Prometheus", "Exploration & research"));
        fleet.add(new Spaceship("USCSS Covenant", "Colonization mission"));

        // Display all ships
        System.out.println("Fleet in Alien Universe:");
        for (Spaceship ship : fleet) {
            ship.displayInfo();
        }

        // Access a specific ship by index
        System.out.println("\nAccessing a specific ship:");
        System.out.println("Second ship in fleet: " + fleet.get(1).getName());

        // Add a new ship dynamically
        fleet.add(new Spaceship("Patna", "Weyland-Yutani vessel"));
        System.out.println("\nAfter adding another ship:");
        for (Spaceship ship : fleet) {
            ship.displayInfo();
        }

        // Remove a ship
        fleet.remove(0); 
        System.out.println("\nAfter removing the first ship:");
        for (Spaceship ship : fleet) {
            ship.displayInfo();
        }
    }
}
