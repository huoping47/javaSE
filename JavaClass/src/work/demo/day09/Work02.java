package work.demo.day09;
/*
计算 1+2-3+4-5+6-7....+100的结果
 */
public class Work02 {
    public static void main(String[] args) {
        int b = 0;
        for (int i =1;i<=100;i++){
            b+=i;
        }
        System.out.println(b);
    }
}
