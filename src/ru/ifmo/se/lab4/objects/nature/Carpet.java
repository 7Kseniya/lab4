package ru.ifmo.se.lab4.objects.nature;

import ru.ifmo.se.lab4.enums.Adverbs;
import ru.ifmo.se.lab4.enums.NatureParams;

public class Carpet extends Nature {
    public Carpet(String nature_name) {
        super(nature_name);
    }
    private String carpetDescription;
    public String grow(NatureParams params){
        switch(params){
            case CONTINUED -> this.carpetDescription = "Сплошной " + getNatureName();
            case LUSHANDGREEN -> this.carpetDescription = "пышным зеленым ковром" ;
        }
        return carpetDescription;
    }
    @Override
    public boolean equals(Object obj){
        if (this.getClass() != obj.getClass() || obj == null){
            return false;
        }
        Carpet carpet = (Carpet) obj;
        return carpet.carpetDescription == this.carpetDescription;
    }
    @Override
    public int hashCode(){
        return this.carpetDescription.hashCode();
    }


}
