package Tema5;

public enum StudentType implements ScholarType{
    BACHELOR("ba"),
    MASTERS("ma"),
    PHD("phd");

    private String type;

    StudentType(String tip){
        this.type = tip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
