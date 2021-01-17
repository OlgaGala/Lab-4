package laba4.story.Enums;

public enum When {
    NOW("сейчас"), NEVER("никогда"), SOMEDAY("когда-нибудь");
    private final String translation;

    When(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}

