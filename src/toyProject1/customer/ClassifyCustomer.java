package toyProject1.customer;

import toyProject1.group.Group;
import toyProject1.group.GroupType;
import toyProject1.menu.ParameterMenu;

public class ClassifyCustomer {
        public static Customers[] classify(){
            Customers[] groupByCustomers = new Customers[GroupType.values().length];
            for (int i = 0; i < ParameterMenu.allGroups.length(); ++i) {
                Group grou=ParameterMenu.allGroups.get(i);
            }
            return groupByCustomers;
        }
}
