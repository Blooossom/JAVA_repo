package toyProject1.customer;

import toyProject1.group.Group;
import toyProject1.group.GroupType;
import toyProject1.menu.ParameterMenu;
import toyProject1.menu.SortType;
import toyProject1.menu.SummaryMenu;

import java.util.Arrays;
import java.util.Comparator;

public class ClassifyCustomer {
        public static Customers[] classify(){
            Customers[] groupByCustomers = new Customers[GroupType.values().length];
            for (int i = 0; i < ParameterMenu.allGroups.length(); ++i) {
                Group grou=ParameterMenu.allGroups.get(i);
            }
            return groupByCustomers;
        }
        public static void sortByName(SortType sortType){
            Customers[] groupByCustomers = classify();
            if(sortType != null && !sortType.equals("")){
                for (int i = 0; i <groupByCustomers.length; ++i) {
                    Customer[] customers = groupByCustomers[i].getCustomers();
                    if(sortType==SortType.ASCENDING){
                        Arrays.sort(customers);
                    }else{
                        Arrays.sort(customers, new Comparator<Customer>() {
                            @Override
                            public int compare(Customer o1, Customer o2) {
                                return o1.compareTo(o2) * -1;
                            }

                        });
                    }
                    groupByCustomers[i].setCustomers(customers);
                }
                SummaryMenu.dispSummary(groupByCustomers);
                }
            }
        public static void sortBySpentTime(SortType sortType) {
        Customers[] groupByCustomers = classify();
        if (sortType != null && !sortType.equals("")) {
            for(int i = 0; i < groupByCustomers.length; ++i) {
                Customer[] customers = groupByCustomers[i].getCustomers();
                if (sortType == SortType.ASCENDING) {
                    Arrays.sort(customers, new Comparator<Customer>() {
                        public int compare(Customer o1, Customer o2) {
                            if (o1.getSpentTime() < o2.getSpentTime()) {
                                return -1;
                            } else if (o1.getSpentTime() == o2.getSpentTime()) {
                                return o1.getCustomerName() != null && o2.getCustomerName() != null ? o1.getCustomerName().compareTo(o2.getCustomerName()) : 0;
                            } else {
                                return 1;
                            }
                        }
                    });
                } else {
                    Arrays.sort(customers, new Comparator<Customer>() {
                        public int compare(Customer o1, Customer o2) {
                            if (o1.getSpentTime() < o2.getSpentTime()) {
                                return 1;
                            } else if (o1.getSpentTime() == o2.getSpentTime()) {
                                return o1.getCustomerName() != null && o2.getCustomerName() != null ? o1.getCustomerName().compareTo(o2.getCustomerName()) : 0;
                            } else {
                                return -1;
                            }
                        }
                    });
                }

                groupByCustomers[i].setCustomers(customers);
            }

            SummaryMenu.dispSummary(groupByCustomers);
        }
    }
        public static void sortByTotalPay(SortType sortType) {
        Customers[] groupByCustomers = classify();
        if (sortType != null && !sortType.equals("")) {
            for(int i = 0; i < groupByCustomers.length; ++i) {
               Customer[] customers = groupByCustomers[i].getCustomers();
                if (sortType ==SortType.ASCENDING) {
                    Arrays.sort(customers, new Comparator<Customer>() {
                        public int compare(Customer o1, Customer o2) {
                            if (o1.getTotalPay() < o2.getTotalPay()) {
                                return -1;
                            } else if (o1.getTotalPay() == o2.getTotalPay()) {
                                return o1.getCustomerName() != null && o2.getCustomerName() != null ? o1.getCustomerName().compareTo(o2.getCustomerName()) : 0;
                            } else {
                                return 1;
                            }
                        }
                    });
                } else {
                    Arrays.sort(customers, new Comparator<Customer>() {
                        public int compare(Customer o1, Customer o2) {
                            if (o1.getTotalPay() < o2.getTotalPay()) {
                                return 1;
                            } else if (o1.getTotalPay() == o2.getTotalPay()) {
                                return o1.getCustomerName() != null && o2.getCustomerName() != null ? o1.getCustomerName().compareTo(o2.getCustomerName()) : 0;
                            } else {
                                return -1;
                            }
                        }
                    });
                }

                groupByCustomers[i].setCustomers(customers);
            }

            SummaryMenu.dispSummary(groupByCustomers);
        }
    }
        }

