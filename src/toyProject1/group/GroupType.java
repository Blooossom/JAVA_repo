package toyProject1.group;

public enum GroupType {
    OTHERS("OTHERS"),
    GENERAL("GENERAL"),
    VIP("VIP"),
    VVIP("VVIP");

    String groupType="";

    //Constructor
    GroupType(String groupType) {
        this.groupType = groupType;
    }

    //Getter&Setter

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
}
