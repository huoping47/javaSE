package object_class.demo;

public class FinalizeClass {
    public static void main(String[] args) {
        per p = new per();
        p=null;
        System.gc();//建议启动垃圾回收器
    }
}
class per{
    protected void finalize() throws Throwable {
        System.out.println("即将被销毁");
    }
}
