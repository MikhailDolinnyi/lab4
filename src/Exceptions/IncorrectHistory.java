package Exceptions;

public class IncorrectHistory extends Exception{
    public IncorrectHistory(String obj){
        super("По истории Знайка залез на забор, а не на что-либо иное");
    }
}
