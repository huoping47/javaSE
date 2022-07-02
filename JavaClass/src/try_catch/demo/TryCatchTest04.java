package try_catch.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
try...catch中的finally关键字
 */
public class TryCatchTest04 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            //创建入流对象
            fileInputStream= new FileInputStream("D:\\php软件\\4878\\phpstorm2018_4878\\phps2018\\使用说明.txt");
//            int file = fileInputStream.read();
            String s= null;
            s.toString();//这里一定会出现空指针异常   所以下面的代码不会执行
            //关闭流
            fileInputStream.close();
        } catch (FileNotFoundException e) {
//            String s = e.getMessage();
//            System.out.println(s);
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //流的关闭放在这边比较保险
            //finally的代码是一定会执行的，即使try中出现了异常
            if (fileInputStream != null) {
                try {
                    System.out.println("你好啊");
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
//                    System.out.println("你好啊");
                }
            }
        }
    }
}
