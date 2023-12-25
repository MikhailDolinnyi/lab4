package Classes;

import Intefaces.ActiveOn;
import Intefaces.Decrease;

public class Heaviness extends Essence implements ActiveOn, Decrease {
    public Heaviness(String name){
        super(name);
    }
    @Override
    public String activeOn(String to_obj) {
        return getName()+" действовала на " + to_obj;
    }

    public String activeWith(String with, String to_obj){
        return getName()+ with+ " действовала на " + to_obj;

    }

    @Override
    public String decrease() {
        return getName()+" уменьшилась ";
    }
}
