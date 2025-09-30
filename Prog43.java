// Superclass
class SchoolMember {
    String name;
    int age;

    SchoolMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showRole() {
        System.out.println(name + " is a member of the school.");
    }

    void attend() {
        System.out.println(name + " is attending the school.");
    }
}

// Subclass 1
class Student extends SchoolMember {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void showRole() {
        System.out.println(name + " is a student in grade " + grade + ".");
    }

    void study() {
        System.out.println(name + " is studying for exams.");
    }
}

// Subclass 2
class Teacher extends SchoolMember {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void showRole() {
        System.out.println(name + " is teaching " + subject + ".");
    }

    void teach() {
        System.out.println(name + " is conducting a class.");
    }
}

// Main class
public class Prog43 {
    public static void main(String[] args) {
        // Polymorphic references
        SchoolMember member1 = new Student("John", 15, "10th");
        SchoolMember member2 = new Teacher("Mrs. Smith", 40, "Mathematics");

        // Array of school members
        SchoolMember[] members = {member1, member2};

        for (SchoolMember member : members) {
            member.showRole(); // Calls overridden method
            member.attend();   // Calls superclass method

            // Access subclass-specific methods
            if (member instanceof Student) {
                ((Student) member).study();
            } else if (member instanceof Teacher) {
                ((Teacher) member).teach();
            }

            System.out.println("----------------------");
        }
    }
}
