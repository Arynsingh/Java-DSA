class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
    public int helper(int a , int step){
        if(a==0){
            return step;
        }
        else if(a%2==0){
            return helper(a/2,step+1);
        }
        return helper(a-1,step+1);
    }
}