package laba4.story.Enums;

public enum FirmlyOrUncertainly {
    FIRMLY("твердо"), UNCERTAINLY("неуверенно");
    private final String translation;

    FirmlyOrUncertainly(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

}