package laba4.story.Others;

import org.springframework.stereotype.Component;

@Component
public class Death {
    @Override
    public String toString() {
        return "гибель";
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
