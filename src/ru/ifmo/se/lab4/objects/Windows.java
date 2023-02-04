package ru.ifmo.se.lab4.objects;

import ru.ifmo.se.lab4.support.NonExisted;

public class Windows extends House implements NonExisted {

    public Windows(String houseName) {
        super(houseName);
    }
    @Override
    public String thereAreNo(){
        return "ни " + getHouseName();
    }
}
