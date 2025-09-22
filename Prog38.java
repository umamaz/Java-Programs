class Species {
    String name;
    String classification;

    Species(String name, String classification) {
        this.name = name;
        this.classification = classification;

    }

    public void Comm() {
        System.out.println( "communicates");

    }

    public void motion() {
        System.out.println("it has motion as well");
    }
}

class Amphibian extends Species {

    Amphibian(String name, String classification) {
        super(name, classification);
    }

    public void Comm() {
        System.out.println(name+" "+"amphibian communicates");
    }
}
    class Aquatic extends Species {

        Aquatic(String name, String classification) {
            super(name, classification);
        }

        public void motion() {
            System.out.println(name +" "+ "aquatic animal moves through water");

        }
    }

    public class Prog38 {
        public static void main(String[] args) {
            Species abc = new Amphibian("Snake", "can swim and slither");
            Species def = new Aquatic("Shark", "Can swim through deep waters");

            abc.Comm();
            def.motion();

        }
    }

