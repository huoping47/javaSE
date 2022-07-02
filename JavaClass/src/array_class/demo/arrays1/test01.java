package array_class.demo.arrays1;

import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        //排序，从小到大，调用Arrays.sort就行，传一个数组进去
        /*int[] a = {1,2,3,9,5,6,8,7,1,5,};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }*/



    /*
    冒泡排序算法
    原始数据3,2,4,8,7
    拿着3和2进行比较，如果左边大于右边，就交换位置
    交换之后的数据2,3,4,8,7，继续拿着上一次比较之后的结果右边较大的数据和后续的数据继续比较
     */
    int[] a = {1,5,6,9,7,8,4,3};
        for (int i = a.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j]>a[j+1]){
                    int c;
                    c = a[j];   //两个值交换位置
                    a[j] = a[j+1];
                    a[j+1] = c;
                }
            }
        }
        //遍历输出经过冒泡排序的值
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
}
