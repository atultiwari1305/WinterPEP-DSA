import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class ImplementTree {
    public static class Node{
        int data;
        List<Node> child;
        public Node(){

        }
        public Node(int x){
           this.data = x;
           this.child = new ArrayList<>();
        }
    }
    
    public static void main(String[] args){
        int[] arr = {10,20,30,-1,60,-1,-1,30,70,-1,80,110,-1,-1,120,-1,-1,90,100,-1,-1,-1};
        Node node = construct(arr);
        display(node);
        System.out.println("Size: "+size(node));
        System.out.println("Max Element: "+max(node));
        System.out.println("Height: "+maxHeight(node));
    }

    private static Node construct(int[] arr){
        int n = arr.length;
        Node root = null;
        Stack<Node> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(arr[i] == -1) st.pop();
            else{
                Node node = new Node(arr[i]);
                if(st.size()>0){
                    st.peek().child.add(node);
                }
                else{
                    root = node;
                }
                st.push(node);
            }
        }
        return root;
    }

    private static void display(Node node){
        String s = node.data+"->";
        for(Node n : node.child){
            s += n.data+"->";
        }
        s+=".";
        System.out.println(s);
        for(Node n : node.child){
            display(n);
        }
    }

    private static int size(Node root){
        int res = 0;
        for(Node node : root.child){
            int s = size(node);
            res += s;
        }
        return res+=1;
    }

    private static int max(Node root){
        int max = Integer.MIN_VALUE;
        for(Node node : root.child){
            int m = max(node);
            max = Math.max(max, m);
        }
        return Math.max(root.data, max);
    }

    private static int maxHeight(Node root){
        int max = 0;
        for(Node node : root.child){
            int m = maxHeight(node);
            max = Math.max(max, m);
        }
        return max+1;
    }
}
