package work.demo.day09;
/*
1、计算1000以内所有不能被7整除的整数之和
 */
public class Work01 {
    public static void main(String[] args) {
        int b = 0;
        for (int i =1;i<=1000;i++){
            if (i%7!=0){
                b+=i;
            }
        }
        System.out.println(b);
    }
}
