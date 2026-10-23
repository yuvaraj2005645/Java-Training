

public class task2 {
    String name;
    int id;
    int salary;
    task2(String name, int id,int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
    public static void main(String[] args) {
        task2 s1 = new task2("yuva",101,40000);
    }
    
}
