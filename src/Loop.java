public class Loop {

    public static void main(String[] args){

        java.util.Scanner sc = new java.util.Scanner(System.in);

       Integer t ;
       Integer num ;
       Integer sum = 0 ;
       double avg;

        for (t = 1 ; t<=10 ; t=t+1){

            System.out.println("請輸入第"+t+"個數字");
            num = sc.nextInt();
            sum = sum + num ;

        }
        avg = sum/10 ;

        System.out.println(sum);
        System.out.println(avg);
    }
}
