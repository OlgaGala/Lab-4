package laba4.story.Place;

public abstract class City {


    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
