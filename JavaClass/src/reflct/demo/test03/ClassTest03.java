package reflct.demo.test03;

/**
 * @author 霍平
 * @date 2022/6/5 22:21
 * @mouse 六月
 */

public class ClassTest03 {
    private int age;
    private String name;
    private boolean isOk;
    private double doubles;

    public ClassTest03() {
    }

    public void Class00(int age, String name, boolean isOk, double doubles) {
        this.age = age;
        this.name = name;
        this.isOk = isOk;
        this.doubles = doubles;
    }

    public void Class001(int age, String name, boolean isOk) {
        this.age = age;
        this.name = name;
        this.isOk = isOk;
    }

    public String Class002(int age, String name) {
        this.age = age;
        this.name = name;
        return this.age + this.name;
    }

    public void Class003(int age) {
        this.age = age;
    }
}
