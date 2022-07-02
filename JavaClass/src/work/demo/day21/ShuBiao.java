package work.demo.day21;

public class ShuBiao implements InsertDrawable {
    @Override
    public void use() {
        System.out.println("插上了鼠标");
    }

    @Override
    public void noUse() {
        System.out.println("拔了鼠标");
    }
}
