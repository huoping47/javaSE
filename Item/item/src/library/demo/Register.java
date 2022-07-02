package library.demo;

/**
 * @author 霍平
 * @date 2022/6/8 19:09
 * @mouse 六月
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

/**
 * 用户注册类
 * @author 霍平
 */
public class Register {
    private String name;
    private String id;

    Scanner sc = new Scanner(System.in);

    File out = null;

    ObjectOutputStream objectOutputStream = null;
    /**
     * 注册类
     * @throws SysInExcption
     * @throws IOException
     */
    public Register() throws SysInExcption, IOException {
        System.out.println("请输入用户名");
        this.name = sc.next();
        if (this.name.length() <=0 ||"null".equals(this.name)) {
            throw new SysInExcption("请输入正确的用户名");
        }
        System.out.println("请输入您的ID");
        this.id = sc.next();
        if (this.id == null ||this.id.length() < 3) {
            throw new SysInExcption("请输入正确的ID");
        }
        User addUser = new User(this.name,this.id);
        out = new File("library/demo/User");

        if (!out.exists()) {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(out,true));
            objectOutputStream.writeObject(addUser);
            objectOutputStream.flush();
            objectOutputStream.close();
        }else{
            UserObjOutStream obj = new UserObjOutStream(new FileOutputStream(out,true));
            obj.writeObject(addUser);
            obj.flush();
            obj.close();
        }
        System.out.println("姓名："+this.name+"ID："+this.id+"\t注册成功");
    }

    public Register(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
