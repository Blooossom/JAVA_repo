package me.java.dataType;

public class GarbageValueExample {
    public static void main(String[] args) {
        byte var1 = 125;
        int var2 = 125;

        for(int i = 0; i<5; i++){
            var1++;
            var2++;
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
        } //위에서 프로모션 발생
        //why > 문자열 + 정수 > 문자열 + 문자열로 프로모션
    }
}
