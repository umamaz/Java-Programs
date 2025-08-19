class Eng {
    void attack() {
        System.out.println("Engineer attacks with technology.");
    }
}

class Hammer extends Eng {
    void attack() {
        System.out.println("Hammerpede attacks with acid blood.");
    }
}

class Xen extends Hammer {
   
    void attack() {
        System.out.println("Xenomorph attacks with inner jaw.");
    }
}

public class Polymorph {
    public static void main(String[] args) {
        Eng e1 = new Eng();
        Eng e2 = new Hammer();
        Eng e3 = new Xen();

        Eng[] aliens = { e1, e2, e3 };

        for (Eng alien : aliens) {
            alien.attack();  // Same method call, different behavior!
        }
    }
}
