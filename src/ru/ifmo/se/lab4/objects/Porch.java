package ru.ifmo.se.lab4.objects;

import ru.ifmo.se.lab4.enums.NatureParams;
import ru.ifmo.se.lab4.objects.nature.Greenery;
import ru.ifmo.se.lab4.support.Overgrown;

public class Porch extends House implements Overgrown {
    public Porch(String houseName)  {
        super(houseName);
    }

    @Override
    public String overgrow(String entirely) {
        var trees = new Greenery(" деревьями");
        return entirely + " заросло " + trees.thereIs(NatureParams.FIG) + trees.getNatureName(); //сплошь
    }
}
