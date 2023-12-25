package Classes;

import Intefaces.LookOutFrom;

public class Korotishki extends Essence implements LookOutFrom {
    public Korotishki(String name){
        super(name);

    }


    @Override
    public String lookToFrom(String to, String from) {
        return getName()+ " смотрят на " + to + " из " + from;
    }
}
