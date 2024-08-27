// Hierarchical Inheritance : one parent class and multiple subclasses

class BMW{
    protected String model;
    protected double price;
    protected int door , year;

    BMW(){}

    BMW(String model , double price , int door , int year){
        this.model = model;
        this.price = price;
        this.door = door;
        this.year = year;
    }

    protected void display(){
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Door: " + door);
    }
}

class X extends BMW{
    String type;
    int tourque , horsePower;

    X(String model , double price , int door , int year , String type , int tourque , int horsePower){
        super(model, price, door, year);
        this.type = type;
        this.tourque = tourque;
        this.horsePower = horsePower;
    }

    void displayX(){
        super.display();
        System.out.println("Type: " + type);
        System.out.println("Tourque: " + tourque);
        System.out.println("horsePower: " + horsePower);
    }
}

class M extends BMW{
    String mode;
    int tourque , horsePower;


    M(String model , double price , int door , int year , String type , int tourque , int horsePower , String mode){
        super(model, price, door, year);
        this.mode = mode;
        this.tourque = tourque;
        this.horsePower = horsePower;
    }

    void displayX(){
        super.display();
        System.out.println("Mode: " + mode);
        System.out.println("Tourque: " + tourque);
        System.out.println("horsePower: " + horsePower);
    }
}