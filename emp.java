

class Employee {
    // Private fields (cannot be accessed directly)
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary > 5000) {  // validation
            this.salary = salary;
        } else {
            System.out.println("Not Eligible");
        }
    }
    public double getSalary() {
        return salary;
    }
}



public class emp {
    public static void main(String[] args) {


        // Creating a loop
        Employee[] emp = new Employee[8];
        emp[0] = new Employee("Umama", 23000);
        emp[1] = new Employee("John", 500);
        emp[2] = new Employee("Emma", 4500);
        emp[3] = new Employee("Lois", 230);
        emp[4] = new Employee("Bateman", 20000);
        emp[5] = new Employee("Mark", 200);
        emp[6] = new Employee("Srenea", 503);
        emp[7] = new Employee("Elena", 999);


       for (Employee e : emp) {
           e.setSalary(e.getSalary());
            System.out.println(e.getSalary());
       }

        }
        }





    

