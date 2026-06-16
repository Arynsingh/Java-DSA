import java.util.*;
public class CyclicSort {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i = 0;i<n;i++){
           arr[i]= sc.nextInt();
       }
       System.out.println(Arrays.toString(arr));
       cyclesort(arr);
       System.out.println(Arrays.toString(arr));

    }
    static void cyclesort(int[] arr){
       int i = 0;
       while(i<arr.length){
           int correct = arr[i]-1;
           if(arr[i]!=arr[correct]){
               swap(arr,i,correct);
           }else{
               i++;
           }
       }
    }
    static void swap(int[] arr,int x,int y){
       int temp = arr[x];
       arr[x]=arr[y];
       arr[y]= temp;
    }

}
