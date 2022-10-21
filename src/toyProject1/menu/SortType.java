package toyProject1.menu;

public enum SortType {
    ASCENDING("ASCENDING"),
    DESCENDING("DESCENDING");
    String sortType = "";

    SortType(String sortType) {
        this.sortType = sortType;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }
}
