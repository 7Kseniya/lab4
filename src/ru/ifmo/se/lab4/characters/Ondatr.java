package ru.ifmo.se.lab4.characters;

public class Ondatr extends Person {
    public Ondatr(String name, String location, String preposition) {
        super(name, location, preposition);
    }
    public String emerge(){
        return "вынырнул ";
    }
    public class Voice{
        private final String PLAINTIVE = " жалобным ";

        @Override
        public String toString(){
            return PLAINTIVE + "голосом ";
        }
    } //inner class


    public String say(){
        var ondatr1 = new Ondatr("", "", "");
        var voice = ondatr1.new Voice();
        return voice.toString() + "сказал: ";
    }
    //и жалобным голосом сказал

}
