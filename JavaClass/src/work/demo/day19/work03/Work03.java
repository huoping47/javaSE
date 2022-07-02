package work.demo.day19.work03;
/*
3、定义一个人类
属性包括：姓名、年龄、性别
属性私有化，对外提供公开的set和get方法
提供无参数构造和有参数构造
提供一个生病方法：ill()，在该方法中打印信息，例如：张三，男，29岁生病了

定义一个病毒类
属性包括：病毒名称name、病毒体积size、病毒类型type
属性私有化，对外提供公开的set和get方法
提供无参数构造和有参数构造
提供一个攻击attack()方法，该方法的参数是“人”，例如：attack(Person p)
在attack()方法中调用人对象的生病方法。

编写测试程序，创建病毒对象，创建人对象，模拟病毒攻击人。
 */
public class Work03 {
    public static void main(String[] args) {
        People p = new People("张三",41,"男");
        Virus v = new Virus();
        v.attack(p);
    }
}
