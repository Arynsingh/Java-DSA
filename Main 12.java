class Solution {
   public static void main(String[] args) {
       int x = -2147483648;
       System.out.println(reverse(x));

    }
    static int reverse(int x) {

        int rev = 0;

        while (x != 0) {
            int n = x % 10;

            // Correct overflow check


            rev = rev * 10 + n;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            x = x / 10;
        }

        return rev;
    }
}
