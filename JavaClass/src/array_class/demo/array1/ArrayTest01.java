package array_class.demo.array1;

public class ArrayTest01 {
    public static void main(String[] args) {
        //使用静态初始化的方式声明一个int类型的数组
        int[] array1 = {100,200,300};
        //读取数组中的长度，输出3
//        System.out.println(array1.length);
        //通过下标读取数组中的值,下面的下标1输出的是第二个值200；
//        System.out.println(array1[1]);
        //通过.length-1读取最后一个元素的值
//        System.out.println(array1[array1.length-1]);
        //修改第一个元素的值
//        array1[0]=10;
//        System.out.println(array1[0]);
        //修改最后一个元素的值
//        array1[array1.length-1] = 155;
//        System.out.println(array1[array1.length-1]);
        //遍历一维数组
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        //从最后一个元素遍历数组
        for (int a = array1.length-1;a>=0;a--){
            System.out.println(array1[a]);
        }
    }
}
