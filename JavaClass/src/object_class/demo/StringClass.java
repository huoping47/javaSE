package object_class.demo;
/*
java语言当中的字符串String有没有重写toString方法，有没有重写equals方法
    String类重写了equals方法，比较字符串必须使用equals方法
    String类也重写了toString方法

 */
public class StringClass {
    public static void main(String[] args) {
        String s1= "你好";
        String s3= "你好";
        System.out.println(s1==s3);//结果是ture
        //实际上String也是一个类，不属于基本数据类型，既然String是一个类，那么一定存在构造方法
        String s2 = new String("你");
        String s4 = new String("你");
        //new两次，两个对象内存地址不同，==判断的是内存地址，不是内容
        System.out.println(s2==s4);//结果是false
        //比较两个字符串必须调用equals方法，String类已经重写equals方法了
        System.out.println(s2.equals(s4));//结果是ture
    }
}
