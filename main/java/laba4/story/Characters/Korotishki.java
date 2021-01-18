package laba4.story.Characters;

import org.springframework.stereotype.Component;

@Component
public class Korotishki {
    public void scat() {
        System.out.println(toString() + " бросились врассыпную");
    }

    public void hide(String houses) {
        System.out.println(toString() + " спрятались" + houses);
    }

    public void gaze(String window) {
        System.out.println(toString() + " стали выглядывать" + window);
    }

    @Override
    public String toString() {
        return "коротышки";
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
