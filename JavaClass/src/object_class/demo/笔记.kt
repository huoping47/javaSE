package object_class.demo

/*  JDK类库的根类    object
Object当中有那种常用的方法呢？
    第一种方法：去源代码中查看
    第二种方法：去查阅java的类库的帮助文档
    需要了解学习的方法：
        protected Object	clone()//负责对象克隆
        int	hashCode()  //获取哈希值的一个方法
            源代码：public native int hashCode();
            这个方法不是抽象方法，带有native关键字，底层调用C++程序
            hashcode（）方法返回的是哈希码：实际上就是一个java对象的内存地址，经过哈希算法，得出一个值
            所以hashcode（）方法的执行结果可以等同看做一个java对象的内存地址
        boolean	equals(Object obj)//半段两个对象是否相等
             以上这个方法是Object类的默认实现
            SUN公司设计equals方法的目的是什么？
            以后编程的过程当中，都要通过equals方法来判断两个对象是否相等，equals方法是判断两个对象是否相等的
            我们需要研究一下Object类给的这个默认的equals方法够不够用
            在Object类中的equals方法当中，默认采用的是“==”判断两个java对象是否相等，而”==“判断的是两个java对象的内存地址
            我们应该判断两个java对象的内容是否相等，所以老祖宗的equals方法不够用，需要子类重写equals方法
            equals方法要重写的时候要彻底
        String	toString()//将对象转换成字符串形式
            toString方法都是需要重写的
        protected void	finalize() //垃圾回收器负责调用的方法
            在Object中的源代码是    protected void finalize() throws Throwable { }
                GC负责调用这个finalize（）这个方法
            在finalize（）方法中只有一个方法体，里面没有代码，而且这个方法是protected修饰的
            这个方法不需要程序员手动调用，JVM的垃圾回收器负责调用这个方法
            finalize（）方法的执行时机：
                当一个java对象即将被垃圾回收器回收的时候，垃圾回收器负责调用finalize（）方法
            finalize（）方法实际上是SUN公司为java程序员准备的一个时机，垃圾销毁时机，如果希望在
            对象销毁时机执行一段代码的话，这段代码要写到finalize（）方法当中
            java中的垃圾回收器不是轻易启动的，垃圾太少，或者时间没到，种种条件下，有可能启动，也有可能不启动
    
    
    
什么是API？
    应用程序编程接口
    整个JDK的类库就是一个javase的API
    每一个API都会配置一套API帮助文档
    SUN公司写好的类库就是一个API





java中什么类型的数据可以使用‘==’判断
    java中基本数据类型比较是否相等，使用‘==’
java中声明类型的数据需要使用equals判断
    java中所有的引用数据类型同意使用equals方法来判断是否相等















 */