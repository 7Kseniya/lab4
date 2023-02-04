package ru.ifmo.se.lab4.objects;
import ru.ifmo.se.lab4.enums.Adverbs;
import ru.ifmo.se.lab4.support.NonExisted;

public class Doors extends House implements NonExisted {

    public Doors(String houseName) {
        super(houseName);
    }
    @Override
    public String thereAreNo(){
        return "ни " + getHouseName();
    }


    private String hopelessly;
    public String barricade(Adverbs adverb){
        switch (adverb){
            case HOPELESSLY -> this.hopelessly = " безнадежно ";
            default -> this.hopelessly = " ";
        }
        return "была" + hopelessly + "забаррикадирована";
    }

}


