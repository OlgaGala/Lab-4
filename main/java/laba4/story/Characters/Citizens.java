package laba4.story.Characters;

import laba4.story.Interfaces.Think;
import org.springframework.stereotype.Component;

@Component
public class Citizens implements Think {

    public void citizensDissuadeZnaika(String dissuade, String z) {
        System.out.println(toString() + " " + dissuade + " " + z);
    }

    public void think() {
        System.out.println(toString() + " " + "считали:");
    }

    public void sayGoodbyeZnaika(String withTears, String sayGoodbye, String z) {
        System.out.println(toString() + " " + withTears + " " + sayGoodbye + z);
    }

    public void citizensHear(String hear) {
        System.out.println(toString() + " " + hear);
    }

    public void beUpset() {
        System.out.println(toString() + " опечалились");
    }

    public String forbiddenToGo() {
        return " ходить нельзя";
    }

    public void sayThat(String greenCity, String forbiddenToGo) {
        System.out.println(toString() + " сказали, что в " + greenCity + forbiddenToGo);
    }


    @Override
    public String toString() {
        return "жители";
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

