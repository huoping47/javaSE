package java_se_test;

/**
 * @author 霍平
 * @date 2022/6/6 20:01
 * @mouse 六月
 * 某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？
 */

public class Test03 {
    public static void main(String[] args) {
        int rice = 24;
        int hs = 8;
        int fan = 3;
        int sum =0 ;
        if (sum >= 30) {
            sum *= 0.8;
            System.out.println("优惠的价格"+sum);
        }else{
            rice = 16;
            sum = rice + hs + fan;
            System.out.println("没用优惠的价格"+sum);
        }
    }
}
