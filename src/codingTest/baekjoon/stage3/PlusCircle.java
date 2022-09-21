package codingTest.baekjoon.stage3;
import java.util.Scanner;
public class PlusCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int X = N;
       int answer = 0;
       while(true){
           N = (N%10)*10+((N%10)+(N/10))%10;
           answer++;
           if(X==N){
               break;}
        }
        System.out.println(answer);
    }
}
