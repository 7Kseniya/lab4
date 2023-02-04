package ru.ifmo.se.lab4.objects.nature;

import ru.ifmo.se.lab4.support.Describable;

public class Hill extends Nature implements Describable {
    public Hill(String nature_name) {
        super(nature_name);
    }
    private final String HIGH = "высокий ";
    private final String GREEN = "зелёный ";
    @Override
    public String describe(){
        return HIGH + GREEN + getNatureName();
    }

}
