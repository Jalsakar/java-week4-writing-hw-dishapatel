package programme_26_encapsulation;

public class Encapsulation {
    //private variables declared these can only accessed by public methods of class
    private String name;
    private int rollNo, age;

    //set method for name to access private variable name
    public void setName(String name) {
        this.name = name;
    }

    //get method for name to access private variable age
    public String getName() {
        return name;
    }

    //set method for roll no. to access private variable rollNo
    public void setRollNo(int i) {
        this.rollNo = rollNo;
    }

    //get method for roll no. to access private variable rollNo
    public int getRollNo() {
        return rollNo;
    }

    //set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }

    //get method for age to access private variable age
    public int getAge() {
        return age;
    }
}
