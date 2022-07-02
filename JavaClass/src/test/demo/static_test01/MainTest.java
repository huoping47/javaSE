package test.demo.static_test01;

public class MainTest {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getAge());
        System.out.println(a.getId());
        System.out.println(A.county);
    }
}
