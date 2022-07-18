package com.huoping;

/*
 *com.huoping
 *霍平
 *2022/7/18 18 21:02
 */
public class TwoUser {
    private String twoName;
    private int twoAge;

    @Override
    public String toString() {
        return "TwoUser{" +
                "twoName='" + twoName + '\'' +
                ", twoAge=" + twoAge +
                '}';
    }

    public String getTwoName() {
        return twoName;
    }

    public void setTwoName(String twoName) {
        this.twoName = twoName;
    }

    public int getTwoAge() {
        return twoAge;
    }

    public void setTwoAge(int twoAge) {
        this.twoAge = twoAge;
    }

    public TwoUser(String twoName, int twoAge) {
        this.twoName = twoName;
        this.twoAge = twoAge;
    }

    public TwoUser() {
    }
}
