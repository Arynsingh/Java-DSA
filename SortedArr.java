public class SortedArr {
    public static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean ans = sorted(arr,0);
        System.out.println(ans);
    }
    public static boolean sorted(int[] nums,int index){
        if(index == nums.length-1){
            return true;
        }
        return nums[index]<nums[index+1] && sorted(nums,index + 1);
    }
}
