// Multilevel Inheritance : one subclass and one parent class and one grandparent class

class Car{
    protected String model , type;
    protected double price;
}

class BMW extends Car{
    BMW(){
        super.model = "BMW M8 competition";
        super.type = "Sedan";
        super.price = 2_50_000;
    }


    void display(){
        System.out.println("Model: " + super.model);
        System.out.println("Type: " + super.type);
        System.out.println("Price: " + super.price);
    }
}

class Mansory extends BMW{
    void display(){
        System.out.println("Model: " + super.model);
        System.out.println("Type: " + super.type);
        System.out.println("Price: " + super.price);
        System.out.println("HorsePower: 1300");
        System.out.println("Tourque: 900");
    }
}

class MultilevelInheritance {
    public static void main(String[] args) {
        Mansory m8 = new Mansory();
        m8.display();
    }
}