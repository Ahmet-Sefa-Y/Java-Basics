
public class Student {
    String name;
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print student info
    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
