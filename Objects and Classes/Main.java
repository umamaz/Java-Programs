 class Car {
    String name ;             //Defining the Class 
    int year;
    String color ;

// Constructor for initialising the Car 
Car(String name , int year , String color){
    this.name = name;
    this.year = year ;
    this.color = color;
}

//Method to display the Car details 
void displayinfo() {
    System.out.println("name of the model:" + name + "Came in the year :" + year + "Has color :" +color);
    }  
}

public class Main{
    public static void main(String[] args) {
        // create 4 models of car 
        Car a = new Car("Toyota Camry", 2021, "White");
        Car b = new Car("Honda Civic", 2019, "Blue");
        Car c = new Car("Ford Mustang", 2022, "Red");
        Car d = new Car("BMW X5", 2020, "Black");

        a.displayinfo();
        b.displayinfo();
        c.displayinfo();
        d.displayinfo();
    }
}
