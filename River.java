
public class River{

    // Encapsulation: private fields
    private String name;
    private double length; // in kilometers
    private String country;

    // Constructor to initialize a River object
    public River(String name, double length, String country) {
        this.name = name;
        this.length = length;
        this.country = country;
    }

    // Getter and Setter methods (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive!");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Method to display river information
    public void displayInfo() {
        System.out.println("River Name: " + name);
        System.out.println("Length: " + length + " km");
        System.out.println("Country: " + country);
    }

    // Method to check if river is long or short
    public void checkSize() {
        if (length > 1000) {
            System.out.println(name + " is a long river.");
        } else {
            System.out.println(name + " is a short river.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating River objects using constructor
        River nile = new River("Nile", 6650, "Egypt");
        River thames = new River("Thames", 346, "United Kingdom");

        // Using methods
        nile.displayInfo();
        nile.checkSize();

        System.out.println();

        thames.displayInfo();
        thames.checkSize();

        // Updating length using setter
        System.out.println("\nUpdating Thames length...");
        thames.setLength(400);
        thames.displayInfo();
    }
}

    