package com.huopingSM.pojo;

/*
 *com.huoping.pojo
 *霍平
 *2022/7/16 16 15:36
 */
public class Users {
    private Integer uid;
    private String uName;
    private String uPass;

    public Users() {
    }

    public Users(Integer uid, String uName, String uPass) {
        this.uid = uid;
        this.uName = uName;
        this.uPass = uPass;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uName='" + uName + '\'' +
                ", uPass='" + uPass + '\'' +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }
}
