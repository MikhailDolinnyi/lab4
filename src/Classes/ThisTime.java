package Classes;

import Intefaces.Time;

public class ThisTime extends Essence implements Time {
    public ThisTime(String name){
        super(name);
    }
    @Override
    public String time() {
        return " В это " + getName();
    }
}
