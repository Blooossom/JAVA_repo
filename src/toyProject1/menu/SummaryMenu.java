package toyProject1.menu;
import java.util.Comparator;
import java.util.Arrays;

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

            } else if (choose == 2) {

            } else if (choose == 3) {

            } else if (choose == 4) {

            } else if (choose == 5) {

            }else{

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


    //이름순 정렬
    public static void sortByname(){
        while (true) {
            String select = selectSortType().toUpperCase();
            if(select.equals("END")){
                return;
            }
            try{
                SortType sortType = SortType.valueOf(select);

            }
        }
    }
    //시간순 정렬

    //금액순 정렬



}
