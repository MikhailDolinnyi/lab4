package Classes;

import Intefaces.CallHelp;

public class UnknownP extends Essence implements CallHelp {
    public UnknownP(String name) {
        super(name);
    }


    @Override
    public String callHelp() {
        return getName()+ " зовёт на помощь ";
    }
}
