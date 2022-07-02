package work.demo.day09;
/*
6、小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
 */
public class Work06 {
    public static void main(String[] args) {
        int day = 0;//初始t天数
        float num =0.0f;//初始金额
        while (true){
            day++;
            num+=2.5f;
            if (day%5==0){
                num-=6;
            }
            if (num>=100){
                break;
            }
        }
        System.out.println(day);
    }
}
