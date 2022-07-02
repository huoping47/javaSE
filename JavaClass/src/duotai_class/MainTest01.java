package duotai_class;

public class MainTest01 {
    public static void main(String[] args) {
        People zhangsan = new People();
        Bird niao = new Bird();
        zhangsan.feed(niao);
        Snake manshe = new Snake();
        zhangsan.feed(manshe);
    }
}
