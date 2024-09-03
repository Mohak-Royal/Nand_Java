class Mathematician{
    String name;
    int age;
    String degree;

    Mathematician(String degree){   
        this.degree = degree;
    }


    void display(){
        System.out.println("Name: " + name + "\nAge: " + age + "\nDegree: " + degree);
    }
}

class Nand extends Mathematician{
    Nand(String name , int age , String degree){
        super(degree); // it will call constructor  of the parent class
        super.name = name;
        super.age = age;
    }

    void display(){
        super.display(); // it will call parent class's display method 
    }
}


public class SuperKW {  
    public static void main(String[] args) {
        Nand nand = new Nand("Nand", 19, "PhD");

        nand.display();
    }
}




/*
super keyword:
Scenario 1: Car Manufacturing
In a car manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

Scenario 2: Online Shopping
In an online shopping system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "Electronics" and "Clothing" that override the "displayDetails" method and use the super keyword to display both general and specific product details.

Scenario 3: Vehicle Manufacturing
In a vehicle manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

Scenario 4: Online Retail System
In an online retail system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "displayDetails" method and use the super keyword to display both general and specific product details.
*/