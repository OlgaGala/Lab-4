package laba4.story.Characters;

import laba4.story.Exceptions.DoPersonHaveNameOrNot;

public class Smekailo extends Citizen {

    public Smekailo(String name) {
        super(name);
    }

    public String getName() {
        return name;
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
        Smekailo smekailo = (Smekailo) obj;
        return this.getName() == smekailo.getName();
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
