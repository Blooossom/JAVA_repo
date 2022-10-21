package toyProject1.menu;

import java.util.InputMismatchException;

public class Main {
    public Main(){

    }
    public static void main(String[] args) {
        ParameterMenu.allGroups.initialize();
        while(true) {
            try {
                int choice = Menu.initMainMenu();
                if (choice == 1) {
                    ParameterMenu.inputParameter();
                } else if (choice == 2) {
                    CustomerMenu.inputCustomerData();
                } else if (choice == 3) {
                    SummaryMenu.inputSummaryMenu();
                } else {
                    if (choice == 4) {
                        System.out.println("\nProgram Finished.");
                        break;
                    }

                    System.out.println("\nInvalid Input. Please try again.");
                }
            } catch (InputMismatchException var2) {
                System.out.println("\nInvalid Type for Input. Please try again.");
                toyProject1.menu.Menu.sc.next();
            }
        }

        Menu.sc.close();
    }
}
