package org.example;

/*
 *org.example
 *霍平
 *2022/7/6 06 18:43
 */
public class UserTest {
    private int id;
    private String userName;
    private String passWord;
    private String sex;
    private int age;

    public UserTest() {
    }

    public UserTest(int id, String userName, String passWord, String sex, int age) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.age = age;
    }

    public UserTest(String userName, String passWord, String sex, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
