package toyProject_1;

public enum GroupClass{
    GENERAL("GENERAL"),
    VIP("VIP"),
    VVIP("VVIP");
    String groupClass = "";

    private GroupClass(String groupClass){

    }

    public String getGroupClass() {
        return groupClass;
    }

    public void setGroupClass(String groupClass) {
        this.groupClass = groupClass;
    }
}