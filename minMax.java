import java.util.Scanner;

public class minMax {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)    arr[i] = scan.nextInt();

        int max = Integer.MIN_VALUE;
        int prevMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int prevMin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] >= max){
                prevMax = max;
                max = arr[i];
            }
            else if(arr[i] > prevMax && arr[i]!=max) prevMax = arr[i];

            if(arr[i] <= min){
                prevMin = min;
                min = arr[i];
            }
            else if(arr[i] < prevMin && arr[i]!=min) prevMin = arr[i];
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

        if(prevMax == max || prevMax == Integer.MIN_VALUE) System.out.println("Prev Max: "+ "NA");
        else System.out.println("Prev Max: "+prevMax);

        if(prevMin == min || prevMin == Integer.MAX_VALUE) System.out.println("Prev Min: "+ "NA");
        else System.out.println("Prev Min: "+prevMin);

        scan.close();
    }
}
