package duotai_class;
/*
主人
 */
public class People {
    /*
    这种方式没有使用java语言当中的多态机制，存在的缺点：People的扩展力很差，因为只要加一个新的宠物，People类就需要添加新的方法
    public void run(Pet p){
        p.paly();
    }
    public void run1(Bird b){
        b.fly();
    }
     */
    /*
    降低程序的耦合度【解耦合】，提成程序的扩展力方法
     */
    //Pet pet形参相当于  Pet pet = new Bird();new的对象是谁，就会调用谁的eat方法
    //People主人类面向的是一个抽象的Pet，不再面向具体的宠物。提倡：面向抽象编程，不要面向具体编程,面向抽象编程的好处是耦合度低，扩展力强
    public void feed(Pet pet){
        pet.eat();
    }
}
