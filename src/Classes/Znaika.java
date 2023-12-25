package Classes;
import Enums.Conjunctions;
import Exceptions.IncorrectHistory;
import Exceptions.IncorrectNumber;
import Intefaces.*;
import Intefaces.ThrowOn;
import Exceptions.IncorrectHistory;


public class Znaika extends Essence  implements Listen, Seemed, RunTo, Want, ClimbOn, Try, BreakOut, LookOut, See, Grab, ThrowOn, CarryThroughTo, Do , Feel, CameOff, SoarWith, Jump, Think {
    public Znaika(String name) {
        super(name);

    }


    @Override
    public String listen() {
        return getName() + " прислушался ";
    }

    @Override
    public String seemed() {
        return " показалось ";
    }

    @Override
    public String runTo(String obj) {
        return getName() + " подбежал к " + obj;
    }

    @Override
    public String want() {
        return " хотел ";
    }


    // Checked Exceptions
    @Override
    public String climbOn(String obj) {
        if (obj != "Забор") {
            try {
                throw new IncorrectHistory(obj);
            } catch (IncorrectHistory e) {
                e.printStackTrace();
            }

        }
        return " залезть на " + obj;
    }

    @Override
    public String tried(boolean tried) {
        if (tried == true) {
            return " удалось ";
        } else {
            return " не удалось ";
        }
    }

    public String heard() {
        return " Услышав ";

    }

    @Override
    public String breakOut(IPlank plank, IFence from) {
        from.setBroke(true);
        return getName() + " выломал " + plank.getName() + " в " + from.getName();


    }

    @Override
    public String lookOut(String obj) {
        return " заглянул в " + obj;
    }

    @Override
    public String see(String obj) {
        return getName() + " увидел " + obj;
    }

    @Override
    public String grab(String obj, String forWhat) {
        return getName() + " схватил " + obj + forWhat;
    }

    @Override
    public String throwOn(String obj, String on) {
        return " закинул " + obj + " на " + on;
    }

    @Override
    public String carryThroughTo(String obj, String through, String to) {
        return " понёс " + obj + " сквозь " + through + " к " + to;
    }

    @Override
    public String doing(String what) {
        return getName() + " сделал " + what;
    }

    @Override
    public String feel(String what) {
        return "почувствовал" + Conjunctions.WHAT + what;
    }

    @Override
    public String cameOff(String from) {
        return getName() + " оторвался от " + from;
    }

    @Override
    public String soarWith(String obj, String to) {
        return " взвился с " + obj + to;
    }

    @Override
    public String jump() {
        return " подпрыгнуть ";
    }

    @Override
    public String think() {
        return getName() + " подумал ";
    }

    // вложенный class
    private class Sentence {
        public String tell() {
            return "Что за чудо! Опять попал в состояние невесомости? ";
        }
    }

    public String tell() {
        Sentence sentence = new Sentence();
        return sentence.tell();
    }

    //Local Class
    public void doSomething() {
        class LocalClass {
            private String action;

            public LocalClass(String action) {
                this.action = action;
            }

            public void performAction() {
                System.out.println("Делает " + action);
            }
        }

    }
}
