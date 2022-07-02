package work.demo.day21;

public class XianShiQi implements InsertDrawable{
    @Override
    public void use() {
        System.out.println("插上了显示器");
    }

    @Override
    public void noUse() {
        System.out.println("拔了显示器");
    }
}
