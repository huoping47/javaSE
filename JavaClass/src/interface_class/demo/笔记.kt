package interface_class.demo

/*接口
接口：
	接口也是一种引用数据类型
	接口编译之后也是一个class字节码文件
	接口支持多继承，一个接口可以继承多个接口，用逗号隔开
	接口中只包含两部分内容，一部分是常量，一部分是抽象方法，就没有其他内容了
	接口中所有的元素都是public修饰的
	接口中的抽象方法定义时，public abstract可以省略
	接口中的常量定义时，常量中的static final也可以省略
	接口抽象方法不能带有方法体
	接口是完全抽象的（抽象类是半抽象）或者说接口是特殊的抽象类
	当一个非抽象的类实现接口的话，必须将接口中的抽象方法全部实现/重写
	extends 和implements同时出现，extends关键字在前，implements在后
接口的基础语法：
	修饰符列表  interface  接口名{}
接口在开发中的一个作用：解耦合
	接口在开发中的作用类似于多态在程序中开发的作用，面向对象编程，不要面向具体编程，耦合度低，扩展力强
	接口是不是完全的？  是。
	而我们以后正好要求，面向抽象编程，面向抽象编程这句话以后可以修改为：面向接口编程
	有了接口就有了可插拔，可插拔表示扩展力很强
	面向对象接口编程，可以降低程序的耦合度，提高程序的扩展力，符合OCP的开发原则，接口
	    的使用离不开多态机制（接口+多态才可以达到降低耦合度）
    接口可以解耦合，解开的是谁和谁的耦合！！任何一个接口都有调用者和实现者，接口可以将调用者
        和实现者解耦合，调用者面向接口调用，实现者面向接口编写实现
    以后进项大项目的开发，一般都是将项目分离成一个模块模块的，模块和模块之间采用接口衔接，降低耦合度
	

抽象类和接口类的区别:
	类和类之间叫做继承，类和结构之间叫做实现
	当一个非抽象的类实现接口的话，必须将接口中的抽象方法全部实现/重写
	一个类可以同时实现多个接口
	这种机制弥补了java中的哪个缺陷？
		java类和类只支持单继承，实际上单继承是为了简单而出现的
		现实世界中支持多继承，java中的接口弥补了单继承带来的缺陷，
	接口和接口之间没有继承关系也可以强转；
	
	抽象类是半抽象的，接口类是完全抽象的
	抽象类中有构造方法，接口中没有构造方法，接口和接口之间支持多继承
	类和类之间只能单继承，一个类可以同时实现多个接口，一个抽象类只能继承一个类
	接口中只允许出现常量和抽象方法
	
	
is a(继承)、 like a（关联） 、 has a（实现）    的一些关系
is a:
    Cat is a Animal(猫是一个动物),凡是能够满足is a的都是‘继承关系’\
    A extends B
has a:
    I has a pen 凡是能够满足 has a的都是“关联关系”，关联关系一般都以’属性‘的方式存在
    A{
        B b;
    }
like a:
    Cooker like a FoodMenu（厨师像一个/实现菜单）
    凡是能够满足like a关系的表示“实现关系“实现关系通常是：类实现接口
    A implements B











 */