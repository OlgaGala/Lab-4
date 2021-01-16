public enum WithTearsOrWithoutTears {
    WITH_TEARS("слезно"), WITHOUT_TEARS("без слез");
    private final String translation;

    WithTearsOrWithoutTears(String translation){
        this.translation=translation;
    }

    public String getTranslation(){
        return translation;
    }

}
