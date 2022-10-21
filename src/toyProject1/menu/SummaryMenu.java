package toyProject1.menu;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.Arrays;

import toyProject1.customer.ClassifyCustomer;
import toyProject1.exception.InputEmptyException;
import toyProject1.exception.InputOutOfRangeException;
import toyProject1.group.GroupType;
import toyProject1.group.Group;
import toyProject1.customer.Customer;
import toyProject1.customer.Customers;
public class SummaryMenu extends Menu{
    public SummaryMenu() {
    }

    //초기 시작 디스플레이
    public static int initSummaryMenu(){
        while (true) {
            try{
                System.out.println();
                System.out.println("==============================");
                System.out.println(" 1. Summary");
                System.out.println(" 2. Summary (Sorted By Name)");
                System.out.println(" 3. Summary (Sorted By Spent Time)");
                System.out.println(" 4. Summary (Sorted By Total Payment)");
                System.out.println(" 5. Back");
                System.out.println("==============================");
                System.out.print("Choose One: ");
                int choose = Integer.parseInt(Menu.sc.next());
                if(choose>=1&&choose<=5){
                    return choose;
                }else{
                    throw new InputOutOfRangeException();
                }
            }catch (NumberFormatException err){
                System.out.println("Invalid Type for Input. Please try again.");
            }catch (InputOutOfRangeException err){
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    //입력받아서 각 항목으로 전달하는 메서드
    public static void inputSummaryMenu(){
        while (true) {
            int choose = initSummaryMenu();
            if (choose == 1) {
                dispSummary(ClassifyCustomer.classify());
            } else if (choose == 2) {
                sortByNameMenu();
            } else if (choose == 3) {
                sortBySpentTimeMenu();
            } else if (choose == 4) {
                sortByTotalPayMenu();
            } else if (choose == 5) {
                return;
            }else{
                System.out.println("\nInvalid Input. Please try again.");
            }
        }
    }


    //정렬방식 고르기
    public static String selectSortType(){
        while(true){
            try{
                System.out.println();
                System.out.println("** Press 'end', if you want to exit! **");
                System.out.print("Which order (ASCENDING, DESCENDING)? ");
                String select = Menu.sc.next().toUpperCase();
                if (select == null) {
                    throw new NullPointerException();
                }

                if (select.equals("")) {
                    throw new InputEmptyException();
                }

                if (select.equals("END")) {
                    return select;
                }
                try{
                    SortType sortType = SortType.valueOf(select);
                    for (int i = 0; i <SortType.values().length; i++) {
                        if(sortType!=null&&sortType.equals(SortType.values()[i])){
                            return select;
                        }
                    }
                }catch (IllegalArgumentException err){
                    System.out.println("Invalid Type for Input. Please try again.");
                }
            }catch(NullPointerException err){
                System.out.println("Null Input. Please input something.");
            }catch (InputEmptyException err){
                System.out.println("Empty Input. Please input something.");
            }catch (InputOutOfRangeException err){
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    //고객 분류
    public static void dispSummary(Customers[] groupByCustomers) {
        System.out.println();

        for(int i = 0; i < ParameterMenu.allGroups.length(); ++i) {
            Group grp = ParameterMenu.allGroups.get(i);
            int custCount = 0;
            if (!groupByCustomers[i].isNull() && !groupByCustomers[i].isEmpty()) {
                custCount = groupByCustomers[i].getCount();
            }

            System.out.println();
            System.out.println("==============================");
            if (grp.getGroupType().equals(GroupType.OTHERS)) {
                System.out.println("Others : " + custCount + " customer(s)");
            } else {
                PrintStream var10000 = System.out;
                String var10001 = grp.getGroupType().toString();
                var10000.println(var10001 + " Group : " + custCount + " customer(s)");
                if (grp.getParameter() == null) {
                    System.out.println("[Parameter] null");
                } else {
                    System.out.println("[Parameter] " + grp.getParameter().toString());
                }
            }

            System.out.println("------------------------------");
            if (!groupByCustomers[i].isNull() && !groupByCustomers[i].isEmpty()) {
                for(int j = 0; j < custCount; ++j) {
                    Customer cust = groupByCustomers[i].get(j);
                    if (cust != null) {
                        System.out.println("No. " + (j + 1) + " => " + cust);
                    }
                }
            } else {
                System.out.println("No customer.");
            }
        }

    }

    //이름순 정렬
    public static void sortByNameMenu(){
        while (true) {
            String select = selectSortType().toUpperCase();
            if(select.equals("END")){
                return;
            }
            try{
                SortType sortType = SortType.valueOf(select);
                if (sortType == SortType.ASCENDING) {
                    System.out.println("ASCENDING");
                    ClassifyCustomer.sortByName(SortType.ASCENDING);
                }else{
                    System.out.println("DESCENDING");
                    ClassifyCustomer.sortByName(SortType.DESCENDING);
                }
            }catch (IllegalArgumentException err) {
                System.out.println("\nInvalid Type for Input. Please try again.");
            }
        }
    }
    //시간순 정렬
    public static void sortBySpentTimeMenu(){
        while(true) {
            String strOrder = selectSortType().toUpperCase();
            if (strOrder.equals("END")) {
                return;
            }

            try {
                SortType orderType = SortType.valueOf(strOrder);
                if (orderType == SortType.ASCENDING) {
                    System.out.println("ASCENDING");
                    ClassifyCustomer.sortBySpentTime(SortType.ASCENDING);
                } else {
                    System.out.println("DESCENDING");
                    ClassifyCustomer.sortBySpentTime(SortType.DESCENDING);
                }
            } catch (IllegalArgumentException var3) {
                System.out.println("\nInvalid Type for Input. Please try again.");
            }
        }
    }
    public static void sortByTotalPayMenu(){
        while(true) {
            String strOrder = selectSortType().toUpperCase();
            if (strOrder.equals("END")) {
                return;
            }

            try {
                SortType orderType = SortType.valueOf(strOrder);
                if (orderType == SortType.ASCENDING) {
                    System.out.println("ASCENDING");
                    ClassifyCustomer.sortByTotalPay(SortType.ASCENDING);
                } else {
                    System.out.println("DESCENDING");
                    ClassifyCustomer.sortByTotalPay(SortType.DESCENDING);
                }
            } catch (IllegalArgumentException err) {
                System.out.println("\nInvalid Type for Input. Please try again.");
            }
        }
    }
    //금액순 정렬



}
