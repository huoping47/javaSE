package work.demo.day20.work02;
/*
图形类
 */
public abstract class Graphics {
     private String color;
     private boolean stuff;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getStuff() {
        return stuff;
    }

    public void setStuff(boolean stuff) {
        this.stuff = stuff;
    }

    public abstract void sun();
}
