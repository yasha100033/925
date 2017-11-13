public class LoopWhile {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        Integer t;
        Integer sum = 0;

        t = 1;
        while (sum <500) {
            sum = sum + t;
            t++;

        }

        System.out.println(sum);
        System.out.println(t-1);

    }
}

