public enum FirmlyOrUncertainly {
    FIRMLY("твердо"), UNCERTAINLY("неуверенно");
    private String translation;

    FirmlyOrUncertainly(String translation){
        this.translation=translation;
    }

    public String getTranslation(){
        return translation;
    }

}