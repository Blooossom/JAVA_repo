package toyProject1.menu;

import toyProject1.customer.Customer;
import toyProject1.customer.Customers;
import toyProject1.exception.InputEmptyException;
import toyProject1.exception.InputFormatException;
import toyProject1.exception.InputOutOfRangeException;
import toyProject1.group.Group;

import java.util.regex.Pattern;

public class CustomerMenu {
    public static Customers allCustomers = new Customers();
    public CustomerMenu() {
    }

    public static void inputCustomerData() {
        while(true) {
            int choose = initCustomerMenu();
            if (choose == 1) {
                int size = getSizeOfCustomersToInput();
                setCustomerData(size);
            } else if (choose == 2) {
                viewCustomerData();
            } else if (choose == 3) {
                updateCustomerData();
            } else if (choose == 4) {
                deleteCustomerData();
            } else {
                if (choose == 5) {
                    return;
                }

                System.out.println("\nInvalid Input. Please try again.");
            }
        }
    }

    public static void setCustomerData(int size) {
        label2:
        for(int i = 0; i < size; ++i) {
            Customer customer = new Customer();
            System.out.println("\n====== Customer " + (i + 1) + " Info. ======");

            while(true) {
                while(true) {
                    int choose = SetCustomerMenu();
                    if (choose == 1) {
                        setCustomerName(customer);
                        break;
                    }

                    if (choose == 2) {
                        setCustomerID(customer);
                        break;
                    }

                    if (choose == 3) {
                        setCustomerSpentTime(customer);
                        break;
                    }

                    if (choose == 4) {
                        setCustomerTotalPay(customer);
                        break;
                    }

                    if (choose == 5) {
                        customer.setGroup(ParameterMenu.allGroups.findGroupFor(customer));
                        allCustomers.add(customer);
                        System.out.println();
                        continue label2;
                    }

                    System.out.println("\nInvalid Input. Please try again.");
                }

                Group grp = ParameterMenu.allGroups.findGroupFor(customer);
                if (grp == null) {
                    customer.setGroup((Group)null);
                } else if (!grp.equals(customer.getGroup())) {
                    customer.setGroup(grp);
                }
            }
        }

    }

    public static void viewCustomerData() {
        System.out.println("\n======= Customer Info. =======");

        for(int i = 0; i < allCustomers.getCount(); ++i) {
            Customer customer = allCustomers.get(i);
            if (customer != null) {
                System.out.println("No. " + (i + 1) + " => " + customer);
            } else {
                System.out.println("null");
            }
        }

    }

    public static void updateCustomerData() {
        int allCustomerCount = allCustomers.getCount();
        viewCustomerData();
        int customerNo = findCustomer(allCustomerCount);
        if (customerNo >= 1 && customerNo <= allCustomerCount) {
           Customer customer = allCustomers.get(customerNo - 1);
            if (customer != null) {
                while(true) {
                    while(true) {
                        int choose = SetCustomerMenu();
                        if (choose == 1) {
                            setCustomerName(customer);
                            break;
                        }

                        if (choose == 2) {
                            setCustomerID(customer);
                            break;
                        }

                        if (choose == 3) {
                            setCustomerSpentTime(customer);
                            break;
                        }

                        if (choose == 4) {
                            setCustomerTotalPay(customer);
                            break;
                        }

                        if (choose == 5) {
                            return;
                        }

                        System.out.println("\nInvalid Input. Please try again.");
                    }

                    Group grp = ParameterMenu.allGroups.findGroupFor(customer);
                    if (grp == null) {
                        customer.setGroup((Group)null);
                    } else if (!grp.equals(customer.getGroup())) {
                        customer.setGroup(grp);
                    }
                }
            }
        }

    }

    public static void deleteCustomerData() {
        int allCustomerCount = allCustomers.getCount();
        viewCustomerData();
        int customerNo = findCustomer(allCustomerCount);
        if (customerNo >= 1 && customerNo <= allCustomerCount) {
            Customer customer = allCustomers.get(customerNo - 1);
            int result = allCustomers.pop(customerNo - 1);
            if (result == -1) {
                System.out.println("\nCustomer Data Can't Be Deleted ...");
            } else {
                System.out.println("\nCustomer Data Deleted Successfully !");
            }

            viewCustomerData();
        } else {
            System.out.printf("\nSelected Customer Number Incorrect ! ( Range: %d ~ %d )\n", 1, allCustomerCount);
        }

    }

