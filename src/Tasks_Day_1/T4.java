import java.util.Scanner;

public class T4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter whole number");
        int a = input.nextInt();

        if ((a % 2) == 0) {
            System.out.printf("Number %d is even", a);
        } else System.out.printf("Number %d is odd", a);
    }
}
