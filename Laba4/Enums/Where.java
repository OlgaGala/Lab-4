public enum Where {
    NEAR("рядом"), FAR("вдали");
    private final String translation;

    Where(String translation){
        this.translation=translation;
    }

    public String getTranslation(){
        return translation;
    }
}
