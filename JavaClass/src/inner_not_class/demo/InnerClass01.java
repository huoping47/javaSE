package inner_not_class.demo;

public class InnerClass01 {
    public static void main(String[] args) {
        main m = new main();
//        counter my = new mySum();
//        m.sums(new mySum(),50,60);//合并的写法
        //匿名内部类的写法,后面的大括号表示对接口的实现，不建议使用匿名内部类
       /* m.sums(new mySum(){
            public int sum(int a,int b){
                return a+b;
            }
        },50,170);*/
    }
}
interface counter{
    int sum(int a,int b);
}
class mySum implements counter{
    public int sum(int a,int b){
        return a+b;
    }
}
class main{
    void sums(counter c,int i,int o){
        System.out.println(c.sum(i,o));
    }
}