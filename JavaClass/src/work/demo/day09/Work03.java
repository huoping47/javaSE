package work.demo.day09;

import java.util.Scanner;

/*
从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1
 */
public class Work03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("������һ������");
        int b = s.nextInt();
        int c = 1;
        for (int i = 1;i<=b;i++){
            c*=i;
        }
        System.out.println(c);
    }
}
