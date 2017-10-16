import java.util.Scanner;

public class cylinder {

    public static void main(String[] args) {
         java.util.Scanner sc = new java.util.Scanner(System.in);

         float r=sc.nextFloat();
         float h=sc.nextFloat();

         System.out.println(Math.PI*Math.pow(r,2)*h);

    }
}
