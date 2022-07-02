package thisclass.demo;

public class ThisClass {
    int age;
    String name;

    //无参数构造函数
    public ThisClass() {
    }
    //有参数构造函数
    public ThisClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int student(int age){
        //等号右边的id是局部变量id
        //等号左边的id是实例变量id，也就是当前对象的id
        return this.age = age;

    }
    public String student(String name){
        return this.name = name;
    }
}
