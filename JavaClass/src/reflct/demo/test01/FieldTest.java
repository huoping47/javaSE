package reflct.demo.test01;

/**
 * @author 霍平
 * @date 2022/6/5 17:06
 * @mouse 六月
 *
 */

public class FieldTest {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 获取类的内存地址，并且调用该类的无参数构造方法
         */
        Class c = Class.forName("reflct.demo.test01.ClassTest");
//        Object o = null;
//        try {
//            获取类的无参数构造方法
//            o = c.newInstance();
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(c.getName());
        //获取类名
        System.out.println(c.getSimpleName());
    }
}
