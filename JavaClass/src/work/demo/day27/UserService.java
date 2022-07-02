package work.demo.day27;

import java.util.Scanner;

/*
用户注册类
 */
public class UserService {
    private String username;
    private String passWord;
    public UserService() throws UserExcption, PassWordException {
        System.out.println("这是一个用户注册系统,注册方法");
        register();
    }

    /**
     * 用户注册方法
     * @throws UserExcption  用户注册异常
     */
    //    public void register(String username,String password) throws UserExcption{
    public void register() throws UserExcption, PassWordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您需要注册的用户名");
//        String name = scanner.next();
        String username= scanner.next();
//        username.trim();
        if ( username.length() < 6 || username.length() > 14) {
            throw new UserExcption("用户名的长度不对，需要在6-14之间");
        }
        this.username = username;
        System.out.println("请输入您需要注册的密码");
        String passWord = scanner.next();
//        passWord.trim();
        if (passWord.length() <6 || passWord.length()>16) {
            throw new PassWordException("密码长度不对");
        }
        this.passWord = passWord;
        System.out.println("您的用户名为："+this.username+"\n您的密码为："+this.passWord);
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
