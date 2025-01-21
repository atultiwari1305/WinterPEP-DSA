public class validPalindrome {

    public static void main(String[] args){
        System.out.println(isPalindrome("racecar"));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return helper(s, 0, s.length()-1);
    }
    
    public static boolean helper(String s, int i, int j){
        if(i>=j) return true;
        if(s.charAt(i) != s.charAt(j)) return false;
        return helper(s, i+1, j-1);
    }

}