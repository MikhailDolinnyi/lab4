package Enums;

public enum FencePosition {
    BEHIND(" за забором "),
    NEAR(" Неподалеку от забора ");


    private String position;
    FencePosition(String position){
        this.position=position;
    }

    @Override
    public String toString() {
        return position;
    }
}
