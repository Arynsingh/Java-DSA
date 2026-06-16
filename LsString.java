import java.util.*;
public class LsString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(Arrays.toString(s.toCharArray()));
        char x = in.next().charAt(0);

        boolean ans = search(s,x);
        System.out.println(ans);
    }
    static boolean search(String a, char b){
        if(a.length() == 0){
            return false;
        }
        for(char ch : a.toCharArray()){
            if(ch==b){
                return true;
            }
        }
        return false;

    }
}
