public enum VeryOrNotVery {
    VERY("очень"), NOT_VERY("не очень");
    private final String translation;

    VeryOrNotVery(String translation){
        this.translation=translation;
    }

    public String getTranslation(){
        return translation;
    }
}
