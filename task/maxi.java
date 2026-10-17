import java.util.Scanner;
public class maxi{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int maxi = arr[0];
        int mini = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]> maxi){
                maxi = arr[i];
            }
            if(arr[i]> maxi){
                maxi = arr[i];
            }
        }
        System.out.println(maxi);
        System.out.println(mini);

    }
}