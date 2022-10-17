package toyProject_1;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Parameter p = new Parameter();
        p.setMinimumSpentTime(Integer.parseInt(br.readLine()));
        p.setMinimumTotalPay(Integer.parseInt(br.readLine()));
        System.out.println(p);
    }
}
/*

 */