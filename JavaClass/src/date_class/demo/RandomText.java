package date_class.demo;

import java.util.Random;

public class RandomText {
    public static void main(String[] args) {
//        Random random = new Random();
//        int a = random.nextInt(50);//参数表示的是取值范围，不包括50
//        System.out.println(a);


        //生成五个随机数，不能重复
        Random random = new Random();
        int[] a = new int[5];
        int b = 0;
        while(b<a.length-1){
            int number = random.nextInt(5);
            if (sun(a, number)) {
                a[b] = number;
                b++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    //当一个地方满足不了自己的需求的时候，可以写一个方法提取出来
    public static boolean sun(int[] a,int b){
        for (int i = 0; i < a.length; i++) {
            if (a[i] ==b) {
                return false;
            }
        }
        return true;
    }
}
