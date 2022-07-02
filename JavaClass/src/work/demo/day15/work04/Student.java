package work.demo.day15.work04;

public class Student {
    private String name;
    private int age;
    private String address;
    private String zipCode;
    private String mobile;

    public Student(String address, String zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }
    public void getPostAddress(){
        System.out.println(this.address+this.zipCode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
