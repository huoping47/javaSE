package work.demo.day16.work02;
/*
2、请定义一个交通工具(Vehicle)的类
其中有属性：
	速度(speed)
	体积(size)等等
	方法移动(move())
	设置速度(setSpeed(int speed))
	加速speedUp(),
	减速speedDown()等等.

最后在测试类Vehicle中的main()中实例化一个交通工具对象
并通过方法给它初始化speed,size的值并且打印出来。
另外调用加速减速的方法对速度进行改变
 */
public class Work2 {
    public static void main(String[] args) {
        Vehicle ve = new Vehicle();
        ve.setSpeed(60);
//        ve.upSpeed(50);
        ve.downSpeed(30);
    }
}
