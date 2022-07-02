package reflct.demo.test03;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author 霍平
 * @date 2022/6/5 22:20
 * @mouse 六月
 */

public class Test3 {
    public static void main(String[] args) throws Exception{
        //获取所有方法
        Class c = Class.forName("reflct.demo.test03.ClassTest03");
        //调用getDeclaredMethods获取该类的所有方法，不包括构造方法
        Method[] methods = c.getDeclaredMethods();
        System.out.println(methods.length);
        Modifier modifier = new Modifier();
        for (Method m:methods){
            //获取方法的修饰符，和属性是一样的获取方式
            System.out.print("修饰符-->"+modifier.toString(m.getModifiers()));
            //获取方法的返回值
            System.out.print("\t返回值-->"+m.getGenericReturnType());
            //获取方法的名称
            System.out.println("\t方法名-->"+m.getName());
            //获取参数的方法
            Class[] annotation = m.getParameterTypes();
            for (Class cs: annotation){
                System.out.print(cs.getSimpleName()+"\t");
            }
        }
        Object o = c.newInstance();
        System.out.println();
        //调用某个类的方法
        Method m = c.getDeclaredMethod("Class002",int.class,String.class);
        System.out.println(m.getName());
        //invoke是设置方法的实参值，需要有返回值接受
        Object o1 = m.invoke(o,15,"张三");
        System.out.println(o1);



    }
}
