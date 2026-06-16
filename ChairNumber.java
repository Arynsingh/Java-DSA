public class ChairNumber {
   public static void main() {
       String a = "EEEEEEE"
       int ans = minimumChairs(a);


    }
    static int minimumChairs(String a) {
        String[] chairs = a.split(",");
        int count=0;
        for(String chair:chairs){
            if(chair=="E"){
                count++;
            }
        }
        return count;


    }
    }

