package Tasks_Day_1;

import java.util.Scanner;

public class T3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter whole number");
        int a = input.nextInt();

        boolean result;
        result = (a % 2) == 0;

        System.out.println(result);
    }
}
