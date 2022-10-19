package toyProject_1.customer;

import java.util.Objects;
import toyProject_1.group.Group;
public class Customer implements Comparable<Customer> {
    private String serialNo;
    private String name;
    private String userID;
    private int spentTime;
    private int totalPay;
    private Group group;
    private static int AUTO_GENERATOR=0;

    public Customer(){
        ++AUTO_GENERATOR;
        this.serialNo=String.format("%04d",AUTO_GENERATOR);
    }
    public Customer(String name, String userID, int spentTime, int totalPay){
        ++AUTO_GENERATOR;
        this.serialNo=String.format("%04d",AUTO_GENERATOR);
        this.name = name;
        this.userID=userID;
        this.spentTime = spentTime;
        this.totalPay=totalPay;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null && this.getClass() == o.getClass()) {
            Customer customer = (Customer) o;
            return spentTime == customer.spentTime && this.totalPay == customer.totalPay && Objects.equals(this.serialNo, customer.serialNo) && Objects.equals(this.name, customer.name) && Objects.equals(this.userID, customer.userID) && Objects.equals(this.group, customer.group);
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.serialNo, this.name, this.userID, this.spentTime, this.totalPay, this.group});
    }

    @Override
    public String toString() {
        return "Customer{" +
                "serialNo='" + this.serialNo + '\'' +
                ", name='" + this.name + '\'' +
                ", userID='" + this.userID + '\'' +
                ", spentTime=" + this.spentTime +
                ", totalPay=" + this.totalPay +
                '}';
    }
    public int compareTo(Customer o){
        if(this.name != null&& o.name !=null){
            if(this.name.compareTo(o.name)<0){
                return -1;
            } else if (this.name.compareTo(o.name)==0) {
                return this.userID != null&& o.userID!=null? this.userID.compareTo(o.userID):0;
            }else{
                return 1;
            }
        }else{
            return 0;
        }
    }

}
