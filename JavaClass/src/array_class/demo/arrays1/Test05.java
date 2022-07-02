package array_class.demo.arrays1;

import java.util.Arrays;

/*
使用sun公司开发好的工具类
 */
public class Test05 {
    public static void main(String[] args) {
        int[] a = {105,208,30,40,50,101,102,103,10160,70,80,90};
        //排序方法
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
        int b = Arrays.binarySearch(a, 80);
        System.out.println(b==-1?"没有找到":"该下标的元素是"+b);
    }
}
