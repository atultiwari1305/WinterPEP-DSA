public class mergeTwoSortedArray {
    public static void main(String[] args){
        int[] arr1 = {1,3,5,7,8,9};
        int[] arr2 = {2,3,4,6,10,11,12,13,14};

        int[] arr3 = new int[arr1.length+arr2.length];

        mergeArray(arr1,0,arr2,0,arr3,0);

        for(int num : arr3) System.out.print(num+" ");
    }

    public static void mergeArray(int[] arr1, int i, int[] arr2, int j, int[] arr3, int k){
        if(k == arr3.length) return;
        if(i>arr1.length-1){
            arr3[k++] = arr2[j++];
            mergeArray(arr1, i, arr2, j, arr3, k);
        }
        else if(j>arr2.length-1){
            arr3[k++] = arr1[i++];
            mergeArray(arr1, i, arr2, j, arr3, k);
        }
        else{
            if(arr1[i]<=arr2[j]){
                arr3[k++] = arr1[i++];
                mergeArray(arr1, i, arr2, j, arr3, k);
            }
            else{
                arr3[k++] = arr2[j++];
                mergeArray(arr1, i, arr2, j, arr3, k);
            }
        }
    }
}
