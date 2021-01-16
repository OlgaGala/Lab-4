public class Dragon {


    public void live(String heads,String greenCity){
        System.out.println(heads+" "+toString()+" поселился в "+greenCity);
    }
    public void run(String heads){
        System.out.println(heads+" "+toString()+" уже бежит");
    }
    public void eatBabyGirls(){
        class BabyGirls{
            public void babyG(){
                System.out.println(Dragon.this.toString()+" пожирает малышек");
            }
        }
        BabyGirls babyGirls = new BabyGirls();
        babyGirls.babyG();
    }




    @Override
    public String toString(){
        return "дракон";
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

