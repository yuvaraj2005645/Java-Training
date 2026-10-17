import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}