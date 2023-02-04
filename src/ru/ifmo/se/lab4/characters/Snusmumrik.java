package ru.ifmo.se.lab4.characters;

import ru.ifmo.se.lab4.enums.Adverbs;

public class Snusmumrik extends Person implements OverLooked {
    public Snusmumrik(String name, String location, String preposition) {
        super(name, location, preposition);
    }
    private String look;

    @Override
    public String overLook(Adverbs adverb) {
        switch(adverb){
            case WITHINTEREST -> this.look = "с интересом ";
            default -> this.look = "";
        }
        return look + "стал осматривать ";
    }

    public String grab(){
        return "ухватился " + getPreposition();
    }
    public String pull(){
        return " потянул. ";
    }
    public String stepForward(){
        return "выступил " ;
    }
     @Override
    public boolean equals(Object obj){
        if (this.getClass() != obj.getClass() || obj == null){
            return false;
        }
        Snusmumrik snusmumrik = (Snusmumrik) obj;
        return snusmumrik.look == this.look;
    }
    @Override
    public int hashCode(){
        return this.look.hashCode();
    }
}
