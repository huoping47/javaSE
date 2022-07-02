package main.demo;

public class Method {
//    主方法
    public static void main(String[] args) {
        //PrivateClass Pc = new PrivateClass(10,"张三");

        //PrivateClass.a();

        //调用有参数构造方法
        PrivateClass pcc = new PrivateClass(10,"张三",1001);
        System.out.println(pcc.getName());
        System.out.println(pcc.getId());
        System.out.println(pcc.getAge());

        //System.out.println(pcc.num(20,20));
        /*测试妻子和丈夫类，Husband 和 Wife
        Husband hus = new Husband();
        Wife wi = new Wife();
        hus.name="霍平";
        hus.age=21;
        hus.addr="长沙市高岭小区";
        hus.w = wi;
        wi.name="江晓雯";
        wi.age=19;
        wi.addr = hus.addr;
        System.out.println(hus.w.addr);*/

        //封装调用测试
        /*
        PrivateClass pc = new PrivateClass();
        pc.setAge(10);
        pc.setId(1001);
        pc.setName("张三");
        System.out.println(pc.getAge());
        System.out.println(pc.getId());
        System.out.println(pc.getName());
        */


    }
}
