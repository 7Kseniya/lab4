package ru.ifmo.se.lab4.characters;
import ru.ifmo.se.lab4.enums.Adverbs;
import ru.ifmo.se.lab4.objects.nature.Hill;

public class MummyTroll extends Person implements OverLooked {

    public MummyTroll(String name, String location, String preposition) {
        super(name, location, preposition);
    }
    public String stay(){
        return "сотоял ";
    }
    //IN YARD

    private String overlooked;
    @Override
    public String overLook(Adverbs adverb){
        switch(adverb){
            case SURPRISED -> this.overlooked = "удивленно озирал "; //высокий зеленый холм
            default -> this.overlooked = "заглянул в неё.";
        }
        return overlooked;
    }
    public String flyUp(String how){ //стремглав
        return how + "подлетел ";
    }
    @Override
    public boolean equals(Object obj){
        if (this.getClass() != obj.getClass() || obj == null){
            return false;
        }
        MummyTroll mummyTroll = (MummyTroll) obj;
        return mummyTroll.overlooked == this.overlooked;
    }
    @Override
    public int hashCode(){
        return this.overlooked.hashCode();
    }
}
