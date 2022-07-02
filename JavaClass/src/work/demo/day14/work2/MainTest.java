package work.demo.day14.work2;
/*
第二题：设计男人类，每个男人都有身份证号、姓名、性别、女人。设计女人类，每个女人都有身份证号、姓名、性别、男人。
 */
public class MainTest {
    public static void main(String[] args) {
        Man m = new Man();
        Women w = new Women();
        m.women=w;
        w.name="王麻子";
        w.man=m;
        m.name="张三";
        System.out.println(m.women.name);
        System.out.println(w.man.name);
    }
}
