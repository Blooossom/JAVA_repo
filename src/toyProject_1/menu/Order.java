package toyProject_1.menu;

public enum Order{
    ASCENDING("ASCENDING"),
    DESCENDING("DESCENDING");

    String sortType = "";

    private Order(String sortType){
        this.sortType = sortType;
    }
    public String getSortType(){
        return this.sortType;
    }
    public void setSortType(String sortType){
        this.sortType=sortType;
    }
}
