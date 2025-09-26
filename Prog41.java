// Main class to run the program
public class Prog41 {
    public static void main(String[] args) {
        // Encapsulation: setting and getting private fields via methods
        Employee emp1 = new Employee("Alice", 50000);
        emp1.setBonus(5000);
        System.out.println(emp1.getName() + "'s Total Salary: " + emp1.getSalary());

        // Inheritance: Manager extends Employee
        Manager mgr = new Manager("Bob", 80000, "IT");
        mgr.setBonus(10000);
        System.out.println(mgr.getName() + " (Manager of " + mgr.getDepartment() + ") earns " + mgr.getSalary());

        // Polymorphism: 
        // Compile-time (method overloading)
        Calculator calc = new Calculator();
        System.out.println("Addition (2+3): " + calc.add(2, 3));
        System.out.println("Addition (2.5+3.5): " + calc.add(2.5, 3.5));

        // Runtime (method overriding + dynamic dispatch)
        Employee polyEmp = new Manager("Charlie", 70000, "HR");
        System.out.println("Polymorphic Salary (overridden): " + polyEmp.getSalary());

        // Abstraction: using an abstract class
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}

// -------------------------
// 1. Encapsulation Example
// -------------------------
class Employee {
    private String name;
    private double baseSalary;
    private double bonus;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter and Setter methods (encapsulation)
    public String getName() {
        return name;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return baseSalary + bonus;
    }
}

// -------------------------
// 2. Inheritance Example
// -------------------------
class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary); // Call parent constructor
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    // Overriding method (runtime polymorphism)
    @Override
    public double getSalary() {
        // Managers always get extra 20% bonus
        return super.getSalary() * 1.2;
    }
}

// -------------------------
// 3. Polymorphism Example
// -------------------------
class Calculator {
    // Method Overloading (compile-time polymorphism)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// -------------------------
// 4. Abstraction Example
// -------------------------
abstract class Shape {
    abstract double area(); // abstract method
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
