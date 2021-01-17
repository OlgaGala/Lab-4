package laba4.story.Place;

public class Houses extends City {

    Window wndws = new Window("окна");

    public String outOfWindows() {
        return " в " + wndws.getName();
    }

    @Override
    public String toString() {
        return " по домам";
    }

    public class Window {
        private final String name;

        public Window(String name1) {
            this.name = name1;
        }

        public String getName() {
            return name;
        }

    }
}