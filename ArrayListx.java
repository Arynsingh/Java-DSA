import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int n = sc.nextInt();
        System.out.println("Select the operation: add , remove , check, update");
        sc.nextLine();
        String op = sc.nextLine();
        if (op.equals("add")) {
            for(int i = 0; i < n; i++){
                list.add(sc.nextInt());
            }
        } else if (op.equals("remove")) {
            list.remove(sc.nextInt());
        } else if (op.equals("check")) {
            System.out.println(list.contains(sc.nextInt()));
        } else if (op.equals("update")) {
            System.out.println("enter the index for set and the value");
            int index = sc.nextInt();
            list.set(index, sc.nextInt());
        } else {
            System.out.println("Invalid Operation");
        }
        System.out.println(list);

    }
    }//tomorrow use while and switch,,,, on your own else go cry like bitch

