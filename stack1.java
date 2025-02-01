import java.util.*;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=10;i++){
            st.push(i);
        }

        st.add(2, 100);

        

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }


    }
}