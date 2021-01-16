public class MoveIn extends Actions{

    @Override
    public String toString(){
        return "отправиться в";
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