package codingTest.baekjoon.stage3;
import java.util.Scanner;
public class SmallerThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        //스캐너가 N과 X를 입력 받음
        //수열 A를 이루는 정수 N개,

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<X; j++){
                System.out.println(j);
            }
        }
    }
}
