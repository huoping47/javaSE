package staticclass.demo;

public class Chinese {
    int id;
    String name;
    //中国人类，所有的中国人的国籍都是中国，但是声明实例变量太浪费内存
    //国籍，这种特种属于类级别的特征，可以提升为整个模板的特征，可以在变量前加static关键字修饰
    //带有static的变量叫静态变量
    //静态变量在类加载的时候就初始化，不需要创建对象，内存就开辟了
    //静态变量存储在方法区内存当中
    //静态变量访问使用，类名.变量名
    static String country = "中国";
    public Chinese(){
    }
    public Chinese(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
