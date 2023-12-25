package Classes;

import Intefaces.Confused;
import Intefaces.Remember;
import Intefaces.Scream;
import Intefaces.TieTo;

public class He extends Znaika implements Scream, Confused, Remember, TieTo {

    public He(String name) {
        super(name);
    }

    @Override
    public String scream() {
        return getName() + " закричал ";
    }

    @Override
    public String confused() {
        return getName() + " растерялся ";
    }

    @Override
    public String remember() {
        return getName() + " вспомнил ";
    }

    @Override
    public String tieTo(String to) {
        return getName() + " привязан к " + to;
    }
}
