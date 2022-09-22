package codingTest.baekjoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2558{
        public static void main(String[] args)throws IOException{
            Scanner sc = new Scanner(System.in);

            int A1 = sc.nextInt();
            int B1 = sc.nextInt();
            sc.close();

            System.out.println(A1+B1);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A+B).append("\n");
            System.out.println(sb);
        }
    }

