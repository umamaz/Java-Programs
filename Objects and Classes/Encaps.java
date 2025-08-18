
class Specie {
    private String name;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        if(n != null && !n.isEmpty()) {
            name = n;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int d) {
        if(d >= 0) {
            damage = d;
        } else {
            System.out.println("Damage cannot be negative!");
        }
    }
}

public class Encaps {
    public static void main(String[] args) {
        Specie neo = new Specie();
        neo.setName("Neomorph");
        neo.setDamage(40);
        System.out.println(neo.getName() + " does " + neo.getDamage() + " damage");

       
    }
}
