package com.huopingSM.pojo;

/*
 *com.huopingSM.pojo
 *霍平
 *2022/7/16 16 19:54
 */
public class Accounts {
    private Integer aid;
    private String aname;
    private String acontent;

    public Accounts() {
    }

    @Override
    public String toString() {
        return "AccountsMapper{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", acontent='" + acontent + '\'' +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent;
    }

    public Accounts(Integer aid, String aname, String acontent) {
        this.aid = aid;
        this.aname = aname;
        this.acontent = acontent;
    }
}
