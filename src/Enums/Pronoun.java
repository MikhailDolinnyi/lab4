package Enums;

public enum Pronoun {
    HIM ("ему "),
    ON_HIM("на него "),
    HIS("его ");

    private String pronoun;
    Pronoun(String pronoun){
        this.pronoun=pronoun;
    }

    @Override
    public String toString() {
        return pronoun;
    }
}
