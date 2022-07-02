package cover_class.dome;

public class Cat  extends Animal {
    //直接继承会输出Animal的方法
    //和父类的方法一摸一样，这样就构成了方法重写，父类的方法体被覆盖
    public void move(){
        System.out.println("猫猫在走动");
    }
}
