package ru.ifmo.se.lab4.objects.nature;

import ru.ifmo.se.lab4.objects.MummiHouse;

public class Creepers extends Nature{
    public Creepers(String natureName) {
        super(natureName);
    }
    public String germinate(){
        class Chimney{
            public String toString(){
                return "печную трубу";
            }
        }; //local class
        Chimney chimney = new Chimney();
        return "проросли сквозь " + chimney.toString();
    }
    public String braid(){
        class Roof{
            public String toString(){
                return "крышу";
            }
        }; //local class
        Roof roof = new Roof();
        return "оплели " + roof.toString();
    }
    MummiHouse mummiHouse = new MummiHouse("Мумми-дом");
    public String envelop(){

        return "окутали весь " + mummiHouse.getHouseName();
    }
}
