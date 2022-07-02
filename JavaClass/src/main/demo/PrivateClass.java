package main.demo;

public class PrivateClass {
    //封装age属性
    //封装name属性
    //封装id属性
    private int age;
    private String name;
    private int id;

    //无参数构造方法
    public PrivateClass(){

    }
    //有参数构造器
    public PrivateClass(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    //带static的方法使用类名.方法名()；的方式调用
    /*public static void a(){
        System.out.println("你好啊");
    }*/
    //没带static的方法使用 类名 引用名= new 类名()；的方式调用

    /**
     * 注释，调用的地方鼠标停留会显示内容
     * 这个是数字相加得方法
     * @param
     * @param
     * @return a+b
     */
    /*public int num(int a ,int b){
        return a+b;
    }*/
    /*public PrivateClass(int age,String name){
        System.out.println(age);
        System.out.println(name);
    }*/


    //get  set方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    //set方法没有返回值，因为set方法只负责修改数据
    /*public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }*/
}
