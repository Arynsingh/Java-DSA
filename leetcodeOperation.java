public class leetcodeOperation {
//    class Solution {
//        public int countOperations(int num1, int num2) {
//            return helper(num1,num2,0);
//        }
//        public int helper(int a , int b,int step){
//            if(a == 0 || b == 0){
//                return step;
//            }
//            else if(a>=b){
//   le             return helper(a-b,b,step+1);
//            }else{
//                return helper(a,b-a,step+1);
//            }
//        }
//    }
//here for the velow one time limit is exceeding so we just revise the upperone
//    public static void main(String[] args) {
//        int ans = countOperations(2,3);
//        System.out.println(ans);
//    }
////
 //    static int countOperations(int num1, int num2) {
//        int steps = 0;
//
//        while(num1<1||num2<1){
//            if(num1<num2){
//                num2 = num2 - num1;
//                steps++;
//            }else if(num2<=num1){
//                num1 = num1 - num2;
//                steps++;
//
//            }
//            steps++;
//
//        }
//        return steps;
//
//
//    }
}
