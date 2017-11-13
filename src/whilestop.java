public class whilestop {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        Integer i;
        Integer Sum=0;
        int num;
        double avg;

        i = 1;
        System.out.println("請輸入第" + i + "個數字");
        num = sc.nextInt();

        while( num ! = 9999)
        {
            Sum = Sum + num;
        }
    }
}
