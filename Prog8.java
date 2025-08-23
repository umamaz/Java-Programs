
class AquaticSpecies {
    private String name;
    private String habitat;
    private double averageSize; 
    private boolean endangered;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getAverageSize() {
        return averageSize;
    }

    public void setAverageSize(double averageSize) {
        if(averageSize > 0) {
            this.averageSize = averageSize;
        } else {
            System.out.println("Size must be positive!");
        }
    }
 
    public boolean isEndangered() {
        return endangered;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }
}

public class Prog8 {
    public static void main(String[] args) {
        // Creating object of AquaticSpecies
        AquaticSpecies dolphin = new AquaticSpecies();

        // Using setters to assign values
        dolphin.setName("Bottlenose Dolphin");
        dolphin.setHabitat("Ocean");
        dolphin.setAverageSize(260.5); 
        dolphin.setEndangered(false);

        // Using getters to access values
        System.out.println("Name: " + dolphin.getName());
        System.out.println("Habitat: " + dolphin.getHabitat());
        System.out.println("Average Size: " + dolphin.getAverageSize() + " cm");
        System.out.println("Endangered: " + (dolphin.isEndangered() ? "Yes" : "No"));
    }
}
