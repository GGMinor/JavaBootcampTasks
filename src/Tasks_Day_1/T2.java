package Tasks_Day_1;

import java.util.concurrent.ThreadLocalRandom;

public class T2 {
    public static void main (String[] args){

        int[] Array = new int[4];
        int[] ArrayCopy = new int[4];

        //Example Array
        for(int i=0; i<Array.length; i++){
            Array[i]= ThreadLocalRandom.current().nextInt(1, 10);
            System.out.println(Array[i]);
        }
        System.out.println();

        //Array Copy
        for(int i=0; i<Array.length; i++){
            ArrayCopy[i]= Array[i];
            System.out.println(ArrayCopy[i]);
        }
    }
}
