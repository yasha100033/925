public class IOOgood {

    public static void main(String[] args){

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入成績");
        int grade = sc.nextInt();

        if( (grade >100) || (grade<0)){
            System.out.println("ERROR");
        }
        else{
                if (grade >60){
                    System.out.println("PASS");
                }
                else{
                    System.out.println("FALSE");
                }
            }
        System.out.println("呵呵笑你");
    }
}
