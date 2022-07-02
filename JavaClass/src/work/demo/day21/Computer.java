package work.demo.day21;

public class Computer {
    private String price;
    private String bigSize;
    private String color;

    public Computer() {
    }

    public void use(InsertDrawable insertDrawable){
        insertDrawable.use();
    }
    public void noUse(InsertDrawable insertDrawable){
        insertDrawable.noUse();
    }

    public Computer(String price, String bigSize, String color) {
        this.price = price;
        this.bigSize = bigSize;
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBigSize() {
        return bigSize;
    }

    public void setBigSize(String bigSize) {
        this.bigSize = bigSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
