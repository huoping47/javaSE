package work.demo.day19.work01;
//有用户ID、用户密码、email地址。
public class User {
    private int id;
    private String password;
    private String email;

    public User() {
    }

    public User(int id, String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }
    public void showInfo(){
        System.out.println("ID为:"+this.id+"\n密码:"+this.password+"\n邮箱:"+this.email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
