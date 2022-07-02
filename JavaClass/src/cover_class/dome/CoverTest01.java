package cover_class.dome;
/*
方法覆盖
 */
public class CoverTest01 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.move();
        Cat c = new Cat();
        c.move();
        Dog d = new Dog();
        d.move();
    }
}
