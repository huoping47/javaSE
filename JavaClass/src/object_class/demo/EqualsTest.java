package object_class.demo;
/*
自己重写toString和equals方法/
 */
public class EqualsTest {
    public static void main(String[] args) {
        Student stu = new Student(19680,"北京大学");
        Student stu1 = new Student(19680,"北京大学");
        System.out.println(stu.toString());
        System.out.println(stu.equals(stu1));
    }
}
class Student{
    int id;
    String school;
    public Student() {
    }
    public Student(int id, String school) {
        this.id = id;
        this.school = school;
    }
    public String toString(){
        return this.id+"是在"+this.school;
    }
    public boolean equals(Object o){
        if (o == null || !(o instanceof Student)) {
            return false;
        }
        if (o==this){
            return true;
        }
        Student stu = (Student)o;
        return this.id==stu.id && this.school.equals(stu.school);

    }
}
