// When you pass another class' object as a parameter into the current class then it is called aggregation



class Address{
    private String city , state , country;

    public Address(){};

    public Address(String city , String state , String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public void display(){
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Country: " + this.country);
    }
}

class Employee{
    private int id;
    private String name;
    private String mobileNumber;
    private Address address;

    public Employee(){};


    public Employee(int id , String name , String mobileNumber , Address address){
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }


    public void display(){
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Mobile Number: " + this.mobileNumber);
        address.display();
    }
}

public class Aggregation {
    public static void main(String[] args) {
        // Address address = new Address("Gandhinagar", "Gujarat", "India");

        // Employee e1 = new Employee(101, "Nand", "1234567890", address);

        // e1.display();

        Employee e1 = new Employee(101, "Nand", "1234567890", new Address("Gandhinagar", "Gujarat", "India"));
        e1.display();
    }
}