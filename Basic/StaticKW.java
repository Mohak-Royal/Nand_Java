class Student{
    static int count;
    String name;

    static{
        count = 0;
        System.out.println("Static block Executed");
    }

    Student(String name){
        count++;
        this.name = name;
    }

    void display(){
        System.out.println("Student Name: " + name);
        System.out.println("Student count: " + count);
    }

    static void method(){
        System.out.println("This is static method");
    }
}



public class StaticKW {
    public static void main(String[] args) {
        // Student s1 = new Student("Nand");
        // s1.display();
        // Student s2 = new Student("Mohak");
        // s2.display();
        // Student s3 = new Student("Mohak");
        // s3.display();

        Student.method();
        System.out.println(Student.count);

    }
}