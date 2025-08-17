abstract class Alien {
    abstract void invade();
}

class Xenomorph extends Alien {
    void invade() {
        System.out.println("Xenomorph is crawling in tunnel");
    }
}

class Facehugger extends Alien {
    void invade() {
        System.out.println("Facehugger in impregnating a homo sapien");
    }
}

class Neomorph extends Alien {
    void invade()  {
        System.out.println(" Neomorph is invading by contaminating the environment");
    }
}

class Deacon extends Alien {
    void invade() {
        System.out.println(" Deacon is invading in the corridor");
    }
}
public class Abs {
    public static void main(String[] args) {
        Alien Xen = new Xenomorph();
        Alien fach = new Facehugger ();
        Alien Neo = new Neomorph();
        Alien Dea = new Deacon();

        Xen.invade();
        fach.invade();
        Neo.invade();
        Dea.invade();

    }
    
}
