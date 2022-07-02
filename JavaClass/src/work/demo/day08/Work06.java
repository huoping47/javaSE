package work.demo.day08;

import java.util.Scanner;

/*
打车起步价8元（3KM以内）
超过3KM，超出的每公里1.2元
超过5KM，超出的每公里1.5元
请在键盘上接收公里数，得出总价。
 */
public class Work06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入公里数");
        int a = s.nextInt();
        int b = 8;
        if (a<3 & a>0){
            System.out.println("您需要支付"+b);
        }else if (a>=3 & a<5){
            b += (a-3)*1.2;
            System.out.println("您需要支付"+b);
        }else if (a>=5){
            b += (a-3)*1.5;
            System.out.println("您需要支付"+b);
        }
    }
}
