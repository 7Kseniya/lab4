package ru.ifmo.se.lab4.characters;

import ru.ifmo.se.lab4.exceptions.AmountOfPeople;
import ru.ifmo.se.lab4.exceptions.NoLocationException;
import ru.ifmo.se.lab4.exceptions.NoPrepositionException;

import java.util.Objects;

public class Person {
    //Person person = new Person("все", "черноту подвала", "в");
    public String comeDown(int amount) throws AmountOfPeople {
        if(amount>1){
            throw new AmountOfPeople("not enough people");
        }
        return "все спустились";

    }

    private String name;
    private String location;
    private String preposition;

    public Person(String name, String location, String preposition){
        this.name = name;
        this.location = location;
        this.preposition = preposition;
    }

    public String getName(){
        return name + " ";
    }

    public String getLocation() throws NoLocationException {
        if(this.location == null){
            throw new NoLocationException("location hasn't been specified");
        }
        return location + " ";
    }

    public String getPreposition() throws NoPrepositionException {
        if(this.preposition == null){
            throw new NoPrepositionException("preposition hasn't been specified");
        }
        return preposition + " ";
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null||getClass() != o.getClass()) return false;
        Person person  = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(location, person.location) && Objects.equals(preposition, person.preposition);
    }
}
