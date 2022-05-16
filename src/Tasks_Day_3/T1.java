package Tasks_Day_3;

public class T1 {
    public static void main (String[] args){
        int[][] Array = new int[10][10];

        for (int row =0; row< Array.length; row++){
            for (int col=0; col< Array.length; col++){
                Array[row][col]=(row+1)*(col+1);
                System.out.println((row+1) + " * " + (col+1) + " = " + Array[row][col]);
            }
            System.out.println();
        }
    }
}
