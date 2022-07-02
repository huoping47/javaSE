package array_class.demo.array1;

import java.util.Scanner;

/*
main 方法上面的String args[]有什么用？
JVM负责调用main方法，JVM调用main方法的时候，会自动传一个String数组过来
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        //String args这个数组的长度默认是0,不是null
//        System.out.println(args.length);
//        System.out.println(args[0]);
        /*
        判断一个用户名的登录名和密码
         */
        args =new String[2];
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名");
        args[0] = s.next();
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入密码");
        args[1] = ss.next();

        if (args.length!=2) {
            System.out.println("您输入的信息有误");
            return;
        }
        //取出用户名
        String userName = args[0];
        String password = args[1];
        if ("张三".equals(userName) && "123456".equals(password)){
            System.out.println("欢迎"+userName+"登录");
        }else{
            System.out.println("请输入正确的账号名或者密码");
        }
    }
}
