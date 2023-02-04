package ru.ifmo.se.lab4.objects;

import ru.ifmo.se.lab4.support.Overgrown;

public class Room extends House implements Overgrown {
    public Room(String houseName) {
        super(houseName);
    }

    @Override
    public String overgrow(String jungle) { //друмучие джунгли
        return "превратилась в " + jungle;
    }
}
