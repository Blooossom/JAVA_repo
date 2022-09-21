package me.java.input;
import java.util.Scanner;
public class InputExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        double height;
        System.out.print("이름을 입력하세요");
        name = sc.next();
        System.out.print("나이를 입력하세요");
        age = sc.nextInt();
        System.out.print("키를 입력하세요");
        height = sc.nextDouble();

        System.out.println("이름은 " + name + " 나이는 " + age + " 키는 " + (int)height);

    }
}
