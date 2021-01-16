public class Take extends Actions {

    public String babiesTakeZnaika(){
        return "вывели";
    }
    public String babiesNotTakeZnaika(){
        return "не вывели ";
    }


    @Override
    public String toString(){
        return "вывести";
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
