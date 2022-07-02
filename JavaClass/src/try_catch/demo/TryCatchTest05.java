package try_catch.demo;
/*
try...catch中的finally关键字
 */
public class TryCatchTest05 {
    public static void main(String[] args) {
        //try 和finalluy  没有catch可以吗？  可以,try  finally可以联合使用
        //以下代码的执行顺序：先执行try，在执行finally，最后执行return（retuen语句只要执行方法必然结束）
        try{
            System.out.println("try");
            return;
        }finally {
            System.out.println("finally");
        }
    }
}
