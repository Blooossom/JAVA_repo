package Online.Chapter1.ch08;

public class CharacterTest {
    public static void main(String[] args) {

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int) ch1);

        char ch2 = 66;//숫자도 문자로 인식하여 ch로 출력
        System.out.println(ch2);
        System.out.println((char) ch2);

        int ch3 = 67;
        System.out.println((char) ch3);
        System.out.println(ch3);

        //char ch = -66; > 음수는 쓸 수 없다

        //char ch = 1234567890; > 너무 큰 숫자도 사용 불가

        char han = '한';
        char ch = '\uD55C';

        System.out.println(han);
        System.out.println(ch);
    }
}
