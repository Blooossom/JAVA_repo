package toyProject_1.group;

import toyProject_1.customer.Customers;
public class Group {
   private GroupType type;
   private Parameter parameter;
   public Group(GroupType type, Parameter parameter){
       this.type = type;
       this.parameter = parameter;
   }
   public Group(){this((GroupType)null, (Parameter)null);}

    public GroupType getType() {
        return type;
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public void edit(GroupType type, Parameter parameter){
       this.type = type;
       this.parameter= parameter;
    }
    public Customers getCustomers(Customers allCustomers) {
        return allCustomers.findCustomers(this);
    }
    @Override
    public boolean equals(Object o) {
        return o != null && o instanceof Group && this.type.equals(((Group)o).type);

    }

    public String toString() {
        if (this.type == null) {
            return "No group.";
        } else if (this.parameter == null) {
            return "GroupType: " + this.type + "\nParameter: null";
        } else {
            GroupType var10000 = this.type;
            return "GroupType: " + var10000 + "\nParameter: " + this.parameter.toString();
        }
    }
/*below
    public Customers getCustomers(Customers allCustomers){
       return allCustomers.findCustomers(this);

 */
    }

