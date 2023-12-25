package Classes;

import Intefaces.IFence;
import Intefaces.IPlank;
public class Fence extends Essence implements IFence{
    private boolean isBreak=false;
    public Fence(String name){
        super(name);
    }

    public void setBroke(boolean broke){
        if (broke == true){
            isBreak=true;

        }
        else{
            isBreak=false;
        }

    }

    public boolean getIsBreak(){
        return isBreak;

    }

    // Вложенный класс
    public static class Plank extends Essence implements IPlank{
        public Plank(String name){
            super(name);
        }
    }


}
