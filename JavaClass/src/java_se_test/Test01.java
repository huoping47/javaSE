package java_se_test;

import java.util.Scanner;

/**
 * @author 霍平
 * @date 2022/6/6 19:17
 * @mouse 六月
 * 其实我们可以通过父母的身高大致推断出子女的身高，假定父母与子女的身高遗传关系如下：
 * ​ 儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
 * ​ 女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
 * 那已知：现有父亲身高175CM,母亲身高160CM。
 * 请将预测的子女身高打印输出
 * ————————————————
 */

public class Test01 {
    public static void main(String[] args) {
        double father =1.75;
        double momther = 1.6;
        float son = (float)((father+momther)*1.08)/2;
        float girs = (float)((father*0.923)+momther)/2;
        System.out.println("儿子的升高"+son);
        System.out.println("女儿的升高"+girs);
    }
}
