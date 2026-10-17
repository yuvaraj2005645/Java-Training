import java.util.Arrays;
import java.util.Scanner;
public class equal{
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
       
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        if(Arrays.equals(arr, arr2)){
            System.out.println("equal");

        }
        else{
            System.out.println("Not equal");
        }
    }
}
        