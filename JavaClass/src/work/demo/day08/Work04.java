package work.demo.day08;

import java.util.Scanner;

/*
整数大小比较：输入两个整数，比较大小，
若x>y 输出 >
若x=y 输出 =
若x<y 输出 <
 */
public class Work04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = s.nextInt();
        System.out.println("第输入的第一个数字是"+a+",请输入第二个整数");
        int b = s.nextInt();
        if (a>b){
            System.out.println(a+">"+b);
        }else if (a<b){
            System.out.println(a+"<"+b);
        }else{
            System.out.println(a+"="+b);
        }
    }
}
