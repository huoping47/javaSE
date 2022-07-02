package work.demo.day08;

import java.util.Scanner;
/*
从键盘接收一个数字，判断该数字的正负。
 */
public class Work02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int i = s.nextInt();
        if (i<0){
            System.out.println("这是一个负数");
        }else{
            System.out.println("这是一个正数");
        }
    }

}
