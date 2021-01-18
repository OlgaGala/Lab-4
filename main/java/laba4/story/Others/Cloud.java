package laba4.story.Others;

import org.springframework.stereotype.Component;

@Component
public class Cloud {

    public void appear(String far, String road) {
        System.out.println(toString() + " " + far + " " + "показалось на " + road);
    }

    public void beCloser() {
        System.out.println(toString() + " приближалось");
    }

    public void beBigger() {
        System.out.println(toString() + " становилось больше");
    }


    @Override
    public String toString() {
        return "облако пыли";
    }
}
