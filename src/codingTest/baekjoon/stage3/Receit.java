package codingTest.baekjoon.stage3;
import java.util.Scanner;
public class Receit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            X = X - (B*A);
        }
        if(X==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
