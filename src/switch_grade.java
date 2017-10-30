public class switch_grade {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入成績");
        int score = sc.nextInt();
        int level = score/10;

        switch (level){

            case 10:
                System.out.println("get A++");
                break;
            case 9:
                System.out.println("get A");
                break;
            case 8:
                System.out.println("get B");
                break;
            case 7:
                System.out.println("get C");
                break;
            case 6:
                System.out.println("get D");
                break;
            default:
                System.out.println("get E(不及格)");
        }

    }
}

