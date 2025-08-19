class Engineer {
    void createLife() {
        System.out.println("Given specie has ability to create life");
    }
    void superStrength() {
        System.out.println("Given specie has super strength.");
    }
    void intelligence() {
        System.out.println("Given uses advanced intelligence.");
    }
}
class Hammerpede extends Engineer {
    void acidBlood() {
        System.out.println("Given has acid blood.");
    }
    void aggression() {
        System.out.println("Given is extremely aggressive.");
    }
}


public class Inherit {
    public static void main(String[] args) {
        Hammerpede Xen= new Hammerpede();

         Xen.createLife();
         Xen.superStrength();
         Xen.intelligence();
         Xen.acidBlood();
         Xen.aggression();

    }
    
}

