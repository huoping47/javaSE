package gather.demo.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/27 002722:10
 * 自动类型推断机制（钻石表达式）
 */
public class Generics02 {
    public static void main(String[] args) {
//        ArrayList<这里的类型会自动推断，可以省略不写>
        List<Object> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();//创建一个只允许存储String类型的集合

        //调用自定义泛型
        MyGenerice<String> myGenerice = new MyGenerice<>();
        myGenerice.test("adab");
//        myGenerice.test(100);//上面 MyGenerice<String> myGenerice = new MyGenerice<>();指定了使用String类型

    }
}

//自定义泛型myGenerices可以随便写，这个只是一个标识符

/**
 * 自定义的泛型类
 * @param <myGenerices>  标识符  E表示参数
 */
class MyGenerice<myGenerices>{
    public void test(myGenerices E){
        System.out.println(E);
    }

}
