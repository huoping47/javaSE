package array_class.demo.arrays1;

public class Test03 {
    public static void main(String[] args) {
        int[] a = {10,50,60,80,90};
        int c = arrayNum(5, a);
        System.out.println(c!=-1?"该下标的元素时"+c :"没有找到该下标");
    }

    /**
     * 从数组中检索某个元素的下标
     * @param i  被检索的元素参数
     * @param arrs  被检索的数组参数
     */
    public static int arrayNum(int i, int[] arrs){
        for (int j = 0; j < arrs.length; j++) {
            if (arrs[j] == i) {
                return i;
            }
        }
        return -1;
    }
}
