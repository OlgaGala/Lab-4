public class Houses extends City {

    public class Window{
        private String name;
        public Window(String name1){
            this.name = name1;
        }

        public String getName() {
            return name;
        }

    }
    Window wndws = new Window("окна");
    public String outOfWindows(){
        return " в "+wndws.getName();
    }
    @Override
    public String toString(){
        return " по домам";
    }
}