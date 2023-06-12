import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1st task
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] integers = new int [num];
        for (int i = 0; i < integers.length; i++ ) {
            integers[i] = i * 2;
        }
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Value " + (i + 1) + ": " + integers[i]);
        }
//        2nd task
        for (int i = 10; i > 0; i--) {
            for (int j = 10; j > 0; j--)
                System.out.println(i + " * " + j + " = " + i * j);
        }
////        3rd task
//        While
        int c = 0;
        while (c < 25) {
            System.out.println(c);
            c += 2;
        }
//        Do while
        int d = 100;
        do {
            d -= 25;
            System.out.println(d);
        } while(d >= 10);
//        4th task
        int [] [] array = new int [4] [8];
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[0].length; j++) {
                        array [i] [j] = i * j;
                    }
                }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.println(array[i][j]);
                }
                System.out.println();
            }
//            5th task
        int numForCompare = 1000;
        int [] minNums = {100, -96, 45, 987, 56, 635};
        for (int i = 0; i < minNums.length; i++) {
            if (minNums[i] < numForCompare) {
                numForCompare = minNums[i];
            }
        }
        System.out.println(numForCompare);
    }
}