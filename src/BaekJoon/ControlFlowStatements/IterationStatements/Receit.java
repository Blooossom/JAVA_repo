package BaekJoon.ControlFlowStatements.IterationStatements;
import java.util.Scanner;
public class Receit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int count = sc.nextInt();


        for(int i=1; i<=count; i++){
            int price = sc.nextInt();
            int number = sc.nextInt();
            total = total - (number*price);
        }
        if(total==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
