package Classes;

import Intefaces.Heard;

public class Moan extends Essence implements Heard {
    public Moan(String name){
        super(name);
    }

    @Override
    public String heard(String bj) {
        return "послышался " + bj;

    }
}
