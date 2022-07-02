package work.demo.day21;
/*
开放型题目：
	设计一个笔记本电脑类，属性随意，并且进行属性私有化，对外提供公开的set和get方法。
	设计一个可插拔的接口：InsertDrawable，该接口有什么方法自行定义。
	设计一个鼠标类，实现InsertDrawable接口，并实现方法。
	设计一个键盘类，实现InsertDrawable接口，并实现方法。
	设计一个显示器类，实现InsertDrawable接口，并实现方法。
	设计一个打印机类，实现InsertDrawable接口，并实现方法。
	在“笔记本电脑类”中有一个InsertDrawable接口属性，可以让笔记本
	电脑可插拔鼠标、键盘、显示器、打印机等。
	编写测试程序，创建多个对象，演示接口的作用。
 */
public class Work1 {
    public static void main(String[] args) {
        InsertDrawable insertDrawable = new ShuBiao();
        InsertDrawable insertDrawable1 = new JianPan();
        InsertDrawable insertDrawable2 = new XianShiQi();
        Computer computer =new Computer();
        computer.use(insertDrawable);
        computer.use(insertDrawable1);
        computer.use(insertDrawable2);
        computer.noUse(insertDrawable);
        computer.noUse(insertDrawable1);
        computer.noUse(insertDrawable2);
    }
}
