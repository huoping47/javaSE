package library.demo;

/**
 * @author 霍平
 * @date 2022/6/8 18:55
 * @mouse 六月
 */

import java.io.IOException;
import java.util.Scanner;

/**
 * 开始展示类
 */
public class Welcome {
    Scanner sc = new Scanner(System.in);
    public Welcome() throws SysInExcption, IOException {
        System.out.println("----------欢迎使用图书管理系统-----------");
        System.out.println("\t\t1：普通用户登录");
        System.out.println("\t\t2：普通用户注册");
        System.out.println("\t\t3：管理员登录");
        System.out.println("\t\t4：退出系统");
        System.out.println("\t\t请输入您的选择：1-4");
        int num = sc.nextInt();
        switch (num){
            case 1:
                new Login();
                break;
            case 2:
                new Register();
                break;
            case 3:
                break;
            case 4:
                break;

            default :
                //如果输入的数字不合法，那么直接抛出异常
                throw new SysInExcption("数字不正确，请输入1-4");
//                SysInExcption sysInExcption = new SysInExcption("您输入的数字不正确");
//                System.out.println(sysInExcption.getMessage());
        }
    }
}
