



class Vehicle{
    public void drive(){
        System.out.println("Vehicle is beign driven.");
    }
}

class Car extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Car is beign driven.");
    }

    public void park(){
        System.out.println("Car is parked.");
    }
}


class Truck extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Truck is being driven.");
    }

    public void loadCargo(){
        System.out.println("Tuck is loading cargo.");
    }
}

public class UpCastingDownCasting {
    public static void main(String[] args) {
        //Upcasting involves treating an object of a subclass as an object of a superclass. This is implicit and doesn't require explicit type casting.

        Vehicle vehicle = new Car();
        vehicle.drive();
        // vehicle.park();

        Vehicle vehicle2 = new Truck();  // Upcasting
        
        //Downcasting involves explicitly converting an object of a super class to an object of a subclass.

        Truck truck = (Truck) vehicle2; // downcating

        truck.drive();
        truck.loadCargo();
    }   
}



/*
Tasks:

Scenario 1: Vehicle Rental System
In a vehicle rental system, create a base class called "Vehicle" with a method called "rent" that performs the rental process. Implement derived classes like "Car" and "Motorcycle" that override the "rent" method with their specific rental processes.

Scenario 2: Shape Drawing Application
In a shape drawing application, define a base class called "Shape" with a method called "draw" that displays the shape on the screen. Implement derived classes like "Circle" and "Rectangle" that override the "draw" method with their specific drawing logic.

Scenario 3: Vehicle Rental Management System
In a vehicle rental management system, create a base class called "Vehicle" with a method called "rent" that performs the rental process. Implement derived classes like "Car" and "Motorcycle" that override the "rent" method with their specific rental processes.

Scenario 4: Shape Drawing Application
In a shape drawing application, define a base class called "Shape" with a method called "draw" that displays the shape on the screen. Implement derived classes like "Circle" and "Rectangle" that override the "draw" method with their specific drawing logic.


*/