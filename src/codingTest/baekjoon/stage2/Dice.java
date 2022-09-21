package codingTest.baekjoon.stage2;
import java.util.Scanner;
public class Dice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a!=b && b!=c && a!=c){
            int max;

            if(a>b){
                if(a>c){
                    max = a;
                    System.out.println(max*100);
                }else{
                    max = c;
                    System.out.println(max*100);
                }
            }else {
                if (b > c) {
                    max = b;
                    System.out.println(max * 100);
                } else {
                    max = c;
                    System.out.println(max * 100);
                }
            }
        }else if(a==b && b==c){
            System.out.println(10000+a*1000);
        }else{
            if(a==b){
                System.out.println(1000+a*100);
            }else{
                System.out.println(1000+c*100);
            }
        }
    }
}
