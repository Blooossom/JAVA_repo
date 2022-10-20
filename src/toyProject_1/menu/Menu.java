package toyProject_1.menu;
import java.util.InputMismatchException;
import java.util.Scanner;
public abstract class Menu {
    public static  Scanner sc;

    public Menu(){
    }

    public static int initMenu() throws InputMismatchException {
        System.out.println();
        System.out.println("==============================");
        System.out.println("1. Classification Parameter");
        System.out.println("2. Customer Data");
        System.out.println("3. Summary");
        System.out.println("4. Quit");
        System.out.println("==============================");
        System.out.println("Choose One: ");
        return sc.nextInt();
    }
    static {
        sc = new Scanner(System.in);
    }
}