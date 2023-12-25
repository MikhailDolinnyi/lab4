package Enums;

public enum Conjunctions {
    AND (" и "),
    WHAT(", что "),
    BUT(", но "),
    COMMA(", ");

    private String conjunction;
    Conjunctions(String conjunction){
        this.conjunction=conjunction;
    }

    @Override
    public String toString() {
        return conjunction;
    }
}
