package online.chapter2.ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee=new Student();
        //클래스가 있으면 클래스를 기반으로 여러개의 인스턴스가 생성될 수 있음
        //참조변수의 역할은 생성되는 곳에 메모리 위치를 나타냄
        //지역변수 = 스택, 인스턴스=힙메모리
        studentLee.studentId=12345;
        studentLee.setStudentName("Lee");
        studentLee.address="서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentId =54231;
        studentKim.studentName="Kim";
        studentKim.address="경기도 성남시";

        studentKim.showStudentInfo();

    }
}
