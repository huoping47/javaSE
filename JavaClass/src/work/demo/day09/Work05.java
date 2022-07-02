package work.demo.day09;

import java.util.Scanner;

/*
从键盘接收一个正整数，该正整数作为行数，输出以下图形
    *
   ***
  *****
 *******
*********
例如：输入5，则打印如上图5行
 */
public class Work05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = s.nextInt();
            // 正三角
        /*
        -->外层循环输出行数
        ---->内层第一个循环输出空格占位子，
        ---->内层第二个循环输出的个数，的个数是找出规律得到的。
         */
            for(int i = 1;i<=num;i++) {
                for(int j = 1;j<=num-i;j++) {
                    System.out.print(" ");
                }
                for(int j = 1;j<=2*i-1;j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
}
