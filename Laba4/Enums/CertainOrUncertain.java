public enum CertainOrUncertain {
    CERTAIN("верную"), UNCERTAIN("неоднозначную");
    private final String translation;

    CertainOrUncertain(String translation){
        this.translation=translation;
    }

    public String getTranslation(){
        return translation;
    }

}