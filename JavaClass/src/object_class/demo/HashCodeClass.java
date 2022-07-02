package object_class.demo;

public class HashCodeClass {
    public static void main(String[] args) {
        Object ob = new Object();
        System.out.println(ob.hashCode());//输出997110508，这是一个经过哈希算法的内存地址997110508
    }
}
