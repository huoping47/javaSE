package work.demo.day19.work01;
/*
1.定义一个用户类
要处理的信息有用户ID、用户密码、email地址。
属性私有化，对外提供公开的set和get方法
提供无参数构造方法
提供有参数构造方法
提供一个showInfo()方法，通过这个方法展示用户信息。
编写测试程序创建对象，调用showInfo()方法。
 */
public class Work1 {
    public static void main(String[] args) {
        User user = new User(123756,"zxcvbnm","430581");
        user.showInfo();
    }
}
