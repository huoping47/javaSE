package string_class.demo.intiger;
//关于8中基本数据类中当中的封装类
public class IntigerTest01 {
    public static void main(String[] args) {
//        doSome(10);

        //123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型转换（装箱）
        Integer integer = new Integer(123);
        Integer integers = new Integer("456");
        //下面是将引用数据类型转换为基本数据类型（拆箱）
        float f = integer.floatValue();
        System.out.println(f);
        System.out.println(integers);


        //有了自动装箱自动拆箱之后，number里面的构造方法就用不着了
        Integer i = 100;  //自动装箱
        int a = i;//自动拆箱
        System.out.println(a);
    }



//    public static void doSome(Object object){
//        System.out.println(object);
//    }
}
