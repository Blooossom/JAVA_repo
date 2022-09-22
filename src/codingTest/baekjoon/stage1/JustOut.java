package codingTest.baekjoon.stage1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class JustOut {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=100; i++) {
            String str = st.nextToken();
            sb.append(str);
            System.out.println(sb);
        }
    }
}
