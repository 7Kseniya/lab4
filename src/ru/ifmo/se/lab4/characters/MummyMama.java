package ru.ifmo.se.lab4.characters;

import ru.ifmo.se.lab4.enums.Adverbs;
import ru.ifmo.se.lab4.objects.Doors;

public class MummyMama extends Person{

    public MummyMama(String name, String location, String preposition) {
        super(name, location, preposition);
    }
    private String openDoor;

    public String tryToOpen(Adverbs adverb, Doors door1){
        switch(adverb){
            case VAINLY -> this.openDoor = "но тщетно. ";
            default -> this.openDoor = "";
        }
        return "попробовала отворить " + door1.getHouseName() + openDoor;
    }
    public String breakGlass(){
        class Glass{
            public String toString(){
                return "стекло ";
            }
        }; //local class

        Glass glass = new Glass();
        return "выбила " + glass.toString();
    }

    public class Work{
        private final String GREATEST = "с величайшим ";
        @Override
        public String toString(){
            return GREATEST + "трудом ";
        }
    } //inner class

    public String squeezeThrough(){
        var mummyMama1 = new MummyMama("", "", "");
        var work = mummyMama1.new Work();
        return work.toString() + "протиснулась ";
    }

    public String sitDown(){
        return "присела ";
    }
    public String fan(){
        return "обмахиваясь " + leaf.leafDescribe();
    }
    Leaf leaf = new Leaf();
    public static class Leaf{
        public String leafDescribe(){
            return "пальмовым листом";
        }
    } //static nested class

}
