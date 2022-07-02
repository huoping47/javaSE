package work.demo.day08;

import java.util.Scanner;

/*
编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中，对它们进行排序，
使用if-else结构，并按从小到大的顺序输出
 */
public class Work05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = s.nextInt();
        System.out.println("请输入第二个整数");
        int b = s.nextInt();
        System.out.println("请输入第三个整数");
        int c = s.nextInt();
        if (a<b&a<c){
            if (b<c){
                System.out.println(a+"<"+b+"<"+c);
            }else{
                System.out.println(a+"<"+c+"<"+b);
            }
        }else if (b<a&b<c){
            if (a<c){
                System.out.println(b+"<"+a+"<"+c);
            }else{
                System.out.println(b+"<"+c+"<"+a);
            }
        }else if (c<a&c<b){
            if (a<b){
                System.out.println(c+"<"+a+"<"+b);
            }else{
                System.out.println(c+"<"+b+"<"+a);
            }
        }
    }
}
