package array_class.demo.array1;

public class ArrayTest02 {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] arr =new int[5];
        arr[0] =50;//分配了空间之后再赋值
        arr[1]=100;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("下标为"+i+"的值是"+arr[i]);
        }
        //静态初始化一个字符串数组
        String[] arr1 = {"张三","李四","王五"};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
