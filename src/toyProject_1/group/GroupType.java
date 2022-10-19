package toyProject_1.group;

public enum GroupType {
    GENERAL("GENERAL"),
    VIP("VIP"),
    VVIP("VVIP"),
    NONE("NONE");
    String groupType = "";

    private GroupType(String groupType){
        this.groupType=groupType;
    }

    public String getGroupType() {
        return this.groupType;
    }

    public void setGroupType(String groupClass) {
        this.groupType = groupType;
    }
}