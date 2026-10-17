import java.util.Arrays;
import java.util.Scanner;
public class copy{
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
       
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] arr2 = Arrays.copyOf(arr, n);
        System.out.println(Arrays.toString(arr2));
    }
}

