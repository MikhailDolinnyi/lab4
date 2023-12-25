package Classes;

import Intefaces.LieOn;
import Intefaces.See;

public class Vintik extends UnknownP implements LieOn, See {
    public Vintik(String name){
        super(name);
    }



    @Override
    public String lieOn(String obj) {
        return getName() + " лежал на "+ obj;
    }

    @Override
    public String see(String obj) {
        return getName()+ " увидел " + obj;
    }
}
