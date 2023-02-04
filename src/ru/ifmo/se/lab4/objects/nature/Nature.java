package ru.ifmo.se.lab4.objects.nature;
public abstract class Nature {
    String natureName;
    public Nature(String natureName){
        this.natureName = natureName;
    }
    public String getNatureName(){
        return natureName + " ";
    }

}
