package toyProject_1;
import java.util.InputMismatchException;
import toyProject_1.group.Group;
import toyProject_1.group.GroupType;
import toyProject_1.group.Parameter;
import toyProject_1.menu.CustomerMenu;
import toyProject_1.menu.ParameterMenu;
import toyProject_1.menu.Menu;
import toyProject_1.menu.SummaryMenu;
import toyProject_1.customer.Customer;
public class Main {
    public Main(){

    }
    public static void test(){
        ParameterMenu.allGroups.add(new Group(GroupType.GENERAL, new Parameter(10,10000)));
        ParameterMenu.allGroups.add(new Group(GroupType.VIP,new Parameter(20,2000000)));
        ParameterMenu.allGroups.add(new Group(GroupType.VVIP,new Parameter(30,30000000)));

        for (int i = 0; i <20; ++i) {
            CustomerMenu.allCustomers.add(new Customer(""+(char)(97+i),(char)(97+i)+"12345",i*10,i*1000000));
        }
        CustomerMenu.allCustomers.refresh(ParameterMenu.allGroups);
    }
    public static void main(String[] args) {
        ParameterMenu.allGroups.initialize();

        while (true) {
            try{
                int choose=Menu.initMenu();
                if (choose == 1) {
                    ParameterMenu.manageParameter();
                } else if (choose == 2) {
                    CustomerMenu.manageCustomerMenu();
                } else if (choose == 3) {
                    SummaryMenu.managaeSummaryMenu();
                }else{
                    if (choose == 4) {
                        System.out.println("\nProgram Finished.");
                        break;
                    }
                    System.out.println("\nInvalid Input. Please try again.");
                }
            }catch(InputMismatchException var2){
                System.out.println("\nInvalid Type for Input. Please try again.");
                Menu.sc.next();
            }
        }
        Menu.sc.close();
    }
}
/*

 */