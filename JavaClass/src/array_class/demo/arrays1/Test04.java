package array_class.demo.arrays1;
/*
二分法查找
10 (下标0)11 12 13 14 15 16 17 18 19 20(下标10)
通过二分法查找，找出18这个元素的下标
    (0+10)/2  --> 中间元素的下标：5

    拿着中间这个元素和目标要查找的元素进行对比：
        中间元素是 arr[5]  --> 15
        15<18 被查找的元素
        被查找的元素18在目前中间元素15的右边
        所有开始元素的下标从0变成5+1
    在重新计算一个中间元素的下标：
        开始下标是5+1；
        结束下标是10
        （6+10）/2 --> 8
        8下标对应的元素是8，找到中间元素和被找的元素18相等，表示找到了，下标为8

二分法查找算法是基于排序的基础之上
 */
public class Test04 {
    public static void main(String[] args) {
        int[] a = {10,20,30,50,90,60,70,80};
        int c = arraysTwo(a, 10);
        System.out.println(c==-1?"没有找到":"该下标的元素是"+c);
    }

    public static int arraysTwo(int[] arr,int nuber){
        //最大下标元素
        int a = arr.length-1;
        int b = 0;//最小下标元素
        while(b<=a){
            int c = (b+a)/2;
            if (arr[c] ==nuber) {
                return c;
            }else if (arr[c] <nuber){
                b = c+1;
            }else{
                a = c-1;
            }
        }
        return -1;
    }
}
