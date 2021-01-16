public class Dissuade extends Actions {

    public String citizensDissuade(){
        return "отговаривали";
    }
    public String citizensNotDissuade(){
        return "не отговаривали";
    }

    @Override
    public String toString(){
        return "отговорить";
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
