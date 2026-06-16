//Naukri Campus Question
public class Rotatebyn {
        public static void main(String[] args) {
            String s = "doexecute";
            int n = 7;

            String result = rotateLeft(s, n);
            System.out.println(result); // output: executedo
        }

        public static String rotateLeft(String s, int n) {
            n = n % s.length();
            return s.substring(n) + s.substring(0, n);
        }
    }

