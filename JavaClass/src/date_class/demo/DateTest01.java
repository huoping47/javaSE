package date_class.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
获取自1970年到当前系统时间的总毫秒
 */
public class DateTest01 {
    public static void main(String[] args) {
        //获取自1970年到当前系统时间的总毫秒
        long nowTime = System.currentTimeMillis();
//        System.out.println(nowTime);
        long begin = System.currentTimeMillis();
//        print();
        long end = System.currentTimeMillis();
//        System.out.println("总耗时"+(end-begin));


        //获取昨天的时间毫秒
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss sss");
        Date date = new Date(System.currentTimeMillis()-1000*60*60*24*365L);//获取去年现在的时间
//        Date date2 = new Date(System.currentTimeMillis()-1000*60*60*24);//获取昨天现在的时间
        Date date1 = new Date();
//        System.out.println(System.currentTimeMillis());
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat.format(date1));


    }
    public static void print(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("i="+i);
        }
    }


}
