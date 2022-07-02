package date_class.demo;
/*
枚举
 */
public class EnumTest {
    public static void main(String[] args) {
        switch (EnumTest01.XIA){
            case CHUN:
                System.out.println("春");
                break;
            case XIA:
                System.out.println("夏");
                break;
            case QIU:
                System.out.println("秋");
                break;
            case DONG:
                System.out.println("冬");
                break;
        }
    }

    //这种设计返回值可以返回100，不谨慎，可以使用boolean类型
//    public static int sun(int a , int b){
//        try {
//            int c = a/b;
//            return 1;
//        }catch (Exception e){
//            return 0;
//        }
//    }

    //布尔类型只能返回两个值，就是true和false，有时候开发过程中可能需要返回多个值，这时候
//    就需要用到枚举
    /*public static boolean sun(int a , int b){
        try {
            int c = a/b;
            return true;
        }catch (Exception e){
            return false;
        }
    }*/

    //返回一个枚举类型
    public static Test01 sun(int a , int b){
        try {
            int c = a/b;
            return Test01.TRUE;
        }catch (Exception e){
            return Test01.FALSE;
        }
    }
}
/*
定义一个枚举类型
 */
enum Test01{
    TRUE,FALSE,SUCCEE,FILE;
}