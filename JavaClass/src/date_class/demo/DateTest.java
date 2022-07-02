package date_class.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//        System.out.println(date);
//        long l = date.getTime()-1000*60*60;
//        String.valueOf(l);

        //日期格式重写方法:date转换成String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        System.out.println(date);
        System.out.println(simpleDateFormat.format(date.getTime()-1000*60*60*24*365L));
        String nowTime = simpleDateFormat.format(date);
        System.out.println(nowTime);

        //把一个字符串转换为一个日期的格式
        String dateTime1 = "2022-05-21  15:30:50";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        Date date1 = simpleDateFormat1.parse(dateTime1);
        System.out.println(date1);//Sat May 21 15:30:50 CST 2022


    }
}
