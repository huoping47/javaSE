package array_class.demo.arrays1;
/*
选择排序
    每一次从这对参与比较的数据当中找出最小值，拿着这个最小值和最前面的元素交换位置
    选择排序比冒泡排序的好处就是好在交换位置的次数上
    选择排序比冒泡排序的效率高，选择元素的排序是有意义的

 */
public class Test02 {
    public static void main(String[] args) {
        int[] a = {5,1,9,7,8,3,5,4,10};
        //排序：5,1,9,7,8,3,5,4,10
            /*
            第一次循环：5,1,9,7,8,3,5,4,10，循环结束：1,5,9,7,8,3,5,4,10
            第一次循环：5,9,7,8,3,5,4,10，循环结束：3,9,7,8,5,5,4,10
            第一次循环：9,7,8,5,5,4,10循环结束：4,7,8,5,5,9,10......以此类推
             */
        //外层控制循环次数
        for (int i = 0; i < a.length; i++) {
            //i正好是参加这堆比较数据中的元素下标
            //假设i是最小的值
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[min] >a[j]) {
                    min = j;//把比i更小的元素换成j
                }
            }
            if (min !=i){
                int tem;
                tem = a[min];
                a[min] = a[i];
                a[i] = tem;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
