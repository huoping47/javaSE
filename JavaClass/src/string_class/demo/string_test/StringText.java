package string_class.demo.string_test;
/*
String类的一些常用构造的方法
    比较重要的StringBuffer,怎么优化？
        在创建StringBuffer的时候尽可能的给定一个初始容量，最好减少底层数组的StringBuffer扩容次
        ，给一个大一点的初始容量
    关键点：给一个合适的初始化容量，可以提高程序的效率
StringBuffer和StringBuilderd的区别：StringBuffer的方法中有：synchronized关键字修饰，表示StringBuffer在多线程环境中
运行时是安全的

 */
public class StringText {
    public static void main(String[] args) {
        String a = "abc";//abc存在方法区的常量池当中，不可变
        String a1 = "abc" +"de";//abc+de 其实是在两个不同的位置，abc和de是分开的
        byte[] b = {97,98,99,100,101,102};//byte[] 方法的使用
        String s = new String(b,1,5);//byte数组，起始位置，截取个数
        System.out.println(s);

        char[] ints = {'1','5','9','2','6','8'};//charAt的使用方法，返回指定下标处的值
        String s1 = new String(ints);
        System.out.println(s1.charAt(ints.length-2));//取出倒数第二个下标的值

        String string = "HelloWord";//StringBuffer的使用
        StringBuffer stringBuffer = new StringBuffer(string);//需要加字符串的参数，可传可不传
        System.out.println(stringBuffer.append("你好啊"));//在字符串的末尾加字符串
        System.out.println(stringBuffer.insert(5,"你好啊"));//在字符串的末尾加字符串

        String s2 = "abc";
        String s3 = new String(s2);
        System.out.println(s3.compareTo("Bzc"));//区分大小写的比较两个字符串在字典中的顺序大小
        System.out.println(s3.compareToIgnoreCase("Bzc"));//不区分大小写的比较两个字符串在字典中的顺序大小

        System.out.println("abc".concat("def").concat("hij"));//concat方法，在字符串的末端加一段字符串

        String s4 = "abcdef";
        String ss = new String(s4);
        System.out.println(ss.contains("c"));  //contains的方法是查找此字符串中有没有包含这个字符，结果是false和true

        String s5 = "www.bcaidu.com";
        String s6 = new String(s5);
        System.out.println(s6.contains("baidu"));  //contains的方法是查找此字符串中有没有包含这个字符，结果是false和true
        System.out.println(s6.endsWith(".com"));  //endsWith()是检查是否以某某某结尾，结果是false和true

        System.out.println(s6.indexOf("w",5));//indexOf()查找字符第一次出现的下标,从下标5开始往后找

        System.out.println(s6.isBlank());//isBlank方法检查字符串是否为空

        System.out.println(s6.isEmpty());//isEmpty方法检查字符串是否为空

        System.out.println(s6.lastIndexOf("w"));//lastIndexOf()检查字符串中某个字符最后一次出现的位置

        System.out.println(s6.repeat(3)+"\t");//重复某个字符串，参数是重复次数

        System.out.println(s6.replace("w", "m"));//repalce，替换所有包含w的字符，参数是需要替换的值和需求值

        System.out.println("http://www.baidu.com".replaceAll("http", "https"));//repalceAll,替换指定的字符

        String[] strings = "1980-10-5".split("-");//split，拆分，以‘-’号分割，返回一个数组
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        char[] chars = {'你','好'};//valueOf  返回一个字符串
        double doubles = 10.01;
        String s7 = String.valueOf(doubles);
        System.out.println(s7);



        //String int integer三种类型之间互相转换
        //String --> int
        String s8 ="123456";
        int c = Integer.parseInt(s8);
        System.out.println(c);

        //String --> Integer
        String ss1 = "582";
        int cc = Integer.valueOf(ss1);
        System.out.println(cc);

        //int --> String
        int s9 = 123587;
        String s10 = String.valueOf(s9);
        System.out.println(s10);

        //int --> Integer
        int a2 = 10;
        Integer integer = new Integer(a2);
        System.out.println(integer);

        //Integer --> String
        Integer x = 101;
        String s11 = String.valueOf(x);
        System.out.println(s11);

        //Integer --> int
        Integer x1 = 102;
        int x2 = x1;
        System.out.println(x2);
    }
}
