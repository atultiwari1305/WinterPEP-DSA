import java.util.*;

public class nextSmaller {
    public static void main(String[] args){
        int[] arr = {2, 1, 5, 6, 2, 3};
        int n = arr.length;

        int[] nextSmallLeft = new int[n];
        int[] nextSmallRight = new int[n];

        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        Arrays.fill(nextSmallLeft, 6);
        Arrays.fill(nextSmallRight, -1);

        st.push(0);
        st2.push(n-1);

        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int id = st.pop();
                nextSmallLeft[id] = i;
            }
            st.push(i);

            while(!st2.isEmpty() && arr[st2.peek()]>arr[n-1-i]){
                int id = st2.pop();
                nextSmallRight[id] = n-1-i;
            }
            st2.push(n-1-i);
        }

        for(int num : nextSmallRight) System.out.print(num+" ");
        System.out.println();
        for(int num : nextSmallLeft) System.out.print(num+" ");
    }
}
