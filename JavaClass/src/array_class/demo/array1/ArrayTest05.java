package array_class.demo.array1;

/*
一维数组的深入：
    数组中存储的类型为：引用数据类型
    对于数组来说，实际上只能存储java对象的内存地址，数组中存储的每个元素都是引用
 */
public class ArrayTest05 {
    public static void main(String[] args) {
//        Animal a = new Animal();
//        Animal a1 = new Animal();
//        Animal[] a2 = {a,a1};//存储的都是Animal对象，所以可以通过
//        priect p = new priect();
//        Animal[] a2 = {a,a1,p};//p不是一个Animal对象，所以存储不进去，类型必须一致
//        for (int i = 0; i < a2.length; i++) {
//            Animal a3 = a2[i];
//            a3.move();
            //合并代码
//            a2[i].move();


//            Animal ani = new Animal();
//            Cat cat = new Cat();
//            Animal[] aniArry = {ani,cat};
            Animal[] aniArry = {new Bird(),new Cat()};//缩写写法

            for (int i = 0; i < aniArry.length; i++) {
                aniArry[i].move();//分别调用鸟和猫的方法
                if (aniArry[i] instanceof Cat){
                    Cat cat = (Cat)aniArry[i];
                    cat.carMouse();
                }else if (aniArry[i] instanceof Bird){
                    Bird bird = (Bird) aniArry[i];
                    bird.fly();
                }
            }
        }
    }
class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}
class priect{

}
class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("鸟儿在拉翔");
    }
    //子类特有方法
    public void fly(){
        System.out.println("鸟儿在飞翔");
    }
}
class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在跑步");
    }
    public void carMouse(){
        System.out.println("猫在抓老鼠");
    }
}
