import java.util.Scanner;
public class jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int [][] stu = new int[n][];

        for(int i=0;i<n;i++){
            int sub = sc.nextInt();
            stu[i] = new int[sub];
            for(int j=0;j<sub;j++){
                stu[i][j] = sc.nextInt();
            }

        }
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<stu[i].length;j++){
                sum +=stu[i][j];

            }
            System.out.println(sum);
        }

    }
    
}
