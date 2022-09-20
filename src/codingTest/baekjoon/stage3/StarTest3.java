package codingTest.baekjoon.stage3;
import java.util.Scanner;
public class StarTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        ****
        ***
        **
        *
         */
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("*");
            }
            for(int k = 1; k<=n; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
