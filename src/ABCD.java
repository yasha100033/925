public class ABCD {
    public static void main(String[] args){

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入成績");
        int grade = sc.nextInt();

        if (grade >=80){
            System.out.println("levelA");
        }
        else{
            if (grade >=70){
                System.out.println("levelB");
            }
            else{
                if (grade >=60){
                System.out.println("levelC");
            }
            else{
                    System.out.println("FALSE");
                }
        }
        System.out.println("完成測驗");
    }
  }
}
