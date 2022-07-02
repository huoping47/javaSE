package reflct.demo.test02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author 霍平
 * @date 2022/6/5 20:58
 * @mouse 六月
 */

public class FieldTest01 {
    public static void main(String[] args) throws Exception{
        /**
         * 获取该类的属性的所有,并设置该类的属性
         */
//        String str = Thread.currentThread().getContextClassLoader().getResource("JavaClass/JavaClass/src/reflct/demo/test02/ClassTest01").getPath();
        try {
            Class c = Class.forName("reflct.demo.test02.ClassTest01");
            Object o = c.newInstance();
            //获取所有的属性，返回一个数组
            Field[] fields = c.getDeclaredFields();
            for (Field f :fields){
                f.setAccessible(true);
                //这里是拿到o对象里面的所有属性的值，谁调用get方法，就拿谁的值
                System.out.println(f.get(o));
                //输出所有的属性名
                System.out.print("属性-->"+f.getName());
                //获取所有属性的数据类型
                System.out.print("\t数据类型-->"+f.getType().getSimpleName());
//              获取该属性的修饰符，返回值是一个数字表示
                int m = f.getModifiers();
                //Modifier方法是可以返回修饰符的，将数字转换修饰符，需要调用toString方法
                Modifier ms = new Modifier();
                String str = ms.toString(m);
                System.out.println("\t修饰符-->"+str);
            }
            System.out.println("============");
            //获取单个属性
            Field str = c.getDeclaredField("age");
            str.setAccessible(true);
            //属性调用get方法参数是传对象，获取哪个对象的值
            System.out.println(str.get(o));
            //设置一个属性的值
            str.set(o,200);
            System.out.println(str.get(o));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
