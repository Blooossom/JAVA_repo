package toyProject1.menu;

import toyProject1.exception.InputEmptyException;
import toyProject1.exception.InputOutOfRangeException;
import toyProject1.group.Group;
import toyProject1.group.GroupType;
import toyProject1.group.Groups;
import toyProject1.group.Parameter;

public class ParameterMenu extends Menu{
    public static Groups allGroups = new Groups();
    public ParameterMenu(){

    }
    //파라미터메뉴 골랐을 때 처음 나오는 디스플레이
    public static int initParameterMenu(){
        while (true) {
            try{
                System.out.println();
                System.out.println("==============================");
                System.out.println(" 1. Set Parameter");
                System.out.println(" 2. View Parameter");
                System.out.println(" 3. Update Parameter");
                System.out.println(" 4. Back");
                System.out.println("==============================");
                System.out.print("Choose One: ");
                int choose = Integer.parseInt(Menu.sc.next());
                if(choose>=1&&choose<=4){
                    return choose;
                }else{throw new InputOutOfRangeException();}
            }catch(NullPointerException err){
                System.out.println("Invalid Type for Input. Please try again. ");
            }catch(InputOutOfRangeException err){
                System.out.println("Invalid Input. Please try again. ");
            }
        }
    }
    //위 디스플레이에서 입력받은 값으로 하위 메뉴로 이어주는 메서드
    public static void inputParameter(){
        while (true) {
            int choose = initParameterMenu();
            if(choose==1){
                setParameter();
            } else if (choose == 2) {
                viewParameter();
            } else if (choose == 3) {
                updateParameter();
            } else if (choose == 4) {
                return;
            }else{
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    //처음에 그룹 고르는 메서드
    public static String selectGroup(){
        while(true){
            try{
                System.out.println();
                System.out.println("** Press 'end', if you want to exit! **");
                System.out.print("Which group (GENERAL, VIP, VVIP)? ");
                String select = Menu.sc.next().toUpperCase();
                if(select==null){
                    throw new NullPointerException();
                }
                if(select.equals("")){
                    throw new InputEmptyException();
                }
                if(select.equals("END")){
                    return select;
                }
                for (int i = 0; i < GroupType.values().length; ++i) {
                    if(select!=null&&select.equals(GroupType.values()[i].toString())){
                        return select;
                    }
                }
            }catch (NullPointerException err){

            }catch (InputEmptyException err){

            }
        }
    }
    //1~4메뉴
    public static void setParameter(){
        while (true) {
            String select = selectGroup().toUpperCase();
            if(select.equals("END")){
                return;
            }
            GroupType groupType;
            try{
                groupType=GroupType.valueOf(select);
            }catch (IllegalArgumentException err)    {
                System.out.println("Invalid.Input. Please try again.");
                continue;
            }
            Group group = allGroups.find(groupType);
            if(group!=null&&group.getParameter()!=null){
                System.out.println();
                System.out.println();
            }else{
                Parameter parameter = new Parameter();
                while (true) {
                    try{
                        int choose = setParameterMenu();
                        if (choose == 1) {
                            setMinimumSpentTime(parameter);
                        } else if (choose == 2) {
                            setMinimumTotalPay(parameter);
                        } else if (choose == 3) {
                            break;
                        }else{
                            System.out.println("Invalid Input. Please try again.");
                        }
                    }catch (InputOutOfRangeException err){
                        System.out.println("Invalid Input. Please try again.");
                        Menu.sc.next();
                    }catch (NumberFormatException err){
                        System.out.println("Invalid Type for Input. Please try again.");
                        Menu.sc.next();
                    }
                }
                allGroups.add(new Group(groupType,parameter));
                CustomerMenu.allCustomers.refresh(allGroups);
            }
        }
    }
    public static void viewParameter(){
        while(true) {
            String select = selectGroup().toUpperCase();
            if (select.equals("END")) {
                return;
            }
            GroupType groupType;
            try {
                groupType = GroupType.valueOf(select);
            } catch (IllegalArgumentException err) {
                System.out.println("\nInvalid Type for Input. Please try again.");
                continue;
            }
            Group group = allGroups.find(groupType);
            System.out.println();
            System.out.println(group);
        }
    }
    public static void updateParameter(){

    }
    //setParameter 시 하위 메뉴
    public static int setParameterMenu(){
        while (true) {
            try{
                System.out.println();
                System.out.println("==============================");
                System.out.println(" 1. Minimum Spent Time");
                System.out.println(" 2. Minimum Total Pay");
                System.out.println(" 3. Back");
                System.out.println("==============================");
                System.out.print("Choose One: ");
                int choose = Integer.parseInt(Menu.sc.next());
                if(choose>=1&&choose<=3){
                    return choose;
                }else{
                    throw new InputOutOfRangeException();
                }
            }catch(NumberFormatException err){
                System.out.println("Invalid Type for Input. Please try again.");
            }catch (InputOutOfRangeException err){
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    //spentTime,totalPay 설정메서드
    public static void setMinimumSpentTime(Parameter parameter){
        while (true) {
            try{
                System.out.println();
                System.out.print("Input Minimum Spent Time: ");
                int minimumSpentTime = Integer.parseInt(Menu.sc.next());
                if(minimumSpentTime<0){
                    throw new InputOutOfRangeException();
                }
                parameter.setMinimumSpentTime(minimumSpentTime);
            }catch(NumberFormatException err){
                System.out.println("Invalid Type for Input. Please try again.");
            }catch (InputOutOfRangeException err){
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    public static void setMinimumTotalPay(Parameter parameter){
        while (true) {
            try{
                System.out.println();
                System.out.print("Input Minimum Total Pay: ");
                int minimumTotalPay = Integer.parseInt(Menu.sc.next());
                if(minimumTotalPay<0){
                    throw new InputOutOfRangeException();
                }
                parameter.setMinimumTotalPay(minimumTotalPay);
            }catch(NumberFormatException err){
                System.out.println("Invalid Type for Input. Please try again.");
            }catch (InputOutOfRangeException err){
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }

}
