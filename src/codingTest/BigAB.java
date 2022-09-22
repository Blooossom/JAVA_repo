package codingTest;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Scanner;
public class BigAB {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        long A = Long.parseLong(br.readLine());//sc.nextDouble(); //
        long B = Long.parseLong(br.readLine());//sc.nextDouble(); //
        sb.append(A+B).append("\n");
        System.out.println(A+B);
        //9223372036854775807
        //9223372036854775808
    }
}
