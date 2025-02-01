import java.util.*;

public class nextSmaller2 {
    public static void main(String[] args){
        int[] arr = {2, 1, 5, 6, 2, 3};

        int[] nextSmallLeft = leftSmall(arr);
        int[] nextSmallRight = rightSmall(arr);

        for(int num : nextSmallRight) System.out.print(num+" ");
        System.out.println();
        for(int num : nextSmallLeft) System.out.print(num+" ");
    }

    public static int[] leftSmall(int[] heights){
        int n = heights.length;
        int[] left = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return left;
    }

    public static int[] rightSmall(int[] heights){
        int n = heights.length;
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]) st.pop();
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return right;
    }
}
