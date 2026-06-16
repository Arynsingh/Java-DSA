//Array list is a dynamic array used when you dont know the size of array u want
import java.util.ArrayList;
import java.util.Scanner;
public class DynamicArray {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>(10);
        // For string we can use String instead of Integer
        list.add(67);
        list.add(52);
        list.add(45);
        list.add(67);
        list.add(52);
        list.add(45);
        list.add(67);
        list.add(52);
        list.add(45);
        list.add(67);
        list.add(52);
        list.add(45);
        list.add(67);
        list.add(52);
        list.add(45);
        list.add(67);
        list.add(52);
        list.add(45);
        list.add(67);
        list.add(52);
        list.add(45);
        System.out.println(list.contains(45));//checks if it contains any specific element or not
        System.out.println(list);//we can directly print these
        list.set(0,99);//used for updating new value in list
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println("Enter the number of ");
    }
}
