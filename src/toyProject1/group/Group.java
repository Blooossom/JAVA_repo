package toyProject1.group;

import toyProject1.customer.Customers;

public class Group {
    private GroupType groupType;
    private Parameter parameter;

    //Constructor

    public Group() {
        this((GroupType)null, (Parameter)null);
    }

    public Group(GroupType groupType, Parameter parameter) {
        this.groupType = groupType;
        this.parameter = parameter;
    }

    //Getter&Setter
    public GroupType getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }

    public Parameter getParameter() {
        return parameter;
    }
    public Customers getCustomers(Customers allCustomers) {
        return allCustomers.findCustomers(this);
    }
    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }
    public void edit(GroupType groupType, Parameter parameter) {
        this.groupType = groupType;
        this.parameter = parameter;
    }
    public boolean equals(Object o) {
        return o != null && o instanceof Group && this.groupType.equals(((Group)o).groupType);
    }
    public String toString() {
        if (this.groupType == null) {
            return "No group.";
        } else if (this.parameter == null) {
            return "GroupType: " + this.groupType + "\nParameter: null";
        } else {
            GroupType var10000 = this.groupType;
            return "GroupType: " + var10000 + "\nParameter: " + this.parameter.toString();
        }
    }
}
