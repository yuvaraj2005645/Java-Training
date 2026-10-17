
import java.util.Arrays;
import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
       
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length-1;
        int temp;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(arr));
    }
}

