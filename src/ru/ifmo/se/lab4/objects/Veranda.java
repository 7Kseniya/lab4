package ru.ifmo.se.lab4.objects;

import ru.ifmo.se.lab4.support.Overgrown;

public class Veranda extends House implements Overgrown {
    public Veranda(String houseName) {
        super(houseName);
    }



    @Override
    public String overgrow(String tightly) {
        return tightly + "заросшей " + getHouseName();
    }
}
