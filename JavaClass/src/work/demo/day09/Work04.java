package work.demo.day09;

import java.util.Scanner;

/*
4、从控制台接收一个正整数，判断该数字是否为质数
质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）
 */
public class Work04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int i = s.nextInt();
        for (int a =2;a<i;a++){
            if (i%a==0){
                System.out.println(i+"不是质数");
                break;
            }else{
                System.out.println(i+"是质数");
                break;
            }
        }
    }
}
