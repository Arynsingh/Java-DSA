public class CountNumberofways {
   public static void main() {
       int n = 5;
       int ans = count(n);
       System.out.println(ans);
       }
       static int count(int a){
       if(a==1||a==2){
           return a;
       }else if(a==3){
           return 4;
       }else{
           return count(a-1)+count(a-2)+count(a-3);
       }
       }

    }

//climbing stairs and Countnumberof ways
//We are using fibonacci nprogram to count the number of ways'

