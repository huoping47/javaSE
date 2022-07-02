package work.demo.day16.work01;

import java.util.Scanner;

public class A {
    int v;
    public A(){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入需要猜测的数字");
        this.v= s.nextInt();
    }
}
