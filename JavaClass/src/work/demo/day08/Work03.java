package work.demo.day08;

import java.util.Scanner;
/*
从键盘接收一个数字，判断该数字的奇偶。
 */
public class Work03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入数字");
        int i = s.nextInt();
        if (i%2==0){
            System.out.println("这是一个偶数");
        }else{
            System.out.println("这是一个基数");
        }
    }
}
