package individualTest.oop01;

public class UserInfo {//userInfo라는 클래스 선언
    String userId;
    String userName;
    int userPhoneNumber;
    String userPw;
    String userGen;
    int userOld;
    String userMail;
    String userAddress;
    //이 위가 필드

public void showUserInfo(){
    System.out.println(userName+"님의 ID는 "+userId+" 이고 패스워드는"+userPw+"입니다.");
}
public void showUserPersonalInfo(){
    System.out.println(userName+"님의 나이는 "+userOld+"이고 성별은 "+userGen+"이며, 전화번호는 "+userPhoneNumber+"입니다");
}
public String getUserName(){
    return userName;
    }
public void setUserName(String name){
    userName=name;
    }
}//Class

