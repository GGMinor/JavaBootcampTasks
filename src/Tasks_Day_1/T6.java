import java.util.Scanner;

public class T6 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = input.nextInt();

        System.out.println("Enter second number");
        int b = input.nextInt();

        if(a==b || (a<0 && b>0) || (a>100 && b>100))
            System.out.println("true");
        else System.out.println("false");
    }
}
