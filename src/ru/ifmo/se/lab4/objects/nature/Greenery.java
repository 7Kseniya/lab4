package ru.ifmo.se.lab4.objects.nature;

import ru.ifmo.se.lab4.enums.NatureParams;
import ru.ifmo.se.lab4.support.Overgrown;

public class Greenery extends Nature implements Overgrown {
    public Greenery(String nature_name) {
        super(nature_name);
    }

    private String greeneryDescription;
    public String thereIs(NatureParams natureParam){
        var greenery1 = new Greenery("растительности");

        switch(natureParam){
            case WILD -> this.greeneryDescription = "дикой " + greenery1.getNatureName();
            case FIG -> this.greeneryDescription = "фиговыми";
            case CLIMBING -> this.greeneryDescription = "вьющихся ";
        }
        return greeneryDescription ;
    }


    @Override
    public String overgrow(String string) {
        return string + "проросших в ";
    }
}
