package toyProject_1.menu;
import java.util.InputMismatchException;

import toyProject_1.exception.InputEmptyException;
import toyProject_1.exception.InputRangeException;
import toyProject_1.group.*;
public class ParameterMenu extends Menu {
    public static Groups allGroups = new Groups();
    public ParameterMenu(){

    }
    //Group 선택하는 메서드
    public static String chooseGroup(){
        while(true){
            try{
                System.out.println();
                System.out.println("** Press 'end', if you want to exit! **");
                System.out.print("Which group (GENERAL, VIP, VVIP)? ");
                String choose = Menu.sc.next().toUpperCase();
                if(choose==null){
                    throw new NullPointerException();
                }
                if(choose.equals("")){
                    throw new InputEmptyException();
                }
                if(choose.equals("END")){
                    return choose;
                }
                for (int i = 0; i < GroupType.values().length; ++i) {
                    if(choose!=null&&choose.equals(GroupType.values()[i].toString())){
                        return choose;
                    }
                }
                throw new InputRangeException();
            }catch(NullPointerException var2){
                System.out.println("Null Input. Please input something.");
            }catch (InputEmptyException var3){
                System.out.println("Empty Input. Please input something.");
            }catch (InputRangeException var4){
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    //ParameterMenu 첫 화면
    public static int initParameterMenu() {
        while(true){
            try{
                System.out.println();
                System.out.println("==============================");
                System.out.println("1. Set Parameter");
                System.out.println("2. View Parameter");
                System.out.println("3. Update Parameter");
                System.out.println("4. Back");
                System.out.println("==============================");
                System.out.println("Choose One:");
                int choose = Integer.parseInt(Menu.sc.next());
                if(choose>=1&&choose<=4){
                    return choose;
                }
            }catch(NumberFormatException var1){
                System.out.println("Invalid Type for Input. Please try again. ");
            }catch(InputRangeException var2){
                System.out.println("Invalid Input. Please try again. ");

            }
        }
    }
    //파라미터 메뉴 조작 메서드
    public static void manageParameter(){
        while(true){
            int choose = initParameterMenu();
            if(choose==1){
                setParameter();
            }else if(choose==2){
                viewParameter();
            }else if (choose==3){
                updateParameter();
            }else{
                if(choose==4){
                    return;
                }
                System.out.println("\nInvalid Input. Please try again.");
            }
        }
    }
    //파라미터 설정 메뉴 진입 시 디스플레이
    public static int setParameterMenu(){
        while(true){
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
                }
                throw new InputRangeException();
            }catch(NumberFormatException var2){
                System.out.println("Invalid Type for Input. Please try again. ");
            }catch(InputRangeException var3){
                System.out.println("Invalid Input. Please try again. ");
            }
        }
    }
    //파라미터 설정
    public static void setParameter() {
        while (true) {
            String strGroup = chooseGroup().toUpperCase();
            if (strGroup.equals("END")) {
                return;
            }

            GroupType groupType;
            try {
                groupType = GroupType.valueOf(strGroup);
            } catch (IllegalArgumentException var5) {
                System.out.println("\nInvalid Input. Please try again.");
                continue;
            }
            Group group = allGroups.find(groupType);
            if (group != null && group.getParameter() != null) {
                System.out.println("\n" + strGroup + "group already exists.");
                System.out.println("\n" + group);
            } else {
                Parameter parameter = new Parameter();
                while (true) {
                    try {
                        int pchoose = setParameterMenu();
                        if (pchoose == 1) {
                            setParameterMinimumSpentTime(parameter);
                        } else if (pchoose == 2) {
                            setParameterMinimumTotalPay(parameter);
                        } else {
                            if (pchoose == 3) {
                                break;
                            }
                            System.out.println("\nInvalid Input. Please try again.");
                        }
                    } catch (InputMismatchException var6) {
                        System.out.println("\nInvalid Type for Input. Please try again.");
                        Menu.sc.next();
                    }
                }

                allGroups.add(new Group(groupType, parameter));
                CustomerMenu.allCustomers.refresh(allGroups);
            }
        }
    }
    public static void setParameterMinimumSpentTime(Parameter parameter){
        while(true){
            try{
                System.out.println();
                System.out.println("Input Minimum Spent Time");
                int minimumSpentTime = Integer.parseInt(Menu.sc.next());
                if(minimumSpentTime<0){
                    throw new InputRangeException();
                }
                parameter.setMinimumSpentTime(minimumSpentTime);
                return;
            }catch(NumberFormatException var2){
                System.out.println("Invalid Type for Input. Please try again.");
            }catch(InputRangeException var3){
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    public static void setParameterMinimumTotalPay(Parameter parameter){
        while(true){
            try{
                System.out.println();
                System.out.println("Input Minimum Total Payment");
                int minimumTotalPay= Integer.parseInt(Menu.sc.next());
                if(minimumTotalPay<0){
                    throw new InputRangeException();
                }
                parameter.setMinimumTotalPay(minimumTotalPay);
                return;
            }catch(NumberFormatException var2){
                System.out.println("Invalid Type for Input. Please try again.");
            }catch(InputRangeException var3){
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    //파라미터 출력
    public static void viewParameter(){
        while(true){
            String strGroup = chooseGroup().toUpperCase();
            if(strGroup.equals("END")){
                return;
            }
            GroupType groupType;
            try{
                groupType=GroupType.valueOf(strGroup);
            }catch(IllegalArgumentException var3){
                System.out.println("\nInvalid Type for Input. Please try again.");
                continue;
            }
            Group grp = allGroups.find(groupType);
            System.out.println();
            System.out.println(grp);
        }
    }
    //파라미터 갱신
    public static void updateParameter(){
        while(true){
            String strGroup = chooseGroup().toUpperCase();
            if(strGroup.equals("END")){
                return;
            }
            GroupType groupType;
            try{
                groupType=GroupType.valueOf(strGroup);
            }catch(IllegalArgumentException var6){
                System.out.println("\nInvalid Input. Please try again.");
                System.out.println(var6);
                return;
            }
            Group grp = allGroups.find(groupType);
            if(grp.getParameter()==null){
                System.out.println("\nNo parameter. Set the parameter first.");
            }else{
                System.out.println("\n"+grp.toString());
                Parameter parameter = grp.getParameter();


            label19:
            while (true) {
                while (true) {
                    try{
                        int pchoose=setParameterMenu();
                        if(pchoose==1){
                            setParameterMinimumSpentTime(parameter);
                        }else if(pchoose != 2){
                            if(pchoose == 3){
                                break label19;
                            }
                            System.out.println("\nInvalid Input. Please try again.");
                        }else{
                            setParameterMinimumTotalPay(parameter);
                        }
                    }catch (InputMismatchException var5){
                        System.out.println("\nInvalid Type for Input. Please try again.");
                        Menu.sc.next();
                    }
                }
            }
            CustomerMenu.allCustomers.refresh(allGroups);
                System.out.println("\n"+grp.toString());
            }
        }
    }
}
