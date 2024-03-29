package java_week4_handwriting_homework;

//Java program to overload constructors
public class Programme_25_ConstructorOverLoadingExample {
    int id, age;
    String name;

    //Creating two arg constructor
    Programme_25_ConstructorOverLoadingExample(int i, String n) {
        id = i;
        name = n;
    }

    //Creating three arg constructor
    Programme_25_ConstructorOverLoadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Programme_25_ConstructorOverLoadingExample s1 = new Programme_25_ConstructorOverLoadingExample(111, "Karan");
        Programme_25_ConstructorOverLoadingExample s2 = new Programme_25_ConstructorOverLoadingExample(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}