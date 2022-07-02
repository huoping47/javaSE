package work.demo.day21;

public class JianPan implements InsertDrawable{
    @Override
    public void use() {
        System.out.println("插上了键盘");

    }

    @Override
    public void noUse() {
        System.out.println("拔了键盘");
    }
}
