package work.demo.day16.work01;

import java.util.Scanner;

public class B {
    int b;
    public void guess(){
        A a = new A();
        Scanner s = new Scanner(System.in);
        for (int i = 0; true; ) {
            System.out.println("请输入您要猜的数字");
            this.b = s.nextInt();
            if (this.b>a.v){
                System.out.println("您输入的数字大了");
            }else if(this.b<a.v){
                System.out.println("您输入的数字小了");
            }else if (this.b==a.v){
                System.out.println("猜测正确");
                break;
            }
        }
    }
}
