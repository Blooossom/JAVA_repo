public class Test22 {
    public static void main(String[] args) {
                String str1 = "hello world world";
                String str2 = "hello world world";
                String replace1 = str1.replace("world", "java world");
                System.out.println("replace1 = " + replace1);
                String replace2 = str2.replace('w', 'W');
                System.out.println("replace2 = " + replace2);
                System.out.println();

                String strAll1 = "hello world world";
                String strAll2 = "hello world world";
                String strAll3 = "hello world world";
                String replaceAll1 = strAll1.replaceAll("world", "java world");
//        String replaceAll2 = strAll2.replaceAll('w', 'W'); // 문자 불가
                String replaceAll3 = strAll3.replaceAll("[a-z]", "_"); // 정규 표현식 사용가능
                System.out.println("replaceAll1 = " + replaceAll1);
//        System.out.println("replaceAll2 = " + replaceAll2);
                System.out.println("replaceAll3 = " + replaceAll3);
                System.out.println();

                // 입력 데이터 형식 확인 (포맷 확인)
                String strRegEx1 = "abasdasd!!012345^~*#"; // 영문자와 숫자 이외의 문자 제거
                String replaceAllRegEx1 = strRegEx1.toLowerCase().replaceAll("[^a-z0-9]", "");
                System.out.println("replaceAllRegEx1 = " + replaceAllRegEx1);

                String strRegEx2 = "가나다라마바사ABCDEFG"; // 한글 이외의 다른 문자 제거
                String replaceAllRegEx2 = strRegEx2.replaceAll("[가-힣]", "");
                System.out.println("replaceAllRegEx2 = " + replaceAllRegEx2);
                System.out.println();
            }
        }
