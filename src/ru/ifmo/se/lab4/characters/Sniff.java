package ru.ifmo.se.lab4.characters;

public class Sniff extends Person{


    public Sniff(String name, String location, String preposition) {
        super(name, location, preposition);
    }
    public String runAround(){
        return "обежал " + getPreposition();
    }
}
