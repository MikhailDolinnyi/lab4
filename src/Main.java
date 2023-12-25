import Classes.*;
import Enums.Conjunctions;
import Enums.FencePosition;
import Enums.Pronoun;
import Exceptions.*;
import Intefaces.Jump;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Korotishki korotishki = new Korotishki("Коротышки");
        He he = new He("Он");
        House.Doors doors = new House.Doors("Двери");
        ThisTime time = new ThisTime("Время");
        Moan moan= new Moan("Стон");
        Znaika znaika=new Znaika("Знайка");
        UnknownP unknownP = new UnknownP("Кто-то");
        Heaviness heavy = new Heaviness("Тяжесть");
        Fence.Plank plank = new Fence.Plank("Доска");
        Fence fence = new Fence("Забор");
        Hole hole = new Hole ("Пролом");
        Vintik vintik = new Vintik("Винтик");
        Ground ground = new Ground("Земля");
        House house = new House("Дом");
        Scanner in =new Scanner(System.in);
        System.out.print("Введи номер лабы: ");
        int lab = in.nextInt();
        // Unchecked exception
        if (lab!=4){
            try{
                throw new IncorrectNumber(lab);
            }catch (IncorrectNumber e){
                e.printStackTrace();
            }
            }

        //Anonim class
        Jump jump = new Jump() {
            @Override
            public String jump() {
                return "Прыжок не удался";
            }
        };

        System.out.println(korotishki.lookToFrom(he.getName(), doors.getName())+ Conjunctions.COMMA+ he.scream() + "\n" +

                znaika.doing("несколько шагов") + Conjunctions.AND + znaika.want() + znaika.jump() + "\n" +
                jump.jump() + "\n" +
                znaika.cameOff(ground.getName()) + znaika.tried(false) + "\n" +


                time.time() + FencePosition.BEHIND + moan.heard(moan.getName()) + "\n"

                + znaika.listen() + ','+ Pronoun.HIM + znaika.seemed() + Conjunctions.WHAT+ unknownP.callHelp()+ "\n"+

                znaika.runTo(fence.getName()) + Conjunctions.AND + znaika.want() + znaika.climbOn(fence.getName()) +
                 Conjunctions.BUT + znaika.tried(false) + "\n" +

                heavy.activeWith(" со страшной силой", znaika.getName()) + "\n" +

                znaika.heard() + Conjunctions.WHAT + FencePosition.BEHIND +unknownP.callHelp() + znaika.breakOut(plank,fence) +
                Conjunctions.AND + znaika.lookOut(hole.getName()) + "\n"+

                FencePosition.NEAR + znaika.see(vintik.getName()) +Conjunctions.COMMA+ vintik.lieOn(ground.getName()) + "\n"+

                vintik.see(znaika.getName()) + "\n"+

                znaika.grab(vintik.getName(), " под мышки" ) + Conjunctions.COMMA + znaika.throwOn(vintik.getName(), "спину ")+
                Conjunctions.AND + znaika.carryThroughTo(vintik.getName(), hole.getName(), house.getName()) + "\n" +

                znaika.doing("несколько шагов") + Conjunctions.AND + znaika.feel(heavy.decrease()) + Conjunctions.COMMA + znaika.doing("еще шаг")+ Conjunctions.COMMA +
                znaika.cameOff(ground.getName()) + Conjunctions.AND + znaika.soarWith(vintik.getName(), " в воздух") + "\n" +
                znaika.tell() + znaika.think() + "\n" +
                he.confused() + Conjunctions.BUT + he.remember() + Conjunctions.WHAT + he.tieTo("верёвке") + Conjunctions.AND + he.scream()

        );



    }

}
