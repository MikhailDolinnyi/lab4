package Exceptions;

public class IncorrectNumber extends RuntimeException{
    public IncorrectNumber(int lab){
        super("Неверный номер лабы");
    }
}
