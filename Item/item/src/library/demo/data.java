package library.demo;/*
集合中的Properties是唯一一个io流读取文件的对象
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

public class data{
    public static void main(String[] args) throws IOException, ClassNotFoundException, SysInExcption {
        FileInputStream fis = new FileInputStream("library/demo/User");
        ObjectInputStream ois = new ObjectInputStream(fis);
        while (true){
            try {
                Object obj = ois.readObject();
                System.out.println(obj);
            }catch (IOException e) {
                return;
            }
        }
//        Register re = new Register();
//        ArrayList ar = re.arr;
//        System.out.println(ar.size());
    }
//    public static void main(String[] args) {
//
//        //创建集合对象，相当于Map集合对象，有键值对
//        Properties pro = new Properties();
//
//        //向集合中添加对象
//        pro.setProperty("张三","12");
//        pro.setProperty("李四","22");
//        pro.setProperty("王二","14");
//
//        //生成一个集合对象
//        Set<String> str = pro.stringPropertyNames();
//
//        //遍历集合对象
//        for(String p : str){
//            String value = pro.getProperty(p);
//            System.out.println("key="+p+"value="+value);
//        }
//
//    }
//    try {
//        myStore();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
}
//    public static void myStore() throws IOException {
//        Properties prop = new Properties();
//
//        prop.setProperty("qinghua001", "张三");
//        prop.setProperty("qinghua002", "李四");
//        prop.setProperty("qinghua003", "王二");
//        prop.setProperty("qinghua004", "赵六");
//
//        FileWriter fw = new FileWriter("myStroe.txt");
//        prop.store(fw,null);
//        fw.close();
//    }

