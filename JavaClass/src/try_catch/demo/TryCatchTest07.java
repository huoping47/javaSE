package try_catch.demo;

public class TryCatchTest07 {
    public static void main(String[] args) {
        //使用自定义的一个异常
        TryCatchTest06 tryCatchTest06 = new TryCatchTest06("不好意思，用户名出错");
//        throw new TryCatchTest06("你好，出错了");
        tryCatchTest06.printStackTrace();
    }
}