    public static int initCustomerMenu() {
        while(true) {
            try {
                System.out.println();
                System.out.println("==============================");
                System.out.println(" 1. Add Customer Data");
                System.out.println(" 2. View Customer Data");
                System.out.println(" 3. Update Customer Data");
                System.out.println(" 4. Delete Customer Data");
                System.out.println(" 5. Back");
                System.out.println("==============================");
                System.out.print("Choose One: ");
                int choose = Integer.parseInt(Menu.sc.next());
                if (choose >= 1 && choose <= 5) {
                    return choose;
                }

                throw new InputOutOfRangeException();
            } catch (NumberFormatException err) {
                System.out.println("Invalid Type for Input. Please try again.");
            } catch (InputOutOfRangeException err) {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static int getSizeOfCustomersToInput() {
        while(true) {
            try {
                System.out.println();
                System.out.println("** Press -1, if you want to exit! **");
                System.out.print("How many customers to input? ");
                int size = Integer.parseInt(Menu.sc.next());
                if (size < 0) {
                    throw new InputOutOfRangeException();
                }

                return size;
            } catch (NumberFormatException err) {
                System.out.println("\nInvalid Type for Input. Please try again.");
            } catch (InputOutOfRangeException err) {
                System.out.println("\nInvalid Input. Please try again.");
            }
        }
    }

    public static int SetCustomerMenu() {
        while(true) {
            try {
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
                if (choose >= 1 && choose <= 5) {
                    return choose;
                }

                throw new InputOutOfRangeException();
            }catch (NumberFormatException err) {
                System.out.println("\nInvalid Type for Input. Please try again.");
            } catch (InputOutOfRangeException err) {
                System.out.println("\nInvalid Input. Please try again.");
            }
        }
    }

    public static void setCustomerName(Customer customer) {
        while(true) {
            try {
                System.out.println();
                System.out.print("Input Customer's Name: ");
                String REGEX = "^[a-zA-Z]{3,}$";
                String name = Menu.sc.next();
                if (name != null && !name.equals("")) {
                    if (Pattern.matches(REGEX, name)) {
                        customer.setCustomerName(name);
                        return;
                    }
                    throw new InputFormatException();
                }
                throw new InputEmptyException();
            } catch (InputFormatException err) {
                System.out.println("Invalid Input for Format. Please try again.");
            } catch (InputEmptyException err) {
                System.out.println("Empty Input. Please input something.");
            }
        }
    }
    public static void setCustomerID(Customer customer) {
        while(true) {
            try {
                System.out.println();
                System.out.print("Input Customer's UserID: ");
                String REGEX = "^[a-zA-Z]{1}[a-zA-Z0-9_]{4,11}$";
                String userID = Menu.sc.next();
                if (userID != null && !userID.equals("")) {
                    if (Pattern.matches(REGEX, userID)) {
                        customer.setCustomerID(userID);
                        return;
                    }
                    throw new InputFormatException();
                }
                throw new InputEmptyException();
            } catch (InputEmptyException err) {
                System.out.println("Empty Input. Please input something.");
            } catch (InputFormatException err) {
                System.out.println("Invalid Input for Format. Please try again.");
            }
        }
    }

    public static void setCustomerSpentTime(Customer customer) {
        while(true) {
            try {
                System.out.println();
                System.out.print("Input Customer's Spent Time at Your Store: ");
                int spentTime = Integer.parseInt(Menu.sc.next());
                if (spentTime < 0) {
                    throw new InputOutOfRangeException();
                }
                customer.setSpentTime(spentTime);
                return;
            } catch (NumberFormatException err) {
                System.out.println("Invalid Type for Input. Please try again.");
            } catch (InputOutOfRangeException err) {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
    public static void setCustomerTotalPay(Customer customer) {
        while(true) {
            try {
                System.out.println();
                System.out.print("Input Customer's Total Payment at Your Store: ");
                int totalPay = Integer.parseInt(Menu.sc.next());
                if (totalPay < 0) {
                    throw new InputOutOfRangeException();
                }
                customer.setTotalPay(totalPay);
                return;
            } catch (NumberFormatException err) {
                System.out.println("Invalid Type for Input. Please try again.");
            } catch (InputOutOfRangeException err) {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static int findCustomer(int allCustomerCount) {
        while(true) {
            try {
                System.out.println();
                System.out.print("Which customer ( 1 ~ " + allCustomerCount + " )? ");
                int customerNo = Integer.parseInt(Menu.sc.next());
                return customerNo;
            } catch (NumberFormatException err) {
                System.out.println("\nInvalid Type for Input. Please try again.");
            }
        }
    }
}
