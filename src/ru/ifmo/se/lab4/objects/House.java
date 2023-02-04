package ru.ifmo.se.lab4.objects;

import java.util.Objects;

public abstract class House {
    String houseName;
    public House(String houseName){
        this.houseName = houseName;
    }

    public String getHouseName(){
        return houseName + " ";
    }

    @Override
    public boolean equals(java.lang.Object o){
        if (this == o){
            return true;
        }
        if (o == null||getClass() != o.getClass()) return false;
        House house  = (House) o;
        return Objects.equals(houseName, house.houseName);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(houseName);
    }
}
