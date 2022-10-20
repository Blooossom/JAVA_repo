package toyProject_1.menu;

import java.util.Arrays;
import toyProject_1.customer.Customer;
import toyProject_1.customer.Customers;
import toyProject_1.exception.InputEmptyException;
import toyProject_1.exception.InputRangeException;
import toyProject_1.group.Group;
import toyProject_1.group.GroupType;

import javax.swing.*;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.InputMismatchException;

public class SummaryMenu extends Menu{

    public static int initSummaryMenu(){
        while(true){
            try{
                System.out.println();
                System.out.println("==============================");
                System.out.println("1. Summary)");
                System.out.println("2. Summary (Sorted By Name)");
                System.out.println("3. Summary (Sorted By Spent Time)");
                System.out.println("4. Summary (Sorted By Total Payment)");
                System.out.println("5. Back");
                System.out.println("==============================");
                System.out.println("Choose One:");
                int choose = Integer.parseInt(Menu.sc.next());
                if(choose>=1&&choose<=5){
                    return choose;
                }
                throw new InputRangeException();
            }catch (NumberFormatException var2){
                System.out.println("Invalid Type for Input. Please try again.");
            }catch(InputRangeException var3){
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    public static void managaeSummaryMenu(){
        while(true){
            int choose = initSummaryMenu();
            if (choose == 1) {
                viewSummary(classify());
            } else if (choose == 2) {
                sortedByName();
            } else if (choose == 3) {
                sortedBySpentTime();
            }else if(choose==4){
                sortedByTotalPay();
            }else{
                if(choose==5){
                    return;
                }
                System.out.println("\nInvalid Input. Please try again.");
            }
        }
    }
    public static void viewSummary(Customers[] groupByCustomers){
        System.out.println();

        for (int i = 0; i < ParameterMenu.allGroups.length(); ++i) {
            Group grp = ParameterMenu.allGroups.get(i);
            int userCount = 0;
            if(!groupByCustomers[i].isNull()&&!groupByCustomers[i].isEmpty()){
                userCount=groupByCustomers[i].getCount();
            }

            System.out.println();
            System.out.println("============================");
            if(grp.getType().equals(GroupType.NONE)){
                System.out.println("Others : "+userCount+" customer(s)");
            }else{
                PrintStream var10000 = System.out;
                String var10001 = grp.getType().toString();
                var10000.println(var10001 + " Group : "+userCount +" customers(s)");
                if(grp.getParameter()==null){
                    System.out.println("[Parameter] null");
                }else{
                    System.out.println("[Parameter] "+grp.getParameter().toString());
                }
            }
            System.out.println("============================");
            if(!groupByCustomers[i].isNull()&&!groupByCustomers[i].isEmpty()){
                for (int j = 0; j <userCount; ++j) {
                    Customer user = groupByCustomers[i].get(j);
                    if(user != null){
                        System.out.println("No. "+(j+1)+" => "+user);
                    }
                }
            }else{
                System.out.println("No Customer.");
            }
        }
    }
    public static Customers[] classify(){

        Customers[] groupByCustomers = new Customers[GroupType.values().length];

        for (int i = 0; i < ParameterMenu.allGroups.length(); ++i) {
            Group grp = ParameterMenu.allGroups.get(i);
            groupByCustomers[i]=grp.getCustomers(CustomerMenu.allCustomers);
        }
        return groupByCustomers;
    }
    public static String chooseSortOrder(){
        while(true){
            try{
                System.out.println();
                System.out.println();
                System.out.println();
                String choose = Menu.sc.next().toUpperCase();
                if(choose==null){
                    throw new NullPointerException();
                }
                if (choose.equals("")) {
                    throw new InputMismatchException();
                }
                if(choose.equals("END")){
                    return choose;
                }
                try{
                    Order order = Order.valueOf(choose);

                    for (int i = 0; i < Order.values().length; ++i) {
                        if(order==Order.values()[i]){
                            return choose;
                        }
                    }
                }catch(IllegalArgumentException var3){
                    System.out.println("Invalid Type for Input. Please try again.");
                }
            }catch(NullPointerException var4){
                System.out.println("Invalid Input. Please input something");
            }catch(InputEmptyException var5){
                System.out.println("Empty Input. Please input something");
            }catch(InputRangeException var6){
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    public static void sortedByName(){
        while(true){
            String order = chooseSortOrder().toUpperCase();
            if(order.equals("END")){
                return;
            }
            try {
                Order ordertype = Order.valueOf(order);
                if(ordertype==Order.ASCENDING){
                    System.out.println("ASCENDING");
                    sortByName(Order.ASCENDING);
                }else{
                    System.out.println("DESCENDING");
                    sortByName(Order.DESCENDING);
                }
            }catch(IllegalArgumentException var3){
                System.out.println("\nInvalid Type for Input. Please try again.");
            }
        }
    }
    public static void sortByName(Order order){
        Customers[] groupByCustomers=classify();
        if(order != null&& !order.equals("")){
            for (int i = 0; i < groupByCustomers.length; ++i) {
                Customer[] customers = groupByCustomers[i].getCustomers();
                if(order==Order.ASCENDING){
                    Arrays.sort(customers);
                }else{
                    Arrays.sort(customers, new Comparator<Customer>() {
                        @Override
                        public int compare(Customer o1, Customer o2) {
                            return o1.compareTo(o2)*-1;
                        }
                    });
                    }
                groupByCustomers[i].setCustomers(customers);
                }
                viewSummary(groupByCustomers);
            }
        }

    public static void sortedByTotalPay(){
        while (true) {
            String order = chooseSortOrder().toUpperCase();
            if(order.equals("END")){
                return;
            }
            try{
                Order ordertype = Order.valueOf(order);
                if(ordertype==Order.ASCENDING){
                    System.out.println("ASCENDING");
                    sortByTotalPay(Order.ASCENDING);
                }else{
                    System.out.println("DESCENDING");
                    sortByTotalPay(Order.DESCENDING);
                }
            }catch(IllegalArgumentException var3){
                System.out.println("\nInvalid Type for Input. Please try again");
            }
        }
    }
    public static void sortByTotalPay(Order order){
        Customers[] groupByCustomers = classify();
        if(order!=null&&!order.equals("")){
            for (int i = 0; i < groupByCustomers.length; ++i) {
                Customer[] customers = groupByCustomers[i].getCustomers();
                if (order == Order.ASCENDING) {
                    Arrays.sort(customers, new Comparator<Customer>() {
                        @Override
                        public int compare(Customer o1, Customer o2) {
                            if(o1.getSpentTime()<o2.getSpentTime()){
                                return -1;
                            }else if(o1.getSpentTime()==o2.getSpentTime()){
                                return o1.getName() !=null && o2.getName() != null? o1.getName().compareTo(o2.getName()):0;
                            }else{
                                return 1;
                            }
                        }
                    });
                }else{
                    Arrays.sort(customers, new Comparator<Customer>() {
                        @Override
                        public int compare(Customer o1, Customer o2) {
                            if(o1.getSpentTime()<o2.getSpentTime()){
                                return 1;
                            }else if(o1.getSpentTime()==o2.getSpentTime()){
                                return o1.getName()!=null&&o2.getName()!=null? o1.getName().compareTo(o2.getName()):0;

                            }else{
                                return -1;
                            }
                        }
                    });
                }
                groupByCustomers[i].setCustomers(customers);
            }
            viewSummary(groupByCustomers);
        }
    }
    public static void sortedBySpentTime(){
        while(true){
            String order = chooseSortOrder().toUpperCase();
            if(order.equals("END")){
                return;
            }
            try{
                Order ordertype = Order.valueOf(order);
                if(ordertype==Order.ASCENDING){
                    System.out.println("ASCENDING");
                    sortBySpentTime(Order.ASCENDING);
                }else{
                    System.out.println("DESCENDING");
                    sortBySpentTime(Order.DESCENDING);
                }
            }catch(IllegalArgumentException var3){
                System.out.println("\nInvalid Type for Input. Please try again.");
            }
        }
    }
    public static void sortBySpentTime(Order order){
        Customers[] groupByCustomers = classify();
        if(order!=null&&!order.equals("")){
            for (int i = 0; i <groupByCustomers.length; ++i) {
                Customer[] customers = groupByCustomers[i].getCustomers();
                if(order==Order.ASCENDING){
                    Arrays.sort(customers, new Comparator<Customer>() {
                        @Override
                        public int compare(Customer o1, Customer o2) {
                            if(o1.getTotalPay()<o2.getTotalPay()){
                                return -1;
                            } else if (o1.getTotalPay()==o2.getTotalPay()) {
                                return o1.getName()!=null&&o2.getName()!=null? o1.getName().compareTo(o2.getName()):0;
                            }else{
                                return 1;
                            }
                        }
                    });
                }else{
                    Arrays.sort(customers, new Comparator<Customer>() {
                        @Override
                        public int compare(Customer o1, Customer o2) {
                            if(o1.getTotalPay()<o2.getTotalPay()){
                                return 1;
                            }else if(o1.getTotalPay()==o2.getTotalPay()){
                                return o1.getName()!=null&&o2.getName()!=null? o1.getName().compareTo(o2.getName()):0;
                            }else{
                                return -1;
                            }
                        }
                    });
                }
                groupByCustomers[i].setCustomers(customers);
            }
            viewSummary(groupByCustomers);
        }
    }
}
