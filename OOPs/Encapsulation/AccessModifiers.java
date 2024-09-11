class Food{
    private String name;
    private double price;

    public Food(String name ,double price){
        this.name = name;
        this.price = price;
    }

    protected void display(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Samosa extends Food{
    private String sauce;

    public Samosa(String name , double price , String sauce){
        super(name , price);
        this.sauce = sauce;
    }

    public void displaySamosaDetails(){
        display();
        System.out.println("Sauce: " + sauce);
    }
}



public class AccessModifiers{
    public static void main(String[] args) {
        Food burger = new Food("CheeseBurger", 150);
        Samosa samosa = new Samosa("Chinnese", 40, "Tomato");

        burger.display();
        System.out.println();
        System.out.println();

        samosa.displaySamosaDetails();
    }
}