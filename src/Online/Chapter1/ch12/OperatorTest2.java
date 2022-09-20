package Online.Chapter1.ch12;

public class OperatorTest2 {
    public static void main(String[] args) {
        int gameScore = 150;

        int lastScore = ++gameScore; //gameScore +=1; gameScore=gameScore +1;

        System.out.println(gameScore);
        System.out.println(lastScore);

        int gameScore1 = 150;
        int lastScore1 = gameScore1++;
        System.out.println(lastScore1);
        System.out.println(gameScore1);
    }
}
