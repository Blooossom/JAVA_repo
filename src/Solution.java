public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        String[] input = new String[6];
        String[] answer = new String[6];

        for (int i = 0; i <6; i++) {
            input[i] = Integer.toBinaryString(arr1[i] | arr2[i]);

            //각 배열 인덱스 순서대로 비트연산 해다가 바이너리로 변환함
            //11111 10101 11101 10011 11111
        }for (int i = 0; i <input.length ; i++) {
            System.out.println(input[i]);
            input[i]=input[i].replace('1','#');
            input[i]=input[i].replace('0', ' ');
            System.out.println(input[i]);
                }

        System.out.println(Integer.toBinaryString(31|14));
        //### #

            }


}