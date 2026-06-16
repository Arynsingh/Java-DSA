import java.util.*;
public class Searchin2Darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of row and column in 2d array: ");
        int n  = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Enter the element to be searched: ");
        int elem = in.nextInt();
        int[] ans = search(arr,elem);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr,int x){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]==x){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
