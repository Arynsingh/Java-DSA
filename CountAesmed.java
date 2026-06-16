public class CountAesmed {
    public static void main(String[] args) {

        int n = 1;
        int m = 50;

        for (int i = n + 1; i <= m; i++) {
            int count = Aes(i);

            if (count == 4) {
                System.out.println(i);
            }
        }
    }

    public static int Aes(int n) {
        int count = 0;

        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                count++;
            }
        }
        return count;
    }
}
