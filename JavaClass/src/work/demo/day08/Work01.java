package work.demo.day08;

import java.util.Scanner;
/*
根据指定月份，打印该月份所属的季节。
	3,4,5 春季
	6,7,8 夏季
	9,10,11 秋季
	12, 1, 2 冬季
    if和switch各写一份
 */
public class Work01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入月份");
        int s1 = s.nextInt();
        switch (s1){
            case 1: case 2: case 12:
                System.out.println(s1+"月份是冬季");
                break;
            case 3: case 4: case 5:
                System.out.println(s1+"月份是春季");
                break;
            case 6: case 7: case 8:
                System.out.println(s1+"月份是夏季");
                break;
            case 9: case 10: case 11:
                System.out.println(s1+"月份是秋季");
                break;
            default:
                System.out.println("请输入正确的月份");
        }
        /*
        if (s1>12 || s1<1){
            System.out.println("请输入正确的月份");
        }else if (s1==3 || s1==5 || s1==4){
            System.out.println(s1+"月份是春季");
        }else if (s1 == 6 || s1==7 || s1==8){
            System.out.println(s1+"月份是夏季");
        }else if (s1 == 9 || s1==10 || s1==11){
            System.out.println(s1+"月份是秋季");
        }else {
            System.out.println(s1+"月份是冬季");
        }
        */
    }
}
