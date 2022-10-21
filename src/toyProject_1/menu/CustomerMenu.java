package toyProject_1.menu;
import toyProject_1.exception.InputRangeException;
import toyProject_1.customer.*;
import toyProject_1.group.Group;
import toyProject_1.group.Parameter;
import java.util.regex.Pattern;

import java.io.*;
public class CustomerMenu  extends Menu{
    public static Customers allCustomers = new Customers();

    public CustomerMenu(){

    }
    public static int manageCustomerMenu(){
        while(true){
            try{
                System.out.println();
                System.out.println("==============================");
                System.out.println("1. Add Customer Data");
                System.out.println("2. View Customer Data");
                System.out.println("3. Update Customer Data");
                System.out.println("4. Delete Customer Data");
                System.out.println("5. Back");
                System.out.println("==============================");
                System.out.println("Choose One:");
                int choose = Integer.parseInt(Menu.sc.next());
                if(choose>=1&&choose<=5){
                    return choose;
                }

            throw new InputRangeException();
            }catch (NumberFormatException var1){
                System.out.println("Invalid Type for Input. Please try again. ");
            }catch(InputRangeException var2){
                System.out.println("Invalid Input. Please try again. ");
            }
        }
    }

    public static void manageCustomerData(){
        while(true){
            int choose = manageCustomerMenu();
            if(choose==1){
                int size = getSizeOfCustomersToInput();
                setCustomerData(size);
            }else if(choose==2){
                viewCustomerData();
            }else if(choose==3){
                editCustomerData();
            }else if(choose==4){
                deleteCustomerData();
            }else{
                if(choose==5){
                    return;
                }
                System.out.println("\nInvalid Input, Please try again. ");
            }
        }
    }
    public static int setCustomerMenu(){
        while(true){
            try{
                System.out.println();
                System.out.println("==============================");
                System.out.println(" 1. Customer Name");
                System.out.println(" 2. Customer ID");
                System.out.println(" 3. Customer Spent Time");
                System.out.println(" 4. Customer Total Pay");
                System.out.println(" 5. Back");
                System.out.println("==============================");
                System.out.print("Choose One: ");
                int choose = Integer.parseInt(Menu.sc.next());
                if(choose>=1&&choose<=5){
                    return choose;
                }
            }catch(NumberFormatException var1){
                System.out.println("Invalid Type for Input. Please try again. ");
            }catch(InputRangeException var2){
                System.out.println("Invalid Input. Please try again. ");
            }
        }
    }

