package toyProject_1.customer;

import java.util.Objects;
public class Customer {
    private int serialNo;
    private String customerName;
    private String customerID;
    private int spentTime;
    private int totalPay;
    public Customer(){

    }

    public Customer(int serialNo, String customerName, String customerID, int spentTime, int totalPay) {
        serialNo++;
        this.serialNo = serialNo;
        this.customerName = customerName;
        this.customerID = customerID;
        this.spentTime = spentTime;
        this.totalPay = totalPay;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return serialNo == customer.serialNo && spentTime == customer.spentTime && totalPay == customer.totalPay && Objects.equals(customerName, customer.customerName) && Objects.equals(customerID, customer.customerID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNo, customerName, customerID, spentTime, totalPay);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "serialNo=" + serialNo +
                ", customerName='" + customerName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", spentTime=" + spentTime +
                ", totalPay=" + totalPay +
                '}';
    }
    public void showCustomerInfo(){
        System.out.println("======= Customer Info =======");
        System.out.println("No. "+serialNo+ " => Customer{serialNo='"+serialNo+"', name='"+customerName+"', userID='"+customerID+"', spentTime="+spentTime+", totalPayment="+totalPay+"}");
    }
}
