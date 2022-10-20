public class Practice03 {
    public static void main(String[] args) {
        String[] subject = {"국어","수학","영어"};
        String[] student = {"학생1","학생2","학생3","학생4","학생5"};
        int[] kor = {50,60,95,60,100};
        int[] math = {60,76,88,65,85};
        int[] eng = {70,100,87,85,77};
        int[] total = new int[5];
        double[] avg = new double[5];

        for (int i = 0; i <5; i++) {
            total[i] = kor[i]+eng[i]+math[i];
            avg[i]=(double)total[i]/3;
        }
        for (int i = 0; i <4; i++) {
            for(int j=i+1; j<5; j++){
                if(avg[j]>avg[i]){//[1]>[0]
                    String str = student[i];//str=학1
                    student[i]=student[j];//학1=학2
                    student[j]=str;//학2는 str

                    int tmp = kor[i];
                    kor[i]=kor[j];
                    kor[j]=tmp;

                    tmp = math[i];
                    math[i]=math[j];
                    math[j]=tmp;

                    tmp = eng[i];
                    eng[i]=eng[j];
                    eng[j]=tmp;

                    tmp = total[i];
                    total[i]=total[j];
                    total[j]=tmp;

                    double temp = avg[i];
                    avg[i]=avg[j];
                    avg[j]=temp;
                }
            }
        }
        System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
        for (int i = 0; i <5; i++) {
            System.out.println(student[i]+"\t"+kor[i]+"\t"+math[i]+"\t"+eng[i]+"\t"+total[i]+"\t"+avg[i]);

        }
    }
}
