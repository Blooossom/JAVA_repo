import java.util.Arrays;
import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[10];

        int sum =0;
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번 학생 성적 입력: ", i + 1); //입력대기
            scores[i] = sc.nextInt();//각 인덱스를 사용자로부터 입력받아 저장
            sum += scores[i];
            }
        Arrays.sort(scores);
        int average = sum/10;
        double tmp=0;

        for(int j=0; j< scores.length; j++){
            tmp = Math.pow(scores[j]-average, 2);
        }
        double var =tmp/10;
        double sd = Math.sqrt(var);
            System.out.println(Arrays.toString(scores));
            System.out.println("최소값 : " + scores[0]);
            System.out.println("최대값 : " + scores[9]);
            System.out.println("평균 : " + average);
            System.out.println("분산 : " + var);
            System.out.println("표준편차 : " + sd);
        }

    }

