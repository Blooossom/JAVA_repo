package toyProject_1;

public class Menu {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("==============================").append("\n")
                .append("1. Add Customer Data").append("\n")
                .append("2. View Customer Data").append("\n")
                .append("3. Update Customer Data").append("\n")
                .append("4. Delete Customer Data").append("\n")
                .append("5. Back").append("\n")
                .append("==============================").append("\n")
                .append("Choose One : ").append("\n");
        System.out.println(sb);
    }
}
