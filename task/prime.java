import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        int n;
        

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
            
            if(arr[i]>0){
                System.out.println("positive");
            }
            else if(arr[i]<0){
                System.out.println("negative");
            }
            else{
                System.out.println("zero");
            }
            count = 0;
            for (int j =1;j<=arr[i];j++){
                
                if (arr[i]%j==0){
                    count++;
                }
            }
            if ( arr[i]>1 && count ==2){
                System.out.println("prime");
            }
            else{
                System.out.println("Not prime");
            }

        }


    }
}