package work.demo.day19.work02;
//属性包括：学生编号、学生姓名、学生年龄
public class Students {
    private int id ;
    private String name;
    private int age;

    public Students() {
    }

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("学号为:"+this.id+"叫"+this.name+",今年"+this.age+"岁");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
