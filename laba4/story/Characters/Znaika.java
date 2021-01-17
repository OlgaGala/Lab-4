package laba4.story.Characters;

import laba4.story.Exceptions.DoPersonHaveNameOrNot;
import laba4.story.Interfaces.Decide;

public class Znaika extends Citizen implements Decide {
    public Znaika(String name) {
        super(name);
    }

    public void pond() {
        System.out.println(toString() + " задумался");
    }

    public void getExcited(String very) {
        System.out.println(toString() + " " + very + " " + "обрадовался");
    }

    public void znaikaSayThat(String say) {
        System.out.print(toString() + " " + say + ", что");
    }

    public void goToGreenCityNow(String now, String move, String greenCity) {
        System.out.println(" " + now + " " + move + " " + greenCity);
    }

    public void znaikaAsk(String show, String road, String greenCity) {
        System.out.println(toString() + " " + "попросил" + " " + show + " " + road + " в " + greenCity);
    }

    public String decide() {
        return "решил";
    }

    public void decideFirmly(String firmly) {
        System.out.print(toString() + " " + firmly + " " + decide());
    }

    public void goToGreenCity(String move, String greenCity) {
        System.out.println(" " + move + " " + greenCity);
    }

    public void znaikaStandOnHisOwn() {
        System.out.println(toString() + " " + "стоял на своем");
    }

    public void znaikaGoToDeath(String certain, String death) {
        System.out.println(toString() + " " + "идет на " + certain + " " + death);
    }

    public void notScared() {
        System.out.println(toString() + " не испугался");
    }

    public void stayInTheMiddle(String where) {
        System.out.println(toString() + " остался посреди " + where);
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public String say() {
        return "сказал";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Znaika znaika = (Znaika) obj;
        return this.getName() == znaika.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void setName() throws DoPersonHaveNameOrNot {
        if (name == "") {
            throw new DoPersonHaveNameOrNot("Отсутствует имя");
        }
    }
}