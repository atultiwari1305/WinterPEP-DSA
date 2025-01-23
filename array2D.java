import java.util.Scanner;

public class array2D {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
