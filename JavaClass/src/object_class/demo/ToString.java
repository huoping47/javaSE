package object_class.demo;
/*
 public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
源代码上tostring（）方法的默认实现是：类名@对象的内存地址转换为十六进制的形式
sun公司设计tostring（）犯法的目的是什么？
    tostring（）方法的作用是什么？
        tostring（）方法的设计目的是：通过调用这个方法可以讲一个java对象转c成字符串对象
        其实sun公司开发java语言的时候，建议所有的子类都去重写这个tostring（）方法
 */
public class ToString {
    public static void main(StringClass[] args) {
        myTime mt = new myTime(1990,5,15);
        //重写toString方法之前输出object_class.demo.myTime@6e8dacdf
        //重写toString方法之后输出1990年5月15日
        //toString()可以省略
        System.out.println(mt.toString());
    }
}

class myTime{
    private int date;
    private int year;
    private int day;

    public myTime(int date, int year, int day) {
        this.date = date;
        this.year = year;
        this.day = day;
    }

    @Override
    public String toString() {
        return   + this.date + "年" + this.year + "月" + this.day +"日";
    }
}