package laba4.story.Place;

import org.springframework.stereotype.Component;

@Component
public class ToOutskirts extends City {


    @Override
    public String toString() {
        return "на окраину города";
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