    public static void setCustomerData(int size){
        label2:
        for (int i = 0; i <size; ++i) {
            Customer customer = new Customer();
            System.out.println();
            System.out.println("\n======= Customer " +(i+1)+" Info. =======");
            while (true){
                while(true){
                    int choose = initMenu();
                    if(choose==1){
                        setCustomerName(customer);
                        break;
                    }
                    if(choose==2){
                        setCustomerID(customer);
                        break;
                    }
                    if(choose==3){
                        setCustomerSpentTime(customer);
                        break;
                    }
                    if(choose==4){
                        setCustomerTotalPay(customer);
                        break;
                    }
                    if(choose==5){
                        customer.setGroup(ParameterMenu.allGroups.findGroupFor(customer));
                        allCustomers.add(customer);
                        System.out.println();
                        continue label2;
                    }
                    System.out.println("\nInvalid Input. Please try again. ");
                }
                Group grp = ParameterMenu.allGroups.findGroupFor(customer);
                if(grp==null){
                    customer.setGroup((Group)null);
                }else  if(!grp.equals(customer.getGroup())){
                    customer.setGroup(grp);
                }
            }
        }

    }
    public static void setCustomerName(Customer customer){
        while(true){
            try{
                System.out.println();
                System.out.println("Input Customer Name: ");
                String REGEX = "^[a-zA-Z]{3,}$";
                String name = Menu.sc.next();
                if(name != null&& !name.equals("")){
                    return;
                }
            }catch (NumberFormatException var2) {
                System.out.println("Invalid Type for Input. Please try again.");
            } catch (InputRangeException var3) {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    public static void setCustomerID(Customer customer){
        while(true){
            try{
                System.out.println();
                System.out.println("Input Customer ID: ");
                String REGEX ="^[a-zA_Z]{1}[a-zA-Z0-9_]{4,11}$";
                String userID = Menu.sc.next();
                if(userID !=null&&!userID.equals("")){
                    return;
                }
            }catch (NumberFormatException var2) {
                System.out.println("Invalid Type for Input. Please try again.");
            } catch (InputRangeException var3) {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    public static void setCustomerSpentTime(Customer customer){
        while(true){
            try{
                System.out.println();
                System.out.println("Input Customer Spent Time: ");
                int spentTime = Integer.parseInt(Menu.sc.next());
                if(spentTime<0){
                    throw new InputRangeException();
                }
                customer.setSpentTime(spentTime);
                return;
            }catch (NumberFormatException var2) {
                System.out.println("Invalid Type for Input. Please try again.");
            } catch (InputRangeException var3) {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    public static void setCustomerTotalPay(Customer customer){
        while(true){
            try{
                System.out.println();
                System.out.println("Input Customer TotalPay: ");
                int totalPay = Integer.parseInt(Menu.sc.next());
                if(totalPay<0){
                    new InputRangeException();
                }
                customer.setTotalPay(totalPay);
                return;
            }catch (NumberFormatException var2) {
                System.out.println("Invalid Type for Input. Please try again.");
            } catch (InputRangeException var3) {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    public static void viewCustomerData(){
        System.out.println("\n======= Customer Info. =======");

        for (int i = 0; i <allCustomers.getCount(); ++i) {
            Customer customer = allCustomers.get(i);
            if(customer != null){
                System.out.println("No. "+(i+1)+"=>"+ customer);
            }else{
                System.out.println("null");
            }

        }
    }
    public static void editCustomerData(){
        int allUserCount = allCustomers.getCount();
        viewCustomerData();
        int userNo=findCustomer(allUserCount);
        if(userNo>=1&&userNo<=allUserCount){
            Customer user = allCustomers.get(userNo-1);
            if(user != null) {
                while (true) {
                    while (true) {
                        int choose = setCustomerMenu();
                        if (choose == 1) {
                            setCustomerName(user);
                            break;
                        }
                        if (choose == 2) {
                            setCustomerID(user);
                            break;
                        }
                        if (choose == 3) {
                            setCustomerSpentTime(user);
                            break;
                        }
                        if (choose == 4) {
                            setCustomerTotalPay(user);
                            break;
                        }
                        if (choose == 5) {
                            return;
                        }
                        System.out.println("\nInvalid Input. Please try again.");
                    }

                    Group grp = ParameterMenu.allGroups.findGroupFor(user);
                    if (grp == null) {
                        user.setGroup((Group) null);
                    } else if (!grp.equals(user.getGroup())) {
                        user.setGroup(grp);
                    }
                }
            }
        }
    }
    public static void deleteCustomerData(){
        int allUserCount = allCustomers.getCount();
        viewCustomerData();
        int userNo = findCustomer(allUserCount);
        if(userNo>=1&&userNo<=allUserCount) {
            Customer user = allCustomers.get(userNo-1);
            int ret = allCustomers.pop(userNo-1);
            if(ret==-1){
                System.out.println("\nCustomer Data Can't Be Deleted ...");
            }else{
                System.out.println("\nCustomer Data Deleted Successfully ! ");
            }
            viewCustomerData();
        }else{
            System.out.printf("\nSelected Customer Number Incorrect ! (Range: %d ~ %d)\n",1,allUserCount);
        }
    }
    public static int getSizeOfCustomersToInput(){
        while(true){
            try{
                System.out.println();
                System.out.println("** Press -1, if you want to exit! **");
                System.out.println("How many customers to input? ");
                int size = Integer.parseInt(Menu.sc.next());
                if(size<0){
                    throw new InputRangeException();
                }
                return size;
            }catch (NumberFormatException var1){
                System.out.println("\nInvalid Type for Input, Please try again. ");
            }catch (InputRangeException var2){
                System.out.println("\nInvalid Input, Please try again. ");
            }
        }
    }
    public static int findCustomer(int allUserCount){
        while (true) {
            try{
                System.out.println();
                System.out.println("Which customer (1 ~ "+allUserCount+" )? ");
                int userNo = Integer.parseInt(Menu.sc.next());
                return userNo;
            }catch (NumberFormatException var2){
                System.out.println("\nInvalid Type for Input. Please try again.");
            }
        }
    }

}

/*


 */
