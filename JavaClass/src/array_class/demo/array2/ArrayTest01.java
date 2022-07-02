package array_class.demo.array2;
/*
二维数组
 */
public class ArrayTest01 {
    public static void main(String[] args) {
//        int[][] array = {
//                {10,20,30},
//                {1,2,3},
//                {50,40,60},
//                {12,13,14,15}
//        };
//        System.out.println(array[1][0]);
        //二维数组的遍历读取
//        for (int i = array.length-1; i >=0; i--) {
//            for (int j = array[i].length-1;j>=0;j--){
//                System.out.println(array[i][j]);
//            }
//            System.out.println("\n");


        //三个一维数组，每个一维数组当中有4个元素
            int[][] arrays = new int[3][4];
            for (int i = arrays.length-1; i >=0; i--) {
                for (int j = arrays[i].length-1;j>=0;j--){
                    System.out.print(arrays[i][j]);
                }
                System.out.println("\n");
            }
        }
}
