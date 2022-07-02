package interface_class.demo;

public class InterfaceTest2 {
    public static void main(String[] args) {
        D d = new ABC();
        d.sun();
        E e = (E)d;
        e.sun1();
        ABC abc = new ABC();
        abc.sun2();
    }
}

interface D{
    void sun();
}
interface E{
    void sun1();
}
interface F{
    void sun2();
}
class ABC implements D,E,F{//类实现多继承接口
    @Override
    public void sun1() {
        System.out.println("sun1");
    }

    @Override
    public void sun2() {
        System.out.println("sun2");
    }

    @Override
    public void sun() {
        System.out.println("sun");
    }
}