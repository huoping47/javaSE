package library.demo;

import javax.print.ServiceUI;
import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author 霍平
 * @date 2022/6/8 19:15
 * @mouse 六月
 * 用户类
 */

public class User implements Serializable {
    private final static long serialVersionUID = 1L;
    private String name;
    private String id;

    public User() {
    }

    public User(String name, String id) {
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
