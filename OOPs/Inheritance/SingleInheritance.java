//  Single Inheritance : one subclass and one parent class

class Father{
    double property;

    Father(){
        this.property = 100000;
    }
}


class Child extends Father{
    
    void display(){
        System.out.println("I have property of : " + property);
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
    
}