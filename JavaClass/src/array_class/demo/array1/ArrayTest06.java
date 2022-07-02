package array_class.demo.array1;
/*
关于一维数组的扩容
    在java开发中，数组长度一旦确定不可变，那么数组满了需要扩容，需要新建一个大容量的数组，然后
    将小容量数组中的数组一个一个拷贝到大数组当中
 */
public class ArrayTest06 {
    public static void main(String[] args) {
        int[] arry = {10,20,30,40,50,60};
        int[] arrys = new int[10];
        System.arraycopy(arry,2,arrys,2,3);//数组拷贝扩容
        for (int i = 0; i < arrys.length; i++) {
            System.out.println(arrys[i]);
        }
        //拷贝字符串
        String[] strArry = {"张三","李四","王麻子"};
        String[] strArrys = new String[10];
        System.arraycopy(strArry,0,strArrys,0,strArry.length);
        for (int i = 0; i < strArrys.length; i++) {
            System.out.println(strArrys[i]);
        }
        //拷贝对象引用的地址
        Object[] ob ={new Object(),new Object(), new Object()};
        Object[] obb = new Object[10];
        System.arraycopy(ob,0,obb,0,ob.length);
        for (int i = 0; i < obb.length; i++) {
            System.out.println(obb[i]);
        }
    }
}
