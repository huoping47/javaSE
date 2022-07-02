package duotai_class;

public class MainTest {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.move();
        c.CatMove();
        Dog d = new Dog();
        d.move();
        Animal a = new Animal();
        a.move();

        //使用多态语法机制
        /*
            1、Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
            2、Cat  is a Animal
            3、new Cat()创建的对象的类型的Cat， a1这个引用的数据类型是Animal，可见他们进行了类型转换
                子类型转换父类型，称为向上转型/upcasting，或者称为自动类型转换
            4、Java中允许这种语法：父类型引用指向子类型
         */
        System.out.println("----------");
        //j程序永远分编译阶段和运行阶段
        //先分析编译阶段，在分析运行阶段，编译无法通过，根本无法运行的
        //编译阶段编译器检查a1这个引用的数据类型为Animal，由于Animal.class字节码当中只有move()方法
        //      所以编译通过了，这个过程我们称为静态绑定，编一阶段绑定，自由静态绑定成功之后才有后续的运行
        //在程序运行阶段，JVM堆内存当中真是创建的对象是Cat对象，那么以下程序在运行阶段一定会调用Cat对象的
        //      move()方法，此时发生了程序的动态绑定，运行阶段绑定
        //无论是Cat类有没有重写move()方法，运行阶段一定调用的是Cat对象的move()方法，因为底层真是对象就是Cat对象
        //父类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态，这种机制可以成为一种多态语法机制

        Animal a1 = new Cat();//存在类型转换、父类型引用指向子类型【多态】
        a1.move();
        /*
           为什么不能调用Cat里面的CatMove方法？
                编译阶段编译器检查到a1的类型是Animal类型，从Animal.class字节码文件当中查找CatMove()方法，最终没有找到该方法
                导致静态绑定失败，没有绑定成功，也就是编译失败了，所以运行不了
         */
        /*
            父类Animal数据类型如果想要访问子类特有的方法，这种叫强制类型转换，需要加强制类型转换符,
            我们可以将a1强制类型转换为Cat类型，a1的类型是Animal(父类)，转换成Cat类型(子类)，被称为向下转型，downcasting

            向下转型也需要两种类型之间必须有继承关系，不然编译报错，强制类型转换需要添加强制类型转换符

            什么时候需要使用向下转型？
                当调用的方法是子类型总特有的，在父类型当中不存在，必须进行向下转型
         */
        Cat c1 = (Cat) a1;
        c1.CatMove();
        System.out.println("----------");

        /*
            以下程序编译时没有问题的，因为编译器检查到a2的类型是Animal类型，Animal和Cat之间存在继承关系，并且Animal是父类型
            Cat是子类型，父类型转换子类型叫做向下转型，语法合格
            程序虽然编译通过了，但是程序在运行阶段会出现异常，因为JVM堆内存当中真是存在的对象是Dog类型，Dog对象无法转换
            为Cat对象，因为两种类型之间不存在任何继承关系，此时出现了著名的异常：
                        java.lang.ClassCastException：类型转换异常，经常在’向下转型‘的情况会发生
         */
        Animal a2 = new Dog();
        Dog d2 = (Dog) a2;
        d2.DogRun();
        //Cat c2 = a2(Cat);//a2父类转换为Cat子类，没有报错，运行会出错
        //java规范中要求，在进行强制类型转换之前，建议采用instanceof运算符进行判断，避免ClassCastException的异常发生
        if (a2 instanceof Cat){//a2是一个Cat类型的对象
            Cat c2 = (Cat) a2;
            //调用子类对象中特有的方法
            c2.CatMove();
        }else if (a2 instanceof Dog){//a2是一个Dog类型的对象
            Dog d1 = (Dog) a2;
            //调用子类对象中特有的方法
            d1.DogRun();
        }


        /*
            以上异常只有在强制类型转换的时候会发生，’向下转型‘存在隐患(编译过了，但是运行错了！)
            向上转型只要编译通过，运行就没问题
            向下转型编译通过，运行可能错误
            怎么避免向下转型出现的java.lang.ClassCastException报错呢？
                使用instanceof运算符可以避免出现以上的异常
            instanceof运算符怎么用？
                语法格式：
                    (引用 instanceof 数据类型名)
                以上运算符的执行结果类型是布尔类型，结果可能是true/false
                关于运算结果true/false:
                    假设（a instanceof Animal）
                    true表示：
                        a这个引用指向的对象是一个Animal类型
                    false表示：
                        a这个引用指向的对象不是一个Animal类型
         */

    }
}
