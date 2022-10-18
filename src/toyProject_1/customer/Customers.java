package toyProject_1.customer;

import java.util.Arrays;

public class Customers {
    public static int SIZE = 10;
    private int count;
    private Customer[] customers;
    
    public Customers() {
        this.customers=new Customer[SIZE];
    }
    public int getCount(){
        return this.count;
    }
    public void setCustomers(Customer[] customers){this.customers=customers;}
    public Customer[] getCustomers(){
        int realCount=0;

        for (int i = 0; i <this.customers.length&&this.customers[i]!=null; ++i) {
            ++realCount
        }
        return (Customer[]) Arrays.copyOf(this.customers,realCount);
    }
    public int length(){return this.customers.length;}
    public boolean isNull(){return this.customers==null;}
    public boolean isEmpty(){return this.count==0;}
    public void add(Customer customer){
        if (this.count < SIZE) {
            this.customers[this.count]=customer;
            ++this.count;
        }else{
            this.extend(customer);
        }
    }
    public void insert(int index, Customer customer){
        if(index<this.count){
            if (this.count < SIZE) {
                
                Customer var10000 = this.customers[index];
                for (int i = 0; i < ; i++) {
                    
                }
            }
        }
    }

}
