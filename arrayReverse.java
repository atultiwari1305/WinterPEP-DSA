public class arrayReverse {
    public static void main(String[] args){
        int[] arr= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        revArr(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void revArr(int[] arr, int i, int j){
        if(i >= j){
            return;
        }
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;

        revArr(arr, i+1, j-1);
    }
}
