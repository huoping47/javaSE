package interface_class.demo;
/*
类实现接口
 */
public class InterfaceTest1{
    public static void main(String[] args) {
        Math m = new Math01();
        Math01 mm = (Math01)m;
        mm.num();
        int i = m.sum(30,50);
        System.out.println(i);
    }
}
interface Math {
    int a=100;
    int sum(int i ,int b);
}
//实现接口
class Math01 implements Math{
    @Override
    public int sum(int i, int b) {
        return i+b;
    }
    public void num(){
        System.out.println("特有的方法");
    }
}