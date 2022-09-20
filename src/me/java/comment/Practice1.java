package me.java.comment; // 패키지 (클래스 집합, 이름은 소문자로 작성)

public class Practice1 {// 클래스(이름은 대문자로 작성, Upper CamelCase)
    public static void main(String[] args) {// 메인 함수(프로그램 실행 시 자동으로 호출되어 순차적으로 문장이 실행)
        /*
         * this is javadoc comment
         * it will be included at /class file(after compile)
         * */



        // 문장 끝에는 세미콜론(;) 작성
        System.out.println("Hello Java World - 1"); // 콘솔에 출력하는 함수
        System.out.println("Hello Java World - 2");
        System.out.println("Hello Java World - 3");
        System.out.println("Hello Java World - 4");
        System.out.println("Hello Java World - 5");

        // 콘솔에 출력하는 함수
        System.out.println("1"); // 콘솔에 출력하는 함수 (문장 + 엔터)
        System.out.print("2"); // 콘솔에 출력하는 함수 (문장만 출력)
        System.out.printf("3"); //콘솔에 출력하는 함수(포맷에 맞춰 출력)
        System.out.println();
    }
}
