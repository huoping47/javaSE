package array_class.demo.array1;
/*
调用数组方法
当一个方法的参数类型是一个数组的时候
 */
public class ArrayTest03 {
    public static void main(String[] args) {
//        array(new int[4]);
        //如果想直接传递一个数组的话，语法必须这样写
        array(new int[]{10,30,50,70});
        array(new String[5]);
    }
    public static void array(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"--"+arr[i]);
        }
    }
    public static void array(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+arr[i]);
        }
    }
}
