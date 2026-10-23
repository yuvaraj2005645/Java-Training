

public class task3 {
    String title;
    int price;
    task3(){
        title = "unknown";
        price=0;

    }
    task3(String t){
        title =t;

    }
    task3(String t,int p){
        title=t;
        price= p;
    }
    public static void main(String[] args) {
        task3 s1 = new task3();
        task3 s2 = new task3("java");
        task3 s3 = new task3("java",100);
        System.out.println(s1.title+".."+s1.price);
        System.out.println(s2.title);
        System.out.println(s3.title+"...."+s3.price);
    }
}
