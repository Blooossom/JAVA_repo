package toyProject1.menu;
import java.util.Scanner;
public abstract class Menu {
    public Menu(){

    }
    public static Scanner sc= new Scanner(System.in);
    public static int initMainMenu(){
        System.out.println();
        System.out.println("==============================");
        System.out.println(" 1. Classification Parameter");
        System.out.println(" 2. Customer Data");
        System.out.println(" 3. Summary");
        System.out.println(" 4. Quit");
        System.out.println("==============================");
        System.out.print("Choose One: ");
        return sc.nextInt();
    }
}
