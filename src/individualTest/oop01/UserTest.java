package individualTest.oop01;

public class UserTest {
    public static void main(String[] args) {
        UserInfo userKim = new UserInfo();
        userKim.userName = "김길동";
        userKim.userId="KimKimKim";
        userKim.userPw="12345";
        userKim.userGen="Male";
        userKim.userOld=24;
        userKim.userPhoneNumber=01012341234;
        userKim.userAddress = "서울시 강남구";
        userKim.userMail = "1234@1234.123";

        userKim.getUserName();
        userKim.setUserName("김철수");
        userKim.showUserInfo();
        userKim.showUserPersonalInfo();

    }
}
