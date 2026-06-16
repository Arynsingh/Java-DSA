import java.util.ArrayList;

//public class LinearSearchRec {
//    public static void main(String[] args){
//        int[] a = {21,31,31,62,33,42,34};
//        boolean ans = Ls(a,31,0);
//        System.out.println(ans);
//        Findall(a,31,0);
//        System.out.println(list);
//    }
//    public static boolean Ls(int[] a,int target,int index){
//        if(index == a.length){
//            return false;
//        }
//        return a[index]== target || Ls(a,target,index+1);
//    }
    //now if you have to return  all index  for multiple same target
//    static ArrayList<Integer> list = new ArrayList<>();
//    static void Findall(int[] a , int target , int i){
//        if(i ==  a.length){
//            return;
//        }
//        if(a[i]==target){
//            list.add(i);
//        }
//        Findall(a,target,i+1);
//    }
//}
//
//
////
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int i = 1;
//
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[j] != nums[i - 1]) {
//                nums[i] = nums[j];
//                i++;
//            }
//        }
//
//        return i;
//    }
//}





public class LinearSearchRec{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,5,55,5,4,2,1};
        System.out.println(LineSrchArr(arr,5,0,new ArrayList<>()));

    }
   public static ArrayList<Integer> LineSrchArr(int[] arr,int target,int index ,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return LineSrchArr(arr,target,index+1,list);
    }
}










