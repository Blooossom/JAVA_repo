package toyProject_1;

import java.util.Objects;

public class User {
    private int serialNO;
    private String userName;
    private String userID;
    private int spentTime;
    private int totalPay;

    public User(int serialNO, String userName, String userID, int spentTime, int totalPay) {
        this.serialNO = serialNO;
        this.userName = userName;
        this.userID = userID;
        this.spentTime = spentTime;
        this.totalPay = totalPay;
    }

    public int getSerialNO() {
        return serialNO;
    }

    public void setSerialNO(int serialNO) {
        this.serialNO = serialNO;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(int spentTime) {
        this.spentTime = spentTime;
    }

    public int getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return serialNO == user.serialNO && spentTime == user.spentTime && totalPay == user.totalPay && Objects.equals(userName, user.userName) && Objects.equals(userID, user.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNO, userName, userID, spentTime, totalPay);
    }

    @Override
    public String toString() {
        return "User{" +
                "serialNO=" + serialNO +
                ", userName='" + userName + '\'' +
                ", userID='" + userID + '\'' +
                ", spentTime=" + spentTime +
                ", totalPay=" + totalPay +
                '}';
    }
}
