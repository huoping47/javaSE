package java_se_test;

/**
 * @author 霍平
 * @date 2022/6/6 19:58
 * @mouse 六月
 * 已知小红同学有25元，她攒了几天钱之后发现自己的现在的钱比原来的2倍还多出10块。而小蓝同学有30元，他攒了几天钱之后发现自己的钱正好是原来的2倍。于是小胖说：小红和小蓝现在的钱一样多，请问，他说的对吗？
 */

public class Test02 {
    public static void main(String[] args) {
        int red = 25;
        int bule = 30;
        if ((red*2)+10 == bule*2) {
            System.out.println("正确");
        }else{
            System.out.println("不正确");
        }

    }
}
