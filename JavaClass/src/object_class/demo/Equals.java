package object_class.demo;

import java.util.Objects;

/*
  public boolean equals(Object obj) {
        return (this == obj);
    }
    以上这个方法是Object类的默认实现
    SUN公司设计equals方法的目的是什么？
        以后编程的过程当中，都要通过equals方法来判断两个对象是否相等，equals方法是判断两个对象是否相等的
    我们需要研究一下Object类给的这个默认的equals方法够不够用
        在Object类中的equals方法当中，默认采用的是“==”判断两个java对象是否相等，而”==“判断的是两个java对象的内存地址
        我们应该判断两个java对象的内容是否相等，所以老祖宗的equals方法不够用，需要子类重写equals方法
 */
public class Equals {
    public static void main(StringClass[] args) {
        int i = 100;
        int a = 100;
        //判断两个基本数据类型的数据是否相等
        System.out.println(i==a);
        //判断两个对象是否相等
        myTme mt = new myTme(1999,5,15);
        myTme mt1 = new myTme(1999,5,15);
        System.out.println(mt);
        System.out.println(mt.equals(mt1));
        //调用默认的equals方法去比较，结果是false
    }
}

class myTme{
    int date;
    int year;
    int day;
    public myTme(int date,int year,int day){
        this.date=date;
        this.day = day;
        this.year = year;
    }
    public String toString(){
        return this.date+"年"+this.year+"月"+this.day+"日";
    }
    //默认的equals方法
    /*public boolean equals(Object obj){
        return (this==obj);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof myTme)) return false;
        myTme myTme = (myTme) o;
        return date == myTme.date && year == myTme.year && day == myTme.day;
//        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, year, day);
    }
}
