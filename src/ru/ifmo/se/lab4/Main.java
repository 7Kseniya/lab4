package ru.ifmo.se.lab4;

import ru.ifmo.se.lab4.characters.*;
import ru.ifmo.se.lab4.enums.Adverbs;
import ru.ifmo.se.lab4.enums.ColorParams;
import ru.ifmo.se.lab4.enums.NatureParams;
import ru.ifmo.se.lab4.enums.StemParams;
import ru.ifmo.se.lab4.exceptions.AmountOfPeopleException;
import ru.ifmo.se.lab4.objects.*;
import ru.ifmo.se.lab4.objects.nature.*;

public class Main {
    public static void main(String[] args) throws AmountOfPeopleException {



        MummyMama mummyMama = new MummyMama("Мумми-мама", "проем", "в");
        //Carpet carpet = new Carpet("ковер");
        Doors door1 = new Doors("дверь");
        Doors door2 = new Doors("двери");
        Stem stems = new Stem("стеблями");
        Greenery greenery2 = new Greenery("растений");
        Porch porch = new Porch("крыльцо");
        MummyMama mummyMama2 = new MummyMama("она", null, " на");
        Room room = new Room("гостиная");
        Ondatr ondatr = new Ondatr("Ондатр", null, "из");
        Greenery fernThickets = new Greenery("зарослей папоротников");
        Room bathroom = new Room("ванной");
        Creepers creepers = new Creepers("Лианы");
        Carpet carpet = new Carpet("ковёр");
        Hill hill = new Hill("холм");
        Flowers flowers = new Flowers("цветы");
        Harvest harvest = new Harvest("плоды");
        Snusmumrik snusmumrik = new Snusmumrik("Снусмумрик", "вперед", "за");
        Doors doors = new Doors("дверей");
        Windows windows = new Windows("окон");
        Stem someStem = new Stem("какой-то стебель");
        Stem stem = new Stem("стебель") ;
        MummyTroll mummyTroll1 = new MummyTroll("Мумми-троль", "дворе", "на");
        Rain rain = new Rain("дождём");
        MummyTroll mummyTroll2 = new MummyTroll("Мумми-троль", "отдушине", "к");
        Sniff sniff = new Sniff("Снифф", null, "вокруг");
        Veranda veranda = new Veranda("веранды");



        Person oneByOne = new Person("", "черноту подвала", "в") {
            @Override
            public String comeDown(int amount){
                return "Один за другим все спустились ";
            }
        };

        String output1 = mummyMama.getName() + mummyMama.tryToOpen(Adverbs.VAINLY, door1);
        output1 += door1.getHouseName() + door1.barricade(Adverbs.HOPELESSLY) + stems.stemDescribe(StemParams.POWERFUL) + stems.getNatureName() + greenery2.thereIs(NatureParams.CLIMBING) + greenery2.getNatureName() + ".";
        String output2 = "Тогда " + mummyMama.getName() + mummyMama.breakGlass() + mummyMama.getPreposition() + door2.getHouseName() + mummyMama2.getPreposition() + porch.getHouseName();
        output2 += porch.getHouseName() + porch.overgrow("сплошь") + ", ";
        output2 += "и " + mummyMama.squeezeThrough() + mummyMama.getPreposition() + mummyMama.getLocation() + ", ";
        String output3 = room.getHouseName() + room.overgrow("дремучие джунгли.");
        output3 += " И " + mummyMama2.getName() + mummyMama2.sitDown() + mummyMama2.fan()+ ". ";
        output3 += "Тут " + ondatr.getPreposition() + fernThickets.getNatureName() + fernThickets.overgrow(", ") + bathroom.getHouseName() + ", ";
        String output4 = ondatr.emerge() + ondatr.getName() + "и" + ondatr.say();
        output4 += creepers.getNatureName() + creepers.germinate() + ", ";
        output4 += creepers.braid() + " и " + creepers.envelop() + carpet.grow(NatureParams.LUSHANDGREEN) + ". ";
        String output5 = "А " + mummyTroll1.getPreposition() + mummyTroll1.getLocation() + "под " + rain.getNatureName() + mummyTroll1.stay() + mummyTroll1.getName();
        output5 += "и " + mummyTroll1.overLook(Adverbs.SURPRISED) + hill.describe() + ", ";
        output5 += flowers.adverbsToString(Adverbs.ONWHICH) + flowers.blossom(Adverbs.RIGHTBEFOREEYES);
        String output6 = "и" + harvest.repine() + harvest.getNatureName() + "," + harvest.changeColor(ColorParams.GREEN_TO_YELLOW) + harvest.changeColor(ColorParams.YELLOW_TO_RED);
        output6 += snusmumrik.getName() + snusmumrik.stepForward() + snusmumrik.getLocation() + "и " + snusmumrik.overLook(Adverbs.WITHINTEREST) + hill.getNatureName() + ". ";
        String output7 = windows.thereAreNo() + ", " + doors.thereAreNo() + ". ";
        output7 += carpet.grow(NatureParams.CONTINUED) + greenery2.thereIs(NatureParams.WILD) + ". ";
        output7 += snusmumrik.getName() + snusmumrik.grab() + someStem.getNatureName() + "и" + snusmumrik.pull();
        String output8 = stem.getNatureName() + stem.describe();
        output8 += stem.wrappedAround(Adverbs.KINDABYCHANCE) + "и" + stem.takeOff("её") + ". ";
        String output9 = "Тем временем " +  sniff.runAround() + veranda.overgrow("наглухо ") + ". ";
        output9 += mummyTroll2.getName() + mummyTroll2.flyUp("стремглав ") + mummyTroll2.getPreposition() + mummyTroll2.getLocation() + "и " + mummyTroll2.overLook(Adverbs.RIGHTBEFOREEYES);
        String output10 = null;
        try {
            output10 = oneByOne.comeDown(5) + oneByOne.getPreposition() + oneByOne.getLocation() + ".";
        } catch (AmountOfPeopleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);
        System.out.println(output6);
        System.out.println(output7);
        System.out.println(output8);
        System.out.println(output9);
        System.out.println(output10);

    }
}
