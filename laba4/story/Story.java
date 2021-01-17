package laba4.story;

import laba4.story.Actions.*;
import laba4.story.Characters.*;
import laba4.story.Enums.*;
import laba4.story.Exceptions.DoPersonHaveNameOrNot;
import laba4.story.Others.Cloud;
import laba4.story.Others.Death;
import laba4.story.Place.*;

public class Story {
    Story(Znaika znaika, Smekailo smekailo, Babies babies, Citizens citizens, MoveIn move, GreenCity greenCity, Dissuade dissuade, Feed feed, ToOutskirts outskirts, Take take, Road road, Show show, Death death, SayGoodbye sayGoodbye, Dragon dragon, Cloud cloud, Korotishki korotishki, Hear hear, Houses houses) {
        try {
            znaika.setName();
        } catch (DoPersonHaveNameOrNot doPersonHaveNameOrNot) {
            System.out.println("ERROR " + doPersonHaveNameOrNot.getMessage());
        }
        try {
            smekailo.setName();
        } catch (DoPersonHaveNameOrNot doPersonHaveNameOrNot) {
            System.out.println("ERROR " + doPersonHaveNameOrNot.getMessage());
        }
        FirmlyOrUncertainly firmly = FirmlyOrUncertainly.FIRMLY;
        CertainOrUncertain certain = CertainOrUncertain.CERTAIN;
        WithTearsOrWithoutTears withTears = WithTearsOrWithoutTears.WITH_TEARS;
        VeryOrNotVery very = VeryOrNotVery.VERY;
        When now = When.NOW;
        HowManyHeads heads = HowManyHeads.HUNDRED;
        Where far = Where.FAR;
        Street street = new Street() {
            private final String name = "улица";

            public String some() {
                return "какая-то " + this.name;
            }
        };


        znaika.getExcited(very.getTranslation());
        znaika.znaikaSayThat(znaika.say());
        znaika.goToGreenCityNow(now.getTranslation(), move.toString(), greenCity.toString());
        znaika.znaikaAsk(show.show(), road.toString(), greenCity.toString());
        citizens.citizensHear(hear.citizensHear());
        citizens.beUpset();
        citizens.sayThat(greenCity.toString(), citizens.forbiddenToGo());
        dragon.live(heads.getTranslation(), greenCity.toString());
        dragon.eatBabyGirls();
        znaika.pond();
        znaika.say();
        smekailo.say();
        znaika.decideFirmly(firmly.getTranslation());
        znaika.goToGreenCity(move.toString(), greenCity.toString());
        citizens.citizensDissuadeZnaika(dissuade.citizensDissuade(), znaika.toString());
        znaika.znaikaStandOnHisOwn();
        babies.BabiesFeedZnaika(feed.babiesFeed(), znaika.toString());
        babies.BabiesTakeZnaika(take.babiesTakeZnaika(), znaika.toString(), outskirts.toString());
        babies.BabiesShowZnaika(show.babiesShowZnaika(), znaika.toString(), road.toString(), greenCity.toString(), true);
        citizens.think();
        znaika.znaikaGoToDeath(certain.getTranslation(), death.toString());
        citizens.sayGoodbyeZnaika(withTears.getTranslation(), sayGoodbye.toString(), znaika.toString());
        cloud.appear(far.getTranslation(), road.toString());
        cloud.beCloser();
        cloud.beBigger();
        korotishki.scat();
        korotishki.hide(houses.toString());
        korotishki.gaze(houses.outOfWindows());
        citizens.think();
        dragon.run(heads.getTranslation());
        znaika.notScared();
        znaika.stayInTheMiddle(street.some());
    }
}

