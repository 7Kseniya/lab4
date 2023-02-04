package ru.ifmo.se.lab4.objects.nature;
import ru.ifmo.se.lab4.enums.Adverbs;
import ru.ifmo.se.lab4.support.AdverbNormalization;
import static ru.ifmo.se.lab4.enums.Adverbs.*;

public class Flowers extends Nature implements AdverbNormalization {
    public Flowers(String nature_name) {
        super(nature_name);
    }
    private String flowersDescription;

    public String blossom(Adverbs adverb){
        switch (adverb){
            case RIGHTBEFOREEYES -> this.flowersDescription = "прямо на глазах ";
            default -> this.flowersDescription = "";
        }
        return flowersDescription + "распускались " + getNatureName();
    }

    @Override
    public String adverbsToString(Adverbs adverb){
        if (adverb == ONWHICH){
            return "на котором ";
        }
        return null;
    }
    @Override
    public boolean equals(Object obj){
        if (this.getClass() != obj.getClass() || obj == null){
            return false;
        }
        Flowers flowers = (Flowers) obj;
        return flowers.flowersDescription == this.flowersDescription;
    }
    @Override
    public int hashCode(){
        return this.flowersDescription.hashCode();
    }

}
