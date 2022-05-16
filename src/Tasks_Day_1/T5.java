import java.util.Scanner;

public class T5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter boolean");
        boolean b1 = input.nextBoolean();

        if (b1==true)
            System.out.println("false");
        else System.out.println("true");

    }
}
