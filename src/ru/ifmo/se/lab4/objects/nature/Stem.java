package ru.ifmo.se.lab4.objects.nature;

import ru.ifmo.se.lab4.enums.Adverbs;
import ru.ifmo.se.lab4.enums.StemParams;
import ru.ifmo.se.lab4.support.Describable;

public class Stem extends Nature implements Describable {

    public Stem(String natureName) {
        super(natureName);
    }
    private String description;
    public String stemDescribe(StemParams param){
        switch(param){
            case ELASTIC -> this.description = "был упругий";
            case RUBBER -> this.description = " словно резиновый";
            case POWERFUL -> this.description = " мощными ";
        }
        return description;
    }
    @Override
    public String describe(){
        return stemDescribe(StemParams.ELASTIC) + "," + stemDescribe(StemParams.RUBBER)+ ", и " + notPull() + "! ";
    }

    public String notPull(){
        class Earth{
            @Override
            public String toString(){
                return "земли";
            }
        }; //local class
        Earth earth = new Earth();
        return "не выдергивался из " + earth.toString();
    }
    private String stemDescription;
    public String wrappedAround(Adverbs adverb){
        class Hat{
            public String toString(){
                return "шляпы Снусмумрика ";
            }
        };
        Hat hat = new Hat();
        switch(adverb){
            case KINDABYCHANCE-> this.stemDescription = "Как бы невзначай ";
            default -> this.stemDescription = "";
        }
        return stemDescription + "обвился он вокруг " + hat.toString();
    }
    public String takeOff(String what){
        return " снял " + what;
    }






}
