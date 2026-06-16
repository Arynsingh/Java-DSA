import java.util.Arrays;

public class plusone {
    public static void main(String[] args) {
        int[] a = {9};
        int[] ans = plusOne(a);
        System.out.println(Arrays.toString(ans));
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
