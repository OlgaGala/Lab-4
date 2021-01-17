package laba4.story.Enums;

public enum HowManyHeads {
    HUNDRED("стоголовый"),
    ONE("одноголовый"),
    TWO("двуголовый"),
    TEN("десятиголовый");
    private final String translation;

    HowManyHeads(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
