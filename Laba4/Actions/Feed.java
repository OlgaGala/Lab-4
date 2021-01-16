public class Feed extends Actions {
    public String babiesFeed(){
        return "покормили";
    }
    public String babiesNotFeed(){
        return "не покормили ";
    }

    @Override
    public String toString(){
        return "кормить";
    }
    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

