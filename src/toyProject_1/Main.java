package toyProject_1;
import toyProject_1.customer.Customer;
import toyProject_1.group.Parameter;

import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Parameter p = new Parameter();
        p.setMinimumSpentTime(Integer.parseInt(br.readLine()));
        p.setMinimumTotalPay(Integer.parseInt(br.readLine()));
        System.out.println(p);
        Customer customer = new Customer();
        customer.setSpentTime(Integer.parseInt(br.readLine()));
        customer.setTotalPay(Integer.parseInt(br.readLine()));
    }
}
/*

 */