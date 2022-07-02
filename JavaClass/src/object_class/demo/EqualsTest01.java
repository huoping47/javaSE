package object_class.demo;
/*
若果学生的姓名和家庭住址相同，则为同一个学生

equals方法要重写的时候要彻底
 */
public class EqualsTest01 {
    public static void main(String[] args) {
        Students stu = new Students("张三",new address("长沙","芙蓉区","0731"));
        Students stu1 = new Students("张三",new address("长沙","芙蓉区","0731"));
        System.out.println(stu.equals(stu1));
    }
}
class Students{
    String name;
    address addr;
    public Students(){}
    public Students(String name, address addr) {
        this.name = name;
        this.addr = addr;
    }
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Students)) return false;
        if (this == obj) return true;
        Students stu = (Students) obj;
        return this.name.equals(stu.name ) && this.addr.equals(stu.addr);
    }
}
class address{
    String city;
    String stree;
    String postCode;

    public address(String city, String stree, String postCode) {
        this.city = city;
        this.stree = stree;
        this.postCode = postCode;
    }
    public boolean equals(Object obj){
        if (obj ==null || !(obj instanceof  address)) return false;
        if (this==obj) return true;
        address addr = (address) obj;
        return this.city.equals(addr.city) && this.postCode.equals(addr.postCode) &&this.stree.equals(addr.stree);
    }
}
