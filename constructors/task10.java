
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class task10 {
    public static void main(String[] args) {
        Employee e = new Employee("Ravi", 25000);
        e.display();
    }
}
