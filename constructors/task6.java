
    
class Calculator {

    Calculator getObject() {
        return this;
       
    }

    void display() {
        System.out.println("Calculator method called");
    }
}

public class task6 {
    public static void main(String[] args) {
        
    
        Calculator s1 = new Calculator();
        s1.getObject().display();
    }
}