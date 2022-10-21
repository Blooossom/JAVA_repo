package toyProject1.customer;

import toyProject1.group.Group;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
    private String serialNo;
    private String customerName;
    private String customerID;
    private int spentTime;
    private int totalPay;
    private Group group;
    public static int SERIAL=0;

    //constructor
    public Customer(){
        ++SERIAL;
        this.serialNo=String.format("06d",SERIAL);
    }
    public Customer(String customerName, String customerID, int spentTime, int totalPay){
        ++SERIAL;
        this.serialNo=String.format("06d",SERIAL);
        this.customerID = customerID;
        this.customerName=customerName;
        this.spentTime=spentTime;
        this.totalPay=totalPay;
    }

    //getter&setter
    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
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

    //hashcode&equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return spentTime == customer.spentTime && totalPay == customer.totalPay && Objects.equals(serialNo, customer.serialNo) && Objects.equals(customerName, customer.customerName) && Objects.equals(customerID, customer.customerID)&& Objects.equals(group, customer.group);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serialNo, customerName, customerID, spentTime, totalPay, group);
    }

    //toString
    @Override
    public String toString() {
        return "Customer{" + "serialNo='" + serialNo  +", customerName='" + customerName  + ", customerID='" + customerID  + ", spentTime=" + spentTime + ", totalPay=" + totalPay + '}';
    }

    @Override
    public int compareTo(Customer o) {
        if(this.customerName!=null&&o.customerName!=null){
            if(this.customerName.compareTo(o.customerName)<0){
                return -1;
            }else if(this.customerName.compareTo(o.customerID)==0){
                if(this.customerID != null && o.customerID != null){
                    return this.customerID.compareTo(o.customerID);
                }else{
                    return 0;
                }
            }else{
                return 1;
            }
        }else{
            return 0;
        }
    }


}
