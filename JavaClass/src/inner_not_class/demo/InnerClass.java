package inner_not_class.demo;
/*内部类
使用内部类编写的代码可读性很差
 */
class InnerClass {
    //实例内部类
    class Inner1{

    }
    //静态内部类
    static class Inner2{

    }
    public void doSome(){
        //局部变量
        int i =100;
        //局部内部类
        class Inner3{
        }
    }
    public void doOther(){
        //doSome中的内部类Inner3在doOther中不能使用
    }

}
