public class Main {

    public static void main(String[] args) {

        Znaika z = new Znaika("Знайка");
        try {
            z.setName();
        } catch(DoPersonHaveNameOrNot doPersonHaveNameOrNot){
            System.out.println("ERROR "+ doPersonHaveNameOrNot.getMessage());
        }
        Smekailo s = new Smekailo("Смекайло");
        try {
            s.setName();
        } catch(DoPersonHaveNameOrNot doPersonHaveNameOrNot){
            System.out.println("ERROR "+ doPersonHaveNameOrNot.getMessage());
        }

        Babies babies = new Babies();
        Citizens citizens = new Citizens();
        MoveIn move = new MoveIn();
        GreenCity greenCity = new GreenCity();
        Dissuade dissuade = new Dissuade();
        Feed feed = new Feed();
        ToOutskirts outskirts = new ToOutskirts();
        Take take = new Take();
        Road road = new Road();
        Show show = new Show();
        FirmlyOrUncertainly firmly = FirmlyOrUncertainly.FIRMLY;
        CertainOrUncertain certain = CertainOrUncertain.CERTAIN;
        Death death = new Death();
        WithTearsOrWithoutTears withTears = WithTearsOrWithoutTears.WITH_TEARS;
        SayGoodbye sayGoodbye = new SayGoodbye();
        Dragon dragon = new Dragon();
        Cloud cloud = new Cloud();
        Korotishki korotishki = new Korotishki();
        VeryOrNotVery very = VeryOrNotVery.VERY;
        When now = When.NOW;
        HowManyHeads heads = HowManyHeads.HUNDRED;
        Where far = Where.FAR;
        Hear hear = new Hear();
        Houses houses = new Houses();
        Street street = new Street() {
            private String name = "улица";
            String some() {
                return "какая-то "+name;
            }
        };



        z.getExcited(very.getTranslation());
        z.znaikaSayThat(z.say());
        z.goToGreenCityNow(now.getTranslation(),move.toString(),greenCity.toString());
        z.znaikaAsk(show.show(), road.toString(), greenCity.toString());
        citizens.citizensHear(hear.citizensHear());
        citizens.beUpset();
        citizens.sayThat(greenCity.toString(), citizens.forbiddenToGo());
        dragon.live(heads.getTranslation(), greenCity.toString());
        dragon.eatBabyGirls();
        z.pond();
        z.say();
        s.say();
        z.decideFirmly(firmly.getTranslation());
        z.goToGreenCity(move.toString(),greenCity.toString());
        citizens.citizensDissuadeZnaika(dissuade.citizensDissuade(),z.toString());
        z.znaikaStandOnHisOwn();
        babies.BabiesFeedZnaika(feed.babiesFeed(),z.toString());
        babies.BabiesTakeZnaika(take.babiesTakeZnaika(),z.toString(),outskirts.toString());
        babies.BabiesShowZnaika(show.babiesShowZnaika(),z.toString(), road.toString(), greenCity.toString(),true);
        citizens.think();
        z.znaikaGoToDeath(certain.getTranslation(), death.toString());
        citizens.sayGoodbyeZnaika(withTears.getTranslation(), sayGoodbye.toString(), z.toString());
        cloud.appear(far.getTranslation(), road.toString());
        cloud.beCloser();
        cloud.beBigger();
        korotishki.scat();
        korotishki.hide(houses.toString());
        korotishki.gaze(houses.outOfWindows());
        citizens.think();
        dragon.run(heads.getTranslation());
        z.notScared();
        z.stayInTheMiddle(street.some());
    }
}
