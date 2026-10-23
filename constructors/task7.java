
class Animal {
    String name = "doggy";
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    String name="Heloo";
    
    Dog() {
       
        super();
        System.out.println("Dog constructor");
        System.out.println(super.name);
        System.out.println(this.name);
    }
   
}

public class task7 {
    public static void main(String[] args) {
        Dog d = new Dog();
       
    }
}
