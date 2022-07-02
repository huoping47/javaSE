package library.demo;

/**
 * @author 霍平
 * @date 2022/6/8 19:07
 * @mouse 六月
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

/**
*用户登录类
 * @author 霍平
 */
public class Login {

    private String name;
    private int id;

    ObjectInputStream obj = null;

    Scanner sc = new Scanner(System.in);

    public Login() {
        ULogin();
    }

    public Login(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public void ULogin(){
        System.out.println("请输入您的用户名");
        this.name = sc.next();
        System.out.println("请输入您的ID");
        this.id = sc.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
