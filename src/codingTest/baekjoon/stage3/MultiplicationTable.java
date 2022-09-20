package codingTest.baekjoon.stage3;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for(int count = 1; count<=9; count++){

            System.out.println(N + " * " + count + " = " + N*count);
        }

    }
}
