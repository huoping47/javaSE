package work.demo.day23.work02;

import java.util.Scanner;

public class Work002 {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("欢迎使用霍平开发的系统，请输入您需要操作的数字  " +"\n"+
                "1、打印所有房间状态  2、订房  3、退房  0、退出");
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("请输入需要操作的编号");
            int c = s.nextInt();
            if (c ==1){
                hotel.prilt();
            }else if (c==2){
                System.out.println("请输入需要预定的房间编号");
                int a = s.nextInt();
                hotel.openRoom(a);
            }else if(c==3){
                System.out.println("请输入需要退房的房间编号");
                int a = s.nextInt();
                hotel.outRoom(a);
            }else if(c==0){
                System.out.println("谢谢使用，再见");
                return;
            }else{
                System.out.println("请输入正确的数字编号");
            }
        }
    }
}
