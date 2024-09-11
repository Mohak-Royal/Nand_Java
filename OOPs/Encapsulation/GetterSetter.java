class Sport{
    private String name;
    private String type;
    private boolean isTeamSports;

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Team Sports?: " + isTeamSports);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public boolean getIsTeamSports(){
        return isTeamSports;
    }

    public void setIsTeamSports(boolean isTeamSports){
        this.isTeamSports = isTeamSports;
    }

}


public class GetterSetter {
    public static void main(String[] args) {
        Sport football = new Sport();

        // System.out.println(football.name);

        football.setName("Fifa");
        football.setType("OutDoor");
        football.setIsTeamSports(true);

        System.out.println(football.getName());
        System.out.println(football.getType());
        System.out.println(football.getIsTeamSports());


        // football.display();
    }
    
}


// Bank Account Management
// Create a class BankAccount with fields like accountNumber, balance, and accountHolderName. Use getters and setters to access and update these fields.


// Employee Details
// Create a class Employee with fields like employeeId, name, designation, and salary. Use getters to retrieve the employee details and setters to update the designation and salary.


// Book Information
// Create a class Book with fields like title, author, price, and isbn. Use getters to retrieve book details and setters to update the price and title if necessary.


// Student Record
// Create a class Student with fields like studentId, name, grade, and age. Use setters to update the grade and getters to retrieve student information.


// Car Specifications
// Create a class Car with fields like make, model, year, and price. Use getters and setters to manage the price and year of the car.